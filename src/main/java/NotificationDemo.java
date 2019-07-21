import java.util.HashMap;
import java.util.Map;

public class NotificationDemo {
    private volatile boolean go = false;

    public static void main(String args[]) throws InterruptedException {
        HashMap a=new HashMap();
        a.put(null,null);
        a.put(1,2);
        a.put("2","ff");

        a.forEach((k, v) -> System.out.println("key:value = " + k + ":" + v));

    }
    /*
     * wait and notify can only be called from synchronized method or bock
     */
    private synchronized void shouldGo() throws InterruptedException {
        while(go != true){
            System.out.println(Thread.currentThread()
                    + " is going to wait on this object");
            wait(); //release lock and reacquires on wakeup
            System.out.println(Thread.currentThread() + " is woken up");
        }
        go = false; //resetting condition
    }

    /*
     * both shouldGo() and go() are locked on current object referenced by "this" keyword
     */
    private synchronized void go() {
        while (go == false){
            System.out.println(Thread.currentThread()
                    + " is going to notify all or one thread waiting on this object");

            go = true; //making condition true for waiting thread
            //notify(); // only one out of three waiting thread WT1, WT2,WT3 will woke up
            notifyAll(); // all waiting thread  WT1, WT2,WT3 will woke up

        }

    }
}