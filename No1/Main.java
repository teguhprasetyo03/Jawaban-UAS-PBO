package UASPBO.No1;

import java.util.*;

abstract class Resto{
    String nama,variantoping,varianukuran,varianpinggiran;
    int hrg_toping=0, hrg_ukuran=0, hrg_pinggiran= 0,
            toping = 0, ukuran = 0, pinggiran = 0;
    int biaya;
    public abstract void toping();
    public abstract void ukuran();
    public abstract void pinggiran();
    public abstract void cetakData();
    public abstract void cetakTotal();

}

 class Pizza extends Resto{

     public static Scanner input=new Scanner(System.in);

     @Override
     public void cetakData() {
         System.out.println("-------------------------------------------");
         System.out.println("               PIZZA HOTARU                ");
         System.out.println("         Terkenal Sejak Tahun 1998         ");
         System.out.println("Input Data Pesanan");
         System.out.print("Nama Pemesan : ");
         nama = input.next();
         System.out.println();
     }

     @Override
     public void toping() {

         System.out.println("Daftar Toping/Rasa Pizza");
         System.out.println("1. Meat Lovers (Rp.84.000)");
         System.out.println("2. Super Supreme(Rp.84.000) \t");
         System.out.println("3. American Favorite(Rp.74.000)");

         System.out.print("Topping Pilihan Anda =  ");
         toping = Integer.parseInt(input.next());

         System.out.println();
         if (toping==1) {
            hrg_toping =  84000;
         variantoping = "Meat Lovers";
         } else if (toping==2) {
           hrg_toping =  84000;
          variantoping = "Super Supreme";
         } else if (toping==3) {
             hrg_toping =  740000;
           variantoping = "American Favorite";
         }
     }

     @Override
     public void pinggiran() {
         System.out.println("Daftar Pinggiran Pizza");
         System.out.println("1. Original Crust (+Rp.0)");
         System.out.println("2. Stuffed Crust (+Rp.22.000) \t");
         System.out.println("3. Sausage Crust (+Rp.22.000)");
         System.out.println("4. Chessy Bites (+Rp.32.000)");

         System.out.print("Pinggiran  Pilihan Anda =  ");
         pinggiran = Integer.parseInt(input.next());

         System.out.println();
         if (pinggiran==1) {
             hrg_pinggiran =  0;
           varianpinggiran = "Original Crust";
         } else if (pinggiran==2) {
             hrg_pinggiran =  22000;
            varianpinggiran = "Stuffed Crust";
         } else if (pinggiran==3) {
             hrg_pinggiran =  22000;
        varianpinggiran  = "Sausage Crust";
         } else if (pinggiran==4) {
             hrg_pinggiran =  32000;
          varianpinggiran = "Chessy Bites";
         }

     }

     @Override
     public void ukuran() {
         System.out.println("Daftar Ukuran Pizza");
         System.out.println("1. Reguler 8slices (+Rp.0)");
         System.out.println("2. Jumbo 10slices (+Rp.40.000)");

         System.out.print("Ukuran Pilihan Anda =  ");
         ukuran = Integer.parseInt(input.next());
         System.out.println();

         if (ukuran==1) {
             hrg_ukuran= 0;
          varianukuran = "Reguler";
         } else if (ukuran==2) {
             hrg_ukuran =  40000;
          varianukuran= "Jumbo";
         }
     }

     @Override
     public void cetakTotal() {
         biaya = hrg_toping +  hrg_pinggiran + hrg_ukuran;
         System.out.println("============Data Pesanan==========");
         System.out.println("Nama Pemesan = " + nama);
         System.out.println("Pizza Yang Dipesan = "+ variantoping  + "/"  + varianpinggiran + "/" +  varianukuran);
         System.out.println("Total Biaya Adalah = Rp." + biaya);
         System.out.println("==================================");
     }
 }

class Utama extends Pizza {
    public static void main(String[] args) {

        Pizza pizza = new Pizza();

        pizza.cetakData();
        pizza.toping();
        pizza.pinggiran();
        pizza.ukuran();
        pizza.cetakTotal();

    }
}
