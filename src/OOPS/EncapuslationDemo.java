package OOPS;

public class EncapuslationDemo {
	
	private String name;
	private int id;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public static void main(String[] args) {
		EncapuslationDemo s1 = new EncapuslationDemo();
		s1.setName("JAI");
		System.out.println(s1.getName());
		
		s1.setId(30);
		System.out.println(s1.getId());
		
	}
}
