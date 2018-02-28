package persistence;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name="NewDataSet")
public class NewDataSetAtomicNumber {
    @Element(name="Table")
    public TableAtomicNumber table;
    
    public TableAtomicNumber getTable(){
        return table;
    }
    
    public void setTable(TableAtomicNumber table){
        this.table = table;
    }
    
}
