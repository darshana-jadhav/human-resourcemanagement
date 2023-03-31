package in.techdenovo.sapps.humanresourcemanagement.service;

import in.techdenovo.sapps.humanresourcemanagement.model.User;
import in.techdenovo.sapps.humanresourcemanagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
     private UserRepository userRepository;

        public User addUser(User user){

            return userRepository.save(user);
        }
    public List<User> getAllUsers(){

        return userRepository.findAll();
    }
    public User showUserForm(long id){

        return userRepository.findById(id).orElse(null);
    }
    public User getUserById(long id){

        return userRepository.findById(id).orElse(null);
    }
    public User editUser(User existingUser){

        return userRepository.save(existingUser);
    }
    public User viewUser(User existingUser){

        return userRepository.save(existingUser);
    }
    public User deleteUser(long id){
            return userRepository.deleteById(id);
    }

    }
