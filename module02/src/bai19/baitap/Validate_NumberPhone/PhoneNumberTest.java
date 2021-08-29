package bai19.baitap.Validate_NumberPhone;

import bai19.thuchanh.Validate_email.EmailExample;

public class PhoneNumberTest {
    private static PhoneNumber phoneNumber;
    public static final String[] validPhone = new String[]{"(84)-(0978489648)"};
    public static final String[] invalidPhone = new String[]{"(a8)-(22222222)"};

    public static void main(String args[]) {
        phoneNumber = new PhoneNumber();
        for (String phone : validPhone) {
            boolean isvalid = phoneNumber.validate(phone);
            System.out.println("Email is " + phone + " is valid: " + isvalid);
        }
        for (String phone : invalidPhone) {
            boolean isvalid = phoneNumber.validate(phone);
            System.out.println("Email is " + phone + " is valid: " + isvalid);
        }
    }
}
