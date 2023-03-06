package deadlock;

public class Primenum {
      int n;
      
	public Primenum(int n) {
		super();
		this.n = n;
	}

	synchronized void primenum(int n) {
		String s=Thread.currentThread().getName();
		if(n<=1) {
			System.out.println(" not a prime no  "+s);
		}
		int c=0;
		for(int i=2;i<=n-1;i++) {
			if(n%i==0) {
				c++;
			}
		}
		if(c==0) {
			System.out.println("prime   "+s);
		}
		else {
			System.out.println("not a prime no  "+s);
		}
		try {
			   Thread.sleep(5000);
		   }
		   catch(InterruptedException e) {
			   e.printStackTrace();
		   }
	}
}
