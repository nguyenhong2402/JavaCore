import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Banking{
    final int balancemin = 50000;
    long balance = 5000000;
    String Namebank;
    long accountNumber;
    long money;
    String des;
    int id;
    LocalDate time;
    ArrayList<String> a = new ArrayList<>();

    public void balanceAcc(){
        System.out.println("Số tiền còn dư là: " + balance);
    }
    public void transfers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Lựa chọn ngân hàng: ");
        Namebank = sc.nextLine();
        System.out.println("Nhập số tài khoản thụ hưởng" );
        accountNumber = Long.parseLong(sc.nextLine());
        System.out.println("Nhập số tiền: ");

        boolean isCheck = false;
        while (!isCheck){
            money = Long.parseLong(sc.nextLine());
            if (money > balance-balancemin){
                System.out.println("Số dư k đủ, nhập lại: ");
            }else {
                isCheck=true;
            }
        }
        System.out.println("Nhập mô tả: ");
        des = sc.nextLine();
        time = LocalDate.now();
        id = id + 1;
    }
    public String transactionHistory(){
        return id + " - " + time + " - " + des + " - " + accountNumber + " - " + money;
    }
    public void tran(){
        a.forEach(s -> System.out.println(s));
    }
}
