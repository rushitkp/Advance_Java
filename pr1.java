class ThreadA extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("ThreadA:"+i);
        }
        System.out.println("Extit From ThreadA");
    }
}
class ThreadB extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("ThreadB:"+i);
        }
        System.out.println("Exit From ThreadB");
    }    
}
class ThreadC extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("ThreadC:"+i);
        }
        System.out.println("Exit From ThreadC");
    }
}
public class pr1
{
    public static void main(String[] args) 
    {
        ThreadA ta=new ThreadA();
        ThreadB tb=new ThreadB();    
        ThreadC tc=new ThreadC();    
        ta.start();
        tb.start();
        tc.start();
    }
}