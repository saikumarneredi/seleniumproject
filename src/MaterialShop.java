
public class MaterialShop {
	         String shopName =" surya";
		
		  int silkPrice = 30 ;
        int fabricPrice = 50 ;
        
        int totalCal(int priceOfSilk,int priceOfFabric) {
        int	totalResult = silkPrice-fabricPrice;
        return totalResult;
        }
         public static void main(String[] args) {
			
	    MaterialShop MS = new  MaterialShop();
		int finalResult =MS.totalCal(30, 50);
		
         System.out.println("the totalPrice :"+ finalResult);
	}

}
