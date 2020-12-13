package practical.project.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import practical.project.demo.model.Session;
import practical.project.demo.model.Speaker;
import practical.project.demo.service.SessionService;
import practical.project.demo.service.SpeakerService;

import java.util.List;

@RestController
@RequestMapping("/speakers")
public class SpeakerController {
    @Autowired
    SpeakerService speakerService;
    //get
    @GetMapping
    public List<Speaker> findAllSpeakers() {
        return speakerService.findAllSpeakers();
    }
    //get endpoint
    @GetMapping
    @RequestMapping("{id_speaker}")
    public Speaker finndSpeakerById(@PathVariable Integer id) {
        return speakerService.getSpeakerById(id);
    }

    @PostMapping
    public Speaker addSpeaker(@RequestBody Speaker speaker) {
        return speakerService.createSpeaker(speaker);//createSession(session);
    }

    //delete by id
    @DeleteMapping
    @RequestMapping("{id_speaker}")
    public void deleteSpeakerById (Integer id) {
        speakerService.deleteSpeakerById(id);//sessionService.deleteSessionById(id);
    }
}
