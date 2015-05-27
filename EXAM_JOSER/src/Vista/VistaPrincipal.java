package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.CardLayout;

public class VistaPrincipal extends JFrame {

	VistaUsuario VU;
	VistaEquipo VE;
	VistaComprobacion VC;
	
	private JPanel pantalla;

	

	public VistaPrincipal() {
		
		VU=new VistaUsuario(this);
		VE=new VistaEquipo(this);
		VC=new VistaComprobacion(this);
		
		this.setTitle("The Laby");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 350);
		pantalla = new JPanel();
		pantalla.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pantalla);
		pantalla.setLayout(new CardLayout(0, 0));
		
		pantalla.add(VU, "VistaUsuario");
		pantalla.add(VE, "VistaEquipo");
		pantalla.add(VC, "VistaComprobacion");
	}
	
	
	public void showVistaEquipo(){
		CardLayout c=(CardLayout)(pantalla.getLayout());
		c.show(pantalla, "VistaEquipo");	
	}
	
	
	public VistaEquipo getVistaEquipo(){
		return VE;}
	
	
	public void showVistaComprobacion(){
		CardLayout c=(CardLayout)(pantalla.getLayout());
		c.show(pantalla, "VistaComprobacion");	
	}
	
	
	public VistaComprobacion getComprobacion(){
		return VC;}
	
	
	public void showVistaUsuario(){
		CardLayout c=(CardLayout)(pantalla.getLayout());
		c.show(pantalla, "VistaUsuario");	
	}
	
	
	public VistaUsuario getUsuario(){
		return VU;}


}
