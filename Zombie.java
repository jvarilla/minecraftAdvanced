package space.codekingdoms.mc2cpl.david1;

import com.codekingdoms.nozzle.base.BaseZombie;
import org.bukkit.entity.LivingEntity;

public class Zombie extends BaseZombie {
	
	private EnderDragon leader;
	
	private String role;
	
	public Zombie( EnderDragon theLeader, String theRole ) {
		
		leader = theLeader;
		role = theRole;
	
	}
	
	public void onSpawn() {
		
		setCustomNameVisible(true);
		setCustomName(role);
	
	}
	
	public void retaliate( Player attacker ) {
		
		setTarget(attacker);
		teleport(attacker.getLocation());
	
	}
	
	
}