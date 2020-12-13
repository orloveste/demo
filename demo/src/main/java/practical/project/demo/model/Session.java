package practical.project.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity(name = "sessions")
public class Session {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_session;
    private String name_session;

    @ManyToMany
    @JoinTable(name = "sessions_speakers", joinColumns = @JoinColumn(name = "id_session"),
            inverseJoinColumns = @JoinColumn(name = "id_speaker"))
    List<Speaker> speakers;

    public Session() {}
    public int getIdSession() {
        return id_session;
    }

    public void setIdSession(int id_session) {
        this.id_session = id_session;
    }

    public String getNameSession() {
        return name_session;
    }

    public void setNameSession(String name_session) {
        this.name_session = name_session;
    }
}
