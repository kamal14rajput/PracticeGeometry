public class EqualityCheck {

        public static void main(String[] args) {
		int x1, x2, y1, y2, x3, x4, y3, y4;
		double answer, answer2;
		x1=13; x2=4; y1=7; y2=2;
		answer = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		System.out.println(answer);
		x3=3; x4=4; y3=17; y4=5;
		answer2 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2)); System.out.println(answer2);
		if (answer == answer2){
			System.out.println("Length of lines are equal");
		}
		else
		{
			System.out.println("Length of lines are not equal");
		}
	}
}
