package first.controller;


import com.fasterxml.jackson.databind.ObjectMapper;

import first.dto.ParticipantDTO;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.restdocs.JUnitRestDocumentation;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.ConfigurableMockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.time.LocalDate;

import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.documentationConfiguration;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@RunWith(SpringRunner.class)

public class RegistrationControllerTest {

    MockMvc mockMvc;

    LocalDate date1 = LocalDate.of(1900,10,01);
    LocalDate date2 = LocalDate.of(1999,01,10);

    ParticipantDTO participant1 = ParticipantDTO.builder()
            .dateOfParticipation(date1)
            .birthDate(date1)
            .firstName("Ivan")
            .lastName("Ivanov")
            .middleName("Ivanovich")
            .login("1234")
            .password("1234")
            .sectionId(3L)
            .build();

    ParticipantDTO participant2 = ParticipantDTO.builder()
            .dateOfParticipation(date2)
            .birthDate(date2)
            .firstName("Mike")
            .lastName("Makovich")
            .middleName("Mc")
            .login("1234")
            .password("1234")
            .sectionId(1L)
            .build();

    @Autowired
    WebApplicationContext webApplicationContext;

    @Autowired
    ObjectMapper objectMapper;

    @Rule
    public JUnitRestDocumentation restDocumentation = new JUnitRestDocumentation("target/generated-test-sources");

    @Before
    public void setUp() {
        ConfigurableMockMvcBuilder builder =
                MockMvcBuilders.webAppContextSetup(this.webApplicationContext)
                        .apply(documentationConfiguration(this.restDocumentation));
        this.mockMvc = builder.build();
    }

    @Test
    public void addParticipant1() throws Exception {
        String content = objectMapper.writeValueAsString(participant1);
        String uri = "/registration/addParticipant";
        mockMvc.perform(post(uri)
                .contentType(MediaType.APPLICATION_JSON)
                .content(content))
                .andExpect(status().isOk())
                .andDo(document(uri.replace("/", "\\")));
    }

    @Test
    public void addParticipant2() throws Exception {
        String content = objectMapper.writeValueAsString(participant2);
        String uri = "/registration/addParticipant";
        mockMvc.perform(post(uri)
                .contentType(MediaType.APPLICATION_JSON)
                .content(content))
                .andExpect(status().isOk())
                .andDo(document(uri.replace("/", "\\")));
    }
}
