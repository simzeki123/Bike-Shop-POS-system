import java.util.ArrayList;
import java.util.List;

public class BikeBase {
    public List<Bike> listOfBike = createListOfBike();

    public List<Bike> createListOfBike() {
        listOfBike = new ArrayList<>();

        Bike[] bikeBase = new Bike[20];

        bikeBase[0]  = new Bike("A0001", "BLUE", "SCOTT", 15.00, "FREE");
        bikeBase[1]  = new Bike("A0002", "RED", "BMC", 25.00, "Booked");
        bikeBase[2]  = new Bike("A0003", "BLUE", "GIANT", 10.00, "FREE");
        bikeBase[3]  = new Bike("A0004", "BLACK", "TREK", 20.00, "FREE");
        bikeBase[4]  = new Bike("A0005", "RED", "FELT", 30.00, "FREE");
        bikeBase[5]  = new Bike("A0006", "BLUE", "SCOTT", 15.00, "Booked");
        bikeBase[6]  = new Bike("A0007", "BLACK", "FELT", 30.00, "FREE");
        bikeBase[7]  = new Bike("A0008", "RED", "TREK", 20.00, "FREE");
        bikeBase[8]  = new Bike("A0009", "BLUE", "BMC", 25.00, "Booked");
        bikeBase[9]  = new Bike("A0010", "BLACK", "GIANT", 10.00, "FREE");

        listOfBike.add(bikeBase[0]);
        listOfBike.add(bikeBase[1]);
        listOfBike.add(bikeBase[2]);
        listOfBike.add(bikeBase[3]);
        listOfBike.add(bikeBase[4]);
        listOfBike.add(bikeBase[5]);
        listOfBike.add(bikeBase[6]);
        listOfBike.add(bikeBase[7]);
        listOfBike.add(bikeBase[8]);
        listOfBike.add(bikeBase[9]);
        return listOfBike;
    }

    /**
     * This method now returns a clone copy of the bike List
     * @return a clone copy of the bike list
     */
    public List<Bike> getListOfBike() {
        return new ArrayList<Bike>(listOfBike);
    }
}