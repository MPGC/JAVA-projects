package ejer1;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics2D;      
import java.awt.geom.Ellipse2D;                  
public class CuadradosCirculos extends JPanel { 
	public void paint(Graphics g) {  //si usamos la clase Graphics2D podemos acceder a m�s m�todos que con la clase Graphics	 // para ello creamos una instacia de Graphics2D y hacemos un casting a la instancia g
		Graphics2D g2d= (Graphics2D) g; //necesitamos import java.awt.Graphics2D;                          
		g.setColor(Color.RED);
		g.fillOval(20, 100, 30, 30);
		g.drawOval(20, 50, 30, 30);		
		g.fillRect(150, 100, 30, 30); //para estos m�todos se puede usar la instancia g � g2d
		g.drawRect(150, 50, 30, 30); 
		g2d.draw(new Ellipse2D.Double(20, 150, 30, 30)); //para m�todos de Graphics2D hay que utilizar g2d
	}	
	public static void main(String[] args) { 
		JFrame ventana=new JFrame();	//se crea el frame que va a contener el JPanel	
		ventana.setTitle("Cuadrados y Circulos");
		ventana.setBounds(50,50,300, 300);
		ventana.add(new CuadradosCirculos());
		ventana.setVisible(true);
        ventana.setResizable(false);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//CuadradosCirculos obj=new CuadradosCirculos();
		//ventana.add(obj);
            //sustituye a las 2 l�neas anteriores
	}
}
