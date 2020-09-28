package IO;

import java.io.*;

public class FileTest {
    public static void main(String[] args) throws Exception{
        // text
        File file = new File("/home/axikuazei/f2.txt");
        File file2 = new File("/home/axikuazei/f3.txt");
        FileInputStream fi = new FileInputStream(file);
        BufferedReader reader = new BufferedReader(new InputStreamReader(fi));
        String sbuf;
        while((sbuf = reader.readLine())!=null){
            System.out.println(sbuf);
        }
        reader.close();

        //byte
        byte[] bbuf = new byte[10];
        BufferedInputStream bi = new BufferedInputStream(new FileInputStream(file));
        BufferedOutputStream oi = new BufferedOutputStream(new FileOutputStream(file2));
        while(bi.read(bbuf)!=-1){
            oi.write(bbuf);
        }
        bi.close();
        oi.close();
    }
}
