package first.convert;

import first.dto.ParticipantDTO;
import first.entity.ParticipantEntity;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Component
public class ParticipantDtoToParticipantConverter implements Converter<ParticipantDTO, ParticipantEntity> {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    @Override
    public ParticipantEntity convert(ParticipantDTO participantDTO) {

        return ParticipantEntity.builder()
                .firstName(participantDTO.getFirstName())
                .lastName(participantDTO.getLastName())
                .middleName(participantDTO.getMiddleName())
                .birthDate(LocalDate.parse(participantDTO.getBirthDate(), FORMATTER))
                .sectionId(participantDTO.getSectionId())
                .dateOfParticipation(LocalDate.parse(participantDTO.getDateOfParticipation(), FORMATTER))
                .participationForm(participantDTO.getParticipationForm())
                .build();
    }
}
