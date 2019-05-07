package cz.mg.vulkan;

public class VkBufferViewCreateInfo extends VkObject {
    public VkBufferViewCreateInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_BUFFER_VIEW_CREATE_INFO));
    }

    public VkBufferViewCreateInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkBufferViewCreateInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkBufferViewCreateInfo(VkPointer pointer) {
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

    public VkBufferViewCreateFlags getFlags() {
        return new VkBufferViewCreateFlags(getVkMemory(), getFlagsNative(getVkAddress()));
    }

    
    public void setFlags(VkBufferViewCreateFlags flags) {
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

    public VkBuffer getBuffer() {
        return new VkBuffer(getVkMemory(), getBufferNative(getVkAddress()));
    }

    
    public void setBuffer(VkBuffer buffer) {
        setBufferNative(getVkAddress(), buffer != null ? buffer.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getBufferNative(long address);
    protected static native void setBufferNative(long address, long buffer);

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

    public VkDeviceSize getOffset() {
        return new VkDeviceSize(getVkMemory(), getOffsetNative(getVkAddress()));
    }

    
    public void setOffset(VkDeviceSize offset) {
        setOffsetNative(getVkAddress(), offset != null ? offset.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getOffsetQ() {
        return getOffset().getValue();
    }

    public void setOffset(long offset) {
        getOffset().setValue(offset);
    }

    protected static native long getOffsetNative(long address);
    protected static native void setOffsetNative(long address, long offset);

    public VkDeviceSize getRange() {
        return new VkDeviceSize(getVkMemory(), getRangeNative(getVkAddress()));
    }

    
    public void setRange(VkDeviceSize range) {
        setRangeNative(getVkAddress(), range != null ? range.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getRangeQ() {
        return getRange().getValue();
    }

    public void setRange(long range) {
        getRange().setValue(range);
    }

    protected static native long getRangeNative(long address);
    protected static native void setRangeNative(long address, long range);


    public void set(VkBufferViewCreateInfo o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkBufferViewCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkBufferViewCreateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkBufferViewCreateInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_BUFFER_VIEW_CREATE_INFO));;
        }

        public Array(VkBufferViewCreateInfo o, int count){
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
        public VkBufferViewCreateInfo get(int i){
            return new VkBufferViewCreateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
