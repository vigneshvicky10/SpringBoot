package com.example.crud.service;

import com.example.crud.dto.CrudDTO;
import org.springframework.stereotype.Service;


public interface CrudService {
    public CrudDTO createUser(CrudDTO crudDTO);
    public CrudDTO getUser(int rollno);
    public CrudDTO updateUser(int rollno,CrudDTO crudDTO);
    public void deleteUser(int rollno);
}
