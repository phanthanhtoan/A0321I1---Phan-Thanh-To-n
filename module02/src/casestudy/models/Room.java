package casestudy.models;

public class Room extends Facility {
    private String extraService;

    public Room() {
    }

    public Room(String extraService) {
        this.extraService = extraService;
    }

    public Room(int id, String service, double usedArea, double rentPrice, String rentType, String extraService) {
        super(id, service, usedArea, rentPrice, rentType);
        this.extraService = extraService;
    }

    public String getExtraService() {
        return extraService;
    }

    public void setExtraService(String extraService) {
        this.extraService = extraService;
    }
}
