package dataType;

public class Primitive {

	public static void main(String[] args) {
		Primitive pre = new Primitive();
		pre.intDataType(32, 20);

	}

	public int intDataType(int hour, int wages) {
		int total = hour * wages;
		System.out.println(total);
		return total;

	}

}
