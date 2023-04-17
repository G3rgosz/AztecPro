// * File: AztecFrame.java
// * Author: Szivák Gergő
// * Copyright: 2023, Szivák Gergő
// * Date: 2023-04-17
// * Github: https://github.com/G3rgosz
// * Licenc: GNU GPL

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AztecFrame extends JFrame{
    public JPanel mainPnl = new JPanel();
    public JPanel northPnl = new JPanel();
    public JPanel eastPnl = new JPanel();
    public JPanel southPnl = new JPanel();
    public JPanel westPnl = new JPanel();
    public JPanel centerPnl = new JPanel();
    public JPanel statusPnl = new JPanel();
    public JPanel checkboxPnl = new JPanel();
    public JTextField pathTF = new JTextField();
    public JButton generateBtn = new JButton();
    public JScrollPane ScrollPanel = new JScrollPane();
    public JTextArea TextArea = new JTextArea();
    public JLabel statTitleLbl = new JLabel();
    public JLabel statusLbl = new JLabel();
    public JLabel descriptionLbl = new JLabel();
    public JCheckBox pdfCBox = new JCheckBox();
    public JCheckBox pngCBox = new JCheckBox();
    public JButton folderBtn = new JButton();
    

    public AztecFrame() {
        initComponents();
    }

    private void initComponents() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 500);
        setTitle("Gergosz - aztecPro");
        northPnl.setBackground(new java.awt.Color(22, 125, 215));
        setLayout( new GridLayout( 1, 1 ) );

        pathTF.setFont(new java.awt.Font("Segoe UI", 1, 14));

        generateBtn.setFont(new java.awt.Font("Segoe UI", 1, 18));
        generateBtn.setText("Generálás");

        TextArea.setFont(new java.awt.Font("Segoe UI", 0, 18));
        ScrollPanel.setViewportView(TextArea);

        statTitleLbl.setFont(new java.awt.Font("Segoe UI", 1, 14));
        statTitleLbl.setText("Státusz:");

        statusLbl.setFont(new java.awt.Font("Tahoma", 1, 12));

        descriptionLbl.setText("<html><div style='text-align: center;'>Add meg az aztec kód adatát, majd tabulátorral elválasztva a nevét is!<br/>(Az adatnak 10 számjegyből kell állnia)</div></html>");
        descriptionLbl.setFont(new java.awt.Font("Segoe UI", 0, 14));
        descriptionLbl.setForeground(new java.awt.Color(255, 255, 255));

        pdfCBox.setFont(new java.awt.Font("Segoe UI", 0, 14));
        pdfCBox.setText("pdf");
        pdfCBox.setSelected(true);

        pngCBox.setFont(new java.awt.Font("Segoe UI", 0, 14));
        pngCBox.setText("png");
        pngCBox.setSelected(true);

        folderBtn.setFont(new java.awt.Font("Tahoma", 1, 14));
        folderBtn.setText("Tallózás");

        mainPnl.setLayout( new BorderLayout());
        add(mainPnl);

        northPnl.setLayout(new FlowLayout( FlowLayout.CENTER ));
        northPnl.add(descriptionLbl);
        northPnl.setBorder(BorderFactory.createEmptyBorder(10, 0,10,0));
        mainPnl.add(northPnl, BorderLayout.NORTH);

        eastPnl.setPreferredSize(new Dimension(150, 400));
        eastPnl.setLayout( new BorderLayout());
        statusPnl.setLayout(new BorderLayout());
        statusPnl.add(statTitleLbl, BorderLayout.NORTH);
        statusPnl.add(statusLbl, BorderLayout.CENTER);
        checkboxPnl.add(pdfCBox);
        checkboxPnl.add(pngCBox);
        eastPnl.add(statusPnl, BorderLayout.NORTH);
        eastPnl.add(checkboxPnl, BorderLayout.SOUTH);
        eastPnl.setBorder(BorderFactory.createEmptyBorder(10,10,0,10));
        mainPnl.add(eastPnl, BorderLayout.EAST);
        
        southPnl.setLayout(new BorderLayout());
        southPnl.add(folderBtn, BorderLayout.WEST);
        southPnl.add(pathTF, BorderLayout.CENTER);
        southPnl.add(generateBtn, BorderLayout.EAST);
        southPnl.setBorder(BorderFactory.createEmptyBorder(10, 10,10,10));
        mainPnl.add(southPnl, BorderLayout.SOUTH);

        westPnl.setSize(10, 400);
        mainPnl.add(westPnl);

        centerPnl.setLayout(new GridLayout(1, 1));
        centerPnl.setBorder(BorderFactory.createEmptyBorder(10,10,0,10));
        centerPnl.add(TextArea);
        mainPnl.add(centerPnl, BorderLayout.CENTER);
    }

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
