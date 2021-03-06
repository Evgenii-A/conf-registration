package first.service;

import first.entity.ParticipantEntity;
import first.repo.ParticipantRepo;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class AddParticipantServiceImpl implements AddParticipantService {

    private final ParticipantRepo participantRepo;

    public AddParticipantServiceImpl(ParticipantRepo participantRepo) {
        this.participantRepo = participantRepo;
    }

    @Override
    @Transactional
    public void addParticipant(ParticipantEntity participant) {
        System.out.println("addParticipant invoked");
        participantRepo.save(participant);
    }
}
