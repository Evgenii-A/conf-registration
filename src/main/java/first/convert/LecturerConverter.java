package first.convert;

import com.fasterxml.jackson.databind.ObjectMapper;
import first.dto.LecturerDTO;
import first.entity.LecturerEntity;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class LecturerConverter implements Converter<LecturerDTO, LecturerEntity> {

    private final ObjectMapper objectMapper;

    public LecturerConverter(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Override
    public LecturerEntity convert(LecturerDTO lecturerDTO) {

        return objectMapper.convertValue(lecturerDTO, LecturerEntity.class);
    }
}

