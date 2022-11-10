package net.codejavajerome.productmanager;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class SecuredPasswordGenerator {

    public static void main(String[] args) {
        BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
//        String rawPassword="codejava";
        String rawPassword="admin123";
        String encodePassword=encoder.encode(rawPassword);

        System.out.println(encodePassword);
    }
}
