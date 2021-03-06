package first.dto;

import first.model.ParticipationForm;
import lombok.Getter;

import java.beans.ConstructorProperties;

import java.time.LocalDate;

@Getter
public class ParticipantDTO {

    private String firstName;
    private String lastName;
    private String middleName;
    private String birthDate;
    private int sectionId;
    private String dateOfParticipation;
    private ParticipationForm participationForm;

    // сопоставляет c параметрами JSON
    @ConstructorProperties({"firstName", "lastName", "middleName", "birthDate", "sectionId", "dateOfParticipation", "participationForm"})
    public ParticipantDTO(String firstName, String lastName, String middleName, String birthDate, int sectionId, String dateOfParticipation, ParticipationForm participationForm) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.birthDate = birthDate;
        this.sectionId = sectionId;
        this.dateOfParticipation = dateOfParticipation;
        this.participationForm = participationForm;
    }
}