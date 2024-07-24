package com.spring.controller;

import com.spring.model.Person;
import com.spring.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class PersonController {

    private final PersonService personService;

    @GetMapping("/books")
    public List<Person> findAll() {
        return personService.findAll();
    }

    @GetMapping("/book")
    public Person findById(@RequestParam  Integer id) {
        return personService.findById(id);
    }

    @PostMapping("/book")
    public Person insert(@RequestBody Person person) {
        return personService.insert(person);
    }

    @PutMapping("/book")
    public Person update(@RequestBody Person person) {
        return personService.update(person);
    }

    @DeleteMapping("/book/{id}")
    public void deleteById(@PathVariable Integer id) {
        personService.deleteById(id);
    }
}
