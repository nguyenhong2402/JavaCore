public class UsingThread extends Thread{
    public void run(){
        for (int i = 10 ; i>0;i--){

            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(0);
        System.out.println("Hết giờ");

    }
}
