package Exercise;

// This is an abstract Celestial Body class. It is intended to hold methods that
// could be relevant to either the Star or Planet class.
public abstract class CelestialBody
{
    String name;

    double xPosition;
    double yPosition;

    double temperature;

    public CelestialBody(String name)
    {
        this.name = name;
    }

    public void setXPosition(double x)
    {
        this.xPosition = x;
    }

    public void setYPosition(double y)
    {
        this.yPosition = y;
    }

    // Sets both the x position and the y position
    public void setPosition(double x, double y)
    {
        setXPosition(x);
        setYPosition(y);
    }

    public double getXPosition()
    {
        return xPosition;
    }

    public double getYPosition()
    {
        return yPosition;
    }

    public double getTemperature()
    {
        return temperature;
    }

    public void setTemperature(double t)
    {
        temperature = t;
    }

    //checks if the temperature is suitable for life
    public boolean isHabitable()
    {
        return 310.0 > temperature && temperature > 240.0;
    }
}