package practical.project.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity(name = "speakers")
public class Speaker {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long speakerId;

    private String speakerName;
    private String speakerFirstName;
    private String speakerCompany;


    @ManyToMany(mappedBy = "speakers")
    List<Session> sessions;

    public Speaker() {
    }

    public Long getSpeakerId() {
        return speakerId;
    }

    public void setSpeakerId(Long speakerId) {
        this.speakerId = speakerId;
    }

    public String getSpeakerName() {
        return speakerName;
    }

    public void setSpeakerName(String speakerName) {
        this.speakerName = speakerName;
    }

    public String getSpeakerFirstName() {
        return speakerFirstName;
    }

    public void setSpeakerFirstName(String speakerFirstName) {
        this.speakerFirstName = speakerFirstName;
    }

    public String getSpeakerCompany() {
        return speakerCompany;
    }

    public void setSpeakerCompany(String speakerCompany) {
        this.speakerCompany = speakerCompany;
    }

    public List<Session> getSessions() {
        return sessions;
    }

    public void setSessions(List<Session> sessions) {
        this.sessions = sessions;
    }
}
