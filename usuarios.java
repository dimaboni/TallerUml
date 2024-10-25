public class Usuario {
    private String usuario;
    private String contrasena;
    private String nombre;
    private String perfil;
    private boolean login;

    public boolean iniciarSesion() {
        return login;
    }

    public boolean cerrarSesion() {
        return true;
    }
}