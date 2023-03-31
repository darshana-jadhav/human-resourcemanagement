package in.techdenovo.sapps.humanresourcemanagement.repository;

import in.techdenovo.sapps.humanresourcemanagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface UserRepository extends JpaRepository<User,Long> {

    public User deleteById( long id);
    }

