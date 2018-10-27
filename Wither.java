package space.codekingdoms.mc2cpl.david1;

import com.codekingdoms.nozzle.utils.Random;
import com.codekingdoms.nozzle.utils.Direction;
import java.lang.Math;
import java.lang.Integer;
import java.lang.Float;
import com.codekingdoms.nozzle.utils.ProjectileType;
import com.codekingdoms.nozzle.base.BaseWither;
import org.bukkit.Location;

/*What this means is that you start with a normal wither
  and build on top of what it can already do */
  
public class Wither extends BaseWither {
	
	/**
	 * When the Wither is damaged by a player 
	 * It Chases that player down and bombards them with wither skulls
	 * **/
	public void onDamagedByPlayer( String name, double damage ) {
	
		//Target the player that just hit the wither
		setTarget(getGame().getPlayer(name));
		
		//Teleport to that player
		teleport(getGame().getPlayer(name).getLocation());
	
		throwProjectile(ProjectileType.LARGE_FIREBALL);
	
	}
	
	/**
	 * Create your own combo move for your Wither
	**/
	public void comboMove() {
		//Experiment by adding code here for your wither to do
		//I suggest looking at teleport and fire projectile
	}
	
	
	
	/**
	 * This code runs whenever a new Wither is spawned
	 **/
	public void onSpawn() {
		//Throws a fireball so we know it's our custom wither
		throwProjectile(ProjectileType.LARGE_FIREBALL);
		
	}
	

	
	
}