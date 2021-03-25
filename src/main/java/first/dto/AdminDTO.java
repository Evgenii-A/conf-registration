package first.dto;

import first.entity.SectionEntity;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
public class AdminDTO {

    private List<SectionEntity> sectionEntities;
    private String password = "password";
    private String login = "login";

}
