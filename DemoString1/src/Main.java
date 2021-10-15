public class Main {

    public static void main(String[] args) {

        Ex1lession2 s = new Ex1lession2();
        s.ex1();
        Ex2 monday = Ex2.MONDAY;
        System.out.println(Ex2.MONDAY.getWeekdays());
        System.out.println(Ex2.TUESDAY.getWeekdays());
        System.out.println(Ex2.WEDNESDAY.getWeekdays());
        System.out.println(Ex2.THURSDAY.getWeekdays());
        System.out.println(Ex2.FRIDAY.getWeekdays());
        System.out.println(Ex2.SATURDAY.getWeekdays());
        System.out.println(Ex2.SUNDAY.getWeekdays());
        // Bài bonus
        String s1 = "học lập trình java không khó";

        String s2 = s1.substring(1,27);
        System.out.println(s2);
        String s3 = s2.toUpperCase();
        System.out.println(s3);
        String s4 = s1.toUpperCase();
        System.out.println(s4);
        String s5 = s4.replace(s3,s2);
        System.out.println(s5);

    }
}
