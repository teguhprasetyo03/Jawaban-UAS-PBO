package UASPBO.No3;

import java.util.Scanner;

abstract class gudang implements pergudangan {
    @Override
    public abstract void setData();
    @Override
    public abstract void tampil();
    public static Scanner in=new Scanner(System.in);
    public static Scanner str=new Scanner(System.in);
    public static void main(String[] args) {
        int menu=0,z=0,a,cari;
        barang[] data=new barang[1024];
        data[z]=new barang();
        data[z].setId();
        while(menu!=6){
            System.out.print("menu...\n1.input\t\t2.view\n3.search\t4.update\n5.delete\t6.exit\n : ");
            menu=data[0].in.nextInt();
            if(menu==1){
                z++;
                data[z]=new barang();
                data[z].setId(data[z-1].getId());
                data[z].setData();
            }else if(menu==2){
                if(z<1)
                    System.out.println("data kosong");
                else{
                    a=0;
                    while(a<z){
                        a++;
                        System.out.println("---"+a+"---");
                        data[a].tampil();
                    }
                }
            }else if(menu==3 || menu==4 || menu==5){
                System.out.print("masukkan id barang : ");
                cari=data[0].in.nextInt();
                a=1;
                while(a<=z){
                    if(data[a].getId()==cari)
                        break;
                    a++;
                }
                if(a<=z){
                    if(menu==3)
                        data[a].tampil();
                    else if(menu==4){
                        data[a].tampil();
                        data[a].setData();
                    }
                    else{
                        while(a<z){
                            data[a]=data[a+1];
                            a++;
                        }
                        z--;
                        System.out.println("data "+cari+" berhasil dihapus");
                    }
                }
                else
                    System.out.println("data tidak ditemukan");
            }else if(menu==6)
                System.out.println("keluar...");
            else
                System.out.println("menu ilegal");
        }
    }

}

interface pergudangan{
    public int getId();
    public void setId();
    public void setId(int id);
    public void setData();
    public void tampil();
}

class barang extends gudang{
    int idBarang,harga,jumlah,total;
    String nama;
    @Override
    public void setData(){
        System.out.print("Masukkan Nama Barang  : ");
        this.nama=str.nextLine();
        System.out.print("Masukkan Harga Barang : ");
        this.harga=in.nextInt();
        System.out.print("Masukkan Jumlah Barang: ");
        this.jumlah=in.nextInt();
        this.total=this.harga*this.jumlah;
    }
    @Override
    public void tampil(){
        System.out.println("Id Barang    : "+this.idBarang);
        System.out.println("Nama Barang  : "+this.nama);
        System.out.println("Harga Barang : "+this.harga);
        System.out.println("Jumlah Barang: "+this.jumlah);
        System.out.println("Total        : "+this.total);
    }
    @Override
    public int getId(){
        return this.idBarang;
    }
    @Override
    public void setId(){
        this.idBarang=153400;
    }
    @Override
    public void setId(int id){
        this.idBarang=id+1;
    }
}