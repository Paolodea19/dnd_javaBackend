// src/main/java/com/example/dnd/response/AuthResponse.java
package com.example.dnd.response;

public class AuthResponse {
    private String token;
    private String message;

    // Costruttore per il token
    public AuthResponse(String token) {
        this.token = token;
        this.message = null;  // Imposta message a null se non viene utilizzato
    }

    // Costruttore per il messaggio
    public AuthResponse(String message, boolean isMessage) {
        this.message = message;
        this.token = null;  // Imposta token a null se non viene utilizzato
    }

    // Getters e setters
    public String getToken() { return token; }
    public void setToken(String token) { this.token = token; }
    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
}



