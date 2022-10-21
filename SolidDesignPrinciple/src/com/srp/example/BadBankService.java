package com.srp.example;

public class BadBankService {

	public long deposit(long amount, String accountNumber) {
		return 0;
	}

	public long withdraw(long amount, String accountNumber) {
		return 0;
	}

	public void printPassBook() {
		// gives transaction info
	}

	public void getLoanInterestInfo(String loanType) {
		if (loanType.equals("home-loan")) {
			// do something
		}
		if (loanType.equals("car-loan")) {
			// do something
		}
		if (loanType.equals("personal-loan")) {
			// do something
		}
	}

	public void sendOtp(String medium) {
		if (medium.equals("email")) {
			// write email related logic
		}
	}
}
