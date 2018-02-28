package persistence;

import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name="NewDataSet")
public class NewDataSetAtoms {
    @ElementList(inline=true)
    private List<TableAtoms> tables;
    
    public List getListTables(){
        return tables;
    }
    
    public void setListTables(List<TableAtoms> tables){
        this.tables = tables;
    }
}
