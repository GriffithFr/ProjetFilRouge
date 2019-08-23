/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filrouge.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author pauld
 */
public class motDePasseValidateur {
    
    private static motDePasseValidateur INSTANCE = new motDePasseValidateur();
    private static String pattern = null;
 
    /**
     * No one can make a direct instance
     * */
    private motDePasseValidateur()
    {
        //do nothing
    }
 
    /**
     * Force the user to build a validator using this way only
     * */
    public static motDePasseValidateur buildValidator( boolean forceSpecialChar,
                                                    boolean forceCapitalLetter,
                                                    boolean forceNumber,
                                                    int minLength,
                                                    int maxLength)
    {
        StringBuilder patternBuilder = new StringBuilder("((?=.*[a-z])");
 
        if (forceSpecialChar)
        {
            patternBuilder.append("(?=.*[@#$%])");
        }
 
        if (forceCapitalLetter)
        {
            patternBuilder.append("(?=.*[A-Z])");
        }
 
        if (forceNumber)
        {
            patternBuilder.append("(?=.*d)");
        }
 
        patternBuilder.append(".{" + minLength + "," + maxLength + "})");
        pattern = patternBuilder.toString();
 
        return INSTANCE;
    }
 
    /**
     * Here we will validate the password
     * */
    public static boolean validatePassword(final String password)
    {
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(password);
        return m.matches();
    }
    
}
