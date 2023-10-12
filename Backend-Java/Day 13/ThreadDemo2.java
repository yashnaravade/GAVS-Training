class PrintData {
    public synchronized void print() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " from " + Thread.currentThread().getName());
        }
    }
}

class DemoThread extends Thread {
    private PrintData printObj;

    public DemoThread(PrintData obj) {
        printObj = obj;
    }

    public void run() {
        printObj.print();
    }
}

public class ThreadDemo2 {
    public static void display() {
        System.out.println("Display method called...");
        System.out.println("Thread Name " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        PrintData pObj = new PrintData();
        Thread d = new DemoThread(pObj);
        d.setName("newThread");
        d.start();
        Thread d2 = new DemoThread(pObj);
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