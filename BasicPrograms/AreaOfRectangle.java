package BasicPrograms;

public class AreaOfRectangle {
	double length, width;
	void Area() {
		double area = this.length * this.width;
		System.out.println(area);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaOfRectangle rect = new AreaOfRectangle();
		rect.length = 4;
		rect.width=10;
		rect.Area();

	}

}
