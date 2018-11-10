import java.util.*;

class Checker implements Comparator<Player>{
	
	public int compare(Player p1,Player p2) {
		
		if(p1.score<p2.score) {
			return 1;
			
		}else if(p2.score<p1.score) {
			return -1;
		}
		else {
			return p1.name.compareTo(p2.name);
		}
		
	}
}

class Player{
	
	String name;
	int score;
	
	Player(String name, int score){
		this.name=name;
		this.score=score;
	}
	
}

public class Compare {
	
		public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.print("Enter number of players: ");
		int n=s.nextInt();
		
		Player [] player=new Player[n];
		//Checker checker=new Checker();
		
		System.out.println("Enter Player Name and Player Score: ");
		for(int i=0;i<player.length;i++) {
			
			player[i]=new Player(s.next(), s.nextInt());
		}
		
		Arrays.sort(player, new Checker());
		
		for(int i=0;i<player.length;i++) {
			System.out.printf("%s %s\n", player[i].name, player[i].score);
			
			
		}
	}
}
