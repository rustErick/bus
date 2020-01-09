package clases;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author erick
 */
public class Photo {
    public ImageIcon resizePic(String picPath, int wdth, int hgt){
        ImageIcon MyImg = new ImageIcon(picPath);
        Image img = MyImg.getImage().getScaledInstance(wdth, hgt, Image.SCALE_SMOOTH);
        ImageIcon MyPicture = new ImageIcon(img);     
        
        return MyPicture;
    } 
    
    public ImageIcon browseImage(JLabel lbl, String pat){
        
        JFileChooser img = new JFileChooser();
        img.setCurrentDirectory(new File(System.getProperty("user.home")));
        
        FileNameExtensionFilter name = new FileNameExtensionFilter("*.Images", "jpg", "png", "gif");
        img.addChoosableFileFilter(name);
        
        int fileState = img.showSaveDialog(null);
        if(fileState == JFileChooser.APPROVE_OPTION){
            File selectedFile = img.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            ImageIcon myPicture = resizePic(path, lbl.getWidth(), lbl.getHeight());
            lbl.setIcon(myPicture);
            return myPicture;

        }else if(fileState == JFileChooser.CANCEL_OPTION)
            JOptionPane.showMessageDialog(null, "Seleccione una imagen"); 
        return null;
    }
    
    public void setImage(JLabel lbl, String path) {
        lbl.setIcon(resizePic(path, lbl.getWidth(), lbl.getHeight()));
    }
    
    public String saveImage(ImageIcon myPicture, String directory) {
        // Generar nombre aleatorio
        Random random = new Random();
        String fileName = random.ints(48, 123)
          .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
          .limit(10)
          .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
          .toString();
        
        if (myPicture != null) {
            // Crear imagen en buffer
            Image image = myPicture.getImage();
            BufferedImage buffered = new BufferedImage(
            image.getWidth(null), image.getHeight(null),
            BufferedImage.TYPE_INT_ARGB);
            Graphics2D g = buffered.createGraphics();
            g.drawImage(image, 0, 0, null);
            g.dispose();
            try {
                // Armar ruta completa del nombre del archivo
                String path = directory + "/" + fileName + ".png";
                // Guardar en disco
                File outputfile = new File(path);
                ImageIO.write(buffered, "png", outputfile);
                return path;
                
            } catch (IOException e) {
                return null;
            }
        } else {
            return null;
        }
    } 
}
