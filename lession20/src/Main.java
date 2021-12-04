import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Service ser = new Service();
        Scanner sc = new Scanner(System.in);
        Menu.menu();
        int chose = Integer.parseInt(sc.nextLine());
        switch (chose){
            case 1:
                ser.login();
                break;
            case 2:
                ser.newAccount();
                break;
        }

    }
}
