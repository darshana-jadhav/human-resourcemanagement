package in.techdenovo.sapps.humanresourcemanagement.controller;

import in.techdenovo.sapps.humanresourcemanagement.model.Department;
import in.techdenovo.sapps.humanresourcemanagement.model.User;
import in.techdenovo.sapps.humanresourcemanagement.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    @GetMapping("/add")
    public String ShowDepartmentForm(Model model){
        Department department=new Department();
        model.addAttribute("department",department);
        return "add-department";
    }
   @PostMapping("/add")
   public String addDepartment(@ModelAttribute("department")Department department){
        if(department.getDepartmentName()!=null){
            departmentService.addDepartment(department);
        }
        return "success";
   }
   @GetMapping("/list")
    public String listOfDepartment(Model model){
       List<Department> departments=new ArrayList<>();
       departments=departmentService.getAllDepartment();
       model.addAttribute("departments",departments);
       return "list-department";
   }


    @GetMapping("/remove/{id}")
    public  String removeDepartment(@PathVariable long id){
        departmentService.deleteDepartment(id);
        return "success";
    }


}
