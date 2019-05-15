class Task4{
	public void same(int lenght , int breadth){
		System.out.println("the area of rectangle is="+(lenght*breadth));
	}
public void same(int area){
	System.out.println("the area of sqaure is="+(area*area));
}

	}

class Task4main{
	public static void main(String[] args) {
		Task4 g1=new Task4();
		g1.same(5,6);
		g1.same(5);
	}
}