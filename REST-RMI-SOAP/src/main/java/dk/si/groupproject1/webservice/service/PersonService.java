package dk.si.groupproject1.webservice.service;

import dk.si.groupproject1.webservice.exceptions.PersonNotFoundException;
import dk.si.groupproject1.webservice.rest.domain.*;

import java.util.List;

public interface PersonService {
    long calculateAge(long yearOfBirth) throws Exception;
    TownAndCity townAndCityForPerson(long zipCode);
    PersonSummary summaryOfPerson(long id) throws PersonNotFoundException;
    List<PersonSummary> summaryOfPersons();
    PersonDetails detailsOfPerson(long id) throws Exception;
    String createPerson(CreatePerson p);
    PersonSummary updatePerson(UpdatePerson p, long id);
    String deletePerson(long id);
}
