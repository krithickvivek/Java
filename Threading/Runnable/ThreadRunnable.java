package Threading.Runnable;
public class ThreadRunnable implements Runnable 
{
    public static void main(String[] args) 
    {
        ThreadRunnable tr1 = new ThreadRunnable();
        Thread t1 = new Thread(tr1); // passing the object of the user defined class
        t1.start();
        ThreadRunnable tr2 = new ThreadRunnable();
        Thread t2 = new Thread(tr2); // passing the object of the user defined class
        t2.start();
        ThreadRunnable tr3 = new ThreadRunnable();
        Thread t3 = new Thread(tr3); // passing the object of the user defined class
        t3.start();
    }
    @Override
    public void run() {
        for (int i = 1; i <=20; i++) {
            System.out.println(i);
        }
    }  
}
