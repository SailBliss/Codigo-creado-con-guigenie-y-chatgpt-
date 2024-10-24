import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PaginaPrincipal extends JPanel {
    private CardLayout cardLayout;
    private JPanel panelContainer;

    // Variables para las diferentes páginas
    private PaginaDondeTirarlo donde;
    private IniciarSesion ini;
    private PaginaConsejos con;
    private Registrarse re;

    public PaginaPrincipal() {
        // Inicializar el CardLayout y el panel contenedor
        cardLayout = new CardLayout();
        panelContainer = new JPanel(cardLayout);

        // Crear las instancias de cada página
        donde = new PaginaDondeTirarlo();
        ini = new IniciarSesion();
        con = new PaginaConsejos();
        re = new Registrarse();

        // Agregar las páginas al panel contenedor con sus nombres
        panelContainer.add(donde, "donde");
        panelContainer.add(ini, "iniciarSesion");
        panelContainer.add(con, "consejos");
        panelContainer.add(re, "registrarse");

        // Establecer la primera página que se mostrará
        cardLayout.show(panelContainer, "donde");

        // Agregar el panel contenedor al JPanel principal
        setLayout(new BorderLayout());
        add(panelContainer, BorderLayout.CENTER);

        // Configurar los botones de navegación
        configureNavigation();
    }

    private void configureNavigation() {
        // Navegación desde "Donde Tirarlo"
        donde.buttonPaginaConsejos.addActionListener(e -> cardLayout.show(panelContainer, "consejos"));
        donde.buttonPaginaRegistrarse.addActionListener(e -> cardLayout.show(panelContainer, "registrarse"));
        donde.buttonPaginaIniciarSesion.addActionListener(e -> cardLayout.show(panelContainer, "iniciarSesion"));

        // Navegación desde "Registrarse"
        re.buttonCancelar.addActionListener(e -> cardLayout.show(panelContainer, "donde"));

        // Navegación desde "Iniciar Sesión"
        ini.buttonCancelar.addActionListener(e -> cardLayout.show(panelContainer, "donde"));

        // Navegación desde "Consejos"
        con.buttonPaginaDondeTirarlo.addActionListener(e -> cardLayout.show(panelContainer, "donde"));
        con.buttonPaginaRegistrarse.addActionListener(e -> cardLayout.show(panelContainer, "registrarse"));
        con.buttonPaginaIniciarSesion.addActionListener(e -> cardLayout.show(panelContainer, "iniciarSesion"));
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("EcoSoul App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new PaginaPrincipal());
        frame.setSize(800, 600);
        frame.setVisible(true);
    }

    // Clases internas para cada sección
    class IniciarSesion extends JPanel {
        private JTextField fieldUsuario;
        private JLabel labelUser;
        private JLabel labelContrasena;
        private JButton buttonIniciar;
        private JButton buttonCancelar;
        private JPasswordField fieldContrasena;

        public IniciarSesion() {
            //construct components
            fieldUsuario = new JTextField(5);
            labelUser = new JLabel("Usuario:");
            labelContrasena = new JLabel("Contrasena:");
            buttonIniciar = new JButton("Iniciar Sesion");
            buttonCancelar = new JButton("Cancelar");
            fieldContrasena = new JPasswordField(5);

            //set layout
            setLayout(null);

            //add components
            add(fieldUsuario);
            add(labelUser);
            add(labelContrasena);
            add(buttonIniciar);
            add(buttonCancelar);
            add(fieldContrasena);

            //set component bounds
            fieldUsuario.setBounds(110, 40, 135, 25);
            labelUser.setBounds(30, 40, 100, 25);
            labelContrasena.setBounds(30, 70, 100, 25);
            buttonIniciar.setBounds(10, 110, 125, 25);
            buttonCancelar.setBounds(145, 110, 125, 25);
            fieldContrasena.setBounds(110, 70, 135, 25);
        }
    }

    class PaginaConsejos extends JPanel {
        private JLabel labelLogo;
        private JButton buttonPaginaDondeTirarlo;
        private JButton buttonPaginaConsejos;
        private JButton buttonPaginaRegistrarse;
        private JButton buttonPaginaIniciarSesion;
        private JLabel labelConsejo;
        private JTextArea fieldConsejo;

        public PaginaConsejos() {
            //construct components
            labelLogo = new JLabel("EcoSoul");
            buttonPaginaDondeTirarlo = new JButton("Donde tirarlo?");
            buttonPaginaConsejos = new JButton("Consejos");
            buttonPaginaRegistrarse = new JButton("Registrarse");
            buttonPaginaIniciarSesion = new JButton("Iniciar Sesion");
            labelConsejo = new JLabel("Consejo:");
            fieldConsejo = new JTextArea(5, 5);

            //set layout
            setLayout(null);

            //add components
            add(labelLogo);
            add(buttonPaginaDondeTirarlo);
            add(buttonPaginaConsejos);
            add(buttonPaginaRegistrarse);
            add(buttonPaginaIniciarSesion);
            add(labelConsejo);
            add(fieldConsejo);

            //set component bounds
            labelLogo.setBounds(20, 20, 100, 25);
            buttonPaginaDondeTirarlo.setBounds(85, 20, 125, 25);
            buttonPaginaConsejos.setBounds(215, 20, 125, 25);
            buttonPaginaRegistrarse.setBounds(415, 20, 115, 25);
            buttonPaginaIniciarSesion.setBounds(535, 20, 115, 25);
            labelConsejo.setBounds(45, 95, 100, 25);
            fieldConsejo.setBounds(120, 95, 100, 75);
        }
    }

    class PaginaDondeTirarlo extends JPanel {
        private JLabel labelLogo;
        private JButton buttonPaginaDondeTirarlo;
        private JButton buttonPaginaConsejos;
        private JButton buttonPaginaRegistrarse;
        private JButton buttonPaginaIniciarSesion;
        private JRadioButton checkPapel;
        private JLabel labelPregunta;
        private JRadioButton checkBotellas;
        private JLabel labelPapel;
        private JLabel labelBotellas;
        private JRadioButton checkCarton;
        private JLabel labelCarton;
        private JRadioButton checkVidrio;
        private JLabel labelVidrio;
        private JLabel labelResultado;
        private JRadioButton buttonComidaSi;
        private JRadioButton buttonComidaNo;
        private JLabel labelComida;
        private JTextArea fieldResultado;
        private JRadioButton checkMetal;
        private JRadioButton checkOtro;
        private JLabel labelMetal;
        private JLabel labelOtro;

        public PaginaDondeTirarlo() {
            //construct components
            labelLogo = new JLabel("EcoSoul");
            buttonPaginaDondeTirarlo = new JButton("Donde tirarlo?");
            buttonPaginaConsejos = new JButton("Consejos");
            buttonPaginaRegistrarse = new JButton("Registrarse");
            buttonPaginaIniciarSesion = new JButton("Iniciar Sesion");
            checkPapel = new JRadioButton("Papel");
            labelPregunta = new JLabel("Que material vas a reciclar?");
            checkBotellas = new JRadioButton("Botellas");
            labelPapel = new JLabel("Descripcion papel.");
            labelBotellas = new JLabel("Descripcion botellas.");
            checkCarton = new JRadioButton("Carton");
            labelCarton = new JLabel("Descripcion carton.");
            checkVidrio = new JRadioButton("Vidrio");
            labelVidrio = new JLabel("Descripcion vidrio.");
            labelResultado = new JLabel("Resultado:");
            buttonComidaSi = new JRadioButton("Si.");
            buttonComidaNo = new JRadioButton("No.");
            labelComida = new JLabel("Contaminado de comida?");
            fieldResultado = new JTextArea(5, 5);
            checkMetal = new JRadioButton("Metal");
            checkOtro = new JRadioButton("Otro");
            labelMetal = new JLabel("Descripcion metal.");
            labelOtro = new JLabel("Descripcion otro.");

            //set layout
            setLayout(null);

            //add components
            add(labelLogo);
            add(buttonPaginaDondeTirarlo);
            add(buttonPaginaConsejos);
            add(buttonPaginaRegistrarse);
            add(buttonPaginaIniciarSesion);
            add(checkPapel);
            add(labelPregunta);
            add(checkBotellas);
            add(labelPapel);
            add(labelBotellas);
            add(checkCarton);
            add(labelCarton);
            add(checkVidrio);
            add(labelVidrio);
            add(labelResultado);
            add(buttonComidaSi);
            add(buttonComidaNo);
            add(labelComida);
            add(fieldResultado);
            add(checkMetal);
            add(checkOtro);
            add(labelMetal);
            add(labelOtro);

            //set component bounds
            labelLogo.setBounds(20, 20, 100, 25);
            buttonPaginaDondeTirarlo.setBounds(85, 20, 125, 25);
            buttonPaginaConsejos.setBounds(215, 20, 125, 25);
            buttonPaginaRegistrarse.setBounds(415, 20, 115, 25);
            buttonPaginaIniciarSesion.setBounds(535, 20, 115, 25);
            checkPapel.setBounds(30, 95, 85, 25);
            labelPregunta.setBounds(30, 65, 200, 25);
            checkBotellas.setBounds(30, 135, 100, 25);
            labelPapel.setBounds(125, 95, 225, 25);
            labelBotellas.setBounds(125, 135, 100, 25);
            checkCarton.setBounds(30, 170, 100, 25);
            labelCarton.setBounds(125, 170, 100, 25);
            checkVidrio.setBounds(30, 205, 100, 25);
            labelVidrio.setBounds(125, 205, 100, 25);
            labelResultado.setBounds(325, 95, 100, 25);
            buttonComidaSi.setBounds(450, 95, 100, 25);
            buttonComidaNo.setBounds(550, 95, 100, 25);
            labelComida.setBounds(325, 65, 200, 25);
            fieldResultado.setBounds(325, 135, 300, 150);
            checkMetal.setBounds(30, 245, 100, 25);
            checkOtro.setBounds(30, 285, 100, 25);
            labelMetal.setBounds(125, 245, 100, 25);
            labelOtro.setBounds(125, 285, 100, 25);
        }
    }

    class Registrarse extends JPanel {
        private JTextField fieldUsuario;
        private JLabel labelUser;
        private JLabel labelCorreo;
        private JTextField fieldCorreo;
        private JLabel labelContrasena;
        private JButton buttonRegistrarse;
        private JButton buttonCancelar;
        private JPasswordField fieldContrasena;

        public Registrarse() {
            //construct components
            fieldUsuario = new JTextField(5);
            labelUser = new JLabel("Usuario:");
            labelCorreo = new JLabel("Correo:");
            fieldCorreo = new JTextField(5);
            labelContrasena = new JLabel("Contrasena:");
            buttonRegistrarse = new JButton("Registrarse");
            buttonCancelar = new JButton("Cancelar");
            fieldContrasena = new JPasswordField(5);

            //set layout
            setLayout(null);

            //add components
            add(fieldUsuario);
            add(labelUser);
            add(labelCorreo);
            add(fieldCorreo);
            add(labelContrasena);
            add(buttonRegistrarse);
            add(buttonCancelar);
            add(fieldContrasena);

            //set component bounds
            fieldUsuario.setBounds(110, 40, 135, 25);
            labelUser.setBounds(30, 40, 100, 25);
            labelCorreo.setBounds(30, 70, 100, 25);
            fieldCorreo.setBounds(110, 70, 135, 25);
            labelContrasena.setBounds(30, 100, 100, 25);
            buttonRegistrarse.setBounds(10, 140, 125, 25);
            buttonCancelar.setBounds(145, 140, 125, 25);
            fieldContrasena.setBounds(110, 100, 135, 25);
        }
    }
}
