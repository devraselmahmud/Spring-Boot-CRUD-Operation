package com.rasel.crud_operation.controllers;

import com.rasel.crud_operation.data_transfer_op.DepartmentRequest;
import com.rasel.crud_operation.model.Department;
import com.rasel.crud_operation.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("dept")
public class DepartmentController {
    private final DepartmentService departmentService;

    @PostMapping("/save")
    public DepartmentRequest saveDepartment(@RequestBody DepartmentRequest request){
        return departmentService.saveDepartment(request);
    }

    @PutMapping("/update")
    public Department updateDepartment(@RequestBody Department request){
        return departmentService.updateDepartment(request);
    }

    @GetMapping(path = "/get/{id}")
    Optional<Department> getDepartment(@PathVariable(value = "id")long id){
        return departmentService.getDepartmentById(id);
    }

    @DeleteMapping(path = "/delete/{id}")
    public void deleteDepartment(@PathVariable long id){
        departmentService.deleteDept(id);
    }


}
