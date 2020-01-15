package mrtech.springbootrestapi;

import mrtech.springbootrestapi.pojo.Manufacturer;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ManufacturerClassTests {
    private final String MNAME = "Samsung";
    private final String HQ = "Tetovo, North Macedonia";

    @Test
    public void testTheAdministratorClass() {
        Manufacturer manufacturer = new Manufacturer(MNAME, HQ);
        assertEquals(manufacturer.getMname(), MNAME);
        assertEquals(manufacturer.getHeadquarters(), HQ);
    }


}
