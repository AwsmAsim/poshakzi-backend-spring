package com.poshakzi.poshakzibackend.dto;

public class JwtResponse {
private String jwtToken;
private String username;
JwtResponse(String jwtToken, String username) {
if(jwtToken == null){
throw new NullPointerException("The property \"jwtToken\" is null. "
+ "Please set the value by \"jwtToken()\". "
+ "The properties \"jwtToken\", \"username\" are required.");
}
if(username == null){
throw new NullPointerException("The property \"username\" is null. "
+ "Please set the value by \"username()\". "
+ "The properties \"jwtToken\", \"username\" are required.");
}
this.jwtToken = jwtToken;
this.username = username;
}
public static JwtResponseBuilder builder(){
return new JwtResponseBuilder();
}
public static class JwtResponseBuilder {
private String jwtToken;
private String username;
JwtResponseBuilder() {
}
public JwtResponseBuilder jwtToken(String jwtToken){
this.jwtToken = jwtToken;
return JwtResponseBuilder.this;
}
public JwtResponseBuilder username(String username){
this.username = username;
return JwtResponseBuilder.this;
}
public JwtResponse build() {
return new JwtResponse(this.jwtToken, this.username);
}
@Override
public String toString() {
return "JwtResponse.JwtResponseBuilder(jwtToken=" + this.jwtToken + ", username=" + this.username + ")";
}
}
@Override
public String toString() {
return "JwtResponse(jwtToken=" + this.jwtToken + ", username=" + this.username + ")";
}
public void doSomething() {
// do something
}
public String getJwtToken() {
return jwtToken;
}
public void setJwtToken(String jwtToken) {
this.jwtToken = jwtToken;
}
public String getUsername() {
return username;
}
public void setUsername(String username) {
this.username = username;
}
}