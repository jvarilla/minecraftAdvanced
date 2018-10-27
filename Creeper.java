package space.codekingdoms.mc2cpl.david1;

import com.codekingdoms.nozzle.base.BaseCreeper;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Math;
import com.codekingdoms.nozzle.utils.Direction;
import com.codekingdoms.nozzle.utils.ProjectileType;
import org.bukkit.block.Block;
import org.bukkit.potion.PotionEffectType;
import com.codekingdoms.nozzle.utils.Random;
/* What this means is that we make a new
   Creeper based on the normal Creeper
   kinda like making a Chocolate Chip Cookie
   by starting with a Plain Cookie     */

public class Creeper extends BaseCreeper {
	
	public void onSpawn() {
		
		setMaxHealth(1000);
		setCustomNameVisible(true);
		setCustomName("Sam");
		//Don't allow the creeper to blow up so it can fire at you
		canExplode = false;
		throwProjectile(ProjectileType.LARGE_FIREBALL);
	
	}
	
	/* *
	   * When hit by the player target them and fire fireballs at them
	   *     */
	
	public void onDamaged( double damage ) {
		
		applyPotionEffect(PotionEffectType.POISON);
		throwProjectile(ProjectileType.LARGE_FIREBALL);
		specialMove();
	
	}
	
	public void onDamagedByPlayer( String name, double damage ) {
		
		throwProjectile(ProjectileType.LARGE_FIREBALL);
		setTarget(getGame().getPlayer(name));
		//	teleport(getGame().getPlayer(name).getLocation());
		throwProjectile(ProjectileType.LARGE_FIREBALL);
	
	}
	
	public void specialMove() {
		
		if (getHealth() < 20) {
			
			setHealth(1000);
			removePotionEffect(PotionEffectType.POISON);
			
		}
		
	
	}
	
	public void onDeath() {
		
		Creeper legacy = new Creeper();
		legacy.spawn(world, getLocation());
	
	}
	
	
}