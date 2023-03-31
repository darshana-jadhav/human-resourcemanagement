package in.techdenovo.sapps.humanresourcemanagement.service;

import in.techdenovo.sapps.humanresourcemanagement.model.Department;
import in.techdenovo.sapps.humanresourcemanagement.model.User;
import in.techdenovo.sapps.humanresourcemanagement.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department addDepartment(Department department){

        return departmentRepository.save(department);
    }
    public List<Department> getAllDepartment(){

        return departmentRepository.findAll();
    }
    public Department showEditForm(long id ){
        return departmentRepository.findById(id).orElse(null);
    }
    public Department editDepartment(Department existingDepartment){

        return departmentRepository.save(existingDepartment);
    }

    public Department deleteDepartment(long id){

        return departmentRepository.deleteById(id);
    }
}
