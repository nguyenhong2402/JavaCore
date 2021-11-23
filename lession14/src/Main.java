import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws MyException {
	// write your code here
    Triangle tr = new Triangle();
    boolean isCheck = false;
//    while (!isCheck){
//        try {
//            tr.check();
//            isCheck = true;
//        }catch (MyException e){
//            System.out.println(e.getMessage());
//        }catch (NumberFormatException e){
//            System.out.println("Bạn đã nhập chữ vui lòng nhập số");
//        }
//    }
        Information infor = new Information();
    while (!isCheck){
        try{
            infor.inputInformation();
            isCheck = true;
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e){
            e.printStackTrace();
        }
    }
}
}
