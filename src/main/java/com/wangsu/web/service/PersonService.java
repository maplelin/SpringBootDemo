package com.wangsu.web.service;

import com.wangsu.web.domain.Person;
import com.wangsu.web.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author linhz
 * @version 1.0 2019/6/6
 * @since 1.0
 */
@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public void savePerson(String name, String email) {
        Person p = new Person();
        p.setName(name);
        p.setEmail(email);
        personRepository.save(p);
    }

    public List<Person> findAllPersons() {
        return (List<Person>) personRepository.findAll();
    }

    public Person getById(Integer id) {
        return personRepository.getOne(id);
    }

    public Person updatePerson(Integer id, String name, String email) {
        Person person = getById(id);
        if (person != null) {
            person.setName(name);
            person.setEmail(email);
            personRepository.save(person);
        }
        return person;
    }

    public void deletePerson(Integer id) {
        Person person = getById(id);
        if (person != null) {
            personRepository.delete(person);
        }
    }
}
