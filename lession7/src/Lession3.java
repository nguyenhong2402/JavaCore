public class Lession3 {
    public static void ques1() {
        System.out.println("Các số nguyên tố đầu tiên: ");
            int n=100;
        if(n >=2){
            System.out.print(2);
        }
        int count=0;
        for (int i = 3; i<n && count<9; i+=2){
            if(isCheck(i)){
                System.out.print("  " + i );
                count ++;
            }
        }
    }
    public static void ques2(){
        System.out.println("\nCác số nguyên tố nhỏ hơn 10: ");
        int n=10;
        if(n >=2){
            System.out.print(2);
        }

        for (int i = 3; i<n; i+=2){
            if(isCheck(i)){
                System.out.print("  " + i );
            }
        }
    }
    public static boolean isCheck(int n){
        for (int i = 2; i <=(int)Math.sqrt(n);i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }

}
