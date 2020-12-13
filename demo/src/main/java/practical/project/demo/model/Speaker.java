package practical.project.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity(name = "speakers")
public class Speaker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_speaker;
    private String name_speaker;

    @ManyToMany(mappedBy = "speakers")
    List<Session> sessions;

}
