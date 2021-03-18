package first.service;

import first.entity.ParticipantEntity;
import first.entity.SectionEntity;
import first.repo.ParticipantRepo;
import org.springframework.stereotype.Service;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService{

   private final ParticipantRepo participantRepo;

    public AdminServiceImpl(ParticipantRepo repo) {
        this.participantRepo = repo;
    }

    @Override
    public Iterable<ParticipantEntity> getAllParticipants() {

        return participantRepo.findAll();
    }

    @Override
    public List<ParticipantEntity> getParticipantsBySection() {
        throw new NotImplementedException();
    }

    @Override
    public SectionEntity createSection() {
        throw new RuntimeException("not implemented");
    }
}
