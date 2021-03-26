package first.controller;

import first.convert.LecturerConverter;
import first.dto.LecturerDTO;
import first.dto.ParticipantDTO;
import first.entity.LecturerEntity;
import first.entity.ParticipantEntity;
import first.service.AddLecturerService;
import first.service.AddParticipantService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;

@RestController
@RequestMapping("/registration")
public class RegistrationController {

    private final Converter<ParticipantDTO, ParticipantEntity> participantConverter;
    private final Converter<LecturerDTO, LecturerEntity> lecturerConverter;
    private final AddParticipantService participantService;
    private final AddLecturerService lecturerService;

    public RegistrationController(Converter<ParticipantDTO, ParticipantEntity> participantConverter,
                                  Converter<LecturerDTO, LecturerEntity> lecturerConverter,
                                  AddParticipantService participantService, AddLecturerService lecturerService) {
        this.participantConverter = participantConverter;
        this.lecturerConverter = lecturerConverter;
        this.participantService = participantService;
        this.lecturerService = lecturerService;
    }

    @PostMapping("/addParticipant")
    public ResponseEntity<Void> addParticipant(@RequestBody  ParticipantDTO participantDTO) {

        ParticipantEntity participant = participantConverter.convert(participantDTO);

        participantService.addParticipant(participant);
        return new ResponseEntity<>(HttpStatus.OK);

    }

    @PostMapping("/addLecturer")
    public ResponseEntity<Void> addParticipant(@RequestBody LecturerDTO lecturerDTO) {

        LecturerEntity lecturer = lecturerConverter.convert(lecturerDTO);

        lecturerService.addLecturer(lecturer);

        return new ResponseEntity<>(HttpStatus.OK);

    }
    // Exeption Handler
}

