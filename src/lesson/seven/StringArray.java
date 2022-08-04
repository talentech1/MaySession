package lesson.seven;

public class StringArray {

	public static void main(String[] args) {
		String[] colors = new String[3];
		// [][][]
		System.out.println(colors[0]);
		colors[0] = "red";
		colors[1] = "blue";
		colors[2] = "green";
		// ["red"]["blue"]["green"]
		
		System.out.println(colors[0]);
		
		String[] colorsTwo = {"black", "yelllo", "orange"};
		System.out.println(colorsTwo[1]);

	}

}
