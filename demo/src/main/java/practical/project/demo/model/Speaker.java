package practical.project.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity(name = "speakers")
public class Speaker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSpeaker;//id for entry in postman
    private String nameSpeaker;//id for entry in postman
//    private Long  speakerId;
//    private String speakerName;

    @ManyToMany(mappedBy = "speakers")
    List<Session> sessions;
    public Speaker() {}

}
