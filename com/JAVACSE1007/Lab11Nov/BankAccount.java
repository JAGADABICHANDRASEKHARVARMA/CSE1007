package com.JAVACSE1007.Lab11Nov;

import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BankAccount
{
    private double balance;

    public BankAccount()
    {
        balance = 0;
    }

    public BankAccount(double initialBalance)
    {
        balance = initialBalance;
    }
    public void deposit(double amount)
    {
        balance = balance + amount;
    }
    public void withdraw(double amount)
    {
        balance = balance - amount;
    }
    public double getBalance()
    {
        return balance;
    }

    public void transfer(double amount, BankAccount other)
    {
        withdraw(amount);
        other.deposit(amount);
    }
}



class SavingsAccount extends BankAccount
{
    private double interestRate;
    public SavingsAccount(double rate)
    {
        interestRate = rate;
    }

    public void addInterest()
    {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
    }
}

class SavingsCalculatorFrame extends JFrame {

    private JTextField ratefield;
    private JTextField balfield;
    private JTextField yearfield;
    private JButton button;
    private JPanel panel;
    private BankAccount account;
    private JLabel rateLabel;
    private JLabel balLabel;
    private JLabel yearLabel;
    private TextArea result;

    public SavingsCalculatorFrame() {

        account = new BankAccount();
        createTextField();
        createButton();
        createPanel();

        setSize(300, 300);

    }

    private void createTextField() {

        rateLabel = new JLabel("Annual Rate: ");
        balLabel = new JLabel("Initial Balance:");
        yearLabel = new JLabel("Number of years:");
        balfield = new JTextField(10);
        ratefield = new JTextField(10);
        yearfield = new JTextField(10);
        result = new TextArea();

    }

    private void createButton() {

        button = new JButton("Calculate");

        class AddCalculateListener implements ActionListener {

            public void actionPerformed(ActionEvent event) {

                double balance = Double.parseDouble(balfield.getText());
                double rate = Double.parseDouble(ratefield.getText());
                double years = Double.parseDouble(yearfield.getText());

                account = new BankAccount(balance);
                rate = rate / 100;

                for (int i = 1; i <= years; i++) {

                    double newbalance = account.getBalance() * rate;
                    account.deposit(newbalance);
                    String test = String.valueOf(account.getBalance()) + "\n";
                    System.out.println(test);
                    result.append(test);

                }

            }

        }

        ActionListener listener = new AddCalculateListener();
        button.addActionListener(listener);
    }
    private void createPanel() {
        panel = new JPanel();
        panel.add(balLabel);
        panel.add(balfield);
        panel.add(rateLabel);
        panel.add(ratefield);
        panel.add(yearLabel);
        panel.add(yearfield);
        panel.add(button);
        panel.add(result);
        add(panel);

    }
}
class SavingsCalculator
{
    public static void main(String[] args)
    {
        JFrame frame = new SavingsCalculatorFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("SavingsCalculator");
        frame.setVisible(true);
    }
}


