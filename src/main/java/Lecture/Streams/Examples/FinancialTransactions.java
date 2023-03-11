package Lecture.Streams.Examples;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FinancialTransactions {
    public static void main(String[] args) {
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction("Purchase", 500.0, LocalDate.of(2022, 3, 8)));
        transactions.add(new Transaction("Withdrawal", 1000.0, LocalDate.of(2022, 3, 9)));
        transactions.add(new Transaction("Purchase", 300.0, LocalDate.of(2022, 3, 10)));
        transactions.add(new Transaction("Purchase", 200.0, LocalDate.of(2022, 3, 11)));
        transactions.add(new Transaction("Withdrawal", 500.0, LocalDate.of(2022, 3, 12)));

        String transactionType = "Purchase";
        double totalAmount = transactions.stream()
                .filter(t -> t.getTransactionType().equals(transactionType))
                .mapToDouble(Transaction::getAmount)
                .sum();

        System.out.println("Total amount spent on " + transactionType + ": " + totalAmount);
    }
}

class Transaction {
    private String transactionType;
    private double amount;
    private LocalDate date;

    public Transaction(String transactionType, double amount, LocalDate date) {
        this.transactionType = transactionType;
        this.amount = amount;
        this.date = date;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getDate() {
        return date;
    }
}

