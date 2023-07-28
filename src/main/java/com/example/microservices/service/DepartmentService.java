package com.example.microservices.service;

import com.example.microservices.entity.Department;
import com.example.microservices.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {
    private final DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public Department saveDepartment(Department department) {

        log.info("Inside saveDepartment method of DepartmentService");
        return departmentRepository.save(department);
    }


    public Department findDepartmentById(long departmentId) {
        log.info("Inside findDepartmentById method of DepartmentService");
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
