
public class Parte5 {

	//Player specific methods (more in the next part)
	@Override 
	public int attack () {
		//TODO Auto-generated method stub 
		return (int) (Math.random()*(xp/4 + numAtkUpgrades*3+3) + xp/10 + numAtkUpgrades*2 + numDefUpgrades + 1);
	
	}
	
	@Override
	public int defend () {
		//TODO Auto-generated method stub 
		return (int) ((Math.random()*(xp/4 + numAtkUpgrades*3+3) + xp/10 + numAtkUpgrades*2 + numDefUpgrades + 1);
	}
	
}
