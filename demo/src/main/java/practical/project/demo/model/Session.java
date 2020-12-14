package practical.project.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity(name = "sessions")
public class Session {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSession;
    private String nameSession;
//    private Long sessionId;
//    private String sessionName;
    @ManyToMany
    @JoinTable(name = "session_speaker", joinColumns = @JoinColumn(name = "session_id"),
            inverseJoinColumns = @JoinColumn(name = "speaker_id"))
    List<Speaker> speakers;

    public Session() {}
    /*public int getIdSession() {
        return idSession;
    }

    public void setIdSession(int idSession) {
        this.idSession = idSession;
    }

    public String getNameSession() {
        return nameSession;
    }

    public void setNameSession(String name_session) {
        this.nameSession = nameSession;
    }*/
}
