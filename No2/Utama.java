package UASPBO.No2;

import java.util.*;


public class Utama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // membuat object segitiga
        Segitiga segitiga = new Segitiga();

        // buat object prisma segitiga
        PrismaSegitiga prismaSegitiga = new PrismaSegitiga();
        System.out.println("====HITUNG LUAS DAN KELILING SEGITIGA====");
        System.out.println("Masukkan Alas : ");
        String a = input.next();
        segitiga.setAlas(Integer.parseInt(a));
        System.out.println("Masukkan Tinggi : ");
        String t = input.next();
        segitiga.setTinggi(Integer.parseInt(t));

        System.out.println("Alas Segitiga 1 = "+segitiga.getAlas());
        System.out.println("Alas Segitiga 2 = "+segitiga.getAlas());
        System.out.println("Alas Segitiga 3 = "+segitiga.getAlas());
        System.out.println("Tinggi Segitiga = "+segitiga.getTinggi());
        System.out.println("Luas Segitiga = "+segitiga.hitungLuas());
        System.out.println("Keliling Segitiga = "+segitiga.hitungKeliling());

        System.out.println();

        System.out.println("====HITUNG LUAS DAN VOLUME PRISMA SEGITIGA====");
        System.out.print("Masukkan Keliling Alas : ");
        String tp = input.next();
        prismaSegitiga.setK_alas(Integer.parseInt(tp));
        System.out.println("Keliling Alas adalah = "+prismaSegitiga.getK_alas());
        System.out.println("Luas Permukaan Prisma = "+prismaSegitiga.hitungLuasPermukaan());
        System.out.println("Hitung Volume Prisma = "+segitiga.hitungVolumePrisma());

    }
}
class Segitiga{
    private int alas;
    private int tinggi;

    public void setAlas(int alas)
    {
        this.alas = alas;
    }
    public void setTinggi(int tinggi)
    {
        this.tinggi = tinggi;
    }
    public int getAlas()
    {
        return alas;
    }
    public int getTinggi()
    {
        return tinggi;
    }

    public double hitungLuas()
    {
        double luas;
        luas=(alas*tinggi)/2;
        return luas;
    }

    public double hitungKeliling()
    {
        double keliling;
        keliling=alas*3;
        return keliling;
    }

    public double hitungVolumePrisma(){
        double volume;
        volume = alas*tinggi;
        return volume;
    }
}


class PrismaSegitiga extends Segitiga{
    public int getK_alas() {
        return k_alas;
    }

    public void setK_alas(int k_alas) {
        this.k_alas = k_alas;
    }

    int k_alas;

    public double hitungLuasPermukaan(){
            double LuasP;
            LuasP = 2 * getAlas() + k_alas * getTinggi();
            return LuasP;
    }
}

