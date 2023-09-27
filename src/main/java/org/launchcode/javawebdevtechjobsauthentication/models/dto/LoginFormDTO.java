package org.launchcode.javawebdevtechjobsauthentication.models.dto;

public class LoginFormDTO {

    @NotNull
    @NotBlank
    @Size(min = 3, max = 20, message = "Invalid username. Must be between 3 and 20 characters.")
    private String username;

    @NotNull
    @NotBlank
    @Size(min = 5, max = 30, message = "Invalid Password. Must be between 5 and 30 characters.")
    private String password;

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username;
    }

    public void setPassword(String password){
        this.password = password;
    }
}
