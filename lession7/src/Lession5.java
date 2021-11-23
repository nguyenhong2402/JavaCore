import java.util.Random;

public class Lession5 {
    public static void check() {
        Random random = new Random();
        int n = random.nextInt();
        System.out.println("Số ngẫu nhiên là: " + n);

            if(isCheck(n)){
                System.out.printf("%d là số nguyên tố",n);
            }else {
                System.out.printf("%d không phải là số nguyên tố",n);
            }

    }

    public static boolean isCheck(int n) {
        if(n<2){
            return false;
        }
        for (int i =2 ; i<=Math.sqrt(n);i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
}

