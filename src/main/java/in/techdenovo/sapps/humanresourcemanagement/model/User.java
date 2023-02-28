package in.techdenovo.sapps.humanresourcemanagement.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Temporal(TemporalType.DATE)
    private Date joiningDate;
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
