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
    public List<Speaker> /*findAllSpeakers()*/ getAllSpeakers() {//rev1
        return speakerRepository.findAll();
    }
    //speaker dupa id
    public Speaker getSpeakerById(Integer id/*Speaker*/) {//rev1
        return speakerRepository.getOne(id/*Speaker*/);//rev1
    }
    //create speaker
    public Speaker /*create*/addSpeaker(Speaker /*newS*/speaker) {//rev1
        return speakerRepository.saveAndFlush(/*newS*/speaker);//rev1
    }

    //delete
    public void deleteSpeakerById(Integer id/*Speaker*/) {
        speakerRepository.deleteById(id/*Speaker*/);
    }
}
