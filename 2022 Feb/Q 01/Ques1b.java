
class NumbersThread extends Thread {
   public void run() {
      for (int r = 1; r <= 100; r++) {
         System.out.println("Thread Name : " + Thread.currentThread().getName() + " - " + r);
      }
   }
}

class ThreadBase {
   public static void main(String args[]) {
      NumbersThread thread1 = new NumbersThread();
      NumbersThread thread2 = new NumbersThread();
      NumbersThread thread3 = new NumbersThread();

      thread1.setName("Red");
      thread2.setName("Blue");
      thread3.setName("Green");
     
      thread1.start();
      thread2.start();
      thread3.start();

      for (int r = 1; r <= 100; r++)
         System.out.println("SLIIT");

      System.out.println("Thread 1 - State = " + thread1.getState() + " - Alive = " + thread1.isAlive());

   }
}
