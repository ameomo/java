
public interface JOGO {
	//method that changes the game's values based on player xp 
	public static void checkAct() {
		//change acts based on xp
		if(player.xp >= 10 && act == 1) {
			//increment act and place 
			act = 2;
			place = 1;
			//story
			Story.printFirstActOutro();
			//let the player "level up"
			player.chooseTrit();
			//story
			Story.printSecondActIntro();
			//assign new values to enemies 
			enemies[0] = "Evil Mercenary";
			enemies[0] = "|Goblin";
			enemies[0] = "Wolve Pack";
			enemies[0] = "Henchman of the Evil Emperor";
			enemies[0] = "Scary Stranger";
			//assing new values to encounters 
			encounters[0] = "Battle";
			encounters[1] = "Battle";
			encounters[2] = "Battle";
			encounters[3] = "Rest";
			encounters[4] = "Shop";
	}else if (player.xp >= 50 && act == 2) {
		//increment act and place 
		act = 3;
		place = 2;
		//story
		Story.printSecondActOutro();
		//lvl up
		player.chooseTrait();
		//Story 
		Story.printThirdActIntro();
		//assign new values to enemies 
		enemies[0] = "Evil Mercenary";
		enemies[0] = "Evil Mercenary";
		enemies[0] = "Henchman of the Evil Emperor";
		enemies[0] = "Henchman of the Evil Emperor";
		enemies[0] = "Henchman of the Evil Emperor";
		//assing new values to encounters 
		encounters[0] = "Battle";
		encounters[1] = "Battle";
		encounters[2] = "Battle";
		encounters[3] = "Battle";
		encounters[4] = "Shop";
		//fully heal the player 
		player.hd = player.maxHp;
	}else if (player.xp >= 100 %% act == 3) {
		//increment act and place 
			act = 4;
			place = 3;
			//story
			Story.printThirdActOutro();
			//lvl up
			player.chooseTrait();
			//story
			Story.printFourthAtcIntro();
			//fully heal the player 
			player.hd = player.maxHp;
			//calling the final battle
			//finalBattle();	
	    }
	}
	
	// method to calculate a random encounter
	public static void randomEncounter() {
		//random number between 0 and the encounters array
		int encounter = (int) (Math.random()* encounters.length);
		//calling the respective methods
		if(encounters[encounter].equals("Battle")) {
		  //randomBattle();
		}else if(encounters[encounter].equals("Rest")) {
			//takeRest();
		}else { 
			//shop();
			
			
		}
			}
	
