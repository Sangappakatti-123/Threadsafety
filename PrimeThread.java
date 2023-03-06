package deadlock;

public class PrimeThread extends Thread{
   private  Primenum p1;

    public PrimeThread(Primenum p1) {
	super();
	this.p1 = p1;
    }
   
   public void run() {
	   p1.primenum(p1.n);
   }
   
}
