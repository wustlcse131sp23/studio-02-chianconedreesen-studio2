package studio2;

public class Ruin {

	public static void main(String[] args) {
		double winChance = .7;
		double winLimit = 10.0;
		int totalSimulations = 500;
		double simCounter = totalSimulations;
		int ruinCounter= 0;
		int startAmount2 = 2;
		double expectedRuin;
		int c = 0;
		double b = (1-winChance)/winChance;
		if (winChance == .5) {
			expectedRuin = (1.0 - (startAmount2/winLimit));
			System.out.println("Expected ruin rate: "+expectedRuin +"%");
		}
		else {
			expectedRuin = (Math.pow(b, startAmount2) - Math.pow(b, winLimit))/(1-Math.pow(b, winLimit));
			System.out.println("Expected ruin rate: "+expectedRuin+"%");
		}
		while (totalSimulations > 0) {
			int startAmount = startAmount2; 
			c++;
			int playsInDay = 0;

			System.out.print("Simulation Day " + c + "  ");
		while (startAmount > 0 && startAmount < winLimit) {
			double A = Math.random();
			if (A <= winChance) {
				startAmount++;
				playsInDay++;
				
			}
			else {
				startAmount--;
				playsInDay++;
			}
			
		}
		System.out.println("Number of plays: " + playsInDay);
		if (startAmount == 10) {
			System.out.println("Win");
		
		}
		else {
			System.out.println("loss");
			ruinCounter++;
		}
		totalSimulations--;
		}
		System.out.print("Ruin Rate: " + ruinCounter/simCounter + "%");
		//if ()
	}

}
