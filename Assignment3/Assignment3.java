package Assignment3;

public class Assignment3 
{
    Plant cherryTree = new Plant("cherry tree", 8, 10, 8, 8);
    Plant berryBush = new Plant("berry bush", 1, 2, 2, 5);

    public void main()
    {
        cherryTree.grow();
        cherryTree.grow();
        cherryTree.grow();
        cherryTree.grow();
        cherryTree.display();
        berryBush.grow();
        berryBush.grow();
        berryBush.grow();
        berryBush.grow();
        berryBush.display();
    }
}
