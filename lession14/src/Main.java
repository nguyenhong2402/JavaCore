import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Triangle tr = new Triangle();
    boolean isCheck = false;
    while (!isCheck){
        try {
            tr.check();
            isCheck = true;
        }catch (TriangleException e){
            System.out.println(e.getMessage());
        }catch (NumberFormatException e){
            System.out.println("Bạn đã nhập chữ vui lòng nhập số");
        }
    }
}
}
