public class Lession4 {
    static String s = "You only live once, but if you do it right, once is enough";
    public static void ques1() {

        String[] split = s.split(" ");
        System.out.println("Số từ trong chuỗi là: " + split.length);
    }
    public static void ques2(){
            int count=0;
            int index=0;
        System.out.println("Số index của chữ o trong chuỗi là: ");
            for (int i = 0; i<s.length();i++){
                index = s.indexOf("o",index +1);
                if(index!=-1){
                    System.out.print(index +"\t");
                    count++;
                }else
                    break;
            }
        System.out.println("\nSố chữ o có trong chuỗi là: " + count);
    }
}
