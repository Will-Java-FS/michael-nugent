package com.revature.services;


import com.revature.models.Dream;

import java.util.List;


public interface DreamService {

    List<Dream> getAllDreams();
    Dream getDream(int id);
    Dream addDream(Dream dream);
    Dream updateDream(int id, Dream dream);
   // List<Dream> getAllDreamsByUser(int userid);


}
