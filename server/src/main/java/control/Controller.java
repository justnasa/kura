package control;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import packets.NewUser.NewUserRequest;
import packets.NewUser.NewUserResponse;

import javax.validation.Valid;

@RestController
@RequestMapping("/")
public class Controller {

    /**
     * This method is called when a new user joins and it returns the user's new team and their id.
     * @param request NewUserRequest (nickname) as JSON
     * @return NewUserResponse (id, team) as JSON
     */
    @RequestMapping(value = {"/newUser"}, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public NewUserResponse addUser(@Valid @RequestBody NewUserRequest request) {
        System.out.println(request.getName());
        return new NewUserResponse(13, true);
    }

    // ---------------------------- TEST ---------------------------------------------
    @RequestMapping(value = {"/test"}, method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String test() {
        return "Hello World!";
    }
}
