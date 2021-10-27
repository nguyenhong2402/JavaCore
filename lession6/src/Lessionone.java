import java.util.Arrays;
import java.util.Scanner;

public class Lessionone {
    static int[] arr;
    static int n;
    public static void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số mảng: ");
        n = sc.nextInt();
        arr = new int[n];

        for(int i = 0; i<arr.length; i++){
            System.out.printf("Nhập phần tử thứ %d: ",i+1);
            arr[i]=sc.nextInt();
        }

    }
    public static void output(){

        System.out.print("Các phần tử đã nhập vào lần lượt là: ");
        for (int i: arr) {
            System.out.print(i + "\t");
        }
    }
    public static void minMax(){

        Arrays.sort(arr);

        System.out.println("\nPhần tử nhỏ nhất của mảng là: "+arr[0]);
        System.out.println("Phần tử lớn nhất của mảng là: " +arr[n-1]);

    }
}
