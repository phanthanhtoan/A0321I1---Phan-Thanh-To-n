package casestudy.models;

public class House extends Facility {
    private String standarRoom;
    private String utilityDescription;
    private int floor;

    public House() {
    }

    public House(String standarRoom, String utilityDescription, int floor) {
        this.standarRoom = standarRoom;
        this.utilityDescription = utilityDescription;
        this.floor = floor;
    }

    public House(int id, String service, double usedArea, double rentPrice, String rentType, String standarRoom, String utilityDescription, int floor) {
        super(id, service, usedArea, rentPrice, rentType);
        this.standarRoom = standarRoom;
        this.utilityDescription = utilityDescription;
        this.floor = floor;
    }

    public String getStandarRoom() {
        return standarRoom;
    }

    public void setStandarRoom(String standarRoom) {
        this.standarRoom = standarRoom;
    }

    public String getUtilityDescription() {
        return utilityDescription;
    }

    public void setUtilityDescription(String utilityDescription) {
        this.utilityDescription = utilityDescription;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }
}
