package pl.dmichalski.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.dmichalski.entity.User;
import pl.dmichalski.repository.UserRepository;

import java.util.List;

@RestController(value = "users")
public class UserController {

    private UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addNewWebUser(@RequestBody String name, @RequestBody String surname) {
        User user = new User();
        user.setName(name);
        user.setSurname(surname);
        userRepository.save(user);
    }

}
