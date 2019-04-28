package cz.mg.vulkan;

public class VkPhysicalDeviceMaintenance3Properties extends VkObject {
    public VkPhysicalDeviceMaintenance3Properties() {
        super(sizeof());
    }

    protected VkPhysicalDeviceMaintenance3Properties(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkPhysicalDeviceMaintenance3Properties(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPhysicalDeviceMaintenance3Properties(VkPointer pointer) {
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

    public VkUInt32 getMaxPerSetDescriptors() {
        return new VkUInt32(getVkMemory(), getMaxPerSetDescriptorsNative(getVkAddress()));
    }

    
    public void setMaxPerSetDescriptors(VkUInt32 maxPerSetDescriptors) {
        setMaxPerSetDescriptorsNative(getVkAddress(), maxPerSetDescriptors != null ? maxPerSetDescriptors.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxPerSetDescriptorsQ() {
        return getMaxPerSetDescriptors().getValue();
    }

    public void setMaxPerSetDescriptors(int maxPerSetDescriptors) {
        getMaxPerSetDescriptors().setValue(maxPerSetDescriptors);
    }

    protected static native long getMaxPerSetDescriptorsNative(long address);
    protected static native void setMaxPerSetDescriptorsNative(long address, long maxPerSetDescriptors);

    public VkDeviceSize getMaxMemoryAllocationSize() {
        return new VkDeviceSize(getVkMemory(), getMaxMemoryAllocationSizeNative(getVkAddress()));
    }

    
    public void setMaxMemoryAllocationSize(VkDeviceSize maxMemoryAllocationSize) {
        setMaxMemoryAllocationSizeNative(getVkAddress(), maxMemoryAllocationSize != null ? maxMemoryAllocationSize.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getMaxMemoryAllocationSizeQ() {
        return getMaxMemoryAllocationSize().getValue();
    }

    public void setMaxMemoryAllocationSize(long maxMemoryAllocationSize) {
        getMaxMemoryAllocationSize().setValue(maxMemoryAllocationSize);
    }

    protected static native long getMaxMemoryAllocationSizeNative(long address);
    protected static native void setMaxMemoryAllocationSizeNative(long address, long maxMemoryAllocationSize);


    public static native long sizeof();

    public static class Array extends VkPhysicalDeviceMaintenance3Properties implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceMaintenance3Properties> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceMaintenance3Properties.sizeof()));
            this.count = count;
        }

        public Array(VkPhysicalDeviceMaintenance3Properties o, int count){
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
        public VkPhysicalDeviceMaintenance3Properties get(int i){
            return new VkPhysicalDeviceMaintenance3Properties(getVkMemory(), address(i));
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
