package SnakeladderSingleplayer;

public class Singleplayer {
	public static void main(String[] args) {
		       int start = 0;
		       System.out.println("Starting_Position : "+start);
		       int min = 1;
			   int max = 6;
			   int movecount = 0;
			 int random = (int) Math.floor(Math.random()*(max-min+1)+min);
			 System.out.println("Die_Random_value : "+random);
			 
			 if (movecount == 0) 
			  { 
				  System.out.println("player in same position"); 
			  } 
			  else 
			  {
			      System.out.println("player in next position"); 
			  }
	}
}

