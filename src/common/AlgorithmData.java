package common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AlgorithmData {

    Library library = new Library();

    public static String PHONE_VALID = "[0-9]{10}$";
    public static String EMAIL_VALID = "^[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}$";

    public String checkInputPhone() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                int phoneCheck = Integer.parseInt(sc.nextLine());
                String resultCheck = String.valueOf(phoneCheck);
                if (!resultCheck.matches(PHONE_VALID)) {
                    System.err.println("Phone number must be 10 digits");
                } else {
                    return resultCheck;
                }
            } catch (NumberFormatException ex) {
                System.out.print("Phone number: ");
                System.err.println("Phone number must be number");
            }
        }
    }

    public String checkInputDate() {
        while (true) {
            try {
                String dateCheck = library.checkInputString();
                Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dateCheck);
                return dateCheck;
            } catch (ParseException ex) {
                System.out.print("Date: ");
                System.err.println("Date to correct format(dd/MM/yyyy)");
            }
        }
    }

    public String checkInputEmail() {
        while (true) {
            String emailCheck = library.checkInputString();
            if (!emailCheck.matches(EMAIL_VALID)) {
                System.err.println("Email must be correct format");
                System.out.print("Email: ");
            } else {
                return emailCheck;
            }
        }
    }

}
