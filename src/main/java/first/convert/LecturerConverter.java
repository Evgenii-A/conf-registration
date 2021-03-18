package first.convert;

import first.dto.LecturerDTO;
import first.entity.LecturerEntity;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class LecturerConverter implements Converter<LecturerDTO, LecturerEntity> {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    private static final DateTimeFormatter FORMATTER2 = DateTimeFormatter.ofPattern("dd.MM.yyyy HH.mm");

    private String Id;
    private String firstName;
    private String lastName;
    private String middleName;
    private LocalDate birthDate;
    private String topic;
    private int sectionID;
    private LocalDateTime performanceTime;
    private String email;
    private String password;
    private String login;

    @Override
    public LecturerEntity convert(LecturerDTO lecturerDTO) {

        return LecturerEntity.builder()
                .firstName(lecturerDTO.getFirstName())
                .lastName(lecturerDTO.getLastName())
                .middleName(lecturerDTO.getMiddleName())
                .sectionID(lecturerDTO.getSectionID())
                .birthDate(LocalDate.parse(lecturerDTO.getBirthDate(), FORMATTER))
                .performanceTime(LocalDateTime.parse(lecturerDTO.getPerformanceTime(), FORMATTER2))
                .login(lecturerDTO.getLogin())
                .password((lecturerDTO.getPassword()))
                .email(lecturerDTO.getEmail())
                .topic(lecturerDTO.getTopic())
                .build();
    }
}

