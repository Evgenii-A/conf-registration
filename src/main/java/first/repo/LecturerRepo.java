package first.repo;

import first.entity.LecturerEntity;
import org.springframework.data.repository.CrudRepository;

public interface LecturerRepo extends CrudRepository<LecturerEntity, Long> {
}
