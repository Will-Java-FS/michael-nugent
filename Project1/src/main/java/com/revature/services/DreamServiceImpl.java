package com.revature.services;

import com.revature.exceptions.ItemNotFoundException;
import com.revature.exceptions.ValidationException;
import com.revature.models.Dream;
import com.revature.repositories.DreamRepo;
import com.revature.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class DreamServiceImpl implements DreamService {

    @Autowired
    DreamRepo dr;

    @Autowired
    UserRepo ur;

    @Override
    public List<Dream> getAllDreams() {
        return dr.findAll();
    }

    @Override
    public List<Dream> getAllDreamsByUser(int fk_userid) {
        return dr.findAllDreamByFk_userId(fk_userid);
    }

    @Override
    public Dream getDream(int id) {
        Optional<Dream> dreamRetrieved = dr.findById(id);

        //Guard: Bad dream ID
        if (dreamRetrieved.isEmpty()) {
            throw new ItemNotFoundException("Dream Journal Entry with ID " + id + " not found.");
        }

        return dreamRetrieved.get();
    }

    @Override
    public Dream addDream(int userId, Dream dream) {
        //ToDo: verify user supplied Dream object.  Throw exception if missing important values or included unnecessary values?
        //Sanitize dream of an id because database will provide

        dream.setFk_userid(userId);

        return dr.save(dream);
    }

    @Override
    public Dream updateDream(int userId, int DreamId, Dream updatedDream) {

        //Verify dream id exists in database already.
        Optional<Dream> dreamCurrent = dr.findById(DreamId);
        //Guard: No dream by that ID found in database
        if (dreamCurrent.isEmpty()) {
            throw new ItemNotFoundException("Dream Journal Entry with ID " + DreamId + " not found.");
        }
        Dream retrievedDream = dreamCurrent.get();

        //Verify dream retrieved from database has same userId as user that made request.
        if (retrievedDream.getFk_userid() != userId) {
            throw new ValidationException("Provided DreamID does not belong to User.");
        }

        // Update fields based on User supplied Dream object
        Optional.ofNullable(updatedDream.getThemes()).ifPresent(retrievedDream::setThemes);
        Optional.ofNullable(updatedDream.getArchetypes()).ifPresent(retrievedDream::setArchetypes);
        Optional.ofNullable(updatedDream.getDescription()).ifPresent(retrievedDream::setDescription);
        Optional.ofNullable(updatedDream.getInterpretationUser()).ifPresent(retrievedDream::setInterpretationUser);

        //Update Time Stamp to now()
        retrievedDream.setTimeStamp(updatedDream.getTimeStamp());

        return dr.save(retrievedDream);
    }

    public Dream deleteDreamById(int id) {
        return dr.deleteById(id);
    }
}
