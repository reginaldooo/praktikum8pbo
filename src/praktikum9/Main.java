/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum9;
import java.util.ArrayList;
/**
 *
 * @author REGIN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
    System.out.println("Nama        : Muhammad Farrel Reginaldo Ahnaf");
    System.out.println("NIM         : 215150607111017");
    Manusia mans1 = new Manusia("Prima", "3923842934", false, true);
    Manusia mans2 = new Manusia("Bayu", "3923842935", true, true);
    Manusia mans3 = new Manusia("Faiz", "3923842936", true, false);
    ArrayList<Manusia> output = new ArrayList<Manusia>();
    output.add(mans1);
    output.add(mans2);
    output.add(mans3);

    System.out.println("========== DAFTAR MANUSIA ==========");
        for(int i=0;i<output.size();i++){
            System.out.println(output.get(i).toString());
        }
    System.out.println("=====================================");

    MahasiswaFilkom mahs1 = new MahasiswaFilkom("Faishal", "351923848239", true, false, "195150200111018", 3.9);
    MahasiswaFilkom mahs2 = new MahasiswaFilkom("Syahidah", "351923848233", false, true, "185150300111019", 3.7);
    MahasiswaFilkom mahs3 = new MahasiswaFilkom("Hilyah", "351923848223", false, false, "175150400111020", 3.2);
    ArrayList<MahasiswaFilkom> output1 = new ArrayList<MahasiswaFilkom>();
    output1.add(mahs1);
    output1.add(mahs2);
    output1.add(mahs3);

    System.out.println();
    System.out.println("====== DAFTAR MAHASISWA FILKOM ======");
        for(int i=0;i<output1.size();i++){
            System.out.println(output1.get(i).toString());
        }
    System.out.println("=====================================");

    Pekerja pekj1 = new Pekerja("Aba", "1234567890", true, true, 7, 22, "131717490");
    Pekerja pekj2 = new Pekerja("Abi", "1234567891", true, false, 13, 28, "451717512");
    Pekerja pekj3 = new Pekerja("Abu", "1234567892", true, true, 10, 26, "351717123");
    ArrayList<Pekerja> output2 = new ArrayList<Pekerja>();
    output2.add(pekj1);
    output2.add(pekj2);
    output2.add(pekj3);

    System.out.println();
    System.out.println("========== DAFTAR PEKERJA ==========");
        for(int i=0;i<output2.size();i++){
            System.out.println(output2.get(i).toString());
        }
    System.out.println("=====================================");

    Manajer mnj1 = new Manajer("Santa", "2345678900", false, true,9, 20,"204837283700", 1500);
    Manajer mnj2 = new Manajer("Santi", "2345678901", true, false,1, 1,"204837283800", 1600);
    Manajer mnj3 = new Manajer("Siti", "2345678902", true, true,2, 1,"204837283900", 1700);
    ArrayList<Manajer> output3 = new ArrayList<Manajer>();
    output3.add(mnj1);
    output3.add(mnj2);
    output3.add(mnj3);

    System.out.println();
    System.out.println("=========== DAFTAR MANAJER ==========");
        for(int i=0;i<output3.size();i++){
            System.out.println(output3.get(i).toString());
        }
    System.out.println("=====================================");

    }
}
