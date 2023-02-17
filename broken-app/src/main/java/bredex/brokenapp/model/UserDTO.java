package bredex.brokenapp.model;


import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO implements Serializable {

    private Integer id;

    private String name;
    private String surname;
    private String username;
    private String password;
}
