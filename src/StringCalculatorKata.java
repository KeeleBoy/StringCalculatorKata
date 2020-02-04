
public class StringCalculatorKata {
	public static void main(String[] args) {

	}

	public static int add(String s) {

		int sum = 0;
		s = s.replace(" ", "");
		s = s.replace(",", " ");
		s = s.replaceAll("([a-zA-Z])", "");

		String[] spacesGone = s.split(" ");

		if (s.equals("")) {
			sum = 0;

		} else {
			for (int i = 0; i < spacesGone.length; i++) {
				int a = Integer.parseInt(spacesGone[i]);
				sum = sum + a;
			}
		}

		return sum;
	}
}