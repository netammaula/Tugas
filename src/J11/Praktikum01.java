/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package J11;

/**
 *
 * @author netammaula
 */
public class Praktikum01 {
    public static void main(String[] args)
    {
        String identitas = "nama lengkap / kelas / no";
        System.out.println("Neta Minkhatul Maula / XRPL3 / 31 : "+ identitas);
        
        String x = "Operasi";
        System.out.println("isi variable x : "+ x);
        System.out.println("\""+ x + "\" panjang karakter = "+x.length());
        
        System.out.println("x adalah kosong : " + x.isEmpty());
        
        String y = "";
        System.out.println("isi variable y : "+ y);
        System.out.println("y adalah kosong : " + y.isEmpty());
    }
    
}
