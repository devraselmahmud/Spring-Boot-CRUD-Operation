package com.rasel.crud_operation.repository;

import com.rasel.crud_operation.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {

}
