package swexpert.j2;

class Pair {
	int x;
	int y;
	
	Pair(int x, int y){
		this.x = x;
		this.y = y;
	}
}

public class SwapTest {
	public static void swap(int x, int y) {
		int tmp;
		
		tmp = x;
		x = y;
		y = tmp;
	}
	public static void swap(Pair p) {
		int tmp;
		
		tmp = p.x;
		p.x = p.y;
		p.y = tmp;
	}
	public static void main(String[] args) {
		int x = 10, y = 20;
		Pair p = new Pair(10, 20);
		
		System.out.println(x+","+y);
		System.out.println(p.x+","+p.y);
		
		swap(x,y);
		swap(p);
		
		System.out.println(x+","+y);
		System.out.println(p.x+","+p.y);
	}
}
