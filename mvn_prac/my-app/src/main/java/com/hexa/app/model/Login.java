package com.hexa.app.model;
import java.util.Objects;
public class Login{
    private String id;
    private String uname;
    private String pwd;
    private String role;

    public Login() {
        this.id = null;
        this.uname = null;
        this.pwd = null;
        this.role = null;
    }

    public Login(String id, String uname, String pwd, String role) {
        this.id = id;
        this.uname = uname;
        this.pwd = pwd;
        this.role = role;
    }


    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUname() {
        return this.uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPwd() {
        return this.pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", uname='" + getUname() + "'" +
            ", pwd='" + getPwd() + "'" +
            ", role='" + getRole() + "'" +
            "}";
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Login)) {
            return false;
        }
        Login login = (Login) o;
        return Objects.equals(id, login.id) && Objects.equals(uname, login.uname) && Objects.equals(pwd, login.pwd) && Objects.equals(role, login.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, uname, pwd, role);
    }


}