class Hello1 implements Runnable {
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Hello1");
            try{Thread.sleep(1000);}catch (Exception e){}
        }
    }
}


class Hi1 implements Runnable {
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Hi1");
            try{Thread.sleep(1000);}catch (Exception e){}
        }
    }
}

public class RunnableMulti {
    public static void main(String args[]){
        Runnable obj1 = new Hello();
        Runnable obj2 = new Hi();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        try{Thread.sleep(100);}catch (Exception e){}
        t2.start();
    }
}

