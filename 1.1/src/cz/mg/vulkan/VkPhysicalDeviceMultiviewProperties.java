package cz.mg.vulkan;

public class VkPhysicalDeviceMultiviewProperties extends VkObject {
    public VkPhysicalDeviceMultiviewProperties() {
        super(sizeof());
    }

    protected VkPhysicalDeviceMultiviewProperties(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkPhysicalDeviceMultiviewProperties(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPhysicalDeviceMultiviewProperties(VkPointer pointer) {
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

    public VkUInt32 getMaxMultiviewViewCount() {
        return new VkUInt32(getVkMemory(), getMaxMultiviewViewCountNative(getVkAddress()));
    }

    
    public void setMaxMultiviewViewCount(VkUInt32 maxMultiviewViewCount) {
        setMaxMultiviewViewCountNative(getVkAddress(), maxMultiviewViewCount != null ? maxMultiviewViewCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxMultiviewViewCountQ() {
        return getMaxMultiviewViewCount().getValue();
    }

    public void setMaxMultiviewViewCount(int maxMultiviewViewCount) {
        getMaxMultiviewViewCount().setValue(maxMultiviewViewCount);
    }

    protected static native long getMaxMultiviewViewCountNative(long address);
    protected static native void setMaxMultiviewViewCountNative(long address, long maxMultiviewViewCount);

    public VkUInt32 getMaxMultiviewInstanceIndex() {
        return new VkUInt32(getVkMemory(), getMaxMultiviewInstanceIndexNative(getVkAddress()));
    }

    
    public void setMaxMultiviewInstanceIndex(VkUInt32 maxMultiviewInstanceIndex) {
        setMaxMultiviewInstanceIndexNative(getVkAddress(), maxMultiviewInstanceIndex != null ? maxMultiviewInstanceIndex.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxMultiviewInstanceIndexQ() {
        return getMaxMultiviewInstanceIndex().getValue();
    }

    public void setMaxMultiviewInstanceIndex(int maxMultiviewInstanceIndex) {
        getMaxMultiviewInstanceIndex().setValue(maxMultiviewInstanceIndex);
    }

    protected static native long getMaxMultiviewInstanceIndexNative(long address);
    protected static native void setMaxMultiviewInstanceIndexNative(long address, long maxMultiviewInstanceIndex);


    public void set(VkPhysicalDeviceMultiviewProperties o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkPhysicalDeviceMultiviewProperties implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceMultiviewProperties> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceMultiviewProperties.sizeof()));
            this.count = count;
        }

        public Array(VkPhysicalDeviceMultiviewProperties o, int count){
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
        public VkPhysicalDeviceMultiviewProperties get(int i){
            return new VkPhysicalDeviceMultiviewProperties(getVkMemory(), address(i));
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
