package first.repo;

import first.entity.ParticipantEntity;
import org.springframework.data.repository.CrudRepository;

public interface ParticipantRepo extends CrudRepository<ParticipantEntity, Long> {
}
