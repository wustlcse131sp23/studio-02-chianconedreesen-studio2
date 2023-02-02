package studio2;

public class pi {

	public static void main(String[] args) {
		int sims= 0;
		double x;
		double y;
		double distance;
		double in=0;
		
		while(sims<100) {
			x = Math.random();
			y = Math.random();
			distance = Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
			if (distance <= 1) {
				in++;
			}
			sims++;
		}
		double a = 4*(in/sims);
		System.out.println(a);
	}

}
