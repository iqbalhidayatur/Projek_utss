package com.mycompany.projek_uts;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
//deklar array
static ArrayList<Pasien> listPasien = new ArrayList<>();
static ArrayList<Dokter> listDokter = new ArrayList<>();
static ArrayList<Perawat> listPerawat = new ArrayList<>();

public static void main(String[] args) {
    
    tambahDataAwal(); //memasukkan data awal

    Scanner input = new Scanner(System.in);
    int pilihan;

    while (true) {
        //main menu
        System.out.println("\n=====================================");
        System.out.println("             Main Menu");
        System.out.println("=====================================");
        System.out.println("1. Tambah Data");
        System.out.println("2. Tampilkan Data");
        System.out.println("3. Cari Data");
        System.out.println("4. Ubah Data");
        System.out.println("5. Cek Status Data");
        System.out.println("6. Keluar");
        System.out.println("=====================================");
        System.out.print("Pilih menu (1-6): ");
        pilihan = input.nextInt();
        input.nextLine();
        
        //method switch/pilihan
        switch (pilihan) {

            case 1 -> tambahData(input);

            case 2 -> tampilkanData(input);

            case 3 -> cariData(input);

            case 4 -> ubahData(input);

            case 5 -> cekStatus();

            case 6 -> {
                return;
            }
        }
    }
}

//data awal
static void tambahDataAwal() {

    Dokter d1 = new Dokter("Dr. Andi", "D01", "45", "0812345678", "Bedah", "Aktif", "Malam");
    Dokter d2 = new Dokter("Dr. Siti", "D02", "40", "0887654321", "Anak", "Aktif", "Siang");

    listDokter.add(d1);
    listDokter.add(d2);

    Perawat p1 = new Perawat("Rina", "PR01", "30", "081111111", "Pagi", "Aktif");
    Perawat p2 = new Perawat("Rani", "PR02", "32", "082222222", "Malam", "Aktif");

    listPerawat.add(p1);
    listPerawat.add(p2);

    Pasien ps1 = new Pasien("Iqbal", "PS01", "25", "083333333", "Demam", d1);
    Pasien ps2 = new Pasien("Laila", "PS02", "31", "084444444", "Asma", d2);

    listPasien.add(ps1);
    listPasien.add(ps2);
}

//tambah data
static void tambahData(Scanner input) {

    System.out.println("\n=====================================");
    System.out.println("1. Tambah Data Pasien");
    System.out.println("2. Tambah Data Dokter");
    System.out.println("3. Tambah Data Perawat");
    System.out.println("=====================================");
    System.out.print("Pilih menu (1-3): ");
    int p = input.nextInt();
    input.nextLine();
    
    //form data
    if (p == 1) {
        System.out.print("\nNama Pasien: ");
        String nama = input.nextLine();
        System.out.print("ID (PS00): ");
        String id = input.nextLine();
        System.out.print("Umur: ");
        String umur = input.nextLine();
        System.out.print("Nomor HP: ");
        String hp = input.nextLine();
        System.out.print("Penyakit: ");
        String penyakit = input.nextLine();

        System.out.println("Pilih dokter penanggung jawab");
        for (int i = 0; i < listDokter.size(); i++) {
            System.out.println((i + 1) + ". " + listDokter.get(i).getNama());
        }

        System.out.print("Pilih nomor dokter: ");
        int pilihDok = input.nextInt();
        input.nextLine();

        Dokter d = listDokter.get(pilihDok - 1);

        Pasien pasien = new Pasien(nama, id, umur, hp, penyakit, d);
        listPasien.add(pasien);
        System.out.println("Data pasien ditambahkan");
    }

    if (p == 2) {
        System.out.print("\nNama dokter: ");
        String nama = input.nextLine();
        System.out.print("ID (D00): ");
        String id = input.nextLine();
        System.out.print("Umur: ");
        String umur = input.nextLine();
        System.out.print("Nomor HP: ");
        String nomorhp = input.nextLine();
        System.out.print("Spesialis: ");
        String spesialis = input.nextLine();
        System.out.print("Status: ");
        String status = input.nextLine();
        System.out.print("Shift: ");
        String shift = input.nextLine();

        Dokter d = new Dokter(nama, id, umur, nomorhp, spesialis, status, shift);
        listDokter.add(d);
        System.out.println("Data dokter ditambahkan");
    }

    if (p == 3) {
        System.out.print("\nNama perawat: ");
        String nama = input.nextLine();
        System.out.print("ID (PR00): ");
        String id = input.nextLine();
        System.out.print("Umur: ");
        String umur = input.nextLine();
        System.out.print("Nomor HP: ");
        String hp = input.nextLine();
        System.out.print("Shift: ");
        String shift = input.nextLine();
        System.out.print("Status: ");
        String status = input.nextLine();

        Perawat pwt = new Perawat(nama, id, umur, hp, shift, status);
        listPerawat.add(pwt);
        System.out.println("Data perawat ditambahkan");
    }
}

//tampilkan data
static void tampilkanData(Scanner input) {

    System.out.println("\n=====================================");
    System.out.println("1. Tampilkan Data Pasien");
    System.out.println("2. Tampilkan Data Dokter");
    System.out.println("3. Tampilkan Data Perawat");
    System.out.println("=====================================");
    System.out.print("Pilih menu (1-3): ");
    int p = input.nextInt();
    input.nextLine();

    if (p == 1) {
        for (Pasien ps : listPasien) ps.infoPasien();
    }

    if (p == 2) {
        for (Dokter d : listDokter) d.infoDokter();
    }

    if (p == 3) {
        for (Perawat pr : listPerawat) pr.infoPerawat();
    }
}

//cari data
static void cariData(Scanner input) {

    System.out.print("\nMasukkan ID: ");
    String id = input.nextLine();

    for (Pasien p : listPasien)
        if (p.getId().equals(id)) p.infoPasien();

    for (Dokter d : listDokter)
        if (d.getId().equals(id)) d.infoDokter();

    for (Perawat r : listPerawat)
        if (r.getId().equals(id)) r.infoPerawat();
}

//edit data
static void ubahData(Scanner input) {

    System.out.print("\nMasukkan ID yang diubah: ");
    String id = input.nextLine();

    for (Pasien p : listPasien)
        if (p.getId().equals(id)) {
            System.out.print("Nama baru: ");
            p.setNama(input.nextLine());
            System.out.println("Data pasien diubah");
        }
}

//cek status
static void cekStatus() {

    for (Dokter d : listDokter) d.statusDokter();
    for (Perawat p : listPerawat) p.statusPerawat();
    for (Pasien ps : listPasien) ps.statusPasien();
}

}
