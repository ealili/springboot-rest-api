package mrtech.springbootrestapi;

import mrtech.springbootrestapi.pojo.Administrator;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AdministratorClassTests {
    private final String USERNAME = "selaudin";
    private final String NAME = "Selaudin Agolli";
    private final String PASSWORD = "selaudin123";

    @Test
    public void testTheAdministratorClass() {
        Administrator administrator = new Administrator(USERNAME, NAME, PASSWORD);
        assertEquals(administrator.getUsername(), USERNAME);
        assertEquals(administrator.getName(), NAME);
        assertEquals(administrator.getPassword(), PASSWORD);
    }


}
