package com.example.mongospring.Model;

public class Devices {


    private String ip;
    private String type;
    private String User;
    private String Password;
    private String Ssh;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String user) {
        User = user;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getSsh() {
        return Ssh;
    }

    public void setSsh(String ssh) {
        Ssh = ssh;
    }

    @Override
    public String toString() {
        return "Devices{" +
                "ip='" + ip + '\'' +
                ", type='" + type + '\'' +
                ", User='" + User + '\'' +
                ", Password='" + Password + '\'' +
                ", Ssh='" + Ssh + '\'' +
                '}';
    }
}
