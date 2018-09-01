package co.grandcircus.lab13;

public class TheJetsRock extends Player  {
    
	public TheJetsRock(String name)  {
        super(name);
    }
     
    @Override
    public Roshambo generateRoshambo() {     
       return Roshambo.ROCK;    
    }
}