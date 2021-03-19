package sample;

import javax.swing.*;
import java.io.Serializable;

public class CommissionEmployee extends Employee implements Serializable {
    double commission;
    double sale;

    public CommissionEmployee(String name, String id, String designation, double commission, double sale) {
        super(name, id, designation);
        this.commission = commission;
        this.sale = sale;
    }

    public double getSalary(double sale) {
            return (commission / 100) * sale;


    }

    public void increaseSalary(double amt) throws InvalidSalaryException {
        if ((commission + amt) / 100 <= .3) {
            commission += amt;
        } else
            throw new InvalidSalaryException("Commission Amount 30% over! ");
    }


    public double getSalary() {
            return (commission / 100) * sale;


    }

    public void display() {
        super.display();
        JOptionPane.showMessageDialog(null,"  Commission Percent:  "+commission,"Display",JOptionPane.PLAIN_MESSAGE);

    }
}
