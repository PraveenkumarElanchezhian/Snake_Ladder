package SnakeladderSingleplayer;

public class Singleplayer {
	
	 public static int min = 1;
	 public static int max = 6;
	 public static int movecount = 0;
	 public static int laddercount = 0;
	 public static int snakecount = 0;
	 
	public static void main(String[] args) {
		       int start = 0;
		       System.out.println("Starting_Position : "+start);
		       
			   
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
			 Singleplayer first = new Singleplayer();
			 first.player_one();
			 
	   }
	
	void player_one() {
		int i = 0; 
		  int move = 0;
		  while(i<=100) 
		  {
			  int random_one = (int)Math.floor(Math.random()*(max-min+1)+min); 
		  System.out.println("previous position "+i); 
		  i=i+random_one; 
		  move++;	
		  switch (i) 
		    {
			 case 1:
				 System.out.println("Ladder : "+i);
				 i=38;
				laddercount++;
			 case 4:
				 System.out.println("Ladder : "+i);
				 i=14;
				 laddercount++;
			 case 9:
				 System.out.println("Ladder : "+i);
				 i=31;
				 laddercount++;
			 case 21:
				 System.out.println("Ladder : "+i);
				 i=42;
			 laddercount++;
			 case 28:
				 System.out.println("Ladder : "+i);
				 i=84;
				laddercount++;
			 case 51:
				 System.out.println("Ladder : "+i);
				 i=67;
				laddercount++;
			 case 80:
				 System.out.println("Ladder : "+i);
				 i=99;
				laddercount++;
			 case 72:
				 System.out.println("Ladder : "+i);
				 i=91;
				laddercount++;
			 case 17:
				 System.out.println("Snake : "+i);
				 i=7;
				 snakecount++;
			 case 54:
				 System.out.println("Snake : "+i);
				 i=34;
				snakecount++;
			 case 62:
				 System.out.println("Snake : "+i);
				 i=19;
				snakecount++;
			 case 64:
				 System.out.println("Snake : "+i);
				 i=60;
				 snakecount++;
			 case 87:
				 System.out.println("Snake : "+i);
				 i=36;
				 snakecount++;
			 case 93:
				 System.out.println("Snake : "+i);
				 i=73;
				 snakecount++;
			 case 95:
				 System.out.println("Snake : "+i);
				 i=75;
				 snakecount++;
			 case 98:
				 System.out.println("Snake : "+i);
				 i=79;
				 snakecount++;
			default:
		   }
		  }
		  System.out.println("Total Ladder Count = "+laddercount); 
		  System.out.println("Total Snake Count = "+snakecount);
		  System.out.println("Total Move Count = "+move); 
	}
	}


