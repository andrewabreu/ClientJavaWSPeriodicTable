package persistence;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name="Table")
public class TableElementSymbol {
    @Element(name="Symbol")
    private String symbol;
    
    public void setSymbol(String symbol){
        this.symbol=symbol;
    }
    
    public String getSymbol(){
        return symbol;
    }
}
