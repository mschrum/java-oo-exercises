package Blogz;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	private String title;	
	private String body;
	private User author;
	private final Date created;
	private Date modified;
	private static final List<Post> allPosts=new ArrayList<Post>();

	public Post (String title, String body, User author){
		this.title=title;
		this.body=body;
		this.author=author;
		this.created=new Date();
		this.modified=this.created;
		allPosts.add(this);		
	}

	public String getTitle(){
		return this.title;
	}

	public String getbody(){
		return this.body;
	}
	
	public Date getCreated(){
		return this.created;
	}
	
	public Date getModified(){
		return this.modified;
	}
	
	public User getAuthor(){
		return this.author;
	}
	
	public void setModified(){
		this.modified = new Date();
	}
	
	public void setTitle(String Title){
		this.title=Title;
		setModified();
	}
	
	public void setBody(String Body){
		this.body=Body;
		setModified();
	}
	
	public static void main(String[] args) {
		User a = new User("Joshua","123Pass");
		Post numberOne = new Post ("TheTitle", "TheBody", a);
		System.out.println(numberOne.getCreated());
		System.out.println(numberOne.getModified());
		numberOne.setTitle("NewTitle");
		System.out.println(numberOne.getModified());
		
	}

}
