package cz.mg.vulkan;

public class VkBufferCopy extends VkObject {
    public VkBufferCopy() {
        super(sizeof());
    }

    public VkBufferCopy(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkBufferCopy(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkBufferCopy(VkDeviceSize srcOffset, VkDeviceSize dstOffset, VkDeviceSize size) {
        super(sizeof());
        setSrcOffset(srcOffset);
        setDstOffset(dstOffset);
        setSize(size);
    }

    public VkDeviceSize getSrcOffset() {
        return new VkDeviceSize(getVkMemory(), getSrcOffset(getVkAddress()));
    }

    
    public void setSrcOffset(VkDeviceSize srcOffset) {
        setSrcOffset(getVkAddress(), srcOffset != null ? srcOffset.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getSrcOffset(long address);
    private static native void setSrcOffset(long address, long srcOffset);

    public VkDeviceSize getDstOffset() {
        return new VkDeviceSize(getVkMemory(), getDstOffset(getVkAddress()));
    }

    
    public void setDstOffset(VkDeviceSize dstOffset) {
        setDstOffset(getVkAddress(), dstOffset != null ? dstOffset.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getDstOffset(long address);
    private static native void setDstOffset(long address, long dstOffset);

    public VkDeviceSize getSize() {
        return new VkDeviceSize(getVkMemory(), getSize(getVkAddress()));
    }

    
    public void setSize(VkDeviceSize size) {
        setSize(getVkAddress(), size != null ? size.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getSize(long address);
    private static native void setSize(long address, long size);


    public static native long sizeof();

    public static class Array extends VkBufferCopy implements cz.mg.collections.array.ReadonlyArray<VkBufferCopy> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkBufferCopy.sizeof()));
            this.count = count;
        }

        public Array(int count, VkBufferCopy o){
            super(o.getVkMemory(), o.getVkAddress());
            this.count = count;
        }

        public Array(VkMemory vkmemory, int count) {
            super(vkmemory);
            this.count = count;
        }

        public Array(VkMemory vkmemory, long vkaddress, int count) {
            super(vkmemory, vkaddress);
            this.count = count;
        }





        @Override
        public int count(){
            return count;
        }

        @Override
        public VkBufferCopy get(int i){
            return new VkBufferCopy(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

    public static class Pointer extends VkObject.Pointer {
        public Pointer() {
        }

        public Pointer(long value) {
            setValue(value);
        }

        public Pointer(VkMemory vkmemory) {
            super(vkmemory);
        }

        public Pointer(VkMemory vkmemory, long vkaddress) {
            super(vkmemory, vkaddress);
        }

        public static class Array extends VkBufferCopy.Pointer implements cz.mg.collections.array.ReadonlyArray<VkBufferCopy.Pointer> {
            private final int count;

            public Array(int count) {
                super(new VkMemory(count*VkPointer.sizeof()));
                this.count = count;
            }

            public Array(VkMemory vkmemory, int count) {
                super(vkmemory);
                this.count = count;
            }

            public Array(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress);
                this.count = count;
            }

            public Array(VkBufferCopy[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkBufferCopy.Pointer get(int i){
                return new VkBufferCopy.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
