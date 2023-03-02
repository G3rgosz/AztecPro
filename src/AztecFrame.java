// * File: AztecFrame.java
// * Author: Szivák Gergő
// * Copyright: 2023, Szivák Gergő
// * Date: 2023-03-02
// * Github: https://github.com/G3rgosz
// * Licenc: GNU GPL

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AztecFrame extends javax.swing.JFrame {

    public AztecFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        pathTF = new javax.swing.JTextField();
        generateBtn = new javax.swing.JButton();
        ScrollPanel = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();
        statTitleLbl = new javax.swing.JLabel();
        statusLbl = new javax.swing.JLabel();
        descriptionLbl = new javax.swing.JLabel();
        pdfCBox = new javax.swing.JCheckBox();
        pngCBox = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        folderBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gergosz - AztecPro");
        setBackground(new java.awt.Color(204, 166, 166));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setName("mainFrame");
        setResizable(false);

        pathTF.setFont(new java.awt.Font("Segoe UI", 0, 14));
        pathTF.setMaximumSize(new java.awt.Dimension(2147483647, 33));
        pathTF.setMinimumSize(new java.awt.Dimension(7, 33));
        pathTF.setPreferredSize(new java.awt.Dimension(7, 33));

        generateBtn.setFont(new java.awt.Font("Segoe UI", 1, 18));
        generateBtn.setText("Generálás");

        TextArea.setColumns(20);
        TextArea.setFont(new java.awt.Font("Segoe UI", 0, 18));
        TextArea.setRows(5);
        ScrollPanel.setViewportView(TextArea);

        statTitleLbl.setFont(new java.awt.Font("Segoe UI", 1, 14));
        statTitleLbl.setText("Státusz:");

        statusLbl.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        statusLbl.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        statusLbl.setFont(new java.awt.Font("Tahoma", 1, 18));

        descriptionLbl.setText("Add meg az aztec kód adatát, majd tabulátorral elválasztva a nevét is ;)");

        pdfCBox.setFont(new java.awt.Font("Segoe UI", 0, 14));
        pdfCBox.setText("pdf");
        pdfCBox.setSelected(true);

        pngCBox.setFont(new java.awt.Font("Segoe UI", 0, 14));
        pngCBox.setText("png");
        pngCBox.setSelected(true);

        jLabel1.setIcon(new javax.swing.ImageIcon("lib/rsz_1gergosz.png"));

        folderBtn.setFont(new java.awt.Font("Tahoma", 1, 14));
        folderBtn.setText("Tallózás");
        folderBtn.setMaximumSize(new java.awt.Dimension(73, 33));
        folderBtn.setMinimumSize(new java.awt.Dimension(73, 33));
        folderBtn.setPreferredSize(new java.awt.Dimension(50, 33));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descriptionLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(folderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pathTF, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(statTitleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(generateBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pdfCBox)
                            .addComponent(pngCBox)
                            .addComponent(statusLbl)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(statTitleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(statusLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pdfCBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pngCBox)
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(descriptionLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ScrollPanel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pathTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(generateBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(folderBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AztecFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AztecFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AztecFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AztecFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AztecFrame().setVisible(true);
            }
        });
    }
                  
    private javax.swing.JScrollPane ScrollPanel;
    private javax.swing.JTextArea TextArea;
    private javax.swing.JLabel descriptionLbl;
    private javax.swing.JButton folderBtn;
    private javax.swing.JButton generateBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField pathTF;
    private javax.swing.JCheckBox pdfCBox;
    private javax.swing.JCheckBox pngCBox;
    private javax.swing.JLabel statTitleLbl;
    private javax.swing.JLabel statusLbl;               

    public JScrollPane getScrollPanel() {
        return ScrollPanel;
    }

    public void setScrollPanel(JScrollPane ScrollPanel) {
        this.ScrollPanel = ScrollPanel;
    }

    public JTextArea getTextArea() {
        return TextArea;
    }

    public void setTextArea(JTextArea TextArea) {
        this.TextArea = TextArea;
    }

    public JLabel getDescriptionLbl() {
        return descriptionLbl;
    }

    public void setDescriptionLbl(JLabel descriptionLbl) {
        this.descriptionLbl = descriptionLbl;
    }

    public JButton getGenerateBtn() {
        return generateBtn;
    }

    public void setGenerateBtn(JButton generateBtn) {
        this.generateBtn = generateBtn;
    }

    public JButton getFolderBtn() {
        return folderBtn;
    }

    public void setFolderBtn(JButton folderBtn) {
        this.folderBtn = folderBtn;
    }

    public JTextField getPathTF() {
        return pathTF;
    }

    public void setPathTF(JTextField pathTF) {
        this.pathTF = pathTF;
    }

    public JCheckBox getPdfCBox() {
        return pdfCBox;
    }

    public void setPdfCBox(JCheckBox pdfCBox) {
        this.pdfCBox = pdfCBox;
    }

    public JCheckBox getPngCBox() {
        return pngCBox;
    }

    public void setPngCBox(JCheckBox pngCBox) {
        this.pngCBox = pngCBox;
    }

    public JLabel getStatTitleLbl() {
        return statTitleLbl;
    }

    public void setStatTitleLbl(JLabel statTitleLbl) {
        this.statTitleLbl = statTitleLbl;
    }

    public JLabel getStatusLbl() {
        return statusLbl;
    }

    public void setStatusLbl(JLabel statusLbl) {
        this.statusLbl = statusLbl;
    }
}
