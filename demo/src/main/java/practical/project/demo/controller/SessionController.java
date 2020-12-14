package practical.project.demo.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
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
    @GetMapping/*("idSession")*/ //rev1
    @RequestMapping("/{id}")/*Session*/
    public Session finndSessionById(@PathVariable ("id") Integer id/*Session*/) {
        return sessionService.getSessionById(id/*Session*/);
    }

    @PostMapping
    public Session addSession(@RequestBody Session session) {
        return sessionService.createSession(session);
    }

    //delete by id
    @DeleteMapping //rev1
    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)/*_session*/
    public void deleteSessionById (Integer id) {
        sessionService.deleteSessionById(id);
    }

}
