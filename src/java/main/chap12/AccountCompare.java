package chap12;

public class AccountCompare {
	
	static int compBalance(Account a, Account b) {
		long totalBalanceA = a instanceof TimeAccount
				? ((TimeAccount)a).getBalance() + ((TimeAccount)a).getTimeBalance()
				: a.getBalance();
		long totalBalanceB = b instanceof TimeAccount
				? ((TimeAccount)b).getBalance() + ((TimeAccount)b).getTimeBalance()
			    : b.getBalance();
				if (totalBalanceA > totalBalanceB)
					return 1;
				else if (totalBalanceA < totalBalanceB)
					return -1;
				return 0;
	}

	public static void main(String[] args) {
		Account adachi = new Account("足立幸一", "123456", 500);
		TimeAccount nakata = new TimeAccount("仲田真二", "654321", 300, 400);
		
		System.out.println("足立君と仲田君の預金残高の比較結果です。");
		switch (compBalance(adachi, nakata)) {
		case  0: System.out.println("二人の預金残高は同じ。");
		case  1: System.out.println("足立君のほうが預金残高が多い。");
		case -1: System.out.println("仲田君のほうが預金残高が多い。");
		}

	}

}
