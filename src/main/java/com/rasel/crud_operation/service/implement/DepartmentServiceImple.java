package com.rasel.crud_operation.service.implement;

import com.rasel.crud_operation.data_transfer_op.DepartmentRequest;
import com.rasel.crud_operation.model.Department;
import com.rasel.crud_operation.repository.DepartmentRepository;
import com.rasel.crud_operation.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class DepartmentServiceImple implements DepartmentService {
    private final DepartmentRepository departmentRepository;

    @Override
    public DepartmentRequest saveDepartment(DepartmentRequest request){
        Department department = new Department();
        department.setName(request.getName());
        department.setActive(request.isActive());

        Department req = departmentRepository.save(department);
        return null;
    }
    @Override
    public Department updateDepartment(Department request) {
//        Department department = new Department();
//        department.getId();
//        department.setName(request.getName());
//        department.setActive(request.isActive());
//
//        Department req = departmentRepository.save(department);
        return departmentRepository.save(request);

    }

    @Override
    public Optional<Department> getDepartmentById(long id){
        return departmentRepository.findById(id);
    }

    @Override
    public void deleteDept(long id){
        Optional<Department> getDept = departmentRepository.findById(id);
        Department department = getDept.get();
        departmentRepository.delete(department);
    }

}
