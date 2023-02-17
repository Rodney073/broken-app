package bredex.brokenapp.domain;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRegistartion {
    @NotEmpty
    public String username;

    @NotEmpty
    public String password;

    @NotEmpty
    public String passwordAgain;

    @NotEmpty
    public String displayname;

    @Email
    public String email;
}
