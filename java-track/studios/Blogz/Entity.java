package Blogz;

import java.util.Objects;

public abstract class Entity {
	private static int uid=0;
	private int UID;
	
	public Entity (){
	this.UID=++uid;
	}
	
	public int getUID(){
		return this.UID;
	}
	
	public static int getuid(){
		return uid;
	}
	
	@Override
	public boolean equals(Object o){
		
		//self check
		if (this == o)
			return true;
		
		if (o == null)
			return false;
		
		
		//type check and cast
		if(!(o instanceof Entity))
			return false;
		
		
		Entity entity = (Entity) o;
		
		//field comparison
		return Objects.equals(UID, entity.getUID()) ;		
		
	}
}
