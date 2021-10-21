import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Nhập số 1,2,3 tương ứng với bài cô muốn kiểm tra:");
        int x = sc3.nextInt();
        switch (x){
            case 1:
                System.out.println("Bài 1");
                Les1.Triangletest();
                break;
            case 2:
                System.out.println("Bài 2");
                Les2.score();
                break;
            case 3:
                System.out.println("Bài 3");
                Les3.testDelta();
                break;
            default:
                System.out.printf("Làm gì có bài %d \n",x);
        }

    }
}