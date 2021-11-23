
import java.util.Arrays;
import java.util.Scanner;

public class Lession2 {
    public static void ques1() {
        Scanner sc = new Scanner(System.in);
        int j;
        System.out.println("Nhập tên của bạn: ");
        String n = sc.nextLine();
        n = n.trim().toLowerCase();
        n = n.replaceAll("\\s+", " ");
        String[] Upper = n.split(" ");
        n="";
        for (int i = 0; i< Upper.length;i++){
            String a = Upper[i].substring(0, 1).toUpperCase();
            String b = Upper[i].substring(1);
            if(i<Upper.length-1){
                Upper[i] = a + b +" ";
            }else {
                Upper[i] = a + b;
            }
            n = n + String.valueOf(Upper[i]);

        }

        System.out.println(n);
        for (int i = 0; i < n.length(); i++) {
            j = n.charAt(n.length() - i - 1);
            while (true) {
                if (n.charAt(i) == j) {
                    if (i == n.length() - i - 1) {
                        System.out.println("Chuỗi này là chuỗi panlydrome");

                    }
                    break;
                } else {
                    System.out.println("Chuỗi này không phải chuỗi Panlyndrome");
                    System.exit(1);
                }
            }
        }
    }
    public String toString(String arr){
        return arr;
    }
}
