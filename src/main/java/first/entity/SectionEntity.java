package first.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;
@Component
@Setter
@Entity
@NoArgsConstructor
@Table(schema = "public", name = "section_entity")
public class SectionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "section_id")
    private List<ParticipantEntity> participantEntities;
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "section_id")
    private List<LecturerEntity> lecturerEntities;

    public SectionEntity(String name) {
        this.name = name;
    }
}
