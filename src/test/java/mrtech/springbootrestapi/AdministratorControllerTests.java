package mrtech.springbootrestapi;

import com.fasterxml.jackson.databind.ObjectMapper;
import mrtech.springbootrestapi.controller.AdministratorController;
import mrtech.springbootrestapi.controller.PhoneController;
import mrtech.springbootrestapi.pojo.Administrator;
import mrtech.springbootrestapi.service.administrator.AdministratorService;
import mrtech.springbootrestapi.service.phone.PhoneService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(AdministratorController.class)
public class AdministratorControllerTests {
    @Autowired
    private MockMvc mvc;

    @MockBean
    private AdministratorService administratorService;

    @Test
    public void getAdministratorTest() throws Exception {
        Administrator administrator = new Administrator("testUsername","testName","testPassword");
        mvc.perform(post("/api/administrator", administrator).contentType(MediaType.APPLICATION_JSON).content(toJson(administrator))).andExpect(status().isOk());
    }

    @Test
    public void postAdministratorTest() throws Exception {
        Administrator administrator = new Administrator("testUsername","testName","testPassword");
        mvc.perform(post("/api/administrator", administrator).contentType(MediaType.APPLICATION_JSON).content(toJson(administrator))).andExpect(status().isOk());
    }

    private String toJson(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
