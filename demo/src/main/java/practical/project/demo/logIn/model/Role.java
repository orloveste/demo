package practical.project.demo.logIn.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity(name="roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String roleName;

    @OneToMany(mappedBy = "userRole")
    List<User> user;

}
