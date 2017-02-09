/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_2;

/**
 *  NIM = 1301150012
 *  Nama = Yusuf Yunadian
 */
public class Mahasiswa {
        private String NIM, Nama, status;
    private char nilai[];
    private int i;
 
 
 public Mahasiswa(){
     status = "Tidak lulus";
     this.i = 0;
     nilai = new char[10];
 }
 
 public Mahasiswa(String Nim, String Nama) {
     this.NIM = Nim;
     this.Nama = Nama;
     this.status = "Tidak lulus";
     this.i = 0;
     nilai = new char[10];
 }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public char getNilai(int i) {
        return nilai[i];
    }

    public void setNilai(char[] nilai) {
        this.nilai = nilai;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
 
    public void addNilai(char nilai){
        if (i< 10) {
            this.nilai[i]= nilai;
            i++;
        }
    }
public String toString(){
    String Mahasiswa;
    Mahasiswa = NIM+", "+Nama+", "+status+", "+" Nilai= ";
    for (int a = 0; a<i; a++){
        Mahasiswa = Mahasiswa + nilai[a] +", ";
    }
    return Mahasiswa;
}

public char cekNilai(Mahasiswa m) {
    char j = 0;
    for (char k = 'A'; k < 'E'; k++){
        for (int l = 0; l < i; l++){
            if (nilai[l]==k){
                for (int n=0; n<m.i; n++){
                    if(m.nilai[n]==k){
                        return k;
                    }
                }
            }
        }
    }
    return j;
}
    
}
