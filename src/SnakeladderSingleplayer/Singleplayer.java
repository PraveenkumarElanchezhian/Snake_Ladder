package SnakeladderSingleplayer;

public class Singleplayer {
	public static void main(String[] args) {
		       int start = 0;
		       System.out.println("Starting_Position : "+start);
		       int min = 1;
			   int max = 6;
			 int random = (int) Math.floor(Math.random()*(max-min+1)+min);
			 System.out.println("Die_Random_value : "+random);
	}
}

