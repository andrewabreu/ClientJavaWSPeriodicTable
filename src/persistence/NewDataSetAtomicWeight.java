package persistence;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name="NewDataSet")
public class NewDataSetAtomicWeight {
    @Element(name="Table")
    public TableAtomicWeight table;
    
    public TableAtomicWeight getTable(){
        return table;
    }
    
    public void setTable(TableAtomicWeight table){
        this.table = table;
    }      
}
