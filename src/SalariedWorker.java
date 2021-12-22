public class SalariedWorker{
    private int annualSalary;
    private int annualProductionBonus;

    public SalariedWorker(int annSalary, int annProdBonus) {
        annualSalary = annSalary;
        annualProductionBonus = annProdBonus;

        setAnnualSalary(annSalary);
        setAnnualProductionBonus(annualProductionBonus);
    }

    public void setAnnualSalary(int annSalary){
        annualSalary = annSalary;

    }
    public int getAnnualSalary(){
        return annualSalary;
    }

    public void setAnnualProductionBonus(int annProdBonus) {
        annualProductionBonus = annProdBonus;
    }
    public int getAnnualProductionBonus(){
        return annualProductionBonus;
    }

    public String toString(){
        return ", Annual Salary: $" + getAnnualSalary() + ", Annual Production Bonus $" + getAnnualProductionBonus();
    }

    public int calcWeeklyPay(){
        return ((getAnnualSalary() + getAnnualProductionBonus()) / 52);
    }
}
