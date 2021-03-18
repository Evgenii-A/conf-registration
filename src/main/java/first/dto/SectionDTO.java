package first.dto;

import first.entity.LecturerEntity;
import first.entity.ParticipantEntity;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Getter
public class SectionDTO {
    private Long sectionId;
    private String name;
    private Long capacity;
    private List<ParticipantEntity> participants;
    private List<LecturerEntity> lecturers;
    private Map <LecturerEntity, LocalDateTime> timetable;

    public SectionDTO(Long sectionId, String name, Long capacity, List<ParticipantEntity> participants,
                      List<LecturerEntity> lecturers, Map<LecturerEntity, LocalDateTime> timetable) {
        this.sectionId = sectionId;
        this.name = name;
        this.capacity = capacity;
        this.participants = participants;
        this.lecturers = lecturers;
        this.timetable = timetable;
    }
}
