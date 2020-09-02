import java.util.ArrayList;
import java.util.List;

public class Daily_report_list {
    public List<Daily_report> listOfDaily_report = createListOfDaily_report();

    public List<Daily_report> createListOfDaily_report() {
        listOfDaily_report = new ArrayList<>();

        Daily_report[] daily_reports = new Daily_report[20];

        daily_reports[0]  = new Daily_report(1000){
        
    };
        daily_reports[1]  = new Bike("A0002", "RED", "BMC", 25.00, "Booked");
        daily_reports[2]  = new Bike("A0003", "BLUE", "GIANT", 10.00, "FREE");
        daily_reports[3]  = new Bike("A0004", "BLACK", "TREK", 20.00, "FREE");
        daily_reports[4]  = new Bike("A0005", "RED", "FELT", 30.00, "FREE");
        daily_reports[5]  = new Bike("A0006", "BLUE", "SCOTT", 15.00, "Booked");
        daily_reports[6]  = new Bike("A0007", "BLACK", "FELT", 30.00, "FREE");
        daily_reports[7]  = new Bike("A0008", "RED", "TREK", 20.00, "FREE");
        daily_reports[8]  = new Bike("A0009", "BLUE", "BMC", 25.00, "Booked");
        daily_reports[9]  = new Bike("A0010", "BLACK", "GIANT", 10.00, "FREE");

        listOfDaily_report.add(daily_reports[0]);
        listOfDaily_report.add(daily_reports[1]);
        listOfDaily_report.add(daily_reports[2]);
        listOfDaily_report.add(daily_reports[3]);
        listOfDaily_report.add(daily_reports[4]);
        listOfDaily_report.add(daily_reports[5]);
        listOfDaily_report.add(daily_reports[6]);
        listOfDaily_report.add(daily_reports[7]);
        listOfDaily_report.add(daily_reports[8]);
        listOfDaily_report.add(daily_reports[9]);
        return listOfDaily_report;
    }

    /**
     * This method now returns a clone copy of the bike List
     * @return a clone copy of the bike list
     */
    public List<Bike> getListOfBike() {
        return new ArrayList<Bike>(listOfBike);
    }
}
}
