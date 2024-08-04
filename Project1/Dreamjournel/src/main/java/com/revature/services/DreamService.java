package com.revature.services;


import com.revature.models.Dream;

import java.util.List;


public interface DreamService {

    List<Dream> getAllDreams();
    Dream getDream(int id);
    Dream addDream(int userId, Dream dream);
    Dream updateDream(int userId, int id, Dream dream);
    List<Dream> getAllDreamsByUser(int fk_userid);
    Dream deleteDreamById(int id);

    // List<Dream> getAllDreamsByUser(int userid);


}
