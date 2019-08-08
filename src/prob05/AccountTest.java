
package prob05;

public class AccountTest{
	public static void main(String[] args){
		String accNo=null; 
		int balance=0;
		Account account=new Account("078-3762-293");
		
		accNo=account.getAccountNo(); 
		balance=account.getBalance(); 
		System.out.println(account.getAccountNo()+"계좌의 잔고는"+account.getBalance()+"만원입니다.");
		account.save(100);  
		balance=account.getBalance(); 
		System.out.println(account.getAccountNo()+"계좌의 잔고는:"+account.getBalance()+"만원입니다."); 
		account.deposit(30);
		balance=account.getBalance(); 
		System.out.println(accNo+"계좌의 잔고는:"+account.getBalance()+"만원입니다."); 
		} 
	}
	

