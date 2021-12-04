public class CreateThread extends Thread{
    NetflixService net = new NetflixService();
    @Override
    public void run() {
        net.getData();
        System.out.println("----------------------------------------------------");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        net.getmaxMovieviews();
        System.out.println("----------------------------------------------------");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        net.listMovieCategory();
        System.out.println("----------------------------------------------------");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        net.listMovieGenre();
        System.out.println("----------------------------------------------------");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
