/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package management;

public class checkText {

    public static char[] number = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    public static char[] character = {'!', '@', '#', '$', '%', '^', '&', '*',
        '(', ')', '+', '=', '{', '}', ':', ';', '<', '>', '?', '[', ']', '.', ','};

    public static boolean checkAllNum(String txt) {
        try {
            Double.parseDouble(txt);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean checkNum(String txt) {
        char[] sep = txt.toCharArray();
        for (int i = 0; i < sep.length; i++) {
            for (int j = 0; j < number.length; j++) {
                if (sep[i] == number[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkCharacter(String txt) {
        char[] sep = txt.toCharArray();
        for (int i = 0; i < sep.length; i++) {
            for (int j = 0; j < character.length; j++) {
                if (sep[i] == character[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // TODO code application logic here
       
    }

}
