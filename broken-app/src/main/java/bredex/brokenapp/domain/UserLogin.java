package bredex.brokenapp.domain;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class UserLogin {
    @NotEmpty
    public String username;

    @NotEmpty
    public String password;

    @Override
    public String toString(){
        return "\nUsername: " + username + "\nPassword: " +password;
    }
}
