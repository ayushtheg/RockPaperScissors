public class RPS {
	public static void main(String[] args) {
		rps(new Scanner(System.in));
	}

	public static void rps(Scanner m){
		//Plays rock apaper scissors
			int rock = 1;
			int paper = 2;
			int scissor = 3;
			String a =  "rock";
			String b = "paper";
			String c = "scissor";
			int x =(int)(Math.random()*3+1);
			System.out.println("Put rock, paper, or scissor");
			String y = m.nextLine();
			if(x == rock){
				if(a.equals(y)){
					System.out.println("I did rock");
					System.out.println("Tie");
					
				}
				else if(b.equals(y)){
					System.out.println("I did rock");
					System.out.println("You win");		
				}
				else if(c.equals(y)){
					System.out.println("I did rock");
					System.out.println("I win");	
				}
	     	}	
			if(x == paper){
				if(a.equals(y)){
					System.out.println("I did paper");
					System.out.println("I win");
				}
				else if(b.equals(y)){
					System.out.println("I did paper");
					System.out.println("Tie");		
				}
				else if(c.equals(y)){
					System.out.println("I did paper");
					System.out.println("You win");	
				}
		}
			if(x == scissor){
				if(a.equals(y)){
					System.out.println("I did scissor");
					System.out.println("You win");
				}
				else if(b.equals(y)){
					System.out.println("I did scissor");
					System.out.println("I win");		
				}
				else if(c.equals(y)){
					System.out.println("I did scissor");
					System.out.println("Tie");	
				}
		}
	}
}
