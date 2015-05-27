package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;



import model.Cadete;
import model.IngresoLaby;

public class VistaEquipo extends JPanel {
	private JTextField textField;
	private JTextField Apellidos;
	private JTextField edad;
	private JTextField Nacionalidad;
	private JTextField Id;

	
	VistaPrincipal Vapp;
	
	public VistaEquipo(VistaPrincipal Vapp) {
		setLayout(null);
		
		JComboBox Desplegable = new JComboBox();
		Desplegable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					        
		    	Cadete C = (Cadete) Desplegable.getSelectedItem();
		    	textField.setText(C.getNombre());	
		    	Id.setText(String.valueOf(C.getId()));
		    	Apellidos.setText(C.getApellidos());

		    	//Partir el apellido en dos
		    		String delimiter= " ";
		    		String[] temp;
		    		temp=C.getApellidos().split(delimiter,2);
		    		for (int i=0;i<temp.length;i++)
		    			
		    			System.out.println(temp[i]);

		    	
		    	edad.setText(String.valueOf(C.getEdad()));
		    	Nacionalidad.setText(C.getNacionalidad());
		    	
		    	
		    }		 
		
		});
		Desplegable.setBounds(10, 38, 168, 25);
		add(Desplegable);
		
		textField = new JTextField();
		textField.setBounds(201, 40, 124, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(201, 15, 46, 14);
		add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellidos");
		lblApellido.setBounds(201, 71, 86, 14);
		add(lblApellido);
		
		Apellidos = new JTextField();
		Apellidos.setBounds(201, 96, 124, 20);
		add(Apellidos);
		Apellidos.setColumns(10);
		
		JLabel lblApellido_1 = new JLabel("Edad");
		lblApellido_1.setBounds(201, 129, 86, 14);
		add(lblApellido_1);
		
		edad = new JTextField();
		edad.setBounds(201, 154, 124, 20);
		add(edad);
		edad.setColumns(10);
		
		JLabel lblNacionalidad = new JLabel("Nacionalidad");
		lblNacionalidad.setBounds(201, 185, 86, 14);
		add(lblNacionalidad);
		
		Nacionalidad = new JTextField();
		Nacionalidad.setBounds(201, 210, 124, 20);
		add(Nacionalidad);
		Nacionalidad.setColumns(10);
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(335, 15, 46, 14);
		add(lblId);
		
		Id = new JTextField();
		Id.setBounds(335, 40, 86, 20);
		add(Id);
		Id.setColumns(10);
		
		JButton btnAtras = new JButton("<< Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Vapp.showVistaUsuario();
			}
		});
		btnAtras.setBounds(10, 266, 89, 23);
		add(btnAtras);
		
		JButton btnSiguiente = new JButton("Siguiente >>");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Vapp.showVistaComprobacion();
			}
		});
		btnSiguiente.setBounds(335, 266, 105, 23);
		add(btnSiguiente);
		
		JLabel lblEquipo = new JLabel("Equipo");
		lblEquipo.setBounds(10, 13, 46, 14);
		add(lblEquipo);

		
		//Rellenamos comboBox
		
		IngresoLaby usuarios=new IngresoLaby();
		
		Iterator<Cadete> it=usuarios.getJugones().iterator();
		while(it.hasNext()){
			Desplegable.addItem(it.next());
		
	}
	

	}
}
