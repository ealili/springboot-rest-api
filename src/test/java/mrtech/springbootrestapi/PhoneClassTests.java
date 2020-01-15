package mrtech.springbootrestapi;

import mrtech.springbootrestapi.pojo.Manufacturer;
import mrtech.springbootrestapi.pojo.Phone;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PhoneClassTests {
    private final String id = "iphone11";
    private final String mname = "Apple";
    private final String hq = "California";
    private final Manufacturer manufacturer = new Manufacturer(mname,hq);
    private final String battery = "Non-removable Li-Ion 3110 mAh battery (11.91 Wh)";
    private final String displayResolution = "828 x 1792 pixels, 19.5:9 ratio (~326 ppi density)";
    private final String displaySize = "6.1 inches, 90.3 cm2 (~79.0% screen-to-body ratio)";
    private final String displayType = "Super Retina XDR OLED capacitive touchscreen, 16M colors";
    private final String imgSource = "https://assets.mmsrg.com/isr/166325/c1/-/pixelboxx-mss-82228356/fee_786_587_png";
    private final String selfieCamera = "12 MP, f/2.2, 23mm (wide)";
    private final String mainCamera = "12 MP, f/1.8, 26mm (wide), 1/2.55&quot;, 1.4µm, dual pixel PDAF, OIS 12 MP, f/2.4, 13mm (ultrawide)";
    private final String name = "iPhone 11";
    private final String weight = "194 g (6.84 oz)";
    private final Integer productionYear = 2019;
    private final String sound = "Stereo Speakers";
    private final String technology = "GSM / CDMA / HSPA / EVDO / LTE";
    private final String os = "iOS 13, upgradable to iOS 13.2";


    @Test
    public void testThePhoneClass() {
        Phone phone = new Phone(id, manufacturer, battery, displayResolution, displaySize, displayType, imgSource,
                selfieCamera, mainCamera, name, weight, productionYear, sound, technology, os);

        assertEquals(phone.getId(), id);
        assertEquals(phone.getManufacturer(), manufacturer);
        assertEquals(phone.getBattery(), battery);
        assertEquals(phone.getDisplayResolution(), displayResolution);
        assertEquals(phone.getDisplaySize(), displaySize);
        assertEquals(phone.getDisplayType(), displayType);
        assertEquals(phone.getImgSource(), imgSource);
        assertEquals(phone.getSelfieCamera(), selfieCamera);
        assertEquals(phone.getMainCamera(), mainCamera);
        assertEquals(phone.getName(), name);
        assertEquals(phone.getWeight(), weight);
        assertEquals(phone.getProductionYear(), productionYear);
        assertEquals(phone.getSound(), sound);
        assertEquals(phone.getTechnology(), technology);
        assertEquals(phone.getOs(), os);
    }
}
