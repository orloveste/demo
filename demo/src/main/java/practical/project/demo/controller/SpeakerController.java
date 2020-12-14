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
    /*@GetMapping
    public List<Speaker> findAllSpeakers() {
        return speakerService.findAllSpeakers();
    }*/
    @RequestMapping(method = RequestMethod.GET)
    public List<Speaker> speakerList() {
        return speakerService.getAllSpeakers();
    }
    //get endpoint
    /*@GetMapping
    @RequestMapping("{id_Speaker}")
    public Speaker finndSpeakerById(@PathVariable Integer idSpeaker) {
        return speakerService.getSpeakerById(idSpeaker);
    }*/
    @RequestMapping(value = "{id}", method = RequestMethod.GET)//rev1
    public Speaker getSpeakerById(@PathVariable Integer id) {
        return speakerService.getSpeakerById(id);
    }

    @PostMapping//rev1
    public Speaker addSpeaker(@RequestBody Speaker speaker) {
        return speakerService/*.createSpeaker*/.addSpeaker (speaker);//createSession(session);
    }

    //delete by id
    /*@DeleteMapping*/ //rev1
    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)/*_speaker*/
    public void deleteSpeakerById (Integer id/*Speaker*/) {
        speakerService.deleteSpeakerById(id/*Speaker*/);//sessionService.deleteSessionById(id);
    }
}
