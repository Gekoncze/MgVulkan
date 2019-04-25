package cz.mg.vulkan;

public class VkMemoryHostPointerPropertiesEXT extends VkObject {
    public VkMemoryHostPointerPropertiesEXT() {
        super(sizeof());
    }

    protected VkMemoryHostPointerPropertiesEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkMemoryHostPointerPropertiesEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkMemoryHostPointerPropertiesEXT(VkPointer pointer) {
        super(pointer);
    }



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSTypeNative(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSTypeNative(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSTypeQ() {
        return getSType().getValue();
    }

    public void setSType(int sType) {
        getSType().setValue(sType);
    }

    protected static native long getSTypeNative(long address);
    protected static native void setSTypeNative(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNextNative(getVkAddress()));
    }

    private VkObject pNext = null;
    public void setPNext(VkObject pNext) {
        setPNextNative(getVkAddress(), pNext != null ? pNext.getVkAddress() : VkPointer.NULL);
        this.pNext = pNext;
    }

    protected static native long getPNextNative(long address);
    protected static native void setPNextNative(long address, long pNext);

    public VkUInt32 getMemoryTypeBits() {
        return new VkUInt32(getVkMemory(), getMemoryTypeBitsNative(getVkAddress()));
    }

    
    public void setMemoryTypeBits(VkUInt32 memoryTypeBits) {
        setMemoryTypeBitsNative(getVkAddress(), memoryTypeBits != null ? memoryTypeBits.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMemoryTypeBitsQ() {
        return getMemoryTypeBits().getValue();
    }

    public void setMemoryTypeBits(int memoryTypeBits) {
        getMemoryTypeBits().setValue(memoryTypeBits);
    }

    protected static native long getMemoryTypeBitsNative(long address);
    protected static native void setMemoryTypeBitsNative(long address, long memoryTypeBits);


    public static native long sizeof();

    public static class Array extends VkMemoryHostPointerPropertiesEXT implements cz.mg.collections.array.ReadonlyArray<VkMemoryHostPointerPropertiesEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkMemoryHostPointerPropertiesEXT.sizeof()));
            this.count = count;
        }

        public Array(VkMemoryHostPointerPropertiesEXT o, int count){
            super(o.getVkMemory(), o.getVkAddress());
            this.count = count;
        }

        public Array(VkPointer pointer, int count){
            super(pointer);
            this.count = count;
        }

        protected Array(VkMemory vkmemory, int count) {
            super(vkmemory);
            this.count = count;
        }

        protected Array(VkMemory vkmemory, long vkaddress, int count) {
            super(vkmemory, vkaddress);
            this.count = count;
        }





        @Override
        public int count(){
            return count;
        }

        @Override
        public VkMemoryHostPointerPropertiesEXT get(int i){
            return new VkMemoryHostPointerPropertiesEXT(getVkMemory(), address(i));
        }

        protected long address(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }

        public static class Array2 extends VkPointer.Array {
            public Array2(int count) {
                super(count);
            }

            protected Array2(VkMemory vkmemory, int count) {
                super(vkmemory, count);
            }

            protected Array2(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress, count);
            }
        }
    }
}
