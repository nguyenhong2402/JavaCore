
public class Lession2 {

    public static int find(String strA, String strB) {

        if(strA.indexOf(strB)==-1){
            System.out.println("Không tìm thấy strB trong strA");
            return -1;
        }
        else if(strA.indexOf(strB)>=0){
            System.out.println("Vị trí cùa strB được tìm thấy trong strA là: " + strA.indexOf(strB));
            return strA.indexOf(strB);
        }
        return strA.indexOf(strB);
    }

}
