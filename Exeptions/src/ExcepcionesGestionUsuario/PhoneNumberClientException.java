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
public class PhoneNumberClientException extends  ProblemInClientManagmentException {
    public  PhoneNumberClientException (String s){
        super(" El numero de telefone debe ser de un celular (+53)");
    }
  
}
