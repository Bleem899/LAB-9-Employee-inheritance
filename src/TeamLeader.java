public class TeamLeader {

    private int monthlyBonusAmount;
    private int requiredNumOfTrainingHours;
    private int trainingHoursAttended;
    private double hourlyPay;

    public TeamLeader(double hourPay, int monthBA, int reqNumHours, int trainHoursAtt) {
        monthlyBonusAmount = monthBA;
        requiredNumOfTrainingHours = reqNumHours;
        trainingHoursAttended = trainHoursAtt;
        hourlyPay = hourPay;

        setMonthlyBonusAmount(monthlyBonusAmount);
        setRequiredNumOfTrainingHours(requiredNumOfTrainingHours);
        setTrainingHoursAttended(trainingHoursAttended);
    }

    public void setMonthlyBonusAmount(int monthBA){
        monthlyBonusAmount = monthBA;
    }
    public int getMonthlyBonusAmount(){
        return monthlyBonusAmount;
    }

    public void setRequiredNumOfTrainingHours(int reqNumHours){
        requiredNumOfTrainingHours = reqNumHours;
    }
    public int getRequiredNumOfTrainingHours(){
        return requiredNumOfTrainingHours;
    }

    public void setTrainingHoursAttended(int trainHoursAtt){
        trainingHoursAttended = trainHoursAtt;
    }
    public int getTrainingHoursAttended(){
        return trainingHoursAttended;
    }

    public String toString(){
        return ", Monthly Bonus Amount: $" + getMonthlyBonusAmount() + ", Required Number of Training Hours: " +
                getRequiredNumOfTrainingHours() + ", Training Hours Attended: " + getTrainingHoursAttended() + ".";
    }

    public int calcWeeklyPay(){
        return (int) ((hourlyPay * 40) + (monthlyBonusAmount / 4));
    }
}
