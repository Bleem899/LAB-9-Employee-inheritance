import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Employee {
    private String name;
    private String number;
    private GregorianCalendar hireDate;
    private double hourlyPay;

    public Employee(String nam, int nID, char nClass, int years, int months, int days, double hourPay){
        name = nam;
        number = nID + "-" + nClass;
        hourlyPay = hourPay;

        setName(name);
        setNumber(nID, nClass);
        hireDate = setHireDate(years, months, days);
    }

    public String getName(){
        return name;
    }
    public void setName(String nam){
        name = nam;
    }

    public String getNumber(){
        return number;
    }
    public boolean setNumber(int numID, char numClass){
        return isValidNumber(numID, numClass);
    }

    public GregorianCalendar setHireDate(int years, int months, int days){
        GregorianCalendar hireDate = new GregorianCalendar(years, months-1, days);
        return hireDate;
    }
    public GregorianCalendar getHireDate(){
        return hireDate;
    }

//    public String toString(){
//        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
//        String s = sdf.format(hireDate.getTime());
//        return "Name: " + getName() + ", ID: " + getNumber() + ", Hire Date: " + s;
//    }
    public String toString(){
        return name + '\t' + getNumber() + '\t' + calcWeeklyPay();
    }

    public double calcWeeklyPay(){
        return hourlyPay * 40;
    };

    public boolean isValidNumber(int nID, char nClass){
        return nID > 000 && nID <10 && nClass > 0 && nClass < 13;
    }
}
