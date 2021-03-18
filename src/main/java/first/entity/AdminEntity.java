package first.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AdminEntity {
    private String login;
    private String password;
    private Long id;

    public AdminEntity(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public AdminEntity() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
