package first.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import first.dto.ParticipantDTO;
import first.dto.SectionDTO;
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

import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.documentationConfiguration;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@RunWith(SpringRunner.class)
public class AdminControllerTest {

    MockMvc mockMvc;

    SectionDTO sectionDTO = new SectionDTO("first section", 100L);


    @Autowired
    WebApplicationContext webApplicationContext;

    @Autowired
    ObjectMapper objectMapper;

    @Rule
    public JUnitRestDocumentation restDocumentation = new JUnitRestDocumentation("target/generated-snippets");

    @Before
    public void setUp() {
        ConfigurableMockMvcBuilder builder =
                MockMvcBuilders.webAppContextSetup(this.webApplicationContext)
                        .apply(documentationConfiguration(this.restDocumentation));
        this.mockMvc = builder.build();
    }

    @Test
    public void createSection() throws Exception {
        String content = objectMapper.writeValueAsString(sectionDTO);
        String uri = "/admin/createSection";
        mockMvc.perform(post(uri)
                .contentType(MediaType.APPLICATION_JSON)
                .content(content))
                .andExpect(status().isOk())
                .andDo(document(uri.replace("/", "\\")));
    }

    @Test
    public void getAllParticipantsTest() throws Exception {
        String uri = "/admin/getAllParticipants";
        mockMvc.perform(get(uri)).andExpect(status().isOk())
                .andDo(document(uri.replace("/", "\\")));
    }

    @Test
    public void getAllParticipantsBySectionTest() throws Exception {
        String uri = "/admin/getAllParticipantsBySection/1";
        mockMvc.perform(get(uri))
                .andExpect(status().isOk())
                .andDo(print())
                .andDo(document(uri.replace("/", "\\")));
    }

    @Test
    public void getAllLecturersTest() throws Exception {
        String uri = "/admin/getAllLecturers";
        mockMvc.perform(get(uri)).andExpect(status().isOk())
                .andDo(document(uri.replace("/", "\\")));
    }

    @Test
    public void getAllLecturersBySectionTest() throws Exception {
        String uri = "/admin/getAllLecturersBySection/1";
        mockMvc.perform(get(uri))
                .andExpect(status().isOk())
                .andDo(document(uri.replace("/", "\\")));
    }

    @Test
    public void deleteSection() throws Exception {
        String uri = "/admin/deleteSection/3";
        mockMvc.perform(delete(uri))
                .andExpect(status().isOk())
                .andDo(document(uri.replace("/", "\\")));
    }
}

