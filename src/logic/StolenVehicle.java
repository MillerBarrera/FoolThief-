package logic;

public class StolenVehicle {

    private String licensePlate;
    private String brand;
    private String reference;
    private String neighborhood;
    private String color;
    private String modusOperandi;

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getModusOperandi() {
        return modusOperandi;
    }

    public void setModusOperandi(String modusOperandi) {
        this.modusOperandi = modusOperandi;
    }

    public String[] getAllData() {
        String[] data = new String[6];
        data[0] = licensePlate;
        data[1] = brand;
        data[2] = reference;
        data[3] = neighborhood;
        data[4] = color;
        data[5] = modusOperandi;
        return data;
    }

    public void setAllData(String[] data) {
        licensePlate = data[0];
        brand = data[1];
        reference = data[2];
        neighborhood = data[3];
        color = data[4];
        modusOperandi = data[5];
    }
}
