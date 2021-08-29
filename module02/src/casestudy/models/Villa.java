package casestudy.models;

public class Villa extends Facility {
    private String roomStandard;
    private String utilityDescription;
    private double poolArea;
    private int floor;

    public Villa() {
    }

    public Villa(String roomStandard, String utilityDescription, double poolArea, int floor) {
        this.roomStandard = roomStandard;
        this.utilityDescription = utilityDescription;
        this.poolArea = poolArea;
        this.floor = floor;
    }

    public Villa(int id, String service, double usedArea, double rentPrice, String rentType, String roomStandard, String utilityDescription, double poolArea, int floor) {
        super(id, service, usedArea, rentPrice, rentType);
        this.roomStandard = roomStandard;
        this.utilityDescription = utilityDescription;
        this.poolArea = poolArea;
        this.floor = floor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getUtilityDescription() {
        return utilityDescription;
    }

    public void setUtilityDescription(String utilityDescription) {
        this.utilityDescription = utilityDescription;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

}
