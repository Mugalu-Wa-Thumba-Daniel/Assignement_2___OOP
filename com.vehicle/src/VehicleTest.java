
public class VehicleTest{

    public static void main(String[] args) {
        Car printSpeed = new Car();
        Car printFuelLevel = new Car();
        Car printDistanceTraveled = new Car();
        Car printSpeed_Mph = new Car();
        Car printDistanceTraveled_Km = new Car();
        Car printRemainingFuel = new Car();

        // #######################################

        ElectricCar printBatteryLevel = new ElectricCar();
        ElectricCar printnewBatteryLevel = new ElectricCar();

        System.out.println(" ");
        printSpeed.setSpeed(75.12);
        System.out.println(" ");
        printFuelLevel.setFuelLevel(100.0f);
        System.out.println(" ");
        printDistanceTraveled.drive(40);    // normaly this parameter gets the time value !!!
        System.out.println(" ");
        printSpeed_Mph.getSpeedMph();
        System.out.println(" ");
        printDistanceTraveled_Km.getDistanceKm();
        System.out.println(" ");
        printRemainingFuel.calculateRemainingFuel();
        System.out.println(" ");
        System.out.println("FOR THE ELECTRIC CAR :  ");
        System.out.println(" ");
        //###########################################

        printBatteryLevel.setBatteryLevel(100.0);
        System.out.println(" ");
        printnewBatteryLevel.getBatteryLevel();

    }
}