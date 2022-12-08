/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ExcepcionesGestionUsuario;

/**
 *
 * @author Jorgito
 */
public class PasstwordUserException extends ProblemInUserManagmentException {
    public  PasstwordUserException (String s){
        super(" la contrasenna debe tener por lo menos 10 caracteres ");
    }
  
}
