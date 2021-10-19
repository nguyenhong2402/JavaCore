import java.util.Scanner;

public class Les3 {
    static void calc(){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Nhập số nguyên x: ");
        int x = sc1.nextInt();
        System.out.println("Nhập số nguyên y: ");
        int y = sc1.nextInt();
        double z = (double)x/y;
        System.out.println("x + y =" +(x+y));
        System.out.println("x - y =" +(x-y));
        System.out.println("x * y =" +(x*y));
        System.out.println("x / y = " +(x/y) + " dư " +(x%y));
        System.out.println("hoặc x / y= " + z);
    }
}
