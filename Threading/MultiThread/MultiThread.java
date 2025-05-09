package Threading.MultiThread;

public class MultiThread extends Thread{
    public static void main(String[] args) {
        MultiThread mt1=new MultiThread();
        mt1.start();
        MultiThread mt2=new MultiThread();
        mt2.start();
        MultiThread mt3=new MultiThread();
        mt3.start();
    }
    @Override
    public void run()
    {
        for (int i = 1; i < 21; i++) {
            System.out.println(i);
        }
    }
    
}
