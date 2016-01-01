import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;

import com.security.person.User;
import com.security.service.core.ServiceRegistery;
import com.security.service.user.UserService;

@Controller
public class LoginController {
	@Autowired
	ServiceRegistery serviceRegistery;
	
	/*
     * This method will list all existing employees.
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST )
    @RequestBody public String listEmployees(@RequestBody User user) {
 
        User user = ((UserService) serviceRegistery.forClass(User.class)).getUserUsingUserNameAndPassword(user.getUserName(), user.getPassWord());
        if(user == null) {
        	return "Not found user with UserName" + user.getUserName() + " and Password " + user.getPassWord();
        } else {
        	return "Login Sucess";
        }
    }	
}
