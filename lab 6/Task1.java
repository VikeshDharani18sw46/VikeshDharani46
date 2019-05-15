class Task1{
	private String name;String email;char gender;
	public Task1(String name,String email,char gender){
		this.name=name;
		this.email=email;
		this.gender=gender;
	}

	public String getname(){
		return name;
	}
	public void setemail(String email){
		this.email=email;
	}
	public String getemail(){
		return email;
	}


	public char getgender(){
		return gender;
	}
	public String tostring(){
		return "Author[Name="+name+",Email="+email+",Gender="+gender+"]";
	}
}
class Task1main{
	public static void main(String[] args) {
		Task1 a=new Task1("Vikesh","Vikikumar574@gmail.com",'m');

		a.getname();
		a.getemail();
		a.getgender();
		a.tostring();

        System.out.println(a.tostring());
	}
}