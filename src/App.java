// * File: App.java
// * Author: Szivák Gergő
// * Copyright: 2023, Szivák Gergő
// * Date: 2023-03-02
// * Github: https://github.com/G3rgosz
// * Licenc: GNU GPL

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringReader;

import java.net.MalformedURLException;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JFileChooser;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.NotFoundException;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Image;
import com.itextpdf.text.Rectangle;

public class App {
    private static AztecFrame aztecFrm;
	public static void main(String[] args) throws WriterException, IOException, NotFoundException {
		aztecFrm = new AztecFrame();
		aztecFrm.setLocationRelativeTo(null);
        aztecFrm.setVisible(true);
		ActionListeners();

	}
	private static void ActionListeners() {
        aztecFrm.getFolderBtn().addActionListener( event -> { selectFolder(); } );
        aztecFrm.getGenerateBtn().addActionListener( event -> { generateAztec(); } );
    }
    private static void selectFolder(){
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            aztecFrm.getPathTF().setText(selectedFile.getAbsolutePath());
        }
    }
    private static void generateAztec() {
        aztecFrm.getGenerateBtn().setEnabled(false);
        String text = aztecFrm.getTextArea().getText();
        String url = aztecFrm.getPathTF().getText()+"/";

        String charset = "UTF-8";
        int sCounter = 0;
        int fCounter = 0;

        try {
            StringReader stringReader = new StringReader(text);
            BufferedReader bufferedReader = new BufferedReader(stringReader);
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                String[] rowData = line.split("\\t");
                String data = rowData[0];
                String filename = rowData[1];
                String path = url + filename;
                try {
                    createAZTEC(data, path + ".png", charset, 925, 925);
                    sCounter++;
                } catch (WriterException e1) {
                    e1.printStackTrace();
                    fCounter++;
                }
                if(aztecFrm.getPdfCBox().isSelected()){
                    createPdf(path);
                }
                if(aztecFrm.getPngCBox().isSelected() == false){
                    File png = new File(path + ".png"); 
                    png.delete();
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
            aztecFrm.getStatusLbl().setText("Hiba! :( ");
        }
        aztecFrm.getStatusLbl().setText("<html>" +"<br/>Sikeres: " + sCounter + "<br/>" + "<br/>Sikertelen: " + fCounter + "</html>");
        aztecFrm.getGenerateBtn().setEnabled(true);
    }
    private static void createAZTEC(String data, String path, String charset,int height, int width) throws WriterException, IOException {
		Map<EncodeHintType, Object> hashMap = new HashMap<>(1);
		hashMap.put(EncodeHintType.AZTEC_LAYERS, 1);

        BitMatrix matrix = new MultiFormatWriter().encode( new String(data.getBytes(charset), charset), BarcodeFormat.AZTEC, width, height, hashMap);

        MatrixToImageWriter.writeToFile(matrix, path.substring(path.lastIndexOf('.') + 1), new File(path));
    }
	
	private static void createPdf(String path)throws FileNotFoundException, MalformedURLException {
		Document document = new Document(new Rectangle(1000,1000));
		String input = path + ".png";
		String output = path + ".pdf";
		try {
		  FileOutputStream fos = new FileOutputStream(output);
		  PdfWriter writer = PdfWriter.getInstance(document, fos);
		  writer.open();
		  document.open();
		  document.add(Image.getInstance(input));
		  document.close();
		  writer.close();
		}
		catch (Exception e) {
		  e.printStackTrace();
		}
	}
}
