package test;

import cz.mg.collections.list.chainlist.ChainList;
import java.io.IOException;
import java.io.InputStream;


public class Utilities {
    public static byte[] load(Class location, String name) {
        try(InputStream stream = location.getResourceAsStream(name);){
            int bufferSize = 2048;

            ChainList<byte[]> buffers = new ChainList<>();
            byte[] buffer = new byte[bufferSize];
            int lastSize;
            while((lastSize = stream.read(buffer)) == bufferSize){
                buffers.addLast(buffer);
                buffer = new byte[bufferSize];
            }
            buffers.addLast(buffer);

            int totalSize = buffers.count()*bufferSize;
            totalSize -= bufferSize - lastSize;

            byte[] bytes = new byte[totalSize];
            int i = 0;
            for(byte[] b : buffers){
                int max = b == buffers.getLast() ? lastSize : bufferSize;
                for(int ii = 0; ii < max; ii++){
                    bytes[i] = b[ii];
                    i++;
                }
            }

            return bytes;
        } catch(IOException e){
            throw new RuntimeException();
        }
    }
}
