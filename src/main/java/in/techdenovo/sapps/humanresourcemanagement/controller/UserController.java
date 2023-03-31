package in.techdenovo.sapps.humanresourcemanagement.controller;

import in.techdenovo.sapps.humanresourcemanagement.dto.UserDto;
import in.techdenovo.sapps.humanresourcemanagement.model.User;
import in.techdenovo.sapps.humanresourcemanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/add")
    public String showUserForm(Model model) {
        User user = new User();
        model.addAttribute("user", user);
//        System.out.println(model.getAttribute("user"));
        return "add-user";
    }

    @PostMapping("/add")
    public String addUser(@ModelAttribute("user") UserDto userDto) {
        if (!userDto.getFirstName().isEmpty()) {
            User user =new User();
            user.setFirstName(userDto.getFirstName());
            SimpleDateFormat simpleDateFormat= new SimpleDateFormat("yyyy-MM-dd");
            try{
                user.setJoiningDate(simpleDateFormat.parse(userDto.getJoiningDate()));
            }catch(ParseException e){
                e.printStackTrace();
            }
            user.setLastName(userDto.getLastName());
            user.setAddressLine1(userDto.getAddressLine1());
            user.setAddressLine2(userDto.getAddressLine2());
            user.setEmailPrimary(userDto.getEmailPrimary());
            user.setEmailSecondary(userDto.getEmailSecondary());
            user.setMobileNo(userDto.getMobileNo());
            user.setPassword(userDto.getPassword());
            user.setCity(userDto.getCity());
            user.setPinCode(userDto.getPinCode());
            user.setState(userDto.getState());
            user.setStatus(userDto.getStatus());
            userService.addUser(user);
        }
        return "success";
    }
    @GetMapping("/list")
    public String getAllUsers(Model model){
        List<User> users= new ArrayList<>();
        users = userService.getAllUsers();
        model.addAttribute("users",users);
        return "all-user";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable long id, Model model){
        if(id!=0){
            User user=userService.showUserForm(id);
            model.addAttribute("user",user);
            return "edit-user";
        }
        else{
            return null;
        }
    }
    @PostMapping("/edit")
    public String editUser(@ModelAttribute("user") User user){
        System.out.println("Inside edit post");
        /*if((user.getId())!=0){
            User existingUser= userService.getUserById(user.getId());
            if(existingUser!=null){
                existingUser.setJoiningDate(user.getJoiningDate());
                existingUser.setFirstName(user.getFirstName());
                existingUser.setLastName(user.getLastName());
                existingUser.setMobileNo(user.getMobileNo());
                existingUser.setPassword(user.getPassword());
                existingUser.setEmailPrimary(user.getEmailPrimary());
                existingUser.setEmailSecondary(user.getEmailSecondary());
                existingUser.setAddressLine1(user.getAddressLine1());
                existingUser.setAddressLine2(user.getAddressLine2());
                existingUser.setState(user.getState());
                existingUser.setCity(user.getCity());
                existingUser.setPinCode(user.getPinCode());
                existingUser.setStatus(user.getStatus());
                userService.editUser(existingUser);
            }

        }*/
        return "success";

    }

    @GetMapping("/view/{id}")
    public String showViewForm(@PathVariable long id, Model model){
        if(id!=0){
            User user2=userService.showUserForm(id);
            model.addAttribute("user2",user2);
            return "view-user";
        }
        else{
            return null;
        }
    }
    @PostMapping("/view")
    public String viewUser(@ModelAttribute("user2") User user){
        if((user.getId())!=0){
            User existingUser= userService.getUserById(user.getId());
            if(existingUser!=null){
                existingUser.setId(user.getId());
                existingUser.setJoiningDate(user.getJoiningDate());
                existingUser.setFirstName(user.getFirstName());
                existingUser.setLastName(user.getLastName());
                existingUser.setMobileNo(user.getMobileNo());
                existingUser.setPassword(user.getPassword());
                existingUser.setEmailPrimary(user.getEmailPrimary());
                existingUser.setEmailSecondary(user.getEmailSecondary());
                existingUser.setAddressLine1(user.getAddressLine1());
                existingUser.setAddressLine2(user.getAddressLine2());
                existingUser.setState(user.getState());
                existingUser.setCity(user.getCity());
                existingUser.setPinCode(user.getPinCode());
                existingUser.setStatus(user.getStatus());
                userService.viewUser(existingUser);
            }

        }
        return "success";

    }
   // @GetMapping("/remove")
   // public String showRemoveForm(Model model){

//        User user =new User();
  //      model.addAttribute("user",user);
    //    return "remove-user";

    //}
@GetMapping("/remove/{id}")
    public  String removeUser(@PathVariable long id){
        userService.deleteUser(id);
        return "success";
    }

//@GetMapping("/view/{id}")
   // public String showUser(@PathVariable long id,User user){



}