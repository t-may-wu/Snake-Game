package snakeGame_2;

import static org.junit.Assert.*;

import java.awt.CardLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



public class ClientGUITest {
	 private static ClientGUI cgui;


	  



	@Test
	  public void testGetButtonAt()
	  {
		cgui = new ClientGUI();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		JPanel container = new JPanel();
		SnakeClient snakeclient = new SnakeClient();
		LoginControl lc = new LoginControl(container, snakeclient);
		LoginPanel lp = new LoginPanel(lc);
		 JButton button = lp.submitButton;
		 try {
			 button.doClick(500);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	    
	    
		if(!lp.getUsername().equals(null))
			assertEquals(1,lc.testInInt);
		
        //assertEquals(1,lc.testCreate);
		
	   
	    
	   
	    
	  }


	 
	}

