package mrtech.springbootrestapi;

import mrtech.springbootrestapi.controller.PhoneController;
import mrtech.springbootrestapi.service.phone.PhoneService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(PhoneController.class)
public class PhoneControllerTest {
    @Autowired
    private MockMvc mvc;

    @MockBean
    private PhoneService phoneService;

    @Test
    public void getPhonesTest() throws Exception{
        mvc.perform(get("/api/phones")).andExpect(status().isOk());
    }

}
