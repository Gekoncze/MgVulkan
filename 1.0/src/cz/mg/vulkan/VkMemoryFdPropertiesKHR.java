package cz.mg.vulkan;

public class VkMemoryFdPropertiesKHR extends VkObject {
    public VkMemoryFdPropertiesKHR() {
        super(sizeof());
    }

    public VkMemoryFdPropertiesKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkMemoryFdPropertiesKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSTypeQ() {
        return getSType().getValue();
    }

    public void setSType(int sType) {
        getSType().setValue(sType);
    }

    protected static native long getSType(long address);
    protected static native void setSType(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNext(getVkAddress()));
    }

    private VkObject pNext = null;
    public void setPNext(VkObject pNext) {
        setPNext(getVkAddress(), pNext != null ? pNext.getVkAddress() : VkPointer.NULL);
        this.pNext = pNext;
    }

    protected static native long getPNext(long address);
    protected static native void setPNext(long address, long pNext);

    public VkUInt32 getMemoryTypeBits() {
        return new VkUInt32(getVkMemory(), getMemoryTypeBits(getVkAddress()));
    }

    
    public void setMemoryTypeBits(VkUInt32 memoryTypeBits) {
        setMemoryTypeBits(getVkAddress(), memoryTypeBits != null ? memoryTypeBits.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMemoryTypeBitsQ() {
        return getMemoryTypeBits().getValue();
    }

    public void setMemoryTypeBits(int memoryTypeBits) {
        getMemoryTypeBits().setValue(memoryTypeBits);
    }

    protected static native long getMemoryTypeBits(long address);
    protected static native void setMemoryTypeBits(long address, long memoryTypeBits);


    public static native long sizeof();

    public static class Array extends VkMemoryFdPropertiesKHR implements cz.mg.collections.array.ReadonlyArray<VkMemoryFdPropertiesKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkMemoryFdPropertiesKHR.sizeof()));
            this.count = count;
        }

        public Array(int count, VkMemoryFdPropertiesKHR o){
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
        public VkMemoryFdPropertiesKHR get(int i){
            return new VkMemoryFdPropertiesKHR(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }

        public static class Array2 extends VkPointer.Array {
            public Array2(int count) {
                super(count);
            }

            public Array2(int count, VkPointer o){
                super(count, o);
            }

            public Array2(VkMemory vkmemory, int count) {
                super(vkmemory, count);
            }

            public Array2(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress, count);
            }
        }
    }
}
