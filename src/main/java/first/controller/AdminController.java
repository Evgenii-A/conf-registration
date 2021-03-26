package first.controller;

import first.dto.SectionDTO;
import first.entity.LecturerEntity;
import first.entity.SectionEntity;
import first.service.AdminService;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
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

     return adminService.getAllParticipants().toString();
    }

    @GetMapping("/getAllParticipantsBySection/{id}")
    public String getParticipantsBySection(@PathVariable Long id) {
        return  adminService.getParticipantsBySection(id).toString();
    }

    @GetMapping("/getAllLecturers")
    public String getAllLecturers() {

        return adminService.getAllLecturers().toString();
    }

    @GetMapping("/getAllLecturersBySection/{id}")
    public List<LecturerEntity> getLecturersBySection(@PathVariable Long id) {
        return  adminService.getLecturersBySection(id);
    }

    @PostMapping("/createSection")
    public void createSection(@RequestBody SectionDTO dto){

        adminService.createSection(dto);
    }

    @DeleteMapping("/deleteSection/{id}")
    public void deleteSection(@PathVariable Long id){
        adminService.deleteSection(id);
    }
}