package cz.mg.vulkan;

public class VkMemory implements AutoCloseable {
    private long address;
    private long size;

    public VkMemory(long size) {
        if(size < 0) throw new IllegalArgumentException("Memory size must be >= 0, given " + size + ".");
        if(size == 0) size = 1;
        this.size = size;
        this.address = malloc(size);
    }

    public long getAddress() {
        return address;
    }

    public long getSize() {
        return size;
    }

    @Override
    public void close() {
        free(address);
        address = 0;
        size = 0;
    }

    public void check(long address, long size){
        if(address < this.address || (address + size - 1) > (this.address + this.size - 1)){
            throw new RuntimeException("Object is not within allocated memory bounds. Object: " + address + " " + size + ", Memory: " + this.address + " " + this.size);
        }
    }

    private static native synchronized long malloc(long size);
    private static native synchronized void free(long pointer);
}
