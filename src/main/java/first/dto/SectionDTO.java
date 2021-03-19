package first.dto;

import first.entity.ParticipantEntity;
import lombok.Getter;

import java.beans.ConstructorProperties;
import java.util.List;


@Getter
public class SectionDTO {
    private String name;
    private Long capacity;

@ConstructorProperties({"name", "capacity"})
    public SectionDTO(String name, Long capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}
