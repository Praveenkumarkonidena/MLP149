package com.hexa.training.model;
import java.util.Objects;
//import com.hexa.training.util.*;

public class Training{
    private int tid;
    private String training_name;
    // private int trgid;
    // private String trgname;

    public Training() {
    }

    public Training(int tid, String training_name) {
        this.tid = tid;
        this.training_name = training_name;
    }

    public int getTid() {
        return this.tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getTraining_name() {
        return this.training_name;
    }

    public void setTraining_name(String training_name) {
        this.training_name = training_name;
    }

    // public int getTrgid(){
    //     return this.trgid;
    // }
    // public String getTrgName(){
    //     return this.trgname;
    // }

    @Override
    public String toString() {
        return "{" +
            " tid='" + getTid() + "'" +
            ", training_name='" + getTraining_name() + "'" +
            "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Training)) {
            return false;
        }
        Training training = (Training) o;
        return tid == training.tid && Objects.equals(training_name, training.training_name);
    }    
    
    @Override
    public int hashCode() {
        return Objects.hash(tid, training_name);
    }

}