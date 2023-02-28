package in.techdenovo.sapps.humanresourcemanagement.repository;

import in.techdenovo.sapps.humanresourcemanagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Long> {

    }

