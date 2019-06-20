package com.wangsu.web.controller;

import com.wangsu.web.controller.request.AddPersonRequest;
import com.wangsu.web.controller.request.UpdatePersonRequest;
import com.wangsu.web.domain.Person;
import com.wangsu.web.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/**
 * @author linhz
 * @version 1.0 2019/6/9
 * @since 1.0
 */
@RestController
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping(path = "/persons")
    public List<Person> findAllPerson() {
        return personService.findAllPersons();
    }

    @PostMapping("/persons")
    public String addPerson(@Valid @RequestBody AddPersonRequest person) {
        personService.savePerson(person.getName(), person.getEmail());
        return "sucess";
    }

    @GetMapping("/persons/{id}")
    public Person getPersonById(@PathVariable(value = "id") Integer id) {
        return personService.getById(id);
    }

    @PutMapping("/persons/{id}")
    public Person updatePerson(@PathVariable(value = "id") Integer id, @Valid @RequestBody UpdatePersonRequest person) {
        return personService.updatePerson(id, person.getName(), person.getEmail());
    }

    @DeleteMapping("/persons/{id}")
    public ResponseEntity<?> deletePerson(@PathVariable(value = "id") Integer id) {
        personService.deletePerson(id);
        return ResponseEntity.ok().build();
    }
}
