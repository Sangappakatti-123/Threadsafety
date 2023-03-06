package deadlock;

public class Mainclass {
   public static void main(String[] args) {
	 
	   Primenum p1=new Primenum(15);
	   PrimeThread t1=new PrimeThread(p1);
	   PrimeThread t2=new PrimeThread(p1);
	   
	   t1.setName("t1 thread : ");
	   t2.setName("t2 thread : ");
	   
	   t1.start();
	   
	   t2.start();
}
}
