package parser;

import clientjavawsperiodictable.PeriodicTable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.simpleframework.xml.Serializer;
import persistence.NewDataSetAtomicNumber;
import persistence.NewDataSetAtomicWeight;
import persistence.NewDataSetAtoms;
import persistence.NewDataSetElementSymbol;
import persistence.TableAtoms;

public class ParserXML {
     
    public static List<String> elementData(String elementName, Serializer s) {
        List<String> elementDataList = new ArrayList<>();
        NewDataSetAtomicNumber NewDataSetAtomicNumber = new NewDataSetAtomicNumber();
        try {
            s.read(NewDataSetAtomicNumber, PeriodicTable.getAtomicNumber(elementName));
        } catch (Exception ex) {
            Logger.getLogger(ParserXML.class.getName()).log(Level.SEVERE, null, ex);
        }
        elementDataList.add(NewDataSetAtomicNumber.getTable().getAtomicNumber());
        elementDataList.add(NewDataSetAtomicNumber.getTable().getElementName());
        elementDataList.add(NewDataSetAtomicNumber.getTable().getSymbol());
        elementDataList.add(NewDataSetAtomicNumber.getTable().getAtomicWeight());
        elementDataList.add(NewDataSetAtomicNumber.getTable().getBoilingPoint());
        elementDataList.add(NewDataSetAtomicNumber.getTable().getIonisationPotential());
        elementDataList.add(NewDataSetAtomicNumber.getTable().getEletroNegativity());
        elementDataList.add(NewDataSetAtomicNumber.getTable().getAtomicRadius());
        elementDataList.add(NewDataSetAtomicNumber.getTable().getMeltingPoint());
        elementDataList.add(NewDataSetAtomicNumber.getTable().getDensity());
        return elementDataList;
    }
    
    public static List<String> elementsList(Serializer s){
        NewDataSetAtoms NewDataSetAtoms = new NewDataSetAtoms();
        try {
            s.read(NewDataSetAtoms, PeriodicTable.getAtoms());
        } catch (Exception ex) {
            Logger.getLogger(ParserXML.class.getName()).log(Level.SEVERE, null, ex);
        }
        List<TableAtoms> listTables = NewDataSetAtoms.getListTables();
        List<String> elementsList = new ArrayList<>();
        for (TableAtoms table : listTables) {
            elementsList.add(table.getElementName());
        }
        return elementsList;
    }
    
    public static String elementSymbol(String elementName, Serializer s){
        NewDataSetElementSymbol NewDataSetElementSymbol = new NewDataSetElementSymbol();
        try {
            s.read(NewDataSetElementSymbol, PeriodicTable.getElementSymbol(elementName));
        } catch (Exception ex) {
            Logger.getLogger(ParserXML.class.getName()).log(Level.SEVERE, null, ex);
        }
        return NewDataSetElementSymbol.getTable().getSymbol();
    }
    
    public static String elementWeight(String elementName, Serializer s) {
        NewDataSetAtomicWeight NewDataSetAtomicWeight = new NewDataSetAtomicWeight();
        try {   
            s.read(NewDataSetAtomicWeight, PeriodicTable.getAtomicWeight(elementName));
        } catch (Exception ex) {
            Logger.getLogger(ParserXML.class.getName()).log(Level.SEVERE, null, ex);
        }
        return NewDataSetAtomicWeight.getTable().getAtomicWeight();         
    }
    
}
