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
import lombok.Setter;

@Entity
@Getter
@Setter
public class BrokerUser implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private Integer id;

    private String name;
    private String surname;
    private String username;
    private String password;
    private Boolean enabled;

    @OneToMany(mappedBy = "user")
    private final Set<Share> shares = new HashSet<>();
}