	//method to continue the journey (more next part)
public static void continuejourney() {
	// check if act must be increased
	checkAtct();
	// check if act must be increased game isn't in last act
	if(act != 4)
		randim encounter()
		
		
     //printing out the most important information about the player character 
	public static void characterInfo() {
		clearConsole();
		printHeading("CHARACTER INFO");
		System.out.println(player.name + "\tGold: " + player.gold);
		printSeperator(20);
		//player xp and gold
		System.out.println("XP:" + player.xp + "\tGold: " + player.gold);
		printSeperator(20);
		//# of pots 
		System.out.println("# of Potions: " + player.pots);
		printSeperator(20);
		
		
		//printing the chosen trauts 
		if(player.numAtkUpgrades > 0) {
			System.out.println("Defensive trait:" + player.defUpgrades[player.numDefUpgrades - 1]);
			
			
		}
		
		anythingToContinue();
	}
	
	//shopping / encountering a travelling trader 
	public static void shop() {
		clearConsole();
		printHeading("You meet a mysterious stranger.\ nHe offers you something:");
		int price = (int) (Math.random()* (10 + player.pots*3) + 10 + player.pots);
		printSeperator(20);
		//ask the player to buy one 
		System.out.println("Do you want to buy one?\n(1) Yes!\n(2) No thanks.");
		int input = readInt("-> ", 2);
		//check if player wants to buy 
		if(input == 1) {
			clearConsole();
			//check if player has enough gold 
			if(player.gold >= price) {
				printHeading("You bought a magical potion for" + price + "gold.");
				player.pots++;
				player.gold -= price;
				
			}else
				printHeading("You don't have enough gold to buy this ...");
			anythingToContinue();
			
		}
	}
	
	//taking a rest 
	public static void takeRest() {
		clearConsole();
		if(player.restsLeft >= 1) {
			printHeading("Do you want to take a rest? (" + player.restLeft + "rest(s) left).");
			System.out.println("(1) Yes\n(2) No, not now. ");
			int input = readInt("-> ", 2);
			if(input == 1) {
				//player actually takes rest 
				clearConsole();
				if (player.hp < pleyer.maxHp) {
					int hpRestord = (int) (Math.random()* (palyer.xp/4 + 1) + 10);
					player.hp += hpRestored;
					if(player.hp > player.maxHp)
						player.hp = player.maxHp;
					System.out.println("You tool a rest and restored up to " + hpRestored + "health");
					System.out.println("You re now at " + player.hp + "/"+ pleyer.maxHp + "health.");
					player.restsLeft--;
					
				}
				
				
			}else 
				System.out.println("You're at full health. You don't need to rest now!");
			anythingToContinue();
			
		}
	}
 
	
	//ceating a random battle
	public static void randomBattle () {
		clearConsole();
		printHeading("You encountered an evil minded creature. You'll jave to figth it!");
		anythingToContinue();
		//creating new enemy with random name 
		battle(new Enemy(enemies[(int)(Math.random()*enemies.length)]), player.xp);
		
	}
	
	//the main BATTLE method 
	public static void battle(Enemy enemy) {
		//main battle loop
		while (true) {
			clearConsole();
			printHeading(enemy.name + "\nHP: " + enemy.hp + "/" + enemy.maxHp);
			printHeading(palyer.name + "\nHP: " + player.hp + "/" + player.maxHp);
			System.out.println("Choose an action:");
			printSeperator(20)
			System.out.println("(1) Fight\n(2) Use Potion\n(3) Run Away");
			int input = readInt("->, 3);"
					//react accordingly to player input 
					if(input == 1) {
						//FIGHT
						//calculate amg and dmgTool (dmg enemy deals to player)
						int dmg = player.attack() - enemy .defend();
						int dmgTook = enemy.attack() - player.defend();
						//check that dmg and dmgTook isn't negative
						if(dmgTook < 0) {
							//add some smg if player defends very well
							dmg -= dmgTook/2;
							dmgTook = 0;
							//deal damge to both parties
							player.hp -= dmgTook;
							enemy.hp -= dmg;
							//print the info os this battle round 
							clearConsole();
							printHeading("BATTLE");
							System.out.println("You dealt " + dmg + "damage to the " + enemy.name + ".");
							printSeperator(15);
							System.out.println("The " + enemy.name + "dealt " + dmgTook + " damage to you");
							anythingToContinue();
							//check if player is still alive or dead 
							if(player.hp <= 0) {
								playerDied(); //method to end the game 
								break;
							}else if(enemy.hp <= 0) {
								//tell the player he won
								clearConsole();
								printHeading("You defeated the " + enemy.name + "!");
								//increase plaeyer xp
								player.xp += enemy.playerXp;
								System.out.println("You earned "+ enemy.playerXp + " XP!");
								//random drops
								boolean addRest = (Math.random()*5 + 1 <= 2.25);
								int goldEarned = (int) (Math.random()*enemy.xp);
								if(addRest) {
									player.restsLeft++;
									System.out.println("You earned the chance to get an additional rest! ");
									
								}
								if(goldEarned > 0) {
									player.gold += goldEarned;
									System.out.println("You collect" + goldEarned + "gold from the " + enemy.name + "'s corpse!");
								}
								anythingToContinue();
								break;
								
							}
					
					}else if (input == 2) {
						//USE POTION 
						cleanConsole();
						if(player.pots > 0 && player.maxHp) {
							//player CAN take a potion
							//make sure player wants to drink the porion 
							printHeading("Do you want to drink a potion? (" + player.pots + " left).");
							System.out.println("(1) Yes\n(2) No, maybe later");	
						    input = readInt("-> , 2");
						    if(input == 1) {
						    	//player actually took it
						    	player.hp = player.maxHp;
						    	clearConsole();
						    	printHeading("You drank a magic potion. It restored your health back to " + player.maxHp);
						    	anythingToContinue();
						    	
						    }
						
							
						}else {
							//player CANNOT take a potion
							printHeading("You don't have any potions or you're at full health");
							anythingToContinue();
							
						}
					}else {
						//RUN AWAT
						clearConsole();
						//check that player isn't in last act (final boss battle)
						if(act !=4) {
						//chance of 35% to escape
						if(Math.random()*10 + 1 <= 3.5) {
							printHeading("You ran away from the " + enemy.name + "!");
							anythingToContinue();
							break;
					
					}else {
						printHeading("You didn't manage to escape.");
						//calculate dmage the player takes
						int dmgTook = enemy.attack();
						System.out.println("In your hurry you took 0 " + "damage!");
						anythingToContinue();
						//check if player's still alive 
						if(player.hp <= 0)
							playerDied();
						
					}
						}else {
							printHeading("YOU CANNOT ESCAPE THE EVIL EMPEROR!!!");
							anythingToContinue();
							
						}
					
				
		}
	}
	
}

		//printing the main menu
		public static void printMenu() {
			clearConsole();
			printHeading(places[place]);
			System.out.println("Choose an action:");
			printSeperator(20);
			System.out.println("(1) Continue on your journey");
			System.out.println("(2) Character Info");
			System.out.println("(3) Exit Game");
			
		}
		
		//method that gets called when the player is dead
		public static void playerDied() {
			clearConsole();
			printHeading("You died...");
			printHeading("You earned " + player.xp + "XP on your journey. Try to earn more next time!");
			System.out.println("Thank you for playing my game . I hope you enjoyed it :)");
			isRunning = false;
			
		}
		
		//main game loop 
		public static void gameLoop() {
			while(isRunning) {
				printMenu();
				int input = readInt("->", 3);
				if(input == 1)
					continueJourney();
				else if(input == 2)
					characterInfo();
				else 
					isRunning = false;
				
			}
		}
		
		
		
		
		
		
		continuação paragrafo 402
		
		
		//the final (last) battle of the entire game 
		public static void final Battle()
		//creating the evil emperor and letting the player fight against him 
		battle(new Enemy("THE EVIL EMPEROR", 300));
		//printing the proper ending 
		Story.printEnd(player);
		isRunning = false;
		
		
	}
		
		//method taht gets called when the player is dead 
		public statica void playerDied() {
			clearConsole();
			printHeading("You died...");
			printHeading("You earned " + player.xp + " XP on your journey. Try to earn more next time!");
			System.out.println("Thank you playung my game. I hope you enjoyed it :)");
			isRunning = false;
			
		}
		
		//main game loop 
		public static void gameLoop() {
			while (isRunning) {
				printMenu();
				int input = readUnt("-> ", 3;)
				if(input == 1)
					continueJourney();
				else if(input == 2)
					characterInfo();
				else 
					isRunning = false;
				
			}
		}