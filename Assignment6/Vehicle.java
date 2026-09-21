package Assignment6;

public class Vehicle extends Machine
{
    //number of wheels on this vehicle
    private int wheelCount;
    //speed im miles per horu
    private double maxSpeed;
    //the amount of fuel left in the vehicle, in gallons
    private double fuel;

    // default constructor: 2 wheels, 60.0mph max speed, inherited Machine defaults
    public Vehicle()
    {
        super();
        wheelCount = 2;
        maxSpeed = 60.0;
        fuel = 25.0;
    }

    // constructor with horsepower/running state from Machine, as well as wheel count, max speed and fuel
    public Vehicle(double h, boolean r, int w, double m, double f)
    {
        super(r, h);
        wheelCount = w;
        maxSpeed = m;
        fuel = f;
    }

    //returns the time it takes for this vehicle to drive a set distance, and drains the correct amount of fuel
    public double driveDistance(double distance)
    {
        fuel -= distance / 20.0;
        if (fuel < 0.0)
        {
            fuel = 0;
        }
        return  distance / getMaxSpeed();
    }

    public void setWheelCount(int w)
    {
        wheelCount = w;
    }

    public int getWheelCount()
    {
        return wheelCount;
    }

    public void setFuel(double f)
    {
        fuel = f;
    }

    public double getFuel()
    {
        return fuel;
    }

    public void setMaxSpeed(double m)
    {
        maxSpeed = m;
    }

    public double getMaxSpeed()
    {
        return  maxSpeed;
    }

    @Override
    public String toString() {
        return String.format("this " + getWheelCount() + " wheeled vehicle is running(" + getRunning() + ") at " + getHorsePower() + " horsepower, with maximum speed of " + getMaxSpeed() + "MPH and " + fuel + " gallons of fuel left");
    }

}
