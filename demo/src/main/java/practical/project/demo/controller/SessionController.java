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

    //GET endpoint to retrive all the sessions
    @GetMapping
    public List<Session> findAllSessions(){
        return sessionService.findAllSessions();
    }

    //GET endpoint to retrieve a session by id
    @GetMapping("/session/{id}")
    public Session findSessionById(@PathVariable Long id){
        return sessionService.getSessionById(id);
    }

    //POST endpoint to create a new session
    @PostMapping("/session")
    public Session addSession(@RequestBody Session session){
        return sessionService.createSession(session);
    }

    //DELETE endpoint to delete a session by id
    @DeleteMapping
    @RequestMapping("/session/{id}")
    public void deleteSessionById(@PathVariable Long id){
        sessionService.deleteSessionById(id);

    }
}
