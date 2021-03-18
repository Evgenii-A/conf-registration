package first.repo;

import first.entity.SectionEntity;
import org.springframework.data.repository.CrudRepository;

public interface SectionRepo extends CrudRepository<SectionEntity, Long> {
}
