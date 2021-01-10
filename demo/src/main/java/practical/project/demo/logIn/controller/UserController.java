package practical.project.demo.logIn.controller;

import org.graalvm.compiler.lir.LIRInstruction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import practical.project.demo.logIn.model.User;
import practical.project.demo.logIn.service.UserService;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }
}
