public class Lession1 {
    public static void checkChar(){
        String s= "Hello every one";
        int i = 0;
        int n = 0;
        int count = 0;
        System.out.print("Ký tự e có index là: \t");
        while (i<s.length()){
            n = s.indexOf('e',n);
            System.out.print(n + "\t");
            n++;
            i=n;
            count++;
        }
        System.out.println("\nSố lần ký tự e xuất hiện là: " + count);
    }
}
