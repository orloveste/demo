package practical.project.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import practical.project.demo.model.Session;
import practical.project.demo.repository.SessionRepository;

import java.util.List;

@Service
public class SessionService {
    //trebuie sa injectam repository
    @Autowired
    SessionRepository sessionRepository;

    //findAll
    public List<Session> findAllSessions(){
        return sessionRepository.findAll();
    }
    //session dupa id
    public Session getSessionById(Integer id/*Session*/) {//rev1
        return sessionRepository.getOne(id/*Session*/);//rev1
    }
    //create session
    public Session createSession(Session newSession) {
        return sessionRepository.saveAndFlush(newSession);
    }
    //delete
    public void deleteSessionById(Integer id) {
        sessionRepository.deleteById(id);
    }


}
