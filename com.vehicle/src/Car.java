// In the com.vehicle package, create a class named Car.

// package com.vehicle;

class Car {

    private double speedKph;
    private float fuelLevel = 100.0f;
    private int distanceTraveled = 0;

    float time = 1.0f;

    public void setSpeed(double speed){
        // Sets the speed of the car. This method should accept a double value.

        speedKph = speed;
        System.out.println("Speed is : " + speed + " Km/h" );
    /*
        Scanner getSpeedKph = new Scanner(System.in);
        System.out.println("Enter The Speed : ");
        String speedKph_String = getSpeedKph.nextLine();
        System.out.println("You have entered a speed of : " + speedKph_String + "Km/h"); // Output user input
    */
    }

    public void setFuelLevel(float fuel){
        // Sets the fuel level of the car. This method should accept a float value.

        System.out.println("At the time 0sec and distance = 0. Fuel level is : " + fuel + "%");
    }

    public void drive(int distance){
        // Simulates driving the car for a given distance in meters. #This method should update the distanceTraveled field.

        int speedKph_Int = (int) speedKph;
        int time_Int = distance;
        distanceTraveled = speedKph_Int * (1000/60) * time_Int; // * 1000 = from Km to m and we divide by 60 to convert time accordind to the speed unit
        System.out.println("The distance you have travelded in " + time_Int + " minutes is : " + distanceTraveled + " meters");
    }

    public double getSpeedMph(){
        // returns the speed of the car in miles per hour. (1 mile = 1.60934 kilometers).
        double speedMph = (speedKph*16.67*1.60934) / time;
        System.out.println("The Speed in Miles per hour is : " + speedMph + " mph");
        return speedMph;
    }

    public int getDistanceKm(){
        // returns the distance traveled in kilometers.

        int speedKph_Int_2 = (int) speedKph;
        int time_Int_2 = (int) time;
        int distanceTraveled_In_Km;

        distanceTraveled_In_Km = speedKph_Int_2 * time_Int_2;
        System.out.println("The distance traveled in kilometers is : " + distanceTraveled_In_Km + "Km/h");
        return distanceTraveled_In_Km;
    }

    public int calculateRemainingFuel(){
        // Calculates the remaining fuel percentage after driving a given distance.
        // Assume that driving 1 kilometer consumes 0.5% of fuel.
        double distance = speedKph*time;
        double remainigFuel_double = (100-(distance%1000)*0.5);
        int remainigFuel = (int) remainigFuel_double;
        System.out.println("The Remaining Fuel is : " + remainigFuel + "%");
        return remainigFuel;
    }

    public Car (){
        this.speedKph = 75.12;
        time = 40f;
    }

}

class ElectricCar extends Car { // ElectricCar = Subclass

    private double batteryLevel;

    public void setBatteryLevel(double battery){    //sets the battery level of the car.
        batteryLevel = battery;
        System.out.println("Your batter is set at : " + batteryLevel + "%");
    }

    public double getBatteryLevel(){    //returns the battery level.
        double distance = (75.12*40);
        double newBatteryLevel = (100-(distance%1000)*10); // Override the drive method to also decrease the battery level by 1% for every 10 kilometers driven.
        //Math.round(newBatteryLevel);
        System.out.println("The Battery Level after 40 minutes of driving and a speed of 75.12 Kph is : " + newBatteryLevel + " %");
        return newBatteryLevel;
    }
    public static void main(String[] args) {

    }
}