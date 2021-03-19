package first.service;

import first.dto.SectionDTO;
import first.entity.LecturerEntity;
import first.entity.ParticipantEntity;
import first.entity.SectionEntity;

import java.util.List;
import java.util.Optional;

public interface AdminService {
    public Iterable<ParticipantEntity> getAllParticipants();
    public Optional<ParticipantEntity> getParticipantsBySection(Long id);
    public Iterable<LecturerEntity> getAllLecturers();
    public Optional<LecturerEntity> getLecturersBySection(Long id);
    public void createSection(SectionDTO dto);
}
