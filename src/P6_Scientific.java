/*
  	ISYS 320
  	Name(s): Derek Stone
  	Date:    April-05-2018
*/

public class P6_Scientific {

	public static void main(String[] args) {
		int result = (int) computeScientificValue(6.5, 3);
		System.out.println(result);
	}
	
	public static double computeScientificValue(double number, int expo){
		return (number * Math.pow(10, expo));
	}

}
