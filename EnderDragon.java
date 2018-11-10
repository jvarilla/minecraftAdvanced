package space.codekingdoms.mc2cpl.david1;

import com.codekingdoms.nozzle.base.BaseEnderDragon;

public class EnderDragon extends BaseEnderDragon {
	
	private Zombie z1;
	
	private Zombie z2;
	
	private Zombie z3;
	
	public void onSpawn() {
		
		z1 = new Zombie(this, "z1");
		z1.spawn(getLocation());
		z2 = new Zombie(this, "z2");
		z2.spawn(getLocation());
		z3 = new Zombie(this, "z3");
		z3.spawn(getLocation());
		//	setMaxHealth(100);
		setCustomNameVisible(true);
		setCustomName("Mark");
		setGliding(false);
		ignite(60);
		//	setGravity(false);
		setAI(true);
	
	}
	
	public void onDamagedByPlayer( String name, double damage ) {
		
		z1 = new Zombie(this, "z1");
		z1.spawn(getLocation());
		z2 = new Zombie(this, "z2");
		z2.spawn(getLocation());
		z3 = new Zombie(this, "z3");
		z3.spawn(getLocation());
		Player attacker = getGame().getPlayer(name);
		z1.retaliate(attacker);
		z2.retaliate(attacker);
		z3.retaliate(attacker);
	
	}
	
	
}