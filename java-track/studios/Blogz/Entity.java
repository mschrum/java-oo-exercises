package Blogz;

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
}
