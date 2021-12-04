import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Service {
    Repo acc = new Repo();
    Scanner sc = new Scanner(System.in);
    void login() {

        boolean isCheck = false;
        boolean check = false;
        while (!isCheck) {
            System.out.println("Nhập username: ");
            String USERNAME = sc.nextLine();
            for (int i = 0; i < acc.listAcc.size(); i++) {
                if (USERNAME.equals(acc.listAcc.get(i).getUsername())) {
                    while (!check) {
                        System.out.println("Nhập password");
                        String PASSWORD = sc.nextLine();
                        if (PASSWORD.equals(acc.listAcc.get(i).getPassword())) {

                            System.out.println("Chào mừng " + USERNAME);
                            editAcc(acc.listAcc.get(i));
                            check = true;
                        } else {
                            forgotPass(acc.listAcc.get(i).getEmail(),acc.listAcc.get(i).getPassword(),i);
                            System.out.println("Chào mừng " + USERNAME);
                            editAcc(acc.listAcc.get(i));
                        }
                    }
                    isCheck = true;

                }

            }
        }

    }
    public void editAcc(Account x){

        boolean isCheck = false;
        while (!isCheck){
            Menu.editAccount();
            int chose = Integer.parseInt(sc.nextLine());
            switch (chose){
                case 1:
                    System.out.println("Nhập username mới");
                    x.setUsername(sc.nextLine());
                    break;
                case 2:
                    System.out.println("Nhập email mới: ");
                    x.setEmail(sc.nextLine());
                    break;
                case 3:
                    System.out.println("Nhập mật khẩu mới");
                    x.setPassword(sc.nextLine());
                    break;
                case 4:
                    System.out.println("Đăng xuất thành công");
                    System.out.println("-----------------");
                    Menu.menu();
                    login();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhập sai số");
            }
        }
    }
    void forgotPass(String email,String pass,int i){
        boolean checker = false;
        while (!checker){
            Menu.reLogin();

        int cho = Integer.parseInt(sc.nextLine());
        switch (cho){
            case 1:
                login();
                break;
            case 2:
                System.out.println("Nhập email: ");
                String mail = sc.nextLine();
                if (mail.equals(email)){
                    System.out.println("Nhập vào mật khẩu mới: ");
                    pass=sc.nextLine();
                    acc.listAcc.get(i).setPassword(pass);
                    checker=true;
                }else {
                    System.out.println("Chưa tồn tại tài khoản");
                }
                break;
        }
    }
    }
    void newAccount(){
       String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
       String PASSWORD_REGEX = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{7,15}$";
       boolean b = false;
       while (!b){
           String newemail = sc.nextLine();
           if (!Pattern.matches(EMAIL_REGEX,newemail) && newemail.equals(acc.listAcc.)){
               System.out.println("Email nhập vào hợp lệ");
           }else {
               System.out.println("Nhập lại giùm cái :(");
           }
       }
    }
}

