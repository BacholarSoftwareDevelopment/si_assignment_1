package dk.si.groupproject1.webservice.rest.domain;

import lombok.Data;

@Data
public class UpdatePerson {
    private String fullName;
    private Long yearOfBirth;
    private Long zipCode;
}
