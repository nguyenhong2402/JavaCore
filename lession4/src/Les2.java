import java.util.Scanner;

public class Les2 {
    public static void score() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Nhập số điểm môn Toán: ");
        float toan = sc1.nextFloat();
        System.out.println("Nhập số điểm môn Văn: ");
        float van = sc1.nextFloat();
        System.out.println("Nhập số điểm môn Lý: ");
        float ly = sc1.nextFloat();
        System.out.println("Nhập số điểm môn Hoá: ");
        float hoa = sc1.nextFloat();
        float tbc = (toan + van + ly + hoa) / 4;

        if (toan >= 0 && van >= 0 && ly >= 0 && hoa >= 0 && toan <= 10 && van <= 10 && ly <= 10 && hoa <= 10) {
            System.out.println("Trung bình cộng các môn = " + tbc);
            if (tbc < 4.5) {
                System.out.println("Học sinh hạng yếu");
            } else if (tbc >= 4.5 && tbc < 6.5) {
                System.out.println("Học sinh hạng trung bình");
            } else if (tbc >= 6.5 && tbc < 8) {
                System.out.println("Học sinh hạng khá");
            } else if (tbc >= 8) {
                System.out.println("Học sinh giỏi");
            }
        } else {
            System.out.println("Nhập sai điểm");
        }
    }
}