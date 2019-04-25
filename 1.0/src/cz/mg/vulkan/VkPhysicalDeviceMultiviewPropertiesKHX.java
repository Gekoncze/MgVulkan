package cz.mg.vulkan;

public class VkPhysicalDeviceMultiviewPropertiesKHX extends VkObject {
    public VkPhysicalDeviceMultiviewPropertiesKHX() {
        super(sizeof());
    }

    protected VkPhysicalDeviceMultiviewPropertiesKHX(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkPhysicalDeviceMultiviewPropertiesKHX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPhysicalDeviceMultiviewPropertiesKHX(VkPointer pointer) {
        super(pointer);
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

    public VkUInt32 getMaxMultiviewViewCount() {
        return new VkUInt32(getVkMemory(), getMaxMultiviewViewCount(getVkAddress()));
    }

    
    public void setMaxMultiviewViewCount(VkUInt32 maxMultiviewViewCount) {
        setMaxMultiviewViewCount(getVkAddress(), maxMultiviewViewCount != null ? maxMultiviewViewCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxMultiviewViewCountQ() {
        return getMaxMultiviewViewCount().getValue();
    }

    public void setMaxMultiviewViewCount(int maxMultiviewViewCount) {
        getMaxMultiviewViewCount().setValue(maxMultiviewViewCount);
    }

    protected static native long getMaxMultiviewViewCount(long address);
    protected static native void setMaxMultiviewViewCount(long address, long maxMultiviewViewCount);

    public VkUInt32 getMaxMultiviewInstanceIndex() {
        return new VkUInt32(getVkMemory(), getMaxMultiviewInstanceIndex(getVkAddress()));
    }

    
    public void setMaxMultiviewInstanceIndex(VkUInt32 maxMultiviewInstanceIndex) {
        setMaxMultiviewInstanceIndex(getVkAddress(), maxMultiviewInstanceIndex != null ? maxMultiviewInstanceIndex.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxMultiviewInstanceIndexQ() {
        return getMaxMultiviewInstanceIndex().getValue();
    }

    public void setMaxMultiviewInstanceIndex(int maxMultiviewInstanceIndex) {
        getMaxMultiviewInstanceIndex().setValue(maxMultiviewInstanceIndex);
    }

    protected static native long getMaxMultiviewInstanceIndex(long address);
    protected static native void setMaxMultiviewInstanceIndex(long address, long maxMultiviewInstanceIndex);


    public static native long sizeof();

    public static class Array extends VkPhysicalDeviceMultiviewPropertiesKHX implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceMultiviewPropertiesKHX> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceMultiviewPropertiesKHX.sizeof()));
            this.count = count;
        }

        public Array(VkPhysicalDeviceMultiviewPropertiesKHX o, int count){
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
        public VkPhysicalDeviceMultiviewPropertiesKHX get(int i){
            return new VkPhysicalDeviceMultiviewPropertiesKHX(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
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
