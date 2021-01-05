package UASPBO.No3;

import java.util.Scanner;

abstract class Hotel {

    String nama,jenis,tanggal;
    int harga,lama,total;

    public abstract void setMenu();
    public abstract void setTanggal();
    public abstract int setHarga(int harga);
    public abstract int total(int harga,int lama);
    public abstract void getData();


}

class Pembelian extends Hotel{


    @Override
    public void setMenu() {

        System.out.println("Pilih jenis kamar ");
        System.out.println("1. Kamar deluxe Rp.450.000/night");
        System.out.println("2. Kamar two bedroom Rp.250.000/night");
    }

    @Override
    public void setTanggal() {
        System.out.println("Tanggal (dd/mm/yyyy) " + this.tanggal);
    }

    @Override
    public int setHarga(int harga) {
        return harga;
    }

    @Override
    public int total(int harga, int lama) {
        return harga * lama;
    }

    @Override
    public void getData() {
        System.out.println("Nama Pelanggan : " + this.nama);
        System.out.println("Jenis Kamar : " + this.jenis);
        System.out.println("Tanggal Masuk : " + this.tanggal);
        System.out.println("Lama Menginap : " + this.lama);
        System.out.println("Harga Kamar : " + this.harga);
        System.out.println("Total Pembayaran : " + this.total);


    }



}
class Pengembalian extends Hotel {


    String rekening;
    @Override
    public void setMenu() {

        System.out.println("Pilih jenis kamar ");
        System.out.println("1. Kamar deluxe Rp.450.000/night");
        System.out.println("2. Kamar two bedroom Rp.250.000/night");
    }

    @Override
    public void setTanggal() {
        System.out.println("Tanggal (dd/mm/yyyy) "+this.tanggal);
    }
    @Override
    public int setHarga(int harga) {
        return harga;
    }

    @Override
    public int total(int harga, int lama) {
        return harga * lama;
    }

    @Override
    public void getData() {

        System.out.println("Nama Pelanggan : " + this.nama);
        System.out.println("Jenis Kamar : " + this.jenis);
        System.out.println("Tanggal Menginap : " + this.tanggal);
        System.out.println("Lama Menginap : " + this.lama);
        System.out.println("Harga Kamar : " + this.harga);
        System.out.println("Total Refund : " + this.total);
        System.out.println("No Rekening : " + this.rekening);
        System.out.println("Note : Batas penembalian 14 hari kerja " );


    }
}

class Ubah extends Hotel{


    @Override
    public void setMenu() {

        System.out.println("Pilih jenis kamar ");
        System.out.println("1. Kamar deluxe Rp.450.000/night");
        System.out.println("2. Kamar two bedroom Rp.250.000/night");
    }

    @Override
    public void setTanggal() {

        System.out.println("Tanggal (dd/mm/yyyy) " + this.tanggal);
    }
    public String setTanggal(String message) {

        return message;
    }

    @Override
    public int setHarga(int harga) {
        return harga;
    }

    @Override
    public int total(int harga, int lama) {
        return harga * lama;
    }

    @Override
    public void getData() {

        System.out.println("Nama Pelanggan : " + this.nama);
        System.out.println("Jenis Kamar : " + this.jenis);
        System.out.println("Ganti Tanggal Menginap : " + this.tanggal);
        System.out.println("Tanggal Menginap : " + this.tanggal);
        System.out.println("Lama Menginap : " + this.lama);
        System.out.println("Harga Kamar : " + this.harga);
        System.out.println("Total Refund : " + this.total);
        System.out.println("Berhasil di ubah " );

    }
}



public class Main {

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        Pembelian pembelian = new Pembelian();
        Pengembalian pengembalian = new Pengembalian();
        Ubah ubah = new Ubah();

        boolean a = true;


