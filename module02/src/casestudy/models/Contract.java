//package casestudy.models;
//
//import java.time.LocalDate;
//
//public class Contract  extends Booking{
//    private double moneyPaid;
//    private double totalMoney;
//
//    public Contract() {
//    }
//
//    public Contract( double moneyPaid, double totalMoney) {
//        this.moneyPaid = moneyPaid;
//        this.totalMoney = totalMoney;
//    }
//
//    public Contract(LocalDate arrivalDate, LocalDate lastDay, double moneyPaid, double totalMoney) {
//        super( arrivalDate, lastDay);
//        this.moneyPaid = moneyPaid;
//        this.totalMoney = totalMoney;
//    }
//
//    public Contract(int id, String service, double usedArea, double rentPrice, String rentType, int idBooking, LocalDate arrivalDate, LocalDate lastDay, int idCustomer, int idContract, double moneyPaid, double totalMoney) {
//        super(id, service, usedArea, rentPrice, rentType, idBooking, arrivalDate, lastDay, idCustomer);
//        this.moneyPaid = moneyPaid;
//        this.totalMoney = totalMoney;
//    }
//
//    public int getIdContract() {
//        return idContract;
//    }
//
//    public void setIdContract(int idContract) {
//        this.idContract = idContract;
//    }
//
//    public double getMoneyPaid() {
//        return moneyPaid;
//    }
//
//    public void setMoneyPaid(double moneyPaid) {
//        this.moneyPaid = moneyPaid;
//    }
//
//    public double getTotalMoney() {
//        return totalMoney;
//    }
//
//    public void setTotalMoney(double totalMoney) {
//        this.totalMoney = totalMoney;
//    }
//
//    @Override
//    public String toString() {
//        return "Contract{" +
//                "idContract=" + idContract +
//                ", moneyPaid=" + moneyPaid +
//                ", totalMoney=" + totalMoney +
//                '}';
//    }
//}
