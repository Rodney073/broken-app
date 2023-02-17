package bredex.brokenapp.entity;


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;

@Entity
@Getter
public class User implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private Integer id;

    private String name;
    private String surname;
    private String username;
    private String password;

    @OneToMany(mappedBy = "user")
    private final Set<Share> shares = new HashSet<>();
}
