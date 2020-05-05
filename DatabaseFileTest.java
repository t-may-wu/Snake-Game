package snakeGame;


/************** Change package name and db.properties' path ***************/
import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class DatabaseFileTest {




		String[] users = {"jay123","123"};
		String[] passwords = {"z842685","z842685"};
		private DatabaseFile db;
		private int rando;

		
		@Before
		public void setUp() throws Exception
		{
			db = new DatabaseFile(); 
		    db.setConnection("snakeGame_2/db.properties");
		    rando = (int)(Math.random()*users.length); 
		}
		
		@Test
		public void setConnection() throws FileNotFoundException
		{
			//1. call setStream() with users.txt
		    db.setConnection("snakeGame_2/db.properties");
		    
		    //2. call getStream() and return a FileInputStream object (fis)
		    Connection fis = db.getConnection();
		    
		    //3. make sure FileInputStream object returned by getStream is not null
		      
		    assertNotNull("Check setConnection", fis); //Place object here 
		}
		
		  @Test
	    public void query() throws SQLException, FileNotFoundException 
	    {
		
		db.setConnection("snakeGame_2/db.properties");
			    
	    //2. call getStream() and return a FileInputStream object (fis)
	    Connection fis = db.getConnection();
		 //Use Random # to extract username/ and expected password
		 String username = users[rando]; 
		 String expected = passwords[rando];
		  
		 //get actual result (invoke query with username
		 String Query = "select password from users where username = \"" + username + "\";"; 
		 ArrayList<String> actual = db.query(Query);
		 //compare expected with actual using assertEquals

		//String Query1 = "Update users set password = aes_decrypt('" + actual.get(0) + "', 'key') where username = \"" + username + "\";";
		//db.executeDML(Query1);



	    
		//ArrayList<String> actual3 = db.query(Query);
		assertEquals(expected, actual.get(0));
		 String encrypt = "Update users set password = aes_encrypt('" + actual.get(0) + "', 'key') where username = '" + username + "';";
		 db.executeDML(encrypt);

		 

	    }
		  
		@Test
		public void executeDML() throws SQLException, FileNotFoundException
		{
			
			db.setConnection("snakeGame_2/db.properties");

			 
			Connection fis = db.getConnection();
			 boolean check = false;
			 String DML = "insert into users values('JiaqiYun@cub.uca.edu', aes_encrypt('ThisisJiaqi', 'key'));";
			 check = db.executeDML(DML);
			 
			 assertTrue(check);
		}
	}
