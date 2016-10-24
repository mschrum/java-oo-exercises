package javagram.filters;

import javagram.Picture;

public abstract class Filter {
	protected String name;
	
	public abstract Picture process(Picture original);	
	public String getName(){
		return this.name;
	}
	
}
