class JoinMethod {

    public static void main(String[] args) {
        System.out.println("main thread start ");

        Thread t = new MyThread();
        t.start();

        try {
            System.out.println("waiting sub thread ");
            t.join(); // 阻塞：主线程会在 thread.join() 处阻塞，直到 MyThread 执行完成。
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("main thread stop");
    }
}


 class MyThread extends Thread {
    public void run() {
        System.out.println("sub thread start");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("sub thread end ");
    }
 }
