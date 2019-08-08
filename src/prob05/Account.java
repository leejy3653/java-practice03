package prob05;

public class Account{
	String account;
	int balance;
	public Account(){
		}
	public Account(String str){
		account=str; System.out.println(account+"계좌가 개설되었습니다.");
		} 
	public String getAccountNo(){ 
		return account; 
		}
	public int getBalance(){
		return balance;
		} 
	public void save(int i){ 
		
		balance+=i;
		System.out.println(account+"계좌에 "+i+"만원이 입금되었습니다."); } 
	public void deposit(int j){ 
		balance-=j;
		
		System.out.println(account+"계좌의 "+j+"만원이 출금되었습니다.");
		}

	}
	
	


