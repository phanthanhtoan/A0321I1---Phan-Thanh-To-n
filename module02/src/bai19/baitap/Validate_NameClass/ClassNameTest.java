package bai19.baitap.Validate_NameClass;

public class ClassNameTest {
    private static ClassName className;
    private static final String[] validClassName = new String[]{"C0318G"};
    private static final String[] invalidClassName = new String[]{"M0318G", "P0323A"};

    public static void main(String[] args) {
        className = new ClassName();
        for (String check : validClassName) {
            boolean isValid = className.validate(check);
            System.out.println("ClassName " + className + " is valid: " + isValid);
        }
        for (String check : invalidClassName) {
            boolean isValid = className.validate(check);
            System.out.println("ClassName" + className + " is valid " + isValid);
        }
    }
}
