package first.dto;

import lombok.Getter;

import java.beans.ConstructorProperties;


@Getter
public class LecturerDTO {

    private String firstName;
    private String lastName;
    private String middleName;
    private String topic;
    private Long sectionID;
    private String email;
    private String password;
    private String login;
    private String birthDate;
    private String performanceTime;

    @ConstructorProperties({"firstName", "lastName", "middleName", "topic",
            "sectionName", "email", "password", "login", "birthDate", "performanceTime"})

    public LecturerDTO(String firstName, String lastName, String middleName,
                       String topic, Long sectionID,
                       String email, String password, String login, String birthDate, String performanceTime) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.topic = topic;
        this.sectionID = sectionID;
        this.email = email;
        this.password = password;
        this.login = login;
        this.birthDate = birthDate;
        this.performanceTime = performanceTime;
    }
}
