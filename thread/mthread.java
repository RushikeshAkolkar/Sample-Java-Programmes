class mythread extends Thread
{
Thread t;
mythread(String s)
{
t=new Thread(this,s);
t.start();
}

public void run()
{
int k;
try
{
for(k=0;k<=100;k++)
{
System.out.println(k);
Thread.sleep(1000);
}
}
catch(Exception e)
{
System.out.println("Stop Your Car");
}
}
}
class mthread
{
public static void main(String args[])
{
mythread t1=new mythread("Signal");
}
}