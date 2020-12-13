package practical.project.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity(name = "sessions")
public class Session {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSession;
    private String nameSession;

    @ManyToMany
    @JoinTable(name = "sessions_speakers", joinColumns = @JoinColumn(name = "idSession"),
            inverseJoinColumns = @JoinColumn(name = "idSpeaker"))
    List<Speaker> speakers;

    public Session() {}
    public int getIdSession() {
        return idSession;
    }

    public void setIdSession(int idSession) {
        this.idSession = idSession;
    }

    public String getNameSession() {
        return nameSession;
    }

    public void setNameSession(String nameSession) {
        this.nameSession = nameSession;
    }
}