        while (a) {
            System.out.println("selamat datang di hotel 86");
            System.out.println("1. Booking");
            System.out.println("2. Refund");
            System.out.println("3. Ubah Jadwal");
            System.out.println("silahkan pilih pilihan anda");
            int pilih = input.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("Masukan nama anda : ");
                    pembelian.nama = input.next();
                    pembelian.setMenu();
                    System.out.println("silahkan pilih pilihan anda");
                    int pil1 = input.nextInt();

                    if (pil1 == 1) {
                        pembelian.jenis = "Deluxe";
                        pembelian.harga = pembelian.setHarga(450000);
                    } else if(pil1 == 2){
                        pembelian.jenis = "Two bedroom";
                        pembelian.harga = pembelian.setHarga(250000);
                    }else {
                        System.out.println("pilihan tidak ada");

                    }

                    System.out.print("Masukan tanggal (dd/mm/yyyy): ");
                    pembelian.tanggal = input.next();
                    System.out.print("lama menginap : ");
                    int lama = input.nextInt();
                    pembelian.lama = lama;

                    System.out.println("total pembayaran : " + pembelian.total(pembelian.harga, lama));
                    pembelian.total = pembelian.total(pembelian.harga, lama);

                    System.out.println("masukan nominal pembayaran : ");
                    int nominal = input.nextInt();

                    if (nominal < pembelian.total(pembelian.harga, lama)) {

                        System.out.println("pembayaran gagal");

                    } else {

                        System.out.println("pembayaran berhasil");
                    }

                    pembelian.getData();
                    break;
                case 2:

                    System.out.println("Masukan nama anda : ");
                    pengembalian.nama = input.next();
                    pengembalian.setMenu();
                    System.out.println("silahkan pilih pilihan anda");
                    int pil2 = input.nextInt();
                    if (pil2 == 1) {
                        pengembalian.jenis = "Deluxe";
                        pengembalian.harga = pengembalian.setHarga(450000);
                    } else if (pil2 == 2){
                        pengembalian.jenis = "Two bedroom";
                        pengembalian.harga = pengembalian.setHarga(250000);
                    }else {
                        System.out.println("pilihan tidak ada");

                    }
                    a = false;
                    System.out.print("Masukan tanggal (dd/mm/yyyy): ");
                    pengembalian.tanggal = input.next();
                    System.out.print("lama menginap : ");
                    int lama1 = input.nextInt();
                    pengembalian.lama = lama1;

                    System.out.println("total pembayaran : " + pengembalian.total(pengembalian.harga, lama1));
                    pengembalian.total = pengembalian.total(pengembalian.harga, lama1);

                    System.out.println("masukan nomer rekening : ");
                    String rekening = input.next();
                    pengembalian.rekening = rekening;

                    if (rekening.isEmpty()) {
                        System.out.println("Refund Gagal");
                    } else {

                        System.out.println("Refund Berhasil");
                    }

                    pengembalian.getData();
                    break;
                case 3:
                    System.out.println("Masukan nama anda : ");
                    ubah.nama = input.next();
                    ubah.setMenu();
                    System.out.println("silahkan pilih pilihan anda");
                    int pil3 = input.nextInt();
                    if (pil3 == 1) {
                        ubah.jenis = "Deluxe";
                        ubah.harga = ubah.setHarga(450000);
                    } else if(pil3 == 2){
                        ubah.jenis = "Two bedroom";
                        ubah.harga = pengembalian.setHarga(250000);
                    }else {
                        System.out.println("pilihan tidak ada");
                    }
                    a = false;
                    System.out.print("Masukan tanggal Menginap(dd/mm/yyyy): ");
                    ubah.tanggal = input.next();
                    System.out.print("ganti Tanggal Menginap(dd/mm/yyyy): ");
                    String tanggal3 = input.next();
                    ubah.tanggal = ubah.setTanggal(tanggal3);

                    System.out.print("lama menginap : ");
                    int lama2 = input.nextInt();
                    ubah.lama = lama2;

                    System.out.println("total pembayaran : " + ubah.total(ubah.harga, lama2));
                    ubah.total = ubah.total(ubah.harga, lama2);


                    ubah.getData();

                default:
                    System.out.println("pilihan tidak ada");
            }
        }
    }
}
