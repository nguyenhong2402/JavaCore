public class Subles2 {
    int code;
    int v;
    String name;
    Subles2(int c,int v1, String n){
        code = c;
        v = v1;
        name =n;
    }

    @Override
    public String toString() {
        return code + " - " + v + "km/h - " + name + "\n";
    }
}
