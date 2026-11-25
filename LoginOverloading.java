import java.util.Scanner;

class Login {

    void login(String username) {
        System.out.println("Login using Username: " + username);
    }

    void login(String name, String password) {
        System.out.println("Login using Name and Password");
        System.out.println("Name: " + name);
        System.out.println("Password: " + password);
    }

    void login(String username, String password, int otp) {
        System.out.println("Login using Username, Password and OTP");
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("OTP: " + otp);
    }
}

public class LoginOverloading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Login obj = new Login();

        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        System.out.print("Enter OTP: ");
        int otp = sc.nextInt();

        System.out.println("\n--- Login Details ---");

        obj.login(username);
        System.out.println();

        obj.login(name, password);
        System.out.println();

        obj.login(username, password, otp);

        sc.close();
    }
}
