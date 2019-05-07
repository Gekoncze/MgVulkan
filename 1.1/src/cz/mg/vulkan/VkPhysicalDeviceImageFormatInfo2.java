package cz.mg.vulkan;

public class VkPhysicalDeviceImageFormatInfo2 extends VkObject {
    public VkPhysicalDeviceImageFormatInfo2() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2));
    }

    public VkPhysicalDeviceImageFormatInfo2(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPhysicalDeviceImageFormatInfo2(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPhysicalDeviceImageFormatInfo2(VkPointer pointer) {
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

    public VkFormat getFormat() {
        return new VkFormat(getVkMemory(), getFormatNative(getVkAddress()));
    }

    
    public void setFormat(VkFormat format) {
        setFormatNative(getVkAddress(), format != null ? format.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFormatQ() {
        return getFormat().getValue();
    }

    public void setFormat(int format) {
        getFormat().setValue(format);
    }

    protected static native long getFormatNative(long address);
    protected static native void setFormatNative(long address, long format);

    public VkImageType getType() {
        return new VkImageType(getVkMemory(), getTypeNative(getVkAddress()));
    }

    
    public void setType(VkImageType type) {
        setTypeNative(getVkAddress(), type != null ? type.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getTypeQ() {
        return getType().getValue();
    }

    public void setType(int type) {
        getType().setValue(type);
    }

    protected static native long getTypeNative(long address);
    protected static native void setTypeNative(long address, long type);

    public VkImageTiling getTiling() {
        return new VkImageTiling(getVkMemory(), getTilingNative(getVkAddress()));
    }

    
    public void setTiling(VkImageTiling tiling) {
        setTilingNative(getVkAddress(), tiling != null ? tiling.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getTilingQ() {
        return getTiling().getValue();
    }

    public void setTiling(int tiling) {
        getTiling().setValue(tiling);
    }

    protected static native long getTilingNative(long address);
    protected static native void setTilingNative(long address, long tiling);

    public VkImageUsageFlags getUsage() {
        return new VkImageUsageFlags(getVkMemory(), getUsageNative(getVkAddress()));
    }

    
    public void setUsage(VkImageUsageFlags usage) {
        setUsageNative(getVkAddress(), usage != null ? usage.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getUsageQ() {
        return getUsage().getValue();
    }

    public void setUsage(int usage) {
        getUsage().setValue(usage);
    }

    protected static native long getUsageNative(long address);
    protected static native void setUsageNative(long address, long usage);

    public VkImageCreateFlags getFlags() {
        return new VkImageCreateFlags(getVkMemory(), getFlagsNative(getVkAddress()));
    }

    
    public void setFlags(VkImageCreateFlags flags) {
        setFlagsNative(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFlagsQ() {
        return getFlags().getValue();
    }

    public void setFlags(int flags) {
        getFlags().setValue(flags);
    }

    protected static native long getFlagsNative(long address);
    protected static native void setFlagsNative(long address, long flags);


    public void set(VkPhysicalDeviceImageFormatInfo2 o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkPhysicalDeviceImageFormatInfo2 implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceImageFormatInfo2> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceImageFormatInfo2.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2));;
        }

        public Array(VkPhysicalDeviceImageFormatInfo2 o, int count){
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
        public VkPhysicalDeviceImageFormatInfo2 get(int i){
            return new VkPhysicalDeviceImageFormatInfo2(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
