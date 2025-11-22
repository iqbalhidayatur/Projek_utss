package com.mycompany.projek_uts;
public class TenagaMedis {
    private String nama;
    private String id;
    private String umur;
    
    //constructor
    public TenagaMedis() {
        this.nama = "Tidak Diketahui";
        this.id = "0000";
        this.umur = "00";
    }

    public TenagaMedis(String nama, String id, String umur) {
        this.nama = nama;
        this.id = id;
        this.umur = umur;
    }
    
    //method info
    public void InfoTenagaMedis(){
        System.out.println("Nama : " + nama);
        System.out.println("ID : " + id);
        System.out.println("Umur : " + umur);
    }
    
    //getter setter
    public String getNama(){
        return nama;
    }
    
    public String getId(){
        return id;
    }
    
    public String getUmur(){
        return umur;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public void setUmur(String umur){
        this.umur = umur;
    }
    
}
