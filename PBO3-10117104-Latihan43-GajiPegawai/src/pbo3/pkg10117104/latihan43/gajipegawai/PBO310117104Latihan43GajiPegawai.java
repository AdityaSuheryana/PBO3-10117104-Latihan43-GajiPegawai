/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117104.latihan43.gajipegawai;


/**
 *
 * @author
 * Nama : Aditya Suheryana
 * Kelas : IF-3/PBO3
 * Nim : 10117104
 * Deskripsi Program : Menampilkan gaji pegawai lengkap dengan nama,
 * alamat dan lain lain
 */
public class PBO310117104Latihan43GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GajiPegawai gp = new GajiPegawai();
        gp.setNama("Rizki Adam Kurniawan");
        gp.setAlamat("Jalan Semar dlm 4 No 72/66");
        gp.setUangTransport(250000);
        gp.setUangTunjangan(300000);
        gp.setGajiPokok(4500000);
        
        gp.totalGaji(gp.getUangTransport(), gp.getUangTunjangan(),
                gp.getGajiPokok()); 
        System.out.println("### Data Gaji Karyawan PT.KAKATU ### ");
        System.out.println("-------------------------------------");
        gp.tampilData(gp.getNama(),gp.getAlamat(),gp.getUangTransport(),
                gp.getUangTunjangan(),gp.getGajiPokok(),gp.totalGaji
        (gp.getUangTransport(), gp.getUangTunjangan(),gp.getGajiPokok()));
        
        
       
        
    }   
    
}
