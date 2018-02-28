package persistence;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name="NewDataSet")
public class NewDataSetElementSymbol {
    @Element(name="Table")
    public TableElementSymbol table;
    
    public TableElementSymbol getTable(){
        return table;
    }
    
    public void setTable(TableElementSymbol table){
        this.table = table;
    }    
}
