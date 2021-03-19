package first.controller;

import first.dto.SectionDTO;
import first.entity.LecturerEntity;
import first.entity.SectionEntity;
import first.service.AdminService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/admin")
public class AdminController {

    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping("/getAllParticipants")
    public String getAllParticipants() {

     return adminService.getAllParticipants().toString();
    }

    @GetMapping("/getAllParticipantsBySection")
    public String getParticipantsBySection(@RequestBody Long id) {
        return  adminService.getParticipantsBySection(id).toString();
    }

    @GetMapping("/getAllLecturers")
    public String getAllLecturers() {

        Iterable<LecturerEntity> list = adminService.getAllLecturers();
        ArrayList<LecturerEntity> lecturerEntities = new ArrayList<>();
        for (LecturerEntity lecturerEntity1: list) {
            lecturerEntities.add(lecturerEntity1);
        }
        return lecturerEntities.toString();
    }

    @PostMapping("/createSection1")
    public void createSection(@RequestBody SectionDTO dto){

        adminService.createSection(dto);
    }
}