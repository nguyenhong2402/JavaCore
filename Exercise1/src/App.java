public class App {
    public static void main(String[] args) throws Exception {
        //Viết phương thức tính BMI có kiểu trả về là void
        App.voidBMI();
        //Viết phương thức tính BMI theo kiểu double
        App dBMI = new App();
        double result = dBMI.doubleBMI();
        System.out.println("Chỉ số BMI của tôi theo kiểu trả về double là " + result);
        //Viết phương thức tính BMI có kiểu trả về là double và có truyền tham số
        double doubleBMIts = App.doubleBMIts(1.7,55);
        System.out.println("Chỉ số BMI của tôi theo kiểu double có truyền tham số là " + doubleBMIts);

    }

    static void voidBMI() {

        double height = 1.7;
        int weight = 55;                                //Viết phương thức tính BMI có kiểu trả về là void
        double bmi = weight / (height * height);
        System.out.println("Chỉ số BMI của tôi theo kiểu trả về void là " + bmi);
    }
    
    double doubleBMI() {
        double height = 1.7;                   //Viết phương thức tính BMI theo kiểu double
        int weight = 55;
        return weight / (height * height);

    }

    static double doubleBMIts(double height, int weight) {
        return weight / (height * height);      //Viết phương thức tính BMI có kiểu trả về là double và có truyền tham số
    }
}
