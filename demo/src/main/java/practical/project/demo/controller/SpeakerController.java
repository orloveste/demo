package practical.project.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import practical.project.demo.model.Speaker;
import practical.project.demo.service.SpeakerService;
import java.util.List;

@RestController
@RequestMapping("/speakers")
public class SpeakerController {
    @Autowired
    SpeakerService speakerService;
    //get
    @RequestMapping(method = RequestMethod.GET)
    public List<Speaker> speakerList() {
        return speakerService.getAllSpeakers();
    }
    //get endpoint
    @RequestMapping(value = "/speaker/{id}", method = RequestMethod.GET)
    public Speaker getSpeakerById(@PathVariable Integer id) {
        return speakerService.getSpeakerById(id);
    }
    @RequestMapping(value = "/speaker", method = RequestMethod.POST)
    public Speaker createSpeaker(@RequestBody Speaker speaker) {
        return speakerService.addSpeaker(speaker);
    }
    //delete by id
    @RequestMapping(value = "/speaker/{id}", method = RequestMethod.DELETE)
    public void deleteSpeakerById (@PathVariable Integer id) {
        speakerService.deleteSpeakerById(id);
    }
}
