
public class feeDeposit {
    String examName = "Semester";
    String applierName = "Rohith";
    int accountNo = 720732007;
    double amount = 50000;

    public double calTotalAmount(double previousBalance, double currentAmount) {
        currentAmount = previousBalance + currentAmount;
        return currentAmount;
    }

         
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		feeDeposit bdf = new feeDeposit();
        double resultBdf =bdf.calTotalAmount(50000, 50000);
		   System.out.println(" resulBdf"+resultBdf );
		   
    }

	}


