/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biometric;

/**
 *
 * @author Thilan K Bandara
 */
public class Validation {

    public static boolean validateInput(String number) {
        try {
            Float.valueOf(number);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public static boolean nameValidation(String name) {
        name = name.trim();
        if (name.matches("[A-Za-z ]+") && name.length() < 50) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean idValidation(String name) {

        name = name.trim();
        if (name.length() == 6) {
            try {
                Integer.valueOf(name);
            } catch (Exception e) {
                return false;
            }
        }else{
        return false;
    }
    return true;}
}
