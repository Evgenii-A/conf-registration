package first.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = "public", name = "admin_entity")
public class AdminEntity {
    private String login;
    private String password;
    @Id
    private Long id = 1L;
//    @OneToMany(fetch = FetchType.LAZY)
//    private List<SectionEntity> sectionEntities;
}
