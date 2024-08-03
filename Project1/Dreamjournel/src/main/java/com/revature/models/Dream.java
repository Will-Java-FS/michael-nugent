package com.revature.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;




@Entity //Denotes this class (entity) as having DB representation
@Table(name = "dreams") // Allows us to set additional information about the Table.
@NoArgsConstructor  //Empty constructor (does not set any values)
@AllArgsConstructor //Full constructor (sets all values) (requires all properties)
@Data
public class Dream {
    List<String> themes; // Notable subjects
    List<Integer> archetypes; // Identified Archetypes (Maybe AI assists with this)
    String description; //Dream journal entry.  Meat of item.  Possibly multiple pages long.
    int imageName;
    @Column(name = "interpretation_ai")
    String interpretationAI;  //AI will make this based on Jungian archetypes and theories.
    @Column(name = "interpretation_user")
    String interpretationUser; //User can provide their own interpretation
    //Timestamp
    @Id //makes this a primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private int id;
    @Column(name = "time_stamp", nullable = false, columnDefinition = "TIMESTAMP WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime timeStamp = LocalDateTime.now();
    @Column
    private int fk_userid;
//    @ManyToOne(targetEntity = User.class)
//    private int userId; //The user this dream belongs to.  One user to many dreams.
   // @ManyToOne
    //@JoinColumn(name="user_id")
    //private User user;

    //Constructor just for tests.
    public Dream(int id, List<String> themes, List<Integer> archetypes, String description, String interpretationUser, LocalDateTime timeStamp){
        this.id = id;
        this.themes = themes;
        this.archetypes = archetypes;
        this.description = description;
        this.interpretationUser = interpretationUser;
        this.timeStamp = timeStamp;
    }
}

