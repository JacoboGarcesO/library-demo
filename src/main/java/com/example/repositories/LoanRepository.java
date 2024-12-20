package com.example.repositories;

import com.example.models.Loan;

import java.util.LinkedList;
import java.util.List;

public class LoanRepository {
  private static LoanRepository instance;
  private List<Loan> loans;

  private LoanRepository() {
    loans = new LinkedList<>();
  }

  public static LoanRepository getInstance() {
    if (instance == null) {
      instance = new LoanRepository();
    }

    return instance;
  }

  public List<Loan> getLoans() {
    return loans;
  }

  public void addLoan(Loan loan) {
    loans.add(loan);
  }
}
