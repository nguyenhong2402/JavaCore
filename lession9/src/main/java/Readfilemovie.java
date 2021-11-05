import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class Readfilemovie {
    public void getData(){
        ArrayList<Movie> arr = new ArrayList<>();
        try{

        Gson gs = new Gson();

        FileReader reader = new FileReader("MOCK_DATA.json");
        Type ty = new TypeToken<ArrayList<Movie>>(){}.getType();
         arr = gs.fromJson(reader, ty);
            printlist(arr);
        }catch (FileNotFoundException e){
            System.out.println("Không tìm thấy file");
        }
    }
    public void printlist(ArrayList<Movie> list){
        for (Movie x : list){
            System.out.println(x);
        }
    }
}
