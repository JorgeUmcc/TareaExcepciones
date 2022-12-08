/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Principal;

/**
 *
 * @author Jorgito
 */
import ExcepcionesGestionUsuario.*;

  
public class Principal {

   
    public static void main(String[] args) {
        Usuario user ;
        
        try { 
            user = new Usuario("Pap0n44","1234");
            System.out.println("Se creo el usuario");
            
                
         }catch (AddresProblemClientException e){
            System.err.println(e.getMessage());   
         }
        catch ( ProblemInClientManagmentException e ) {
        System.out.println(e.getMessage());
        } 
        catch (ProblemInUserManagmentException e) {
            System.out.println(e.getMessage());
    }
}
}
    
        
    
    

