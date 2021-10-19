import java.util.Scanner;

public class Les1 {
    static void oddEven(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 số: ");
        int x = sc.nextInt();
        String result = x % 2 == 0 ? x + " là số chẵn" : x + " là số lẻ";
        System.out.println(result);

    }
}
