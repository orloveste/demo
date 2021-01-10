package practical.project.demo.logIn.model;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String userName;
    private String password;

    @ManyToOne
    @JoinColumn(name = "roleId")
    Role userRoles;
}
