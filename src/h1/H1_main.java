package h1;

public class H1_main {
	public static void main(String[] args) {
	
	int a = 21;
	int b = 7;
	
	Bruch bruch1 = new Bruch(a, b);
    System.out.println("Bruch vor dem Kürzen: " + bruch1.zaehler + "/" + bruch1.nenner);

    bruch1.shorten();
    System.out.println("Bruch nach dem Kürzen: " + bruch1.zaehler + "/" + bruch1.nenner);

    Bruch bruch2 = new Bruch(3, 1);
    System.out.println("Hat bruch1 denselben Wert wie bruch2? " + bruch1.hasSameValueAs(bruch2));
    }
}


class Bruch {
	int zaehler;
	int nenner;
	
	Bruch (int zaehler, int nenner) {
		this.zaehler = zaehler;
        this.nenner = nenner;
	 }
	
	private int ggT(int x, int y) {
		int rest;

	    while (y != 0) {
	        rest = x % y;  // r = x mod y
	        x = y;         // nächster Durchlauf: x wird y
	        y = rest;      // y wird der neue Rest
	    }

	    return x; // x ist der ggT
		}
	
	public void shorten () {
		int z = ggT(zaehler, nenner); 
		zaehler = zaehler / z;
		nenner = nenner / z;
		}
	
	public boolean hasSameValueAs(Bruch b) {
		if (this.zaehler * b.nenner == this.nenner * b.zaehler){
			return true;
		}
		return false;
	}
}
