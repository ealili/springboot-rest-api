package mrtech.springbootrestapi;

import com.fasterxml.jackson.databind.ObjectMapper;
import mrtech.springbootrestapi.controller.PhoneController;
import mrtech.springbootrestapi.pojo.Manufacturer;
import mrtech.springbootrestapi.pojo.Phone;
import mrtech.springbootrestapi.pojo.PhoneInput;
import mrtech.springbootrestapi.service.phone.PhoneService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(PhoneController.class)
public class PhoneControllerTest {
    @Autowired
    private MockMvc mvc;

    @MockBean
    private PhoneService phoneService;

    @Test
    public void getPhonesTest() throws Exception {
        mvc.perform(get("/api/phones")).andExpect(status().isOk());
    }

    @Test
    public void postPhoneTest() throws Exception {
        Manufacturer manufacturer = new Manufacturer();
        Phone phone = new Phone(null, manufacturer, "testBattery", "testResolution", "testDisplaySize", "testDisplayType", "testImgSource", "testSelfieCamera", "testMainCamera", "testName", "testWeight", 2010, "testSound", "testTechonlogy", "testOs");
        mvc.perform(post("/api/phone/save").contentType(MediaType.APPLICATION_JSON).content(toJson(phone))).andExpect(status().isOk());
    }

    @Test
    public void putPhoneTest() throws Exception {
        Manufacturer manufacturer = new Manufacturer();
        PhoneInput phoneInput = new PhoneInput("testMName","testBattery", "testResolution", "testDisplaySize", "testDisplayType", "testImgSource", "testSelfieCamera", "testMainCamera", "testName", "testWeight", 2010, "testSound", "testTechonlogy", "testOs");
        Phone phone = new Phone(null, manufacturer, "testBattery", "testResolution", "testDisplaySize", "testDisplayType", "testImgSource", "testSelfieCamera", "testMainCamera", "testName", "testWeight", 2010, "testSound", "testTechonlogy", "testOs");
        mvc.perform(put("/api/phone/update/{id}", phone.getId() , phoneInput).contentType(MediaType.APPLICATION_JSON).content(toJson(phoneInput))).andExpect(status().isOk());
    }

    private String toJson(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

