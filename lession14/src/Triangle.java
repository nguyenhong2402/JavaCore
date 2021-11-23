import java.util.Scanner;

public class Triangle {

    public void check() throws MyException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 3 cạnh a,b,c");
        double a = Double.parseDouble(sc.nextLine());
        if(a < 0) throw new MyException("Cạnh nhập vào là âm");
        double b = Double.parseDouble(sc.nextLine());
        if(a < 0) throw new MyException("Cạnh nhập vào là âm");
        double c = Double.parseDouble(sc.nextLine());
        if(a < 0) throw new MyException("Cạnh nhập vào là âm");
        if (a + b > c && a + c > b && b + c > a){
            System.out.println("3 cạnh trên là một tam giác");
        }else {
            System.out.println("3 cạnh trên ko phải tam giác");
        }

    }
}
