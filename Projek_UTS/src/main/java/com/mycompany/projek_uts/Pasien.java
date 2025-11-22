package com.mycompany.projek_uts;
public class Pasien {
    private String nama;
    private String id;
    private String umur;
    private String nomorhp;
    private String penyakit;
    private Dokter dokter;

//constructor
public Pasien(String nama, String id, String umur, String nomorhp, String penyakit, Dokter dokter) {
    this.nama = nama;
    this.id = id;
    this.umur = umur;
    this.nomorhp = nomorhp;
    this.penyakit = penyakit;
    this.dokter = dokter;
}

//getter setter
public String getNama() {
    return nama;
}

public String getId() {
    return id;
}

public String getUmur() {
    return umur;
}

public String getNomorhp() {
    return nomorhp;
}

public String getPenyakit() {
    return penyakit;
}

public Dokter getDokter() {
    return dokter;
}

public void setNama(String nama) {
    this.nama = nama;
}

public void setId(String id) {
    this.id = id;
}

public void setUmur(String umur) {
    this.umur = umur;
}

public void setNomorhp(String nomorhp) {
    this.nomorhp = nomorhp;
}

public void setPenyakit(String penyakit) {
    this.penyakit = penyakit;
}

public void setDokter(Dokter dokter) {
    this.dokter = dokter;
}

//method info & status
public void infoPasien() {
    System.out.println("\n=================================");
    System.out.println("Nama Pasien : " + nama);
    System.out.println("ID          : " + id);
    System.out.println("Umur        : " + umur);
    System.out.println("Nomor HP    : " + nomorhp);
    System.out.println("Penyakit    : " + penyakit);
    System.out.println("=================================");
}

public void statusPasien() {
    System.out.println("\n=================================");
    System.out.println("Nama Pasien : " + nama);
    System.out.println("ID          : " + id);
    System.out.println("Penyakit    : " + penyakit);
    System.out.println("=================================");
    System.out.println("Ditangani oleh");
    dokter.infoDokter();
}

}
