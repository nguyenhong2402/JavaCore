public class Lession3 {

    public static String longestWord(String input) {
        String input1 = input + ' ';
        int x = input.indexOf(' '); //Độ dài từ dài nhất max
        int length = input.length();
        int y=x;
        int imax = 0; //index đầu của từ dài nhất
        int ymax = x; //index cuối của từ dài nhất
        for(int i = 0; i<length; i++){
            i=y;
            y = input1.indexOf(' ',y+1);
            int z = y - i -1; //z là độ dài các chữ cái đem so sánh vs max
            if(x >= z && y>0){
                continue;
            }

            else if(x<z){
                x=z;
                imax=i+1;
                ymax=y;
            }else {
                break;
            }

        }
        System.out.println("Chữ dài nhất là:" + input.substring(imax,ymax));
        System.out.println("Chữ dài nhất có "+ x+ " có ký tự");
        return input.substring(imax,ymax);
    }
}
