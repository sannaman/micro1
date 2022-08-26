package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@RestController
public class EmployeeController {

    List<Employee> list = new CopyOnWriteArrayList<>();

    @GetMapping("/employee")
    public ResponseEntity<List> getEmployeeDetails(){

        return ResponseEntity.ok().body(list);
    }

    @PostMapping("/employee")
    public ResponseEntity<String> createEmployee(@RequestBody Employee emp){

        list.add(new Employee(emp.getId(),emp.getFname(),emp.getSname()));

        return ResponseEntity.ok().build();

    }

    @PutMapping("/employee")
    public ResponseEntity<String> updateEmployee(@RequestBody Employee emp){

        list.stream().forEach(e-> {

            if(e.getId().equals(emp.getId())){
                list.remove(e);
                list.add(emp);
            }

        });
        return ResponseEntity.ok().build();

    }

}
