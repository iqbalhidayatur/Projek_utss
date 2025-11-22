package com.mycompany.projek_uts;
public class Perawat extends TenagaMedis {
    private String nomorhp;
    private String shift;
    private String status;

// constructor
public Perawat(String nama, String id, String umur, String nomorhp, String shift, String status) {
    super(nama, id, umur);
    this.nomorhp = nomorhp;
    this.shift = shift;
    this.status = status;
}

//getter setter
public String getNomorhp() {
    return nomorhp;
}

public void setNomorhp(String nomorhp) {
    this.nomorhp = nomorhp;
}

public String getShift() {
    return shift;
}

public void setShift(String shift) {
    this.shift = shift;
}

public String getStatus() {
    return status;
}

public void setStatus(String status) {
    this.status = status;
}

//method status & info
public void statusPerawat() {
    System.out.println("\n================================");
    System.out.println("Nama Perawat : " + getNama());
    System.out.println("ID           : " + getId());
    System.out.println("Status       : " + status);
    System.out.println("================================");
}

public void infoPerawat() {
    System.out.println("\n================================");
    System.out.println("Nama Perawat : " + getNama());
    System.out.println("ID           : " + getId());
    System.out.println("Umur         : " + getUmur());
    System.out.println("Shift        : " + shift);
    System.out.println("Nomor HP     : " + nomorhp);
    System.out.println("Status       : " + status);
    System.out.println("================================");
}

}
