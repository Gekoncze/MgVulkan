package cz.mg.vulkan;

public class VkImageMemoryRequirementsInfo2 extends VkObject {
    public VkImageMemoryRequirementsInfo2() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_IMAGE_MEMORY_REQUIREMENTS_INFO_2));
    }

    public VkImageMemoryRequirementsInfo2(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkImageMemoryRequirementsInfo2(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkImageMemoryRequirementsInfo2(VkPointer pointer) {
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

    public VkImage getImage() {
        return new VkImage(getVkMemory(), getImageNative(getVkAddress()));
    }

    
    public void setImage(VkImage image) {
        setImageNative(getVkAddress(), image != null ? image.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getImageNative(long address);
    protected static native void setImageNative(long address, long image);


    public void set(VkImageMemoryRequirementsInfo2 o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkImageMemoryRequirementsInfo2 implements cz.mg.collections.array.ReadonlyArray<VkImageMemoryRequirementsInfo2> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkImageMemoryRequirementsInfo2.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_IMAGE_MEMORY_REQUIREMENTS_INFO_2));;
        }

        public Array(VkImageMemoryRequirementsInfo2 o, int count){
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
        public VkImageMemoryRequirementsInfo2 get(int i){
            return new VkImageMemoryRequirementsInfo2(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
