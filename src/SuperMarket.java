
public class SuperMarket {
	String marketName =" haritageFresh";
	int groceriesTypes = 12 ;
	int vegetableTypes = 10 ;
	
	int totalTypes(int typesOfGroc,int typesOfVeg ) {
     int totalResult = (typesOfGroc+typesOfVeg);
     return totalResult;
	}
		
          public static void main(String[] args) {
			
	    SuperMarket SM = new SuperMarket();
	    int types = SM.totalTypes(12 ,10);
	    System.out.println("totaltypes :" + types);

	
	
		
	}

}
