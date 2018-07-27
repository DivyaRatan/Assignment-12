public class MMBankFactory extends BankFactory{ 
  
 @Override 
 public SavingAcc getNewSavingAcc(int accNo, String accNm, int accBal, boolean isSalaried) { 
 SavingAcc savingAcc = new MMSavibngAcc(accNo,accNm,accBal,isSalaried); 
 return savingAcc; 
 } 
  
 @Override 
 public CurrentAcc getNewCurrentAcc(int accNo, String accNm, int accBal, float creditLimit) { 
 CurrentAcc currentAcc = new MmCurrentAcc(accNo,accNm,accBal,creditLimit); 
 return currentAcc; 
 } 
  
 } 
