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
public class AddresProblemClientException extends  ProblemInClientManagmentException {
    public  AddresProblemClientException (String s){
        super(" La direccion del cliente debe coincidir con la del ci");
    }
  
}
