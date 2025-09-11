package com.base64;

import java.util.Base64;

public class BaseEncode {

    public static void main(String[] xyz) {

    String password = "yuvraj@123";
    String encoded = Base64.getEncoder().encodeToString(password.getBytes());
    System.out.println(encoded);

    System.out.println("after decoding");

    String decoded = new String(Base64.getDecoder().decode(encoded));
    System.out.println(decoded);
}
}
