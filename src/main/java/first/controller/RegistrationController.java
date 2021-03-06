package first.controller;

import first.dto.ParticipantDTO;
import first.entity.ParticipantEntity;
import first.service.AddParticipantService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/registration")
public class RegistrationController {

    private final Converter<ParticipantDTO, ParticipantEntity> participantConverter;
    private final AddParticipantService participantService;

    public RegistrationController(Converter<ParticipantDTO, ParticipantEntity> participantConverter,
                                  AddParticipantService participantService) {
        this.participantConverter = participantConverter;
        this.participantService = participantService;
    }

    @PostMapping("/add")
    public String addParticipant(@RequestBody ParticipantDTO participantDTO) {

        ParticipantEntity participant = participantConverter.convert(participantDTO);

        participantService.addParticipant(participant);
        return "fff";
    }
}
