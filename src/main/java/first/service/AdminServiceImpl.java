package first.service;

import first.convert.SectionConverter;
import first.dto.SectionDTO;
import first.entity.LecturerEntity;
import first.entity.ParticipantEntity;
import first.entity.SectionEntity;
import first.repo.LecturerRepo;
import first.repo.ParticipantRepo;
import first.repo.SectionRepo;
import org.springframework.stereotype.Service;
import org.thymeleaf.standard.processor.StandardHrefTagProcessor;

import java.util.List;
import java.util.Optional;


@Service
public class AdminServiceImpl implements AdminService{

   private final ParticipantRepo participantRepo;
   private final LecturerRepo lecturerRepo;
   private final SectionRepo sectionRepo;
   private final SectionConverter sectionConverter;

    public AdminServiceImpl(ParticipantRepo repo, LecturerRepo lecturerRepo, SectionRepo sectionRepo, SectionConverter sectionConverter) {
        this.participantRepo = repo;
        this.lecturerRepo = lecturerRepo;
        this.sectionRepo = sectionRepo;
        this.sectionConverter = sectionConverter;
    }

    @Override
    public Iterable<ParticipantEntity> getAllParticipants() {
        return participantRepo.findAll();
    }

    @Override
    public List<ParticipantEntity> getParticipantsBySection(Long id) {
        if (sectionRepo.existsById(id)) {
            SectionEntity sectionEntity = sectionRepo.findById(id).get();
            return sectionEntity.getParticipantEntities();
        }
        throw new RuntimeException();
    }

    @Override
    public Iterable<LecturerEntity> getAllLecturers() {

        return lecturerRepo.findAll();
    }

    @Override
    public List<LecturerEntity> getLecturersBySection(Long id) {
        if (sectionRepo.existsById(id)) {
            SectionEntity sectionEntity = sectionRepo.findById(id).get();
           return sectionEntity.getLecturerEntities();
        }
        throw new RuntimeException();
    }

    @Override
    public void createSection(SectionDTO dto) {
        SectionEntity sectionEntity = sectionConverter.convert(dto);
        sectionRepo.save(sectionEntity);
    }

    @Override
    public void deleteSection(Long id) {
        sectionRepo.deleteById(id);
    }
}
