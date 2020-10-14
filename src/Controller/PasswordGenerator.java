/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.math.BigInteger;
import java.util.Random;

/**
 *
 * @author Asus
 */
public class PasswordGenerator {
    private String PasswordText = "";
    private Integer passwordLenght = 8;
    
    public PasswordGenerator()
    {
        
    }
    
    public void generatetPasswordNormal(Integer passLength)
    {
        Random randNumber = new Random();
        String charList = "0123456789QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm";
        int charListLength = 0;
        charListLength = charList.length();
        
        for(int i = 0; i < passLength; i++)
        {
            PasswordText += charList.charAt(randNumber.nextInt(charListLength));
        }
    }
    
    public void generatetPasswordSpecial(Integer passLength)
    {
        Random randNumber = new Random();
        String charList = "@#$%&*^!~=0123456789QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm@#$%&*^!~=";
        int charListLength = 0;
        charListLength = charList.length();
        
        for(int i = 0; i < passLength; i++)
        {
            this.PasswordText += charList.charAt(randNumber.nextInt(charListLength));
        }
    }
    
    public String getGeneratedPassword()
    {
        return this.PasswordText;
    }
    
}
