
public class Main {

    public static void main(String[] args) {
        //Employee myEmployee = new Employee("Ben Morris", 888, 'B', 1999, 9, 23);
//        HourlyWorker myHourlyWorker = new HourlyWorker(1, 6.25);
//        SalariedWorker mySalariedWorker = new SalariedWorker(70000,7000);
//        TeamLeader myTeamLeader = new TeamLeader(8.50, 450, 60, 45);

        Employee[] weeklyPay = new Employee[10];

        weeklyPay[0] = new Employee("Ben Morris", 888, 'B', 1999, 9, 23, 8.50);
        weeklyPay[1] = new Employee("John Smith", 123, 'C', 1999, 9, 23, 7.00);
        weeklyPay[2] = new Employee("Paul Walker", 858, 'D', 1999, 9, 23, 10.00);
        weeklyPay[3] = new Employee("Cal Ripken", 905, 'E', 1999, 9, 23, 11.00);
        weeklyPay[4] = new Employee("LeBron James", 958, 'F', 1999, 9, 23, 12.00);
        weeklyPay[5] = new Employee("Mother Teresa", 388, 'G', 1999, 9, 23, 11.50);
        weeklyPay[6] = new Employee("Dr. Hennagin", 708, 'H', 1999, 9, 23, 10.25);
        weeklyPay[7] = new Employee("Winnie the Pooh", 326, 'I', 1999, 9, 23, 9.75);
        weeklyPay[8] = new Employee("Giannis Antetekoumpo", 701, 'J', 1999, 9, 23, 9.00);
        weeklyPay[9] = new Employee("The Holy Spirit", 584, 'K', 1999, 9, 23, 13.00);

        for (int i = 0; i < 10; i++) {
            System.out.println(weeklyPay[i]);
        }
            //System.out.print(myEmployee);
//            System.out.print(myHourlyWorker);
//            System.out.print(mySalariedWorker);
//            System.out.println(myTeamLeader);

    }
}
