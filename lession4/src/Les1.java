import java.util.Scanner;

public class Les1 {
    public static void Triangletest() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào ba cạnh a b c:");
        double a = sc.nextDouble();
        System.out.println("a= " + a);
        double b = sc.nextDouble();
        System.out.println("b= " + b);

        double c = sc.nextDouble();
        System.out.println("c= " + c);
        if (a + b > c && b + c > a && c + a > b) {
            System.out.println("Ba cạnh trên có hợp thành tam giác");
            if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == b * b + a * a) {
                System.out.println("Và là tam giác vuông");

            } else if ((a == b || b == c || c == a)&&(a!=b || b!=c || c!=a)) {
                System.out.println("và là tam giác cân");
            } else if (a == b && b == c) {
                System.out.println("và là tam giác đều");

            }

        } else {
            System.out.println("Ba cạnh k hợp thành tam giác");


        }


    }
}
