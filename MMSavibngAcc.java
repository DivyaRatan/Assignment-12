public class MMSavibngAcc extends SavingAcc{ 
  
 public MMSavibngAcc(int accNo, String accNm, int accBal, boolean isSalaried) { 
 super(accNo, accNm, accBal, isSalaried); 
  
 } 
  
 @Override 
 public void withdraw(float amount) { 
 { 
 if(isSalaried()) { 
 if((getAccBal() - amount) >= 0) 
 setAccBal(getAccBal() - amount); 
 else { 
 System.out.println("Failed"); 
 } 
 } 
 else { 
 if((getAccBal() - amount) >= getMinbal()) 
 setAccBal(getAccBal() - amount); 
 else { 
 System.out.println("Failed"); 
 } 
 } 
 } 
  
 } 
 @Override 
 public String toString() { 
 return "MMSavingAcc [toString()=" + super.toString() + "]"; 
 } 
  
 } 
