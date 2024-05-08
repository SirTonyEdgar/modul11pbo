package modul11pbo;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Mahasiswa {
    private String nim;
    private String nama;
    private Date tgl_lahir;
    private double IPK;
    
    public void setNim(String nim) throws Exception{
        boolean allNum = true;
        if (nim.isEmpty()){
            throw new Exception("NIM tidak boleh kosong");
        } else if (nim.length() != 10 ){
            throw new Exception("NIM harus 10 digit");
        } 
        this.nim = "" + Integer.parseInt(nim);
     
    }
    
    public void setNama(String nama){
        if (nama == ""){
            throw new Exception("Nama tidak boleh kosong");
        } else if (nama){
            throw new Exception("Nama minimal 8 karakter");
        }
    }
    
    public void setTglLahir(String tgl_lahir) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        this.tgl_lahir = sdf.parse(tgl_lahir);
    }
    
    public void setIPK (double ipk){
        if (IPK ){
            throw new Exception("")
        }
    }
    
    public String getNim() {
        return nim;
    }
    
    public String getNama(){
        return nama;
    }
    
    public Date getTglLahir(){
        return tgl_lahir;
    }
    
    public double getIPK(){
        return IPK;
    }
}
