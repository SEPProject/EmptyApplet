package model;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordManager implements PasswordManagerBehaviour {

    String hashStored;

    @Override
    public String getHashStored(){
        return hashStored;
    }

    @Override
    public void setHashStored(String password){
        hashStored = hash(password);
    }


    public String hash(String password){
        String md5 = null;
        if (password ==null){
            return md5;
        }else {
            try {
                // creating MessageDigest object for MD5 algo
                MessageDigest digest = MessageDigest.getInstance("MD5");

                //updating password in message digest
                digest.update(password.getBytes(), 0, password.length());

                //converting in HEX
                md5 = new BigInteger(1,digest.digest()).toString(16);

            } catch (NoSuchAlgorithmException e) {
                System.err.println(e);
            }

            return md5;
        }
    }





}
