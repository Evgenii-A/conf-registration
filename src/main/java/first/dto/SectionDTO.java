package first.dto;

import first.entity.ParticipantEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Id;
import java.beans.ConstructorProperties;
import java.util.List;

@NoArgsConstructor
@Setter
@Getter
public class SectionDTO {

    private Long id;
    private String name;
    private Long capacity;

@ConstructorProperties({"name", "capacity"})
    public SectionDTO(String name, Long capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}
