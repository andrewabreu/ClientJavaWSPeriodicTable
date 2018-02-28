package ui;

import java.util.List;
import javax.swing.JComboBox;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;
import parser.ParserXML;

public class ClientJavaWSPeriodicTableGUI extends javax.swing.JFrame {
    
    private Serializer s;
    private String elementSelected;
    private List<String> elementList;
    
    public ClientJavaWSPeriodicTableGUI() {
        initComponents();
        s = new Persister();
        addElementsToComboBox();
        showElementList();
    }

    private void addElementsToComboBox(){
        elementList = ParserXML.elementsList(s);
        for (String element : elementList) {
            cbElementList1.addItem(element);
            cbElementList2.addItem(element);
            cbElementList3.addItem(element);
        }
    }
    
    private void showElementData(){
        List<String> elementData = ParserXML.elementData(elementSelected, s);
        atomicNumberText.setText(elementData.get(0));
        elementText.setText(elementData.get(1));
        symbolText.setText(elementData.get(2));
        atomicWeightText.setText(elementData.get(3));
        boilingPointText.setText(elementData.get(4));
        ionisationPotencialText.setText(elementData.get(5));
        electroNegativityText.setText(elementData.get(6));
        atomicRadiusText.setText(elementData.get(7));
        meltingPointText.setText(elementData.get(8));
        densityText.setText(elementData.get(9));
    }
    
    private void showElementAtomicWeight(){
        atomicWeightText2.setText(ParserXML.elementWeight(elementSelected, s));
    }

    private void showElementSymbol() {
        elementSymbolText.setText(ParserXML.elementSymbol(elementSelected, s));        
    }
    
