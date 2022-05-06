package practical2Part2;
/**
 *
 * @author D'NIKE
 * @description In this exercise, you are required: first, to create a Java Package called 
practical2Part2 in the project called OOSD1 that you have already created; second, 
to design and write a Java program for calculating the Total Money we spent last month. 
The program uses three variables as input for Food, Leisure and Clothes expenses, and it 
uses another variable as output for the total money spent as output.
 */
public class MonthlyExpenditure {

    public static void main(String[] args) {
        double foodExpenses = 300.0;
        double leisureExpenses = 100.0;
        double clothesExpenses = 50.0;
        double totalSpent;
        
        totalSpent = foodExpenses + leisureExpenses + clothesExpenses;
        System.out.println("The total expenditure this month was #" + totalSpent);
    }
    
}
