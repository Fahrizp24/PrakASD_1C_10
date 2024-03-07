package P3.AOBMahasiswa;

public class DataMahasiswa10 {
    String nama, nim;
    char jenisKelamin;
    double ipk, totalIpk, ipkterbesar;

    double TotalIpk(double ipkMhs){
        totalIpk+=ipkMhs;
        return totalIpk;
    }
    double ipkterbesar(double ipkMhs){
        if (ipkterbesar<ipkMhs) {
            ipkterbesar=ipkMhs;
        }
        return ipkterbesar;
    }
}