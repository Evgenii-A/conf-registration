package first.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
@Table(schema = "public", name = "lecturer_entity")
public class LecturerEntity {
    @Id
    @GeneratedValue
    private Long Id;
    private String firstName;
    private String lastName;
    private String middleName;
    private LocalDate birthDate;
    private String topic;
    private Long sectionID;
    private LocalDateTime performanceTime;
    private String email;
    private String password;
    private String login;
}
