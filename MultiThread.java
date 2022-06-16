public class MultiThread {
    public static void main(String args[]) {
        int n = 8;
        for (int i = 0; i < 8; i++) {
            Thread obj = new Thread(new MultiThreadRun());
            obj.start();
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }

        }
    }
}
