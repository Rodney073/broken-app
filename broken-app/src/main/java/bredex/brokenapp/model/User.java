package bredex.brokenapp.model;


import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;

@Entity
@Getter
public class User {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;
    private String surname;
    private String username;
    private String password;

    @OneToMany(mappedBy="user")
    private Set<Share> shares;
}
