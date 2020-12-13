package practical.project.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import practical.project.demo.model.Speaker;
import practical.project.demo.repository.SpeakerRepository;

import java.util.List;

@Service
public class SpeakerService {
    //trebuie sa injectam repository
    @Autowired
    SpeakerRepository speakerRepository;

    //findAll
    public List<Speaker> findAllSpeakers(){
        return speakerRepository.findAll();
    }
    //session dupa id
    public Speaker getSpeakerById(Integer id) {
        return speakerRepository.getOne(id);
    }
    //create session
    public Speaker createSpeaker(Speaker newSpeaker) {
        return speakerRepository.saveAndFlush(newSpeaker);
    }

    //delete
    public void deleteSpeakerById(Integer id) {
        speakerRepository.deleteById(id);
    }
}
