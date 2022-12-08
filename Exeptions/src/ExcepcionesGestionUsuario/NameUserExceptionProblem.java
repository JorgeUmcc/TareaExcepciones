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
public class NameUserExceptionProblem extends ProblemInUserManagmentException {
    public  NameUserExceptionProblem (String s){
        super(" el nombre de usuario debe tener por lo menos 10 caracteres ");
    }
  
}
