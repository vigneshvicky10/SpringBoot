package com.example.crud.controller;

import com.example.crud.dto.CrudDTO;
import com.example.crud.service.CrudService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/crud")
public class CrudController {

    private CrudService crudService;

    //create user
@PostMapping("/create")
    public ResponseEntity<CrudDTO> createUser(@RequestBody CrudDTO crudDTO){
        CrudDTO newDTO=crudService.createUser(crudDTO);
        return new ResponseEntity<>(newDTO,HttpStatus.CREATED);
    }

    //getuser
    @GetMapping("/get/{rollno}")
    public ResponseEntity<CrudDTO> getUser(@PathVariable int rollno){
    CrudDTO newDTO=crudService.getUser(rollno);
    return new ResponseEntity<>(newDTO,HttpStatus.OK);
    }

    //updateuser
    @PutMapping("/update/{rollno}")
    public ResponseEntity<CrudDTO> updateUser(@PathVariable int rollno,@RequestBody CrudDTO crudDTO){
    CrudDTO newDTO=crudService.updateUser(rollno,crudDTO);
    return new ResponseEntity<>(newDTO,HttpStatus.OK);
    }

    //deleteuser
    @DeleteMapping("/delete/{rollno}")
    public ResponseEntity<String> deleteUser(@PathVariable int rollno){
    crudService.deleteUser(rollno);
    return new ResponseEntity<>("Deleted Successfully",HttpStatus.OK);
    }
}
