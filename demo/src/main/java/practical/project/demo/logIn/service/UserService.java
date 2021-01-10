package practical.project.demo.logIn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import practical.project.demo.logIn.model.User;
import practical.project.demo.logIn.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    User addUser (User user) {
        return  userRepository.saveAndFlush(user);
    }
}
