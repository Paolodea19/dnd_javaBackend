package com.example.dnd.model;



import jakarta.persistence.*;

@Entity
public class Monsters {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String name;
    private String type;
    private String size;
    private String alignment;
    private String ac;
    private String hp;
    private String speed;
    private String cr;
    private String senses;
    private String languages;
    private String challenge;
    private String image;

    // Getters e Setters
    public Long getId() {return Id;}
    public void setId(Long id) {Id = id;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getType() {return type;};
    public void setType(String type) {this.type = type;}
    public String getSize() {return size;};
    public void setSize(String size) {this.size = size;}
    public String getAlignment() {return alignment;}
    public void setAlignment(String alignment) {this.alignment = alignment;}
    public String getAc() {return ac;}
    public void setAc(String ac) {this.ac = ac;}
    public String getHp() {return hp;}
    public void setHp(String hp) {this.hp = hp;}
    public String getSpeed() {return speed;}
    public void setSpeed(String speed) {this.speed = speed;}
    public String getCr() {return cr;}
    public void setCr(String cr) {this.cr = cr;}
    public String getSenses() {return senses;}
    public void setSenses(String senses) {this.senses = senses;}
    public String getLanguages() {return languages;}
    public void setLanguages(String languages) {this.languages = languages;}
    public String getChallenge() {return challenge;}
    public void setChallenge(String challenge) {this.challenge = challenge;}
    public String getImage() {return image;}
    public void setImage(String imageUrl) {this.image = image;}
}
