package first.service;

import first.dto.SectionDTO;
import first.entity.LecturerEntity;
import first.entity.ParticipantEntity;
import first.entity.SectionEntity;

import java.util.List;
import java.util.Optional;

public interface AdminService {
    Iterable<ParticipantEntity> getAllParticipants();
    List<ParticipantEntity> getParticipantsBySection(Long id);
    Iterable<LecturerEntity> getAllLecturers();
    List<LecturerEntity> getLecturersBySection(Long id);
    void createSection(SectionDTO dto);
    void deleteSection(Long id);
}
