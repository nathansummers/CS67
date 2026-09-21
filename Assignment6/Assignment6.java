package Assignment6;

import java.util.ArrayList;

public class Assignment6 
{

    public ArrayList<Vehicle> vehicleList;
    Vehicle newVehicle;

    public void main(String args[])
    {
        vehicleList = new ArrayList<Vehicle>();

        for (int i = 0; i < 10; i++)
        {
                newVehicle = new Vehicle(250 + (100.0 * i),true, 1 + (i / 2), 180.0 / (1 + (i / 3)), 20.0 + (i * 2));
                vehicleList.add(newVehicle);
        }

        for (Vehicle aVehicle : vehicleList)
        {
            System.out.println(aVehicle);
        }

    }
}
