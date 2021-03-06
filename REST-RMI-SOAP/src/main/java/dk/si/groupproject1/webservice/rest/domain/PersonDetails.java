package dk.si.groupproject1.webservice.rest.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonDetails extends PersonIdentifier{
    private String fullName;
    private Long yearOfBirth;
    private Long age;
    private Long zipCode;
    private String town;
    private String country;

    public PersonDetails(Long id, String fullName, Long yearOfBirth, Long age, Long zipCode, String town, String country){
        super(id);
        this.fullName = fullName;
        this.yearOfBirth = yearOfBirth;
        this.age = age;
        this.zipCode = zipCode;
        this.town = town;
        this.country = country;
    }
}
