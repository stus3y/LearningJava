public class DemoThread {
    public static void main(String[] args) {
        for (int i = 0; i< 10; i++) {
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println( Thread.currentThread().getName() );
                }
            });
            t.start();
        }
    }
}
