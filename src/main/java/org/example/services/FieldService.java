package org.example.services;

import org.example.entity.MyData;
import org.example.repositories.MyDataRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FieldService {

    private final MyDataRepository fieldRepository;

    public FieldService(MyDataRepository fieldRepository) {
        this.fieldRepository = fieldRepository;
    }
    public List<MyData> getAll() {
        return fieldRepository.findAll();
    }
}







