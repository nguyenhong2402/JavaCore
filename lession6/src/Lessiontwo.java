import java.util.Scanner;

public class Lessiontwo {
    static int n;
    static Subles2[] arr;

    static int code;
    static int v;
    static String name;
//    Lessiontwo(int maso, int vantoc, String ten){
//        code = maso;
//        v = vantoc;
//        name = ten;
//    }

    public static void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số mảng: ");
        n = sc.nextInt();
        arr = new Subles2[n];
        for(int i = 0; i<arr.length; i++){
            System.out.printf("Nhập mã số phương tiện giao thông thứ %d: ",i+1);
            code = sc.nextInt();
            System.out.printf("Nhập vào vận tốc tối đa của phương tiện %d: ",i+1);
            v = sc.nextInt();
            sc.nextLine();
            System.out.printf("Nhập tên phương tiện giao thông thứ %d: ",i+1);
            name = sc.nextLine();
            Subles2 ls2 = new Subles2(code,v,name);
            arr[i] =ls2;

        }


    }
    public static void output(){
        System.out.println("Bảng thông tin phương tiện: ");
        for (Subles2 j : arr){
            System.out.print(j);
        }


    }


}
