package com.mycompany.projek_uts;
public class Dokter extends TenagaMedis {
    private String nomorhp;
    private String shift;
    private String spesialis;
    private String status;

//constructor    
public Dokter(String nama, String id, String umur, String nomorhp, String spesialis, String status, String shift) {
    super(nama, id, umur);
    this.spesialis = spesialis;
    this.status = status;
    this.shift = shift;
    this.nomorhp = nomorhp;
}

//getter setter
public String getSpesialis() {
    return spesialis;
}

public void setSpesialis(String spesialis) {
    this.spesialis = spesialis;
}

public String getShift() {
    return shift;
}

public void setShift(String shift) {
    this.shift = shift;
}

public String getNomorhp() {
    return nomorhp;
}

public void setNomorhp(String nomorhp) {
    this.nomorhp = nomorhp;
}

public String getStatus() {
    return status;
}

public void setStatus(String status) {
    this.status = status;
}

//method status & info
public void statusDokter() {
    System.out.println("\n================================");
    System.out.println("Nama Dokter : " + getNama());
    System.out.println("ID          : " + getId());
    System.out.println("Spesialis   : " + spesialis);
    System.out.println("Status      : " + status);
    System.out.println("================================");
}

public void infoDokter() {
    System.out.println("\n================================");
    System.out.println("Nama Dokter : " + getNama());
    System.out.println("ID          : " + getId());
    System.out.println("Umur        : " + getUmur());
    System.out.println("Spesialis   : " + spesialis);
    System.out.println("Shift       : " + shift);
    System.out.println("Nomor HP    : " + nomorhp);
    System.out.println("Status      : " + status);
    System.out.println("================================");
}

}
