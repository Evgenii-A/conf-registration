package first.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import lombok.Getter;

import java.beans.ConstructorProperties;
import java.time.LocalDate;

@Getter
public class ParticipantDTO {

    private String login;
    private String password;
    private String firstName;
    private String lastName;
    private String middleName;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    private LocalDate birthDate;
    private Long sectionId;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    private LocalDate dateOfParticipation;

    @ConstructorProperties({"login", "password", "firstName", "lastName", "middleName", "birthDate", "sectionId", "dateOfParticipation"})
    public ParticipantDTO(String login, String password, String firstName, String lastName, String middleName, LocalDate birthDate, Long sectionId, LocalDate dateOfParticipation) {
        this.login = login;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.birthDate = birthDate;
        this.sectionId = sectionId;
        this.dateOfParticipation = dateOfParticipation;
    }
}