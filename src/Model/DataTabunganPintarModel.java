
package Model;

import Entity.DataTabunganPintarEntity;
import java.util.ArrayList;
public class DataTabunganPintarModel {
     private ArrayList<DataTabunganPintarEntity> datatabunganpintarEntityArrayList;

    public DataTabunganPintarModel() {
        datatabunganpintarEntityArrayList = new ArrayList<DataTabunganPintarEntity>(); 
    }
     
        public void InsertDataTabunganPintar(DataTabunganPintarEntity syahrul07185_dataTabunganPintarEntity){
        datatabunganpintarEntityArrayList.add(syahrul07185_dataTabunganPintarEntity);
        
    }
}
