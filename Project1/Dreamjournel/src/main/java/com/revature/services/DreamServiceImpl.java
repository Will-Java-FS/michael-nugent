package com.revature.services;

import com.revature.models.Dream;
import com.revature.exceptions.ItemNotFoundException;
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
    public Dream getDream(int id) {
        Optional<Dream> dreamRetrieved = dr.findById(id);

        //Guard: Bad dream ID
        if(dreamRetrieved.isEmpty()){
            throw new ItemNotFoundException("Dream Journal Entry with ID " + id + " not found.");
        }

        return dreamRetrieved.get();
    }

    @Override
    public Dream addDream(Dream dream) {
        //ToDo: verify user supplied Dream object.  Throw exception if missing important values or included unnecessary values?
        //Sanitize dream of an id because database will provide
        return dr.save(dream);
    }

    @Override
    public Dream updateDream(int id, Dream updatedDream) {
        //ToDo: Verify id matches user (authorization issue)

        //Verify dream id exists in database already.
        Optional<Dream> dreamCurrent = dr.findById(id);
        //Guard: No dream by that ID found in database
        if (dreamCurrent.isEmpty()) {
            throw new ItemNotFoundException("Dream Journal Entry with ID " + id + " not found.");
        }
        Dream retrievedDream = dreamCurrent.get();

        // Update fields using Optional to avoid null checks based on User supplied Dream object
        Optional.ofNullable(updatedDream.getThemes()).ifPresent(retrievedDream::setThemes);
        Optional.ofNullable(updatedDream.getArchetypes()).ifPresent(retrievedDream::setArchetypes);
        Optional.ofNullable(updatedDream.getDescription()).ifPresent(retrievedDream::setDescription);
        Optional.ofNullable(updatedDream.getInterpretationUser()).ifPresent(retrievedDream::setInterpretationUser);

        //Update Time Stamp to now()
        retrievedDream.setTimeStamp(updatedDream.getTimeStamp());

        return dr.save(retrievedDream);
    }
}
