package com.poshakzi.poshakzibackend.dto;

public class JwtRequest {
String email;
String password;
public String getEmail(){ return email;}
public String getPassword(){ return password;}
public static class Builder {
private String email;
private String password;
public Builder() {
}
Builder(String email, String password) {
this.email = email;
this.password = password;
}
public Builder email(String email){
this.email = email;
return Builder.this;
}
public Builder password(String password){
this.password = password;
return Builder.this;
}
public JwtRequest build() {
if(this.email == null){
throw new NullPointerException("The property \"email\" is null. "
+ "Please set the value by \"email()\". "
+ "The properties \"email\", \"password\" are required.");
}
if(this.password == null){
throw new NullPointerException("The property \"password\" is null. "
+ "Please set the value by \"password()\". "
+ "The properties \"email\", \"password\" are required.");
}
return new JwtRequest(this);
}
}
public JwtRequest() {
}
public JwtRequest(String email, String password) {
super();
this.email = email;
this.password = password;
}
public void setEmail(String email) {
this.email = email;
}
public void setPassword(String password) {
this.password = password;
}
private JwtRequest(Builder builder) {
this.email = builder.email;
this.password = builder.password;
}
public void doSomething() {
// do something
}
}