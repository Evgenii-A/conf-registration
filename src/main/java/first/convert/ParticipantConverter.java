package first.convert;

import com.fasterxml.jackson.databind.ObjectMapper;
import first.dto.ParticipantDTO;
import first.entity.ParticipantEntity;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;



@Component
public class ParticipantConverter implements Converter<ParticipantDTO, ParticipantEntity> {

    private ObjectMapper objectMapper;

    public ParticipantConverter(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Override
    public ParticipantEntity convert(ParticipantDTO participantDTO) {

        return objectMapper.convertValue(participantDTO, ParticipantEntity.class);

    }
}
