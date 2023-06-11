package com.rasel.crud_operation.service;

import com.rasel.crud_operation.data_transfer_op.DepartmentRequest;
import com.rasel.crud_operation.model.Department;

import java.util.Optional;

public interface DepartmentService {
    DepartmentRequest saveDepartment(DepartmentRequest request);

    Department updateDepartment(Department request);

    Optional<Department> getDepartmentById(long id);

    void deleteDept(long id);

    DepartmentRequest updateDepartment(DepartmentRequest request);
}
