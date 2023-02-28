package in.techdenovo.sapps.humanresourcemanagement.repository;

import in.techdenovo.sapps.humanresourcemanagement.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long>{
}
