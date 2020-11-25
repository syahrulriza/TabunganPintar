
package Model;
import Entity.DataPenggunaEntity;
import java.util.ArrayList;
import java.util.Scanner;


public class DataPenggunaModel implements ModelInterface {
    Scanner input=new Scanner(System.in);
    private ArrayList<DataPenggunaEntity> datapenggunaEntityArrayList;

    public DataPenggunaModel() {
        datapenggunaEntityArrayList= new ArrayList<DataPenggunaEntity>();
    }
    
    
    
     @Override
    public void view(){
        if(datapenggunaEntityArrayList.isEmpty()){
            System.out.println("Data Kosong");
        }else{
            for(int a=0;a<datapenggunaEntityArrayList.size();a++){
                    System.out.println("Nama = "+datapenggunaEntityArrayList.get(a).getNama());
                    System.out.println("Jenis Kelamin = "+datapenggunaEntityArrayList.get(a).getJenisKelamin());
                    System.out.println("Email = "+datapenggunaEntityArrayList.get(a).getEmail());
                    System.out.println("");
                    
                    
                    
                    
                }
        }
    }
    
     public int CekData(String Email,String Password){
        int loop=0;
        if(datapenggunaEntityArrayList.size()==0){
            loop=-1;
        }else{
            for(int a=0;a<datapenggunaEntityArrayList.size();a++){
                if(datapenggunaEntityArrayList.get(a).getEmail().equals(Email)&&datapenggunaEntityArrayList.get(a).getPassword().equals(Password)){
                    loop=a;
                    break;
                }else{
                    loop=-2;
                }
            }
        }
        return loop;
    }
     
      public void hapusnama(String nama){
      if(nama.equals(datapenggunaEntityArrayList.get(carinama(nama)).getNama())){
           datapenggunaEntityArrayList.remove(carinama(nama));
            System.out.println("Nama Sudah Dihapus");
      }else{
          System.out.println("Nama Tidak Ditemukan");
      }
   }
      
        public void update(String nama){
       if(carinama(nama)!=-1){     
             System.out.print("Email = ");
                String Email1=input.next();
           datapenggunaEntityArrayList.get(carinama(nama)).setEmail(Email1);
       }else{
           System.out.println("Nama Tidak Ditemukan");
       }
   }
        
        private int carinama(String syahrul07185_nama){
       int indeks=-1;
       
       for(int a=0;a<datapenggunaEntityArrayList.size();a++){
           if(syahrul07185_nama.equals(datapenggunaEntityArrayList.get(a).getNama())){
               indeks=a;
               break;
           }
       }
       return indeks;
   }
        
        public void syahrul07185_InsertDataPengguna(DataPenggunaEntity dataPenggunaEntity){
          
          datapenggunaEntityArrayList.add(dataPenggunaEntity);
      }

   
}
