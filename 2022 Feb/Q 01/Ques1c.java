
class Calculation {
   long  total;
   public Calculation() {
      total = 0;
   }
   public void Sum(int start, int end) {
      long  temp = 0;
      for (int r = start; r <= end; r++) {
          temp += r;
      }
      synchronized (this) {
         total += temp;
      }
   }
   public long getTotal() {
      return total;
   }
}

class ParallelThread extends Thread {
   Calculation myCalc;
   int start, end;
   public ParallelThread(Calculation calc, int start, int end) {
       myCalc = calc;
       this.start = start;
       this.end = end;
   }
   public void run() {
      myCalc.Sum(start, end);
   }
}

class ParallelTest {
   public static void main(String args[])  throws InterruptedException {
      Calculation mycalc = new Calculation();
      ParallelThread thread1 = new ParallelThread(mycalc, 1, 25000);
      ParallelThread thread2 = new ParallelThread(mycalc, 25001, 50000);
      ParallelThread thread3 = new ParallelThread(mycalc, 50001, 75000);
      ParallelThread thread4 = new ParallelThread(mycalc, 75001, 100000);
      thread1.start();
      thread2.start();
      thread3.start();
      thread4.start();

      thread1.join();
      thread2.join();
      thread3.join();
      thread4.join();
  
      System.out.println("Total " + mycalc.getTotal());

   }
}
