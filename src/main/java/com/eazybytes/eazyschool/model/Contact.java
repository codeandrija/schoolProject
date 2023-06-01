package com.eazybytes.eazyschool.model;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class Contact {

    @NotBlank(message = "Name must not be blank")
    @Size(min = 3, max = 20, message = "Name must be at least 3 characters long and 20 characters at maximum lenght")
    private String name;
    @NotBlank(message = "Mobile Number must not be blank")
    @Pattern(regexp = "^$|[0-9]{10}", message = "Mobile number must be 10 digits")
    private String mobileNum;
    @NotBlank(message = "Email must not be blank")
    @Email(message = "Please provide a valid email address")
    private String email;
    @NotBlank(message = "Subject must not be blank")
    @Size(min = 5, max = 20, message = "Subject must be at least 5 characters long and 50 characters at maximum lenght")
    private String subject;
    @NotBlank(message = "Subject must not be blank")
    @Size(min = 5, max = 200, message = "Message must be at least 5 characters long and 200 characters at maximum lenght")
    private String message;

}
