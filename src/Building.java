import java.awt.Color;

public class Building {
	public static void main ( String [] args)
	{
		//WINDOW PARAMETERS
		Window win ;
		win = new Window ();
		win.setSize(1000, 1000);
		win.setTitle("Charles Greene is the King");
		win.setBackground(java.awt.Color.cyan);
		
		//OVAL PARAMETERS HILL 1
		Oval ovlhill = new Oval ( -400, 400, 1000, 1000);
		win.add(ovlhill);
		ovlhill.setBackground(java.awt.Color.green);
		
		//OVAL PARAMETERS HILL 2
		Oval ovlhill2 = new Oval ( 300, 400, 1000, 1000);
		win.add(ovlhill2);
		ovlhill2.setBackground(java.awt.Color.green);
		
		//TRIANGLE PARAMETER ROOF TOP
		Triangle tri = new Triangle ( 100, 400, 100, 100, 1);
		win.add (tri);
		tri.setBackground (java.awt.Color.gray);
		
		//TRIANGLES2 PARAMETERS ROOF TOP
		Triangle tri2 = new Triangle( 200, 400, 100, 100, 1);
		win.add( tri2 );
		tri2.setBackground (java.awt.Color.gray);
		
		//TRIANGLE3 PARAMETERS ROOF TOP
		Triangle tri3 = new Triangle (300, 400, 100, 100, 1);
		win.add(tri3);
		tri3.setBackground (java.awt.Color.gray);
		
		
		//RECTANGLE1 PARAMETERS HOUSE
		Rectangle rec = new Rectangle (100, 500, 300, 300 );
		win.add(rec);
		rec.setBackground (java.awt.Color.black) ;
		
		//RECTANGLE2 PARAMETERS ROAD
		Rectangle rec2 = new Rectangle (0, 800, 1000, 200);
		win.add(rec2);
		rec2.setBackground(java.awt.Color.darkGray);
		
		//RECTANGLE3 PARAMETERS ROAD STRIPS
		Rectangle rec3 = new Rectangle (10, 860, 90, 20);
		win.add(rec3);
		rec3.setBackground(java.awt.Color.white); 
		
		//RECTANGLE 4 PARAMETERS ROAD STRIPS
		Rectangle rec4 = new Rectangle (200, 860, 90, 20);
		win.add(rec4);
		rec4.setBackground(java.awt.Color.white); 
		
		//RECTANGLE 5 PARAMETERS ROAD STRIPS
		Rectangle rec5 = new Rectangle (390, 860, 90, 20);
		win.add(rec5);
		rec5.setBackground(java.awt.Color.white); 
				
		//RECTANGLE 6 PARAMETERS ROAD STRIPS
		Rectangle rec6 = new Rectangle (580, 860, 90, 20);
		win.add(rec6);
		rec6.setBackground(java.awt.Color.white); 
		
		//RECTANGLE 7 PARAMETERS ROAD STRIPS
		Rectangle rec7 = new Rectangle (770, 860, 90, 20);
		win.add(rec7);
		rec7.setBackground(java.awt.Color.white);
		
		//RECTANGLE 8 PARAMETERS ROAD STRIPS
		Rectangle rec8 = new Rectangle (960, 860, 90, 20);
		win.add(rec8);
		rec8.setBackground(java.awt.Color.white);
		
		//OVAL 1 PARAMETERS CLOUD
		Oval ovl = new Oval ( 100, 100, 100, 100);
		win.add(ovl);
		ovl.setBackground(java.awt.Color.white);
		
		//OVAL 2 PARAMETERS CLOUD
		Oval ovl2 = new Oval ( 170, 50, 100, 100);
		win.add(ovl2);
		ovl2.setBackground(java.awt.Color.white);
		
		//OVAl 3 PARAMETERS CLOUD
		Oval ovl3 = new Oval ( 190, 110, 100, 100);
		win.add(ovl3);
		ovl3.setBackground(java.awt.Color.white);
		
		//OVAL 4 PARAMETERS CLOUD
		Oval ovl4 = new Oval ( 250, 70, 100, 100);
		win.add(ovl4);
		ovl4.setBackground(java.awt.Color.white);
		
		//OVAL 5 PARAMETERS SUN
		Oval ovl5 = new Oval ( 750, 40, 200, 200);
		win.add(ovl5);
		ovl5.setBackground(java.awt.Color.yellow);
		
		//OVAL 6 PARAMATERS CLOUD
		Oval ovl6 = new Oval ( 700, 100, 100, 100);
		win.add(ovl6);
		ovl6.setBackground(java.awt.Color.white);
		
		//OVAL 7 PARAMETERS CLOUD
		Oval ovl7 = new Oval ( 750, 150, 100, 100);
		win.add(ovl7);
		ovl7.setBackground(java.awt.Color.white);
		
		//OVAL 8 PARAMETERS CLOUD
		Oval ovl8 = new Oval ( 670, 160, 100, 100);
		win.add(ovl8);
		ovl8.setBackground(java.awt.Color.white);
		
		//OVAL 9 PARAMETERS CLOUD
		Oval ovl9 = new Oval ( 620, 100, 100, 100);
		win.add(ovl9);
		ovl9.setBackground(java.awt.Color.white);
		
		//OVAL 10 PARAMETERS CLOUD
		Oval ovl10 = new Oval ( 580, 160, 100, 100);
		win.add(ovl10);
		ovl10.setBackground(java.awt.Color.white);
		
		//RECTANGLE 9 PARAMETERS DOOR
		Rectangle rec9 = new Rectangle ( 230, 700, 60, 100);
		win.add(rec9);
		rec9.setBackground(java.awt.Color.orange);
		
		//OVAL 11 PARAMETERS DOOR KNOB
		Oval ovl11 = new Oval (270, 740, 10, 10);
		win.add(ovl11);
		ovl11.setBackground(java.awt.Color.black);
		
		//RECTANGLE 10 PARAMETERS WINDOW
		Rectangle rec10 = new Rectangle ( 120, 600, 50, 50);
		win.add(rec10);
		rec10.setBackground(java.awt.Color.orange);
		
		//RECTANGLE 11 PARAMETERS WINDOW
		Rectangle rec11 = new Rectangle ( 120, 540, 50, 50);
		win.add(rec11);
		rec11.setBackground(java.awt.Color.orange);
		
		//RECTANGLE 12 PARAMETERS WINDOW
		Rectangle rec12 = new Rectangle ( 180, 600, 50, 50);
		win.add(rec12);
		rec12.setBackground(java.awt.Color.orange);
		
		//RECTANGLE 13 PARAMETERS WINDOW
		Rectangle rec13 = new Rectangle ( 180, 540, 50, 50);
		win.add(rec13);
		rec13.setBackground(java.awt.Color.orange);
		
		//RECTANGLE 14 PARAMETERS WINDOW
		Rectangle rec14 = new Rectangle ( 330, 600, 50, 50);
		win.add(rec14);
		rec14.setBackground(java.awt.Color.orange);
		
		//RECTANGLE 15 PARAMETERS WINDOW
		Rectangle rec15 = new Rectangle ( 270, 600, 50, 50);
		win.add(rec15);
		rec15.setBackground(java.awt.Color.orange);
		
		//RECTANGLE 16 PARAMETERS WINDOW
		Rectangle rec16 = new Rectangle ( 330, 540, 50, 50);
		win.add(rec16);
		rec16.setBackground(java.awt.Color.orange);
		
		//RECTANGLE 17 PARAMETERS WINDOW
		Rectangle rec17 = new Rectangle ( 270, 540, 50, 50);
		win.add(rec17);
		rec17.setBackground(java.awt.Color.orange);
		
		//RECTANGLE 18 TREE BRANCH
		Rectangle rec18 = new Rectangle ( 700, 670, 20, 130);
		win.add(rec18);
		rec18.setBackground(java.awt.Color.LIGHT_GRAY);
		
		//TRIANGLE 4 PARAMETERS TREE
		Triangle tri4 = new Triangle ( 635, 600, 150, 150, 1);
		win.add(tri4);
		tri4.setBackground(java.awt.Color.pink);
		
		//TRIANGLE 5 PARAMETERS TREE
		Triangle tri5 = new Triangle ( 645, 580, 130, 130, 1);
		win.add(tri5);
		tri5.setBackground(java.awt.Color.pink);
		
		//TRIANGLE 6 PARAMETERS TREE
		Triangle tri6 = new Triangle ( 655, 560, 110, 110, 1);
		win.add(tri6);
		tri6.setBackground(java.awt.Color.pink);


				
	}
	
}
