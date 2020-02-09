package mrtech.springbootrestapi;

import com.fasterxml.jackson.databind.ObjectMapper;
import mrtech.springbootrestapi.controller.ManufacturerController;
import mrtech.springbootrestapi.pojo.Manufacturer;
import mrtech.springbootrestapi.service.manufacturer.ManufacturerService;
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
@WebMvcTest(ManufacturerController.class)
public class ManufacturerControllerTests {
    @Autowired
    private MockMvc mvc;

    @MockBean
    private ManufacturerService manufacturerService;

    @Test
    public void getManufacturersTest() throws Exception {
        mvc.perform(get("/api/manufacturers")).andExpect(status().isOk());
    }

    @Test
    public void postManufacturerTest() throws Exception {
        Manufacturer manufacturer = new Manufacturer("testMName","testHeadQ");
        mvc.perform(post("/api/manufacturer/save",manufacturer).contentType(MediaType.APPLICATION_JSON).content(toJson(manufacturer))).andExpect(status().isOk());
    }


    private String toJson(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
