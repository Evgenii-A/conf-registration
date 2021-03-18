package first.convert;

import com.fasterxml.jackson.databind.ObjectMapper;
import first.dto.ParticipantDTO;
import first.entity.ParticipantEntity;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


@Component
public class ParticipantDtoToParticipantConverter implements Converter<ParticipantDTO, ParticipantEntity> {

    private ObjectMapper objectMapper;

    public ParticipantDtoToParticipantConverter(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Override
    public ParticipantEntity convert(ParticipantDTO participantDTO) {

        // настроить на парсинг даты
        return objectMapper.convertValue(participantDTO, ParticipantEntity.class);

    }
}
