package cz.mg.vulkan;

public class VkImageFormatListCreateInfoKHR extends VkObject {
    public VkImageFormatListCreateInfoKHR() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_IMAGE_FORMAT_LIST_CREATE_INFO_KHR));
    }

    public VkImageFormatListCreateInfoKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkImageFormatListCreateInfoKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkImageFormatListCreateInfoKHR(VkPointer pointer) {
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

    public VkUInt32 getViewFormatCount() {
        return new VkUInt32(getVkMemory(), getViewFormatCountNative(getVkAddress()));
    }

    
    public void setViewFormatCount(VkUInt32 viewFormatCount) {
        setViewFormatCountNative(getVkAddress(), viewFormatCount != null ? viewFormatCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getViewFormatCountQ() {
        return getViewFormatCount().getValue();
    }

    public void setViewFormatCount(int viewFormatCount) {
        getViewFormatCount().setValue(viewFormatCount);
    }

    protected static native long getViewFormatCountNative(long address);
    protected static native void setViewFormatCountNative(long address, long viewFormatCount);

    public VkFormat getPViewFormats() {
        return new VkFormat(getVkMemory(), getPViewFormatsNative(getVkAddress()));
    }

    private VkObject pViewFormats = null;
    public void setPViewFormats(VkFormat pViewFormats) {
        setPViewFormatsNative(getVkAddress(), pViewFormats != null ? pViewFormats.getVkAddress() : VkPointer.NULL);
        this.pViewFormats = pViewFormats;
    }

    public VkFormat.Array getPViewFormatsQ() {
        return new VkFormat.Array(getPViewFormats(), getViewFormatCountQ());
    }

    protected static native long getPViewFormatsNative(long address);
    protected static native void setPViewFormatsNative(long address, long pViewFormats);


    public void set(VkImageFormatListCreateInfoKHR o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkImageFormatListCreateInfoKHR implements cz.mg.collections.array.ReadonlyArray<VkImageFormatListCreateInfoKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkImageFormatListCreateInfoKHR.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_IMAGE_FORMAT_LIST_CREATE_INFO_KHR));;
        }

        public Array(VkImageFormatListCreateInfoKHR o, int count){
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
        public VkImageFormatListCreateInfoKHR get(int i){
            return new VkImageFormatListCreateInfoKHR(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
