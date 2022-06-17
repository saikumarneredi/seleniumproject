
public class HostelRoom {


	String name =" venkatSai" ;
	int monthlyRent = 5000 ;
	int dailyRent = 250 ;
	  int calAmount(int rentM,int rentD ){
		int  totalAmount = rentM*rentD;
		return totalAmount;
	  }
		
		public static void main(String[] args) {

		HostelRoom HR = new HostelRoom();
		int finalAmount = HR.calAmount(5000, 250);
		
		System.out.println("totalAmount :" +finalAmount);
		
		
		}
	
	

	}


