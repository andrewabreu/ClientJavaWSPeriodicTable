package persistence;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name="Table")
public class TableAtoms {
    @Element(name="ElementName")
    private String elementName;
    
    public String getElementName() {
        return elementName;
    }

    public void setElementName(String elementName) {
        this.elementName = elementName;
    }
    
}
