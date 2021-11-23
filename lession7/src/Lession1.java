
public class Lession1 {
    public static void ques1() {

        int n = 4;
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    public static void ques2() {
        int n = 4;
        int j = 0;
        for (int i = 1; i <= n; i++) {
            j=0;
            for (int space = 1; space <= n - i; space++) {
                System.out.print("  ");
            }

            while (j != 2 * i-1) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
        }
    }
    public static void ques3(){
        int n = 4;
        for (int i = 1; i<=n; i++){
            for (int j =1;j<=n; j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
