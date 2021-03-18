package first.controller;

import first.entity.ParticipantEntity;
import first.service.AdminService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping("/getAllParticipants")
    public String getAllParticipants() {

        Iterable<ParticipantEntity> list = adminService.getAllParticipants();
        ArrayList<ParticipantEntity> participantEntities = new ArrayList<>();
        for (ParticipantEntity participantEntity : list) {
            participantEntities.add(participantEntity);
        }
        return  participantEntities.toString();
    }
}