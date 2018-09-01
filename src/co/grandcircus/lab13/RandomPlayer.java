package co.grandcircus.lab13;

public class RandomPlayer extends Player {
    
	public RandomPlayer (String name) {
		super(name);
	}
	@Override
	public Roshambo generateRoshambo() {
		int rIndex = (int) (Math.random() * 3);

		return Roshambo.values()[rIndex];
	
}
      }
      
      
