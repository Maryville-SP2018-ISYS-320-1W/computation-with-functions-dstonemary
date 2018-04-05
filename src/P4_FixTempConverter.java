/*
  	ISYS 320
  	Name(s): Derek Stone
  	Date:    April-05-2018
*/

/*
 What were the errors you found?
 1. print tempc : tempc print without update the value
 2. void method : method ftoc was returned nothing
 
 */

public class P4_FixTempConverter {
	public static void main(String[] args) {
		double tempf = 98.6;
		double tempc = 0.0;
		tempc = ftoc(tempf, tempc);
		System.out.println("Body temp in C is: " + tempc);
	}

	// converts Fahrenheit temperatures to Celsius
	public static double ftoc(double tempf, double tempc) {
	      return (tempf - 32) * 5 / 9;
    }
}
