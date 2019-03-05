package test;

import cz.mg.collections.list.chainlist.ChainList;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;


public class Utilities {
    public static byte[] load(Class location, String name) {
        try(InputStream stream = location.getResourceAsStream(name);){
            int bufferSize = 2048;

            ChainList<byte[]> buffers = new ChainList<>();
            byte[] buffer = new byte[bufferSize];
            int lastSize;
            do {
                lastSize = stream.read(buffer);
                buffers.addLast(buffer);
                buffer = new byte[bufferSize];
            } while(lastSize == bufferSize);

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

    public static ByteBuffer createBuffer(byte[] bytes){
        ByteBuffer buffer = ByteBuffer.allocateDirect(bytes.length);
        buffer.put(bytes);
        return buffer;
    }
}
