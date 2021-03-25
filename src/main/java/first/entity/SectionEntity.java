package first.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(schema = "public", name = "section_entity")
public class SectionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long capacity;
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "section_id")
    private List<ParticipantEntity> participantEntities;
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "section_id")
    private List<LecturerEntity> lecturerEntities;

}
