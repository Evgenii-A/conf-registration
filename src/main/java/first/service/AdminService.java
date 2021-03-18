package first.service;

import first.entity.ParticipantEntity;
import first.entity.SectionEntity;

import java.util.List;

public interface AdminService {
    public Iterable<ParticipantEntity> getAllParticipants();
    public List<ParticipantEntity> getParticipantsBySection();
    public SectionEntity createSection();
}
