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
			 int i = 0; 
			  int move = 0;
			  while(i<=100) 
			  { int random_one = (int)Math.floor(Math.random()*(max-min+1)+min); 
			  System.out.println("Winning Position: "+i); 
			  i=i+random_one; 
			  move++;
			  }
			  System.out.println("Total Move Count = "+move); 
	}
}