    private void showElementList(){
        for (String string : elementList) {
            list.add(string);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        titlePanel = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        atomicNumberPanel = new javax.swing.JPanel();
        atomicNumberText = new javax.swing.JTextField();
        atomicWeightText = new javax.swing.JTextField();
        elementLabel = new javax.swing.JLabel();
        elementText = new javax.swing.JTextField();
        symbolText = new javax.swing.JTextField();
        boilingPointText = new javax.swing.JTextField();
        ionisationPotencialText = new javax.swing.JTextField();
        electroNegativityText = new javax.swing.JTextField();
        atomicRadiusText = new javax.swing.JTextField();
        meltingPointText = new javax.swing.JTextField();
        densityText = new javax.swing.JTextField();
        symbolLabel = new javax.swing.JLabel();
        atomicWeightLabel = new javax.swing.JLabel();
        boilingPointLabel = new javax.swing.JLabel();
        ionisationPotencialLabel = new javax.swing.JLabel();
        electroNegativityLabel = new javax.swing.JLabel();
        atomicRadiusLabel = new javax.swing.JLabel();
        meltingPointLabel = new javax.swing.JLabel();
        densityLabel = new javax.swing.JLabel();
        atomicNumberLabel = new javax.swing.JLabel();
        elementSelectLabel = new javax.swing.JLabel();
        cbElementList1 = new javax.swing.JComboBox<>();
        elementSymbolPanel = new javax.swing.JPanel();
        selectElementLabel3 = new javax.swing.JLabel();
        cbElementList3 = new javax.swing.JComboBox<>();
        elementSymbolText = new javax.swing.JTextField();
        atomicWeightPanel = new javax.swing.JPanel();
        selectElementLabel2 = new javax.swing.JLabel();
        cbElementList2 = new javax.swing.JComboBox<>();
        atomicWeightText2 = new javax.swing.JTextField();
        elementsPanel = new javax.swing.JPanel();
        list = new java.awt.List();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        logoLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        logoLabel.setForeground(new java.awt.Color(9, 113, 194));
        logoLabel.setText("TABLA PERIÓDICA");
        logoLabel.setToolTipText("");

        jLabel2.setText("by Andrew De Abreu Ruiz");

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(titlePanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addComponent(logoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        atomicNumberPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Atomic Number", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 0, 11))); // NOI18N
        atomicNumberPanel.setToolTipText("");

        atomicNumberText.setEditable(false);

        atomicWeightText.setEditable(false);

        elementLabel.setText("Elemento");

        elementText.setEditable(false);

        symbolText.setEditable(false);

        boilingPointText.setEditable(false);

        ionisationPotencialText.setEditable(false);

        electroNegativityText.setEditable(false);

        atomicRadiusText.setEditable(false);

        meltingPointText.setEditable(false);

        densityText.setEditable(false);

        symbolLabel.setText("Símbolo");

        atomicWeightLabel.setText("Peso atómico");

        boilingPointLabel.setText("Punto de ebullición");

        ionisationPotencialLabel.setText("Potencial de ionización");

        electroNegativityLabel.setText("Electronegatividad");

        atomicRadiusLabel.setText("Radio atómico");

        meltingPointLabel.setText("Punto de fusión");

        densityLabel.setText("Densidad");

        atomicNumberLabel.setText("Número atómico");

        elementSelectLabel.setText("Seleccione un elemento:");

        cbElementList1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbElementList1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout atomicNumberPanelLayout = new javax.swing.GroupLayout(atomicNumberPanel);
        atomicNumberPanel.setLayout(atomicNumberPanelLayout);
        atomicNumberPanelLayout.setHorizontalGroup(
            atomicNumberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(atomicNumberPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(atomicNumberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(elementSelectLabel)
                    .addComponent(cbElementList1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 227, Short.MAX_VALUE)
                .addGroup(atomicNumberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, atomicNumberPanelLayout.createSequentialGroup()
                        .addGroup(atomicNumberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(atomicNumberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(symbolLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(elementLabel))
                            .addComponent(atomicNumberLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(atomicNumberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(elementText, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(atomicNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(symbolText, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(atomicWeightText, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, atomicNumberPanelLayout.createSequentialGroup()
                        .addGroup(atomicNumberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(atomicNumberPanelLayout.createSequentialGroup()
                                .addComponent(boilingPointLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(boilingPointText, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(atomicNumberPanelLayout.createSequentialGroup()
                                .addComponent(atomicRadiusLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(atomicRadiusText, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(atomicNumberPanelLayout.createSequentialGroup()
                                .addComponent(electroNegativityLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(electroNegativityText, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(atomicNumberPanelLayout.createSequentialGroup()
                                .addComponent(meltingPointLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(meltingPointText, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(atomicNumberPanelLayout.createSequentialGroup()
                                .addComponent(densityLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(densityText, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(atomicNumberPanelLayout.createSequentialGroup()
                                .addComponent(ionisationPotencialLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ionisationPotencialText, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20))
                    .addGroup(atomicNumberPanelLayout.createSequentialGroup()
                        .addComponent(atomicWeightLabel)
                        .addContainerGap())))
        );
        atomicNumberPanelLayout.setVerticalGroup(
            atomicNumberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(atomicNumberPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(atomicNumberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(atomicNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(atomicNumberLabel)
                    .addComponent(elementSelectLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(atomicNumberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(elementLabel)
                    .addComponent(cbElementList1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(atomicNumberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(symbolText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(symbolLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(atomicNumberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(atomicWeightText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(atomicWeightLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(atomicNumberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boilingPointText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boilingPointLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(atomicNumberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ionisationPotencialText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ionisationPotencialLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(atomicNumberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(electroNegativityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(electroNegativityLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(atomicNumberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(atomicRadiusText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(atomicRadiusLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(atomicNumberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(meltingPointText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(meltingPointLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(atomicNumberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(densityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(densityLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        elementSymbolPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Element Symbol", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 0, 11))); // NOI18N

        selectElementLabel3.setText("Seleccione un elemento:");

        cbElementList3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbElementList3ActionPerformed(evt);
            }
        });

        elementSymbolText.setEditable(false);

        javax.swing.GroupLayout elementSymbolPanelLayout = new javax.swing.GroupLayout(elementSymbolPanel);
        elementSymbolPanel.setLayout(elementSymbolPanelLayout);
        elementSymbolPanelLayout.setHorizontalGroup(
            elementSymbolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(elementSymbolPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(elementSymbolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(elementSymbolPanelLayout.createSequentialGroup()
                        .addComponent(selectElementLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(elementSymbolPanelLayout.createSequentialGroup()
                        .addComponent(cbElementList3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(elementSymbolText, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );
        elementSymbolPanelLayout.setVerticalGroup(
            elementSymbolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(elementSymbolPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(selectElementLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(elementSymbolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbElementList3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(elementSymbolText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        atomicWeightPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Atomic Weight", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 0, 11))); // NOI18N

        selectElementLabel2.setText("Seleccione un elemento:");

        cbElementList2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbElementList2ActionPerformed(evt);
            }
        });

        atomicWeightText2.setEditable(false);

        javax.swing.GroupLayout atomicWeightPanelLayout = new javax.swing.GroupLayout(atomicWeightPanel);
        atomicWeightPanel.setLayout(atomicWeightPanelLayout);
        atomicWeightPanelLayout.setHorizontalGroup(
            atomicWeightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(atomicWeightPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(atomicWeightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(atomicWeightPanelLayout.createSequentialGroup()
                        .addComponent(selectElementLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(atomicWeightPanelLayout.createSequentialGroup()
                        .addComponent(cbElementList2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(atomicWeightText2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );
        atomicWeightPanelLayout.setVerticalGroup(
            atomicWeightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(atomicWeightPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(selectElementLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(atomicWeightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbElementList2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(atomicWeightText2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        elementsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Atoms", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 0, 11))); // NOI18N

        javax.swing.GroupLayout elementsPanelLayout = new javax.swing.GroupLayout(elementsPanel);
        elementsPanel.setLayout(elementsPanelLayout);
        elementsPanelLayout.setHorizontalGroup(
            elementsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(elementsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(list, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(523, Short.MAX_VALUE))
        );
        elementsPanelLayout.setVerticalGroup(
            elementsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, elementsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(list, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(atomicNumberPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(elementSymbolPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(atomicWeightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(elementsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(atomicNumberPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(atomicWeightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(elementSymbolPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(elementsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbElementList1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbElementList1ActionPerformed
        // TODO add your handling code here:
        JComboBox cb = (JComboBox) evt.getSource();
        elementSelected = (String)cb.getSelectedItem();
        showElementData();
    }//GEN-LAST:event_cbElementList1ActionPerformed

    private void cbElementList3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbElementList3ActionPerformed
        // TODO add your handling code here:
        JComboBox cb =(JComboBox) evt.getSource();
        elementSelected = (String) cb.getSelectedItem();
        showElementSymbol();
    }//GEN-LAST:event_cbElementList3ActionPerformed

    private void cbElementList2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbElementList2ActionPerformed
        // TODO add your handling code here:
        JComboBox cb =(JComboBox) evt.getSource();
        elementSelected = (String) cb.getSelectedItem();
        showElementAtomicWeight();
    }//GEN-LAST:event_cbElementList2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel atomicNumberLabel;
    private javax.swing.JPanel atomicNumberPanel;
    private javax.swing.JTextField atomicNumberText;
    private javax.swing.JLabel atomicRadiusLabel;
    private javax.swing.JTextField atomicRadiusText;
    private javax.swing.JLabel atomicWeightLabel;
    private javax.swing.JPanel atomicWeightPanel;
    private javax.swing.JTextField atomicWeightText;
    private javax.swing.JTextField atomicWeightText2;
    private javax.swing.JLabel boilingPointLabel;
    private javax.swing.JTextField boilingPointText;
    private javax.swing.JComboBox<String> cbElementList1;
    private javax.swing.JComboBox<String> cbElementList2;
    private javax.swing.JComboBox<String> cbElementList3;
    private javax.swing.JLabel densityLabel;
    private javax.swing.JTextField densityText;
    private javax.swing.JLabel electroNegativityLabel;
    private javax.swing.JTextField electroNegativityText;
    private javax.swing.JLabel elementLabel;
    private javax.swing.JLabel elementSelectLabel;
    private javax.swing.JPanel elementSymbolPanel;
    private javax.swing.JTextField elementSymbolText;
    private javax.swing.JTextField elementText;
    private javax.swing.JPanel elementsPanel;
    private javax.swing.JLabel ionisationPotencialLabel;
    private javax.swing.JTextField ionisationPotencialText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private java.awt.List list;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JLabel meltingPointLabel;
    private javax.swing.JTextField meltingPointText;
    private javax.swing.JLabel selectElementLabel2;
    private javax.swing.JLabel selectElementLabel3;
    private javax.swing.JLabel symbolLabel;
    private javax.swing.JTextField symbolText;
    private javax.swing.JPanel titlePanel;
    // End of variables declaration//GEN-END:variables


}
