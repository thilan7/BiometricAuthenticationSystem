
package biometric;

/**
 *
 * @author Thilan K Bandara
 */
public class Biometric {

   
    
    public static void main(String[] args) {

        SQLiteJDBC.Initialize();
        SignIn form=new SignIn();
        form.setVisible(true);
        
        
    }
    
}
