package com.example.crud.service;

import com.example.crud.dto.CrudDTO;
import com.example.crud.entity.CrudEntity;
import com.example.crud.repository.CrudOperationRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CrudServiceImpl implements CrudService {

    private ModelMapper modelMapper;
    private CrudOperationRepository crudOperationRepository;
    @Override
    public CrudDTO createUser(CrudDTO crudDTO) {
       CrudEntity newEntity= modelMapper.map(crudDTO, CrudEntity.class);
       CrudEntity saveEntity=crudOperationRepository.save(newEntity);
       CrudDTO NewDTO=modelMapper.map(saveEntity,CrudDTO.class);
        return NewDTO;
    }

    @Override
    public CrudDTO getUser(int rollno) {
       CrudEntity NewEntity=crudOperationRepository.findById(rollno).get();
       CrudDTO newDTO=modelMapper.map(NewEntity,CrudDTO.class);
        return newDTO;
    }

    @Override
    public CrudDTO updateUser(int rollno, CrudDTO crudDTO) {
        CrudEntity NewEntity=crudOperationRepository.findById(rollno).get();
        NewEntity.setCourseID(crudDTO.getCourseID());
        NewEntity.setCourseName(crudDTO.getCourseName());
        NewEntity.setStudentName(crudDTO.getStudentName());
        NewEntity.setPresent(crudDTO.getPresent());
        CrudEntity saveEntity=crudOperationRepository.save(NewEntity);
        return modelMapper.map(saveEntity,CrudDTO.class);
    }

    @Override
    public void deleteUser(int rollno) {
        CrudEntity newEntity=crudOperationRepository.findById(rollno).get();
crudOperationRepository.deleteById(rollno);
    }
}
