package pl.dmichalski.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.dmichalski.entity.User;
import pl.dmichalski.entity.request.AddUserRequest;
import pl.dmichalski.repository.UserRepository;

@RestController
@RequestMapping(path = "/users")
public class UserController {

    private final UserRepository userRepository;

    @Value("${lwt.application.five-minute-jobs}")
    private boolean fiveMinuteJobsEnabled;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<User> findAllUsers() {
        System.out.println(fiveMinuteJobsEnabled);
        return userRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addNewWebUser(@RequestBody AddUserRequest addUserRequest) {
        User user = new User();
        user.setName(addUserRequest.getName());
        user.setSurname(addUserRequest.getSurname());
        userRepository.save(user);
    }

}
