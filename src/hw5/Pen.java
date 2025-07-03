package hw5;

public abstract class Pen {

	private String brand;
	private double price;
	
	public Pen() {
		
	}
	public Pen(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	 
	public void setPrice(double price) {
		this.price = price;
	}
		
	public String getBrand() {
		return brand;
	}
	
	public double getPrice() {
		return price;
	}
	
	public abstract void write();
	
	class Pencil extends Pen{
		public Pencil(String brand, double price) {
			super(brand, price);
		}
		public double getPrice() {
			return getPrice() * 0.8;
		}
		@Override
		public void write() {
			System.out.println("削鉛筆");
			
		}
		
	}
	
	class InkBrush extends Pen{
		public InkBrush(String brand, double price) {
			super(brand, price);
		}
		

		public double getPrice() {
			return getPrice() * 0.9;
		}
		@Override
		public void write() {
			System.out.println("沾墨汁");
			
		}
		
	}
	
	public static void main(String[] args) {
		Pen p1 = new Pencil();
		Pen p2 = new Pencil();
		p1.write();
		System.out.println(p1.getPrice());
		p2.write();
		System.out.println(p1.getPrice());
	}
}
