package Security.OAuth2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class Controller {

    @GetMapping("/")
    public String greeting(){
        return "Hi welcome";
    }
    @GetMapping("/secured")
    public String getUserName(Principal principal){
        return "Hi Welcome!";
    }


}
