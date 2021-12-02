import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Banking bank = new Banking();
        String mobile = "0123456789";
        String password = "123456789";
        boolean isCheck = false;
        Scanner sc = new Scanner(System.in);
        while (!isCheck){
            System.out.println("Nhập tài khoản");
            String m = sc.nextLine();
            System.out.println("Nhập mật khẩu");
            String p = sc.nextLine();
            if(m.equals(mobile) && p.equals(password)){
                while (!isCheck){
                System.out.println("Nhập 1 để truy vấn tài khoản");
                System.out.println("Nhập 2 để chuyển tiền");
                System.out.println("Nhập 3 để xem ls giao dịch");
                System.out.println("Nhập 0 để thoát");
                int x = Integer.parseInt(sc.nextLine());
                switch (x){
                    case 1:
                        bank.balanceAcc();
                        break;
                    case 2:
                        bank.transfers();
                        bank.a.add(bank.transactionHistory());
                        break;
                    case 3:
                        bank.tran();
                        break;
                    case 0:
                        isCheck = true;
                        break;
                    default:
                        System.out.println("Nhập sai số");
                }}
            }else {
                System.out.println("Vui lòng nhập lại");
            }
        }

    }

}
