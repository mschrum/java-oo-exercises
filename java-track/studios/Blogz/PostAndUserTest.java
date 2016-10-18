package Blogz;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PostAndUserTest {

User a;
User b;
private static boolean initialized = false;

	@Before
	public void init() {
		if (!initialized) {
			a = new User ("Melissa", "Password");
			b = new User ("Jacob", "Boo");
			initialized = true;
		}
	}

	@Test
	public void testUserInit() {
		a = new User ("Melissa", "Password");
		b = new User ("Jacob", "Boo");
		assertEquals("Melissa", a.getUserName());
		assertEquals("Password", a.getPassword());	
	}

	@Test
	public void testIsValidPassword() {
		assertTrue(a.isValidPassword("Password"));		
		assertFalse(a.isValidPassword("Hacker"));	
	}

	@Test
	public void testIsValidUsername() {
		try{
			assertTrue(User.isValidUsername("Melissa"));			
		}
		catch(IllegalArgumentException e){
			System.out.println("Cannot create username");
			e.printStackTrace();
		}
	}

	@Test
	public void testGetAllUsers() {
		assertEquals("Melissa",User.getAllUsers().get(0).getUserName());
		assertEquals("Jacob",User.getAllUsers().get(1).getUserName());
		}

	@Test
	public void testPostInit() {
		a = new User ("Melissa", "Password");
		Post first = new Post("MyTitle", "MyBody", a);
		assertEquals("MyTitle", first.getTitle());
		assertEquals("MyBody", first.getbody());
		assertEquals("Melissa", first.getAuthor().getUserName());
	}

}
