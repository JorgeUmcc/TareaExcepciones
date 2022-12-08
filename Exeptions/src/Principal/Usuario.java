package Principal;
import ExcepcionesGestionUsuario.*;



public class Usuario {
    private String name;
    private String password;
    public Usuario (String name,String password) throws ProblemInClientManagmentException,ProblemInUserManagmentException {
    this.name=name;
    this.password=password;
    
}
}
