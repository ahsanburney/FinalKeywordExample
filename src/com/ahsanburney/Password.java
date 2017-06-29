package com.ahsanburney;

/**
 * Created by Kulsum on 6/28/2017.
 */
public class Password {
    private static final int key= 748;
    private final int encruptedPassword;

    public Password(int password) {
        this.encruptedPassword = encruptDecrypt(password);
    }

    private int encruptDecrypt(int password){
        return password ^ key;
    }

    public void storePassword(){
        System.out.println("Saving password is " + this.encruptedPassword);
    }

    public boolean letMeIn(int password){
        if (encruptDecrypt(password) == this.encruptedPassword){
            System.out.println("Welcome");
            return true;
        } else {
            System.out.println("Nope,you cannot come in");
            return false;
        }
    }
}
