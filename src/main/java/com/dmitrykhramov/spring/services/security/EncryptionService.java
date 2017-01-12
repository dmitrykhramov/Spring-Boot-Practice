package com.dmitrykhramov.spring.services.security;

/**
 * Created by Dmitry on 09.01.2017.
 */

public interface EncryptionService {

    String encryptString(String input);

    boolean checkPassword(String plainPassword, String encryptedPassword);

}
