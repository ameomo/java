packge net.codestudent.main;

public class Pt6Player {
	
	//integers to store number of upgrades/skills in each path
	public int numAtkUpgrades, numDefUpgrandes;
	
	//additional player stats
	int gold, restsLeft, pots;
	
	//Arrays to store skill names 
	public String[] atkUpgrades = {"Strength", "Power", "Might", "Godlike Strength"};
	public String[] defUpgrades = {"Heavy Bones", "Stoneskin", "Scale Armor", "Holy Aura"};
	
	//Player specifi constructor 
	public Player(String name) {
		// calling constructor os superclass 
		super(name, 100, 0);
		//Setting # of upgrades to 0 
		this.numAtkUpgrades = 0;
		this.numDefUpgrades = 0;
		//set additional stats
		this.gold = 5;
		this.restsLeft = 1;
		this.pots = 0;
		//let the player choose a trait when creating a new character 
		chooseTrait();
		
	}

	//Player specific methods (more in the next part)
	@Override 
	public int attack() {
		//TODO Auto-generated method stub
		return (int) (Math.random()*(xp/4 +numAtkUpgrades*3 + 3) + xp/10 + numAtkUpgrades*2 + numDefUpgrades + 1 );
		
	}
	
	@Override 
	public int defend() {
		//TODO Auto-generated method stub 
		return (int) (Math.random()* (xp/4 + numDefUpgrades*3 + 3) + xp/10 + numDefUpgrades*2 + numAtlUpgrades + 1 );
		
	}
}
