/*
	Joseph Varilla
	11/9/2018
	For Minecraft on CodeKingdoms Platform

	INSTRUCTIONS:

	Hi students (or anyone who has stumbled upon this),
	This is the final week. I'm gonna miss you all but
	you will always have access to any code I put up here.

	The following contains instructions for how
	to make one Entity target another Entity.

	This file contains some general code that
	you need to adapt to fit your code.

	For example, changimg the mob name to match what
	you called it in your own code.
	
	You got this!
*/


// IN MOB FILE *****************************

//1. Add field: 
   private LivingEntity target;

//2. Add method:
   public void aimFor( LivingEntity et) {
   		
   		//Set Target
   		target = et;

   		setTarget(target);
   }

// IN GAME FILE *****************************
  //PLACE AFTER where you spawn your mob and its target
   
   //Example
   	creep.spawn(someLocation); 
   	wither.spawn(someLocation);

   	//This code makes creep aim for wither
	creep.aimFor(wither);

	//How would you make wither aim for creep?

