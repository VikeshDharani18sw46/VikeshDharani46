class Task3{
	public void change(int n,char c){
		System.out.println(n+" "+c);
	}
	public void change(char c,int n){
		System.out.println(c+" "+n);
	}
}
class Task3main {
	public static void main(String[] args) {
		Task3 p1=new Task3();
		p1.change(5,'c');
		p1.change('c',5);
	}
}