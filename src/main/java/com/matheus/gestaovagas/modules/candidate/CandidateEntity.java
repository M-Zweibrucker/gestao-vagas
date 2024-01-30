package com.matheus.gestaovagas.modules.candidate;

import jakarta.validation.constraints.Pattern;
import lombok.Data;

import java.util.UUID;

@Data
public class CandidateEntity {

    private UUID id;
    private String name;
    @Pattern(regexp = "^[a-zA-Z0-9]{5,}$", message = "Username must have at least 5 characters")
    private String username;
    private String email;
    private String password;
    private String description;
    private String curriculum;

}
