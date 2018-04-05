/*
  	ISYS 320
  	Name(s): Derek Stone
  	Date:    April-05-2018
*/

public class PayProgram {

	
	public static void main(String[] args) {
		double pay = computePay(4.00, 11);
		System.out.println(pay);
	}
	
	public static double computePay(double salary, int hour){
		double pay = (salary * Math.min(hour, 8)) + ((salary * 1.5) * Math.max((hour - 8), 0));
		return pay;
	}

}
