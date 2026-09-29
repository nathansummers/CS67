package Exercise;

public class Planet extends CelestialBody
{
    Star parentBody;

    double orbitingDistance;

    double xVelocity;
    double yVelocity;

    int orbitsCompleted;

    double coolingRate;

    boolean atmosphere;

    // This is a planet class. It is intended to orbit a star at the given orbiting distance and velocity.
    // It's position is originated at the equivalent to (1, 0) on the unit circle where (0, 0) is the Star it orbits and the radius is the orbiting distance.
    public Planet(String name, Star sun, double orbitingDistance, double orbitingVelocity, double cooling, boolean atmosphere)
    {
        super(name);

        this.parentBody = sun;

        this.orbitingDistance = orbitingDistance;

        this.xVelocity = 0;
        this.yVelocity = orbitingVelocity;

        this.orbitsCompleted = 0;

        this.coolingRate = cooling;
        this.atmosphere = atmosphere;

        setPosition(sun.xPosition + orbitingDistance, sun.yPosition); // Setting the position as outlined in the comment above
    }

    //default constructor for planet, based on earth's parameters
    public Planet()
    {
        super("default");

        this.parentBody = new Star();

        this.orbitingDistance = 149_597_870_700.0;

        this.xVelocity = 0;
        this.yVelocity = 2_572_992_000.0;

        this.orbitsCompleted = 0;

        this.coolingRate = 15.0;
        this.atmosphere = true;

        setPosition(parentBody.xPosition + orbitingDistance, parentBody.yPosition); // Setting the position as outlined in the comment above
    }

    // This function represents one time step passing for this object
    public void takeStep()
    {
        double old_y = yPosition;

        xPosition += xVelocity;
        yPosition += yVelocity;

        double new_y = yPosition;

        temperature -= coolingRate * (1.0 - (((parentBody.temperature) - temperature) / parentBody.temperature));
        parentBody.applyHeat(this);

        // Since the starting position is the equivalent of (1, 0), an orbit is completed when the planet
        // crosses the x axis from bottom to top again.
        if (old_y < 0 && new_y > 0)
        {
            orbitsCompleted++;

            celebrateNewYear();
        }
        
    }

    // This function updates the planet's velocities by the given parameters
    public void changeVelocity(double horizontalChange, double verticalChange)
    {
        xVelocity += horizontalChange;
        yVelocity += verticalChange;
    }

    // This function contains the 'decorative' actions to be taken once an orbit has been completed.
    private void celebrateNewYear()
    {
        String numberSuffix;

        switch (orbitsCompleted)
        {
            case 1:
                numberSuffix = "st";
                break;
            case 2:
                numberSuffix = "nd";
                break;
            default:
                numberSuffix = "th";
                break;
        }
        
        System.out.println(name + " completed its " + orbitsCompleted + numberSuffix + " orbit!");
    }

    public String toString()
    {
        return String.format(   name + 
                                "\n     Orbiting: " + parentBody.name +
                                "\n     Orbits Completed: " + orbitsCompleted +
                                "\n     Position: (%,2f, %,2f)" +
                                "\n     Velocity: (%,2f, %,2f)" + 
                                "\n     Temperature: " + temperature + " kelvin" + 
                                "\n     Hospitable: " + isHabitable(),
                                xPosition, yPosition,
                                xVelocity, yVelocity);
    }

    //overriding the default isHabitable, now checks for both temperature and atmosphere
    public boolean isHabitable()
    {
        return 310.0 > temperature && temperature > 240.0 && atmosphere;
    }

}
