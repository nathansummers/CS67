package Assignments.Assignment3;

public class Plant 
{
    String name;
    int germinationTime;
    int floweringTime;
    int fruitingTime;
    int deathTime;

    public Plant(String name, int germinationTime, int floweringTime, int fruitingTime, int deathTime)
    {
        this.name = name;
        this.germinationTime = germinationTime;
        this.floweringTime = floweringTime;
        this.fruitingTime = fruitingTime;
        this.deathTime = deathTime;
    }

    String[] growthStages = {"seed", "sprout", "flowering plant", "fruiting plant", "dead plant"};
    int growthStage = 0;

    public void display()
    {
        System.out.println("The " + name + " is currently a " + growthStages[growthStage]);
    }

    public void grow()
    {
        int timeToGrow = 0;

        if (growthStage == 0)
        {
            timeToGrow = germinationTime;
        }

        else if (growthStage == 1)
        {
            timeToGrow = floweringTime;
        }

        else if (growthStage == 2)
        {
            timeToGrow = fruitingTime;
        }

        else if (growthStage == 3)
        {
            timeToGrow = deathTime;
        }

        else if (growthStage == 4)
        {
            timeToGrow = 0;
        }

        for (int i = 0; i < timeToGrow; i++)
        {
            System.out.println("The " + name + " is growing...");
        }
        growthStage += 1;
        System.out.println("The " + name + " is now a " + growthStages[growthStage]);
    }
}
