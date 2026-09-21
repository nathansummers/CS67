package Assignment6;

public abstract class Machine 
{
    //true if the machine is active, false otherwise
    private boolean running;
    //maximum horsepower this machine outputs
    private double horsePower;

    //default constructor for 200 horsepower and running
    public Machine()
    {
        this.horsePower = 200.0;
        this.running = true;
    }

    //constructor with user provided running status and horsepower
    public Machine(boolean r, double h)
    {
        this.horsePower = h;
        this.running = r;
    }

    //tooggles the machine between running and not running
    public void toggleRunning()
    {
        running = !running;
    }

    public boolean getRunning()
    {
        return running;
    }

    public void setHorsePower(float h)
    {
        horsePower = h;
    }

    public double getHorsePower()
    {
        return horsePower;
    }

    @Override
    public String toString() {
        return String.format("Running (" + running + ") at " + horsePower);
    }
}
