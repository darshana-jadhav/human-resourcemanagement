package in.techdenovo.sapps.humanresourcemanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private String joiningDate;
    private String firstName;
    private String lastName;
    private String mobileNo;
    private String password;
    private String emailPrimary;
    private String emailSecondary;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String pinCode;
    private String state;
    private String status;

}
