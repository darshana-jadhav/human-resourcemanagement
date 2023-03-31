package in.techdenovo.sapps.humanresourcemanagement.repository;

import in.techdenovo.sapps.humanresourcemanagement.model.Department;
import in.techdenovo.sapps.humanresourcemanagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long>{

    public Department deleteById(long id);

}
