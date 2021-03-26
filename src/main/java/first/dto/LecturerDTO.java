package first.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import lombok.Builder;
import lombok.Getter;

import java.beans.ConstructorProperties;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Builder
@Getter
public class LecturerDTO {

    private final String firstName;
    private final String lastName;
    private final String middleName;
    private final String topic;
    private final String email;
    private final String password;
    private final String login;
    private Long sectionId;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    private LocalDate birthDate;

    @JsonFormat(pattern = "yyyy-MM-dd HH-mm")
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    private LocalDateTime performanceTime;


    @ConstructorProperties({"firstName", "lastName", "middleName", "topic", "email", "password", "login", "section_id", "birthDate", "performanceTime"})
    public LecturerDTO(String firstName, String lastName, String middleName,
                       String topic, String email, String password, String login, Long sectionId, LocalDate birthDate, LocalDateTime performanceTime) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.topic = topic;
        this.email = email;
        this.password = password;
        this.login = login;
        this.sectionId = sectionId;
        this.birthDate = birthDate;
        this.performanceTime = performanceTime;
    }
}
