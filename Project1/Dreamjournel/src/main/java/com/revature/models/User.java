package com.revature.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
@Setter
@Getter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userid")
    int u_id;
    @Column(nullable = false)
    private String username;
    @Column(nullable = false)
    private String password;

    // @OneToMany(mappedBy = "user")
    //private List<Dream> dreams;
}