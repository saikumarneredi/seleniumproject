 
public class Underground {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int loaderPrice = 50 ;
    int drillerPrice = 30 ;
    int numOfLoaders = 5 ;
    int numOfDrillers = 5 ;
    int totalAmount = (loaderPrice*numOfLoaders) + (drillerPrice*numOfDrillers) ;
    
    
    System.out.println("The total Price is: "+ totalAmount);
    
    Underground ug = new Underground();
    int finalResult1 = ug.groundTotalCal(5, 30);
    
    System.out.println("The total Price is: "+ finalResult1);
    int finalResult2 = ug.groundTotalCal(68, 70);
    
    System.out.println("The total Price is: "+ finalResult2);
    
	}
	
	
	 public int groundTotalCal(int numLoaders, int numDrillers){
		 
		   int loaderPrice = 50 ;
		   int drillerPrice = 30;
		   
		   int totalPrice = (loaderPrice*numLoaders) + (drillerPrice*numDrillers) ;
		   
		   return totalPrice;
		
	}

}
