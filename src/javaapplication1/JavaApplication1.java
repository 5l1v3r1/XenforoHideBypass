package javaapplication1;



/**
 *
 * @author Ahmethan
 */
import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        
        //coded by ahmeth4n
        
        try {
				System.out.println("Xenforo Mini Hide Tag Bypass Bot");
				System.out.println();
                System.out.println("Forum URL gir : ");
                Scanner klavye2 = new Scanner (System.in);
                String domain = klavye2.nextLine();
            int i = 0;
            int e = 0;
            System.out.println("Konu URL gir : ");
                Scanner klavye = new Scanner (System.in);
                String isim = klavye.nextLine();
                Document doc = Jsoup.connect(isim).get();
                System.out.println("-------------------------------------");
                System.out.println();
            Elements links = doc.select("a[href]");
            for (Element link : links) {
                if(i < 1){
                String href = link.attr("href");
                if(href.contains("members")){
                i++;
                String id = href.replace("members/","");
                String id2 = id.replace("/","");
                int kf = id2.length();
                int son = kf - 4;
                  String vm = id2.substring(son,kf);
                 Document doc2 = Jsoup.connect(domain+"search/member?user_id="+vm+"&content=thread").get();
                 Elements links2 = doc2.select("blockquote[class=snippet]");
                     for (Element link2 : links2) {
                    Elements link3 = links2.select("a[href]");
                    String linkOuterH = link3.html(); 
                    if(e < 1){
                     System.out.println(linkOuterH);
                     e++;
                    }
                     }

                }
                }
                
                
            }   } catch (IOException ex) {
            Logger.getLogger(JavaApplication1.class.getName()).log(Level.SEVERE, null, ex);
        }
   
}
}
