package persistence;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name="Table")
public class TableAtomicWeight {
    @Element(name="AtomicWeight")
    private String atomicWeight;
    
    public void setAtomicWeight(String atomicWeight){
        this.atomicWeight=atomicWeight;
    }
    
    public String getAtomicWeight(){
        return atomicWeight;
    }    
}
