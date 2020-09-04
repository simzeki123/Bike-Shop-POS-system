import java.util.ArrayList;
import java.util.List;

public class SalesPersonBase {
    public static List<SalesPerson> listOfSalesPersons = createListOfStaff();

    public static List<SalesPerson> createListOfStaff(){
        listOfSalesPersons = new ArrayList<>();

        SalesPerson[] staffBase = new SalesPerson[20];

        staffBase[0] = new SalesPerson("S0001", "TOM PARKER", "MALE", 2900.50, 700.00);
        staffBase[1] = new SalesPerson("S0002", "CHRIS DOWNEY", "MALE", 1980.50, 200.00);
        staffBase[2] = new SalesPerson("S0003", "LEE SANG HYEOK", "MALE", 5000.00, 400.00);
        staffBase[3] = new SalesPerson("S0004", "SABRINA CHNG", "FEMALE", 3500.00, 1000.00);
        staffBase[4] = new SalesPerson("S0005", "EMMA WATSON", "FEMALE", 4700.00, 350.00);
        staffBase[5] = new SalesPerson("S0006", "BILL NEWTON", "MALE", 3600.00, 420.00);
        staffBase[6] = new SalesPerson("S0007", "SERAPHINE", "FEMALE", 8000.00, 1500.00);
        staffBase[7] = new SalesPerson("S0008", "ALBERT HAWKING", "MALE", 4650.00, 640.00);
        staffBase[8] = new SalesPerson("S0009", "CYNTHIA ENG", "FEMALE", 1920.50, 250.00);
        staffBase[9] = new SalesPerson("S0010", "MOK YEN MEI", "FEMALE", 3000.00, 450.00);

        listOfSalesPersons.add(staffBase[0]);
        listOfSalesPersons.add(staffBase[1]);
        listOfSalesPersons.add(staffBase[2]);
        listOfSalesPersons.add(staffBase[3]);
        listOfSalesPersons.add(staffBase[4]);
        listOfSalesPersons.add(staffBase[5]);
        listOfSalesPersons.add(staffBase[6]);
        listOfSalesPersons.add(staffBase[7]);
        listOfSalesPersons.add(staffBase[8]);
        listOfSalesPersons.add(staffBase[9]);

        return listOfSalesPersons;
    }

    public static List<SalesPerson> getListOfStaff() {
        return new ArrayList<SalesPerson>(listOfSalesPersons);
    }
}