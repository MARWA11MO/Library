package com.application.courselibrary.controller;

import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.stereotype.Controller;
import com.application.courselibrary.entity.AdminEntity;
import com.application.courselibrary.repository.AdminRepo;

@RestController
public class SignupController {
@Autowired 
private AdminRepo adminrepo;



@PostMapping("/admin")
public String createaccount (@RequestBody AdminEntity Admin){
    if (adminrepo.findByemail(Admin.getEmail())) {
        return "email is already exists";
    }

    else{
 if (!isValidEmail(Admin.getEmail())){return "the email must be vailed";}

if (Admin.getUsername().length() < 4){return "the username must be  4 charachters or more";}

if (Admin.getPassword().length()<6){return "the password must be  6 characters or more";}

else{
    adminrepo.save(Admin);
   
     return "created sucessfully";
}

        
    }


}


private boolean isValidEmail(String email) {
    // Regular expression for basic email validation
    String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    Pattern pattern = Pattern.compile(emailRegex);
    return pattern.matcher(email).matches();
}






}
