
package Mahasiswa;


public class DataMahasiswa {
    private String nama, nim, semester;
    private double uts, uas, tugas, kehadiran, biaya_bulanan, nilai_akhir;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public double getUts() {
        return uts;
    }

    public void setUts(double uts) {
        this.uts = uts;
    }

    public double getUas() {
        return uas;
    }

    public void setUas(double uas) {
        this.uas = uas;
    }

    public double getTugas() {
        return tugas;
    }

    public void setTugas(double tugas) {
        this.tugas = tugas;
    }

    public double getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(double kehadiran) {
        this.kehadiran = kehadiran;
    }

    public double getBiaya() {
        return biaya_bulanan;
    }

    public void setBiaya(double biaya) {
        this.biaya_bulanan = biaya;
    }
    public double getNilai() {
        return nilai_akhir;
    }

    public void setNilai(double nilai) {
        this.biaya_bulanan = nilai;
    }
    
    public double getNilaiAkhir(){
        return nilai_akhir = ((0.1 * kehadiran) +(0.2 * tugas) + (0.3 * uts) + (0.4* uas));
    }
    
    public String getGrade(){
        if (getNilaiAkhir() >= 80){
            return "A";
        }
        else if (getNilaiAkhir() >= 70){
            return "B";
    } else if (getNilaiAkhir() >= 60){
            return "C";
    } else if (getNilaiAkhir() >= 50){
            return "D";
    } else{
            return "A";
    }
}
    
public String getStatusLulus(){
    if (getGrade ().equalsIgnoreCase("A") || getGrade().equalsIgnoreCase("B")|| getGrade().equalsIgnoreCase("C")){
        return "Lulus";
    } else {
        return "Tidak Lulus";
    }
}
}
