import java.util.Scanner;

public class Les3 {
    public static void testDelta() {
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Giải phương trình ax2 + bx + c = 0 với a != 0");
        System.out.println("Nhập vào 3 số a,b,c theo thứ tự:");
        float a = sc2.nextFloat();
        float b = sc2.nextFloat();
        float c = sc2.nextFloat();
        float delta = b * b - 4 * a * c;

        if (a != 0) {
            System.out.println("delta = b2-4ac = " + delta);
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if (delta == 0) {

                System.out.println("Phương trình có nghiệm kép x1=x2=" + (-b /( 2 * a)));
            }else if(delta>0){
                System.out.println("Phương trình có 2 nghiệm phân biệt là: ");
                System.out.println("x1 = " + (-b+Math.sqrt(delta))/(2*a));
                System.out.println("x2 = " + (-b-Math.sqrt(delta))/(2*a));
            }
        }else {
            System.out.println("Không thoả mãn đề ra");
        }
    }
}