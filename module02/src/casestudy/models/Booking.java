package casestudy.models;

import java.time.LocalDate;

public class Booking  extends Facility{
    private int idBooking;
    private LocalDate arrivalDate;
    private LocalDate lastDay;
    private int idCustomer;

    public Booking() {
    }

    public Booking(int idBooking, LocalDate arrivalDate, LocalDate lastDay, int idCustomer) {
        this.idBooking = idBooking;
        this.arrivalDate = arrivalDate;
        this.lastDay = lastDay;
        this.idCustomer = idCustomer;
    }

    public Booking(int id, String service, double usedArea, double rentPrice, String rentType, int idBooking, LocalDate arrivalDate, LocalDate lastDay, int idCustomer) {
        super(id, service, usedArea, rentPrice, rentType);
        this.idBooking = idBooking;
        this.arrivalDate = arrivalDate;
        this.lastDay = lastDay;
        this.idCustomer = idCustomer;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "idBooking=" + idBooking +
                ", arrivalDate=" + arrivalDate +
                ", lastDay=" + lastDay +
                ", idCustomer=" + idCustomer +
                '}';
    }
}
