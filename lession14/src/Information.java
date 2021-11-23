import java.util.Scanner;

public class Information {
    public final int thisYear = 2021;
    public String name;
    public int yearofBirth;
    public String address;
    public void inputInformation() throws MyException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        name = sc.nextLine();
        System.out.println("Nhập năm sinh: ");
        yearofBirth = Integer.parseInt(sc.nextLine());
        if(yearofBirth<1900 || yearofBirth>2021) throw new MyException("Nhập năm sinh phải trên 1900");
        System.out.println("Nhập địa chỉ: ");
        address = sc.nextLine();
        System.out.println("Tuổi của " + name + " là: " + age());
        if (age()<18) {
            System.out.println("Chưa đủ tuổi bầu cử");
        }else {
            System.out.println("Đã đủ tuổi bầu cử");
        }
    }
    public int age(){
        return thisYear - yearofBirth;
    }
}
