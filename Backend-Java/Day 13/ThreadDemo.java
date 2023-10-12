class DemoThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " from " + Thread.currentThread().getName());
        }
    }
}

public class ThreadDemo {
    public static void display() {
        System.out.println("Display method called...");
        System.out.println("Thread Name " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Thread d = new DemoThread();
        d.setName("newThread");
        d.start();
        Thread d2 = new DemoThread();
        d2.setName("AnotherThread");
        d2.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        for (int i = 0; i < 9; i++) {
            System.out.println(i + " from " +
                    Thread.currentThread().getName());
        }
        System.out.println("Main ends...");
    }

}