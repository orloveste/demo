package practical.project.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import practical.project.demo.model.Session;
import practical.project.demo.service.SessionService;

import java.util.List;

@RestController
@RequestMapping("/sessions")
public class SessionController {
    @Autowired
    SessionService sessionService;
    //get
    @GetMapping
    public List<Session> findAllSesions() {
        return sessionService.findAllSessions();
    }
    //get endpoint
    @GetMapping
    @RequestMapping("/session/{id}")
    public Session findSessionById(@PathVariable Integer id) {
        return sessionService.getSessionById(id);
    }

    @PostMapping("/session")
    public Session addSession(@RequestBody Session session) {
        return sessionService.createSession(session);
    }

    //delete by id
    @DeleteMapping
    @RequestMapping(value = "/session/{id}")
    public void deleteSessionById (@PathVariable Integer id) {
        sessionService.deleteSessionById(id);
    }
}
