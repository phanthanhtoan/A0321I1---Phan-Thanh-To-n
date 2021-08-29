package casestudy.models;

public abstract class Facility {
    private int id;
    private String service;
    private double usedArea;
    private double rentPrice;
    private String rentType;

    public Facility() {
    }

    public Facility(int id, String service, double usedArea, double rentPrice, String rentType) {
        this.id = id;
        this.service = service;
        this.usedArea = usedArea;
        this.rentPrice = rentPrice;
        this.rentType = rentType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public double getUsedArea() {
        return usedArea;
    }

    public void setUsedArea(double usedArea) {
        this.usedArea = usedArea;
    }

    public double getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(double rentPrice) {
        this.rentPrice = rentPrice;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }
}
