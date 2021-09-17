import javax.swing.*;
import java.text.DecimalFormat;
/*
A car salesperson typically earns an hourly wage and a commission on any sales they completed. They typically work 30 to 40
hours a week, earning $5.25 to $7.50 an hour. Additionally, they earn 1% to 3% of all sales they've completed that week,
which a typical car sells for $10,000 to $30,000. A salesperson with a 1% commission that sells a car for $20,000 earns $200.00.

Write a program which prompts the user to enter the hourly rate, hours worked, the sales commission percent and the total
sales of a salesperson and calculates their total earnings. The program should include multiple methods. (What ARE the
smaller pieces?)

Example:

Hourly Rate: 6.25
Hours Worked: 33.5
Sales Commission: 1.5%
Total Sales: $65,000.00

Total Earnings: $1184.38

THE PLAN (*dun dun dun*)
1.) receive inputs for proper math
Possible inputs: hourlyWage, hoursWorked, earnPercent, carPrice
2.)Do math
    -Get the user to enter in how long the user worked in hours and multiply the hourly wage by that amount.
    -Once that information is gathered, have the user input the car price and see what percent of the money the salesman earned.
    -Add together the percent gained and the money from how many hours they worked to get our total earnings.
3.) Output the data found
 */

public class SalesCommission {

    public static void main(String[] args) {
        double hourlyWage = getInput("How much does the salesman earn per hour? ");
        double hoursWorked = getInput("How many hours did the salesman work?");
        double earnPercent = getInput("How much commission percent does the salesman earn?");
        double sales = getInput("How many sales did they make?");

        double payDay = saleWage(hourlyWage, hoursWorked, earnPercent, sales);

        outputResults(payDay);
        System.exit(0);
    }


//Input receiver
    public static double getInput(String message){
        return Double.parseDouble(JOptionPane.showInputDialog(message));
    }


//The Job (The math, the movie, the game)
    public static double saleWage(double hourlyWage, double hoursWorked, double earnPercent, double sales){
        double hourMoney = hourlyWage * hoursWorked;
        double percentEarned = sales * earnPercent / 100.0;

        return hourMoney + percentEarned;
    }

//The output... go getter? (I don't what the opposite of a receiver is.)
    public static void outputResults(double totalCost){
        DecimalFormat round = new DecimalFormat("#,###.00");

        JOptionPane.showMessageDialog(null, "The total earnings is " + round.format(totalCost));
    }
}
