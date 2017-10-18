
//package pack1;

class Index implements Runnable{

    public void run()
    {
        for(int i=0;i<20;i++)
        {
            System.out.println("JSTC:"+i);
        }
        System.out.println("1."+Thread.currentThread());
        //Thread.currentThread() prints the current thread name
    }

    public static void main(String[] args)
    {
        Index o=new Index();
        Thread th=new Thread(o);
        Thread th1=new Thread(o);
        Thread th2=new Thread(o);
        Thread th3=new Thread(o);
        // child thread
        th.start();
        th1.start();
        th2.start();
        th3.start();
        /*It is necessary to start() the run()
        otherwise it wont print the statements preceding that would not be compiled*/
        //new Index().start();//This makes multiple loops run simultaneously; thus, Threading.

        for(int i=20;i<40;i++)
        {
            System.out.println("Java Training Center:"+i);
        }
        System.out.println("2."+Thread.currentThread());
    }

}
