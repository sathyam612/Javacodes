public class MultiThreadRun implements  Runnable{
    public void run(){
        try{
            System.out.println("Thread "+Thread.currentThread().getId()+" is running");
        }
        catch (Exception e){
            System.out.println("Exception has occured");
        }
    }
}
