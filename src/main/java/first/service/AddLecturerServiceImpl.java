package first.service;

import first.convert.LecturerConverter;
import first.dto.LecturerDTO;
import first.entity.LecturerEntity;
import first.repo.LecturerRepo;
import org.springframework.stereotype.Service;

@Service
public class AddLecturerServiceImpl implements AddLecturerService{
    private final LecturerRepo lecturerRepo;

    public AddLecturerServiceImpl(LecturerRepo lecturerRepo) {
        this.lecturerRepo = lecturerRepo;
    }

    @Override
    public void addLecturer(LecturerEntity lecturer) {
        lecturerRepo.save(lecturer);
    }
}
