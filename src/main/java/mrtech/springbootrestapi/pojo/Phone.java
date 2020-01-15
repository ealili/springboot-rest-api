package mrtech.springbootrestapi.pojo;


import javax.persistence.*;

@Entity
@Table(name = "phone")
public class Phone {
    @Id
    private String id;
    @ManyToOne
    @JoinColumn(name = "mname")
    private Manufacturer manufacturer;

    private String battery;
    private String displayResolution;
    private String displaySize;
    private String displayType;
    private String imgSource;
    private String selfieCamera;
    private String mainCamera;
    private String name;
    private String weight;
    private Integer productionYear;
    private String sound;
    private String technology;
    private String os;

    public Phone() {
    }

    public Phone(String id, Manufacturer manufacturer, String battery, String displayResolution, String displaySize,
                 String displayType, String imgSource, String selfieCamera, String mainCamera, String name,
                 String weight, Integer productionYear, String sound, String technology, String os)
    {
        this.id = id;
        this.manufacturer = manufacturer;
        this.battery = battery;
        this.displayResolution = displayResolution;
        this.displaySize = displaySize;
        this.displayType = displayType;
        this.imgSource = imgSource;
        this.selfieCamera = selfieCamera;
        this.mainCamera = mainCamera;
        this.name = name;
        this.weight = weight;
        this.productionYear = productionYear;
        this.sound = sound;
        this.technology = technology;
        this.os = os;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public String getDisplayResolution() {
        return displayResolution;
    }

    public void setDisplayResolution(String displayResolution) {
        this.displayResolution = displayResolution;
    }

    public String getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(String displaySize) {
        this.displaySize = displaySize;
    }

    public String getDisplayType() {
        return displayType;
    }

    public void setDisplayType(String displayType) {
        this.displayType = displayType;
    }

    public String getImgSource() {
        return imgSource;
    }

    public void setImgSource(String imgSource) {
        this.imgSource = imgSource;
    }

    public String getSelfieCamera() {
        return selfieCamera;
    }

    public void setSelfieCamera(String selfieCamera) {
        this.selfieCamera = selfieCamera;
    }

    public String getMainCamera() {
        return mainCamera;
    }

    public void setMainCamera(String mainCamera) {
        this.mainCamera = mainCamera;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public Integer getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(Integer productionYear) {
        this.productionYear = productionYear;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }
}
