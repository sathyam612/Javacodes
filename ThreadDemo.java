
class Hello extends Thread {
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Hello");
            try{Thread.sleep(1000);}catch (Exception e){}
            }
        }
    }


class Hi extends Thread {
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Hi");
            try{Thread.sleep(1000);}catch (Exception e){}
        }
    }
}

public class ThreadDemo {
    public static void main(String args[]){
        Hello obj1 = new Hello();
        Hi obj2 = new Hi();
        obj2.start();
        try{Thread.sleep(100);}catch (Exception e){}
        obj1.start();
    }
}
