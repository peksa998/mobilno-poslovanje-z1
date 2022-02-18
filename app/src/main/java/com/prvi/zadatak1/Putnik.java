package com.prvi.zadatak1;

import java.io.Serializable;

public class Putnik implements Serializable {
    String ime;
    String prezime;
    String brojTelefona;
    String mail;
    String vozilo;

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getBrojTelefona() {
        return brojTelefona;
    }

    public void setBrojTelefona(String brojTelefona) {
        this.brojTelefona = brojTelefona;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getVozilo() {
        return vozilo;
    }

    public void setVozilo(String vozilo) {
        this.vozilo = vozilo;
    }

    public Putnik() {

    }
}
