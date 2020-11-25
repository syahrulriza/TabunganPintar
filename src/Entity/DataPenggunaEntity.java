
package Entity;


public class DataPenggunaEntity {
String email,nama,password,jenisKelamin;

    public DataPenggunaEntity(String email, String nama, String password, String jenisKelamin) {
        this.email = email;
        this.nama = nama;
        this.password = password;
        this.jenisKelamin = jenisKelamin;
    }

    public String getEmail() {
        return email;
    }

    public String getNama() {
        return nama;
    }

    public String getPassword() {
        return password;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setEmail(String email) {
        this.email = email;
    }
 
    
    
}
