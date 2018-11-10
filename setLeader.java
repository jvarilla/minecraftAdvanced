/*
	Joseph Varilla
	11/9/2018
	For Minecraft on CodeKingdoms Platform

	INSTRUCTIONS:

	Hi students (or anyone who has stumbled upon this),
	This is the final week. I'm gonna miss you all but
	you will always have access to any code I put up here.

	The following contains instructions for how
	to make one entity the LEADER of other entities.
	As in, if the LEADER is damaged by a player,
	the other entities should RETALIATE and attack,
	the player who attacked it.

	This file contains some general contents that
	you need to adapt to fit your code.

	For example, changimg the mob name to match what
	you called it in your own code.
	
	

	1. First pick the type of mob you 
	   want to be the LEADER, make sure 
	   the one you choose has the methods:
	   onSpawn()
	   onDamagedByPlayer()
	
	2. Select FOLLOWER mobs and add them to 
	   your CodeKingdoms file, they can be
	   different than the LEADER and you can have
	   as many as you want, but they need
	   to have the method:
	   onSpawn()

	3. Remember to adapt this code to your code
	   REPLACE 
	   <LEADER MOB> with the mob you choose like Creeper
	   <FOLLOWER MOB> with the mob you choose like Wolf

	   with what you think 
	   goes there

	You got this!
*/


// IN LEADER MOB FILE *****************************

	//1. Add field: 
	   private <FOLLOWER MOB> follower1 = 
	   		new <FOLLOWER MOB>(this, "follower1");

	//2. SPAWN FOLLOWER WITH LEADER Add :
	   public void onSpawn() {
	   		//Set Name Tag
			setCustomNameVisible(true);
			setCustomName("LEADER");

			//Spawn FOLLOWER in the same location as LEADER
			follower1.spawn(getLocation());
		}

	//3. FOLLOWER DEFENSE OF LEADER MECHANISM Add:
		public void onDamagedByPlayer( String name, double damage ) {
		
		//Get the Player who attacked the leader
		Player attacker = getGame().getPlayer(name);
		
		//Have the FOLLOWER attack the attacker in defense
		follower1.retaliate(attacker);
	
	}

// IN FOLLOWER MOB FILE *****************************
  //PLACE AFTER where you spawn your mob and its target
   
   //1. Add the following fields
	private <LEADER MOB> leader;
	private String role;

   //2. Add Constructor
	public <FOLLOWER MOB>(
	 <LEADER MOB> theLeader, String theRole ) {
		leader = theLeader;
		role = theRole;
	}

   //3. Add onSpawn
	public void onSpawn() {
		setCustomNameVisible(true);
		setCustomName(role);
	}

   //4. Add retaliate method
	public void retaliate( LivingEntity attacker ) {
		//Teleport FOLLOWER to attacker
		teleport(attacker.getLocation());
		//Set Target to Attacker
		setTarget(attacker);

		//Change nametag to identify the target
		setCustomName("Attack" + attacker.toString());
	
	}

// IN GAME FILE MOB FILE *****************************
	<LEADER MOB> leader = new <LEADER MOB>();
	leader.spawn(); //This will also spawn the FOLLOWERS