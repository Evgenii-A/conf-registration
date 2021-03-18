package first.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(schema = "public", name = "section_entity")
public class SectionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String name;
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "section_id")
    private List<ParticipantEntity> participantEntityList;

}
