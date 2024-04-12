package vista;

import javax.swing.JButton;
import javax.swing.JDialog;

import controlador.ControladorEventos;

public class VentanaPrincipal extends JDialog{

	private JButton botonAltaProducto, BotonConsultaProducto, botonAltaPlato,
	botonConsultaPlato, botonAltaProveedor, botonConsultaProveedor, botonAltaUsuario;
	
public VentanaPrincipal(){
		
		setSize(1000, 1000);
		setLocationRelativeTo(null);
		setResizable(false);
		setTitle("RESTECH");
		setLayout(null);
		inicializarComponentes();
		setVisible(true);
	}

	private void inicializarComponentes(){
		
		botonAltaProducto = new JButton("Alta Producto");
		botonAltaProducto.setBounds(400,100,150,30);
		add(botonAltaProducto);
		
		BotonConsultaProducto = new JButton("Consultar Producto");
		BotonConsultaProducto.setBounds(400,150,150,30);
		add(BotonConsultaProducto);
		
		botonAltaPlato = new JButton("Alta Plato");
		botonAltaPlato.setBounds(400,200,150,30);
		add(botonAltaPlato);
		
		botonConsultaPlato = new JButton("Consultar Plato");
		botonConsultaPlato.setBounds(400,250,150,30);
		add(botonConsultaPlato);
		
		botonAltaProveedor = new JButton("Alta Proveedor");
		botonAltaProveedor.setBounds(400,250,150,30);
		add(botonAltaProveedor);
		
		botonConsultaProveedor = new JButton("Consultar Proveedor");
		botonConsultaProveedor.setBounds(400,300,150,30);
		add(botonConsultaProveedor);
		
		botonAltaUsuario = new JButton("Alta Usuario");
		botonAltaUsuario.setBounds(400,350,150,30);
		add(botonAltaUsuario);
	}
	
	public void IniciarListener(ControladorEventos controlador) {
		
		botonAltaProducto.addActionListener(controlador);
}
}
