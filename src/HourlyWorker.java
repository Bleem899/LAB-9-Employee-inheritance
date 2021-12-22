public class HourlyWorker {
    private int shift;
    private double hourlyPay;

    public HourlyWorker(int s, double hourPay){
        super();
        shift = s;
        hourlyPay = hourPay;

        setShift(shift);
        setHourlyPay(hourlyPay);
    }

    public int getShift(){
        return shift;
    }

    public void setShift(int s){
        shift = s;
    }

    public double getHourlyPay(){
        return hourlyPay;
    }

    public void setHourlyPay(double hourPay){
        hourlyPay = hourPay;
    }

    public String toString(){
        if(getShift() == 1) {
            return ", Hourly Worker Day Shift $" + getHourlyPay() + "/hour";
        }else{
            return ", Hourly Worker Night Shift $" + getHourlyPay() + "/hour";
        }
    }

    public double calcWeeklyPay(){
        return hourlyPay * 40;
    }
}
