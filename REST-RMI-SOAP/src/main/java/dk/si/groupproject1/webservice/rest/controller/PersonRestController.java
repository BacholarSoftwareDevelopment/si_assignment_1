package dk.si.groupproject1.webservice.rest.controller;

import com.google.gson.Gson;
import dk.si.groupproject1.webservice.exceptions.PersonNotFoundException;
import dk.si.groupproject1.webservice.rest.domain.CreatePerson;
import dk.si.groupproject1.webservice.rest.domain.PersonDetails;
import dk.si.groupproject1.webservice.rest.domain.PersonSummary;
import dk.si.groupproject1.webservice.rest.domain.UpdatePerson;
import dk.si.groupproject1.webservice.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonRestController {
    
    @Autowired
    PersonService service;

    @GetMapping("/summary")
    public List<PersonSummary> retrieveAllPersonList() {
        return service.summaryOfPersons();
    }

    @GetMapping("/{id}/summary")
    public PersonSummary retrievePersonSummary(@PathVariable long id) throws PersonNotFoundException {
        return service.summaryOfPerson(id);
    }

    @GetMapping("/{id}/details")
    public PersonDetails retrievePersonDetails(@PathVariable long id) throws Exception {
        return service.detailsOfPerson(id);
    }

    @PostMapping("/")
    public String createPerson(@RequestBody CreatePerson p) {
        return service.createPerson(p);
    }

    @PutMapping("/{id}")
    public PersonSummary editPerson(@RequestBody UpdatePerson p, @PathVariable long id) {
        return service.updatePerson(p, id);
    }

    @DeleteMapping("/{id}")
    public String deletePerson(@PathVariable long id) {
        return service.deletePerson(id);
    }
}
