package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import model.ModeloVerificacion;


public class VistaComprobacion extends JPanel {
	private JTextField Id;
	private JTextField Apellidos;
	private JTextField Comprobar;
	VistaPrincipal Vapp;
	
	
	
	public VistaComprobacion(VistaPrincipal Vapp) {
		setLayout(null);
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(36, 33, 46, 14);
		add(lblId);
		
		Id = new JTextField();
		
		Id.setBounds(36, 58, 86, 20);
		add(Id);
		Id.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellidos");
		lblApellido.setBounds(238, 33, 86, 14);
		add(lblApellido);
		
		Apellidos = new JTextField();
		Apellidos.setBounds(238, 58, 86, 20);
		add(Apellidos);
		Apellidos.setColumns(10);
		
		JButton btnNewButton = new JButton("Comprobar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				/*verificacion=new ModeloVerificacion();
		
				String Seleccion = (String) Desplegable.getSelectedItem();
				String contrasena=verificacion.Verificacion(Seleccion);
				System.out.println(Seleccion); 
				
				if(CampoContra.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(null,"Please Enter a Password", "Bingo Twist", JOptionPane.WARNING_MESSAGE, new ImageIcon("src/Principal/imagenes/iconoJOption.jpg"));
					jugadores VentPrinc = new jugadores();
					VentPrinc.setVisible (false);

						
					}
				
				else{
					
					//verificacion.Verificacion();
					char[] Contra = CampoContra.getPassword(); 
					
					
					
					if  (contrasena.equals(String.valueOf(Contra)))
					{
						System.out.println("Contraseña correcta"); 
						Primera.this.dispose();
						jugadores VentPrinc1 = new jugadores();		
						VentPrinc1.setVisible (true);*/
					}
				
					
				

				
			
			
			
		});	
		btnNewButton.setBounds(99, 126, 225, 23);
		add(btnNewButton);
		
		Comprobar = new JTextField();
		Comprobar.setBounds(99, 181, 225, 20);
		add(Comprobar);
		Comprobar.setColumns(10);
		
		JButton atras = new JButton("<< Atras");
		atras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Vapp.showVistaEquipo();
			}
		});
		atras.setBounds(36, 246, 89, 23);
		add(atras);

	}

}
