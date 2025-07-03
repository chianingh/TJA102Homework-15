package hw5Ext;

public class TestPen {
	public static void main(String[] args) {
		Pen p1 = new Pencil("Pencil", 100);
		Pen p2 = new InkBrush("InkBrush", 80);
		p1.write();
		System.out.println(p1.getPrice());
		p2.write();
		System.out.println(p2.getPrice());
	}
}
