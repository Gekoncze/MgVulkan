package cz.mg.vulkan;

public class VkDisplayPresentInfoKHR extends VkObject {
    public VkDisplayPresentInfoKHR() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DISPLAY_PRESENT_INFO_KHR));
    }

    public VkDisplayPresentInfoKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDisplayPresentInfoKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDisplayPresentInfoKHR(VkPointer pointer) {
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

    public VkRect2D getSrcRect() {
        return new VkRect2D(getVkMemory(), getSrcRectNative(getVkAddress()));
    }

    
    public void setSrcRect(VkRect2D srcRect) {
        setSrcRectNative(getVkAddress(), srcRect != null ? srcRect.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getSrcRectNative(long address);
    protected static native void setSrcRectNative(long address, long srcRect);

    public VkRect2D getDstRect() {
        return new VkRect2D(getVkMemory(), getDstRectNative(getVkAddress()));
    }

    
    public void setDstRect(VkRect2D dstRect) {
        setDstRectNative(getVkAddress(), dstRect != null ? dstRect.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getDstRectNative(long address);
    protected static native void setDstRectNative(long address, long dstRect);

    public VkBool32 getPersistent() {
        return new VkBool32(getVkMemory(), getPersistentNative(getVkAddress()));
    }

    
    public void setPersistent(VkBool32 persistent) {
        setPersistentNative(getVkAddress(), persistent != null ? persistent.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getPersistentQ() {
        return getPersistent().getValue();
    }

    public void setPersistent(int persistent) {
        getPersistent().setValue(persistent);
    }

    protected static native long getPersistentNative(long address);
    protected static native void setPersistentNative(long address, long persistent);


    public static native long sizeof();

    public static class Array extends VkDisplayPresentInfoKHR implements cz.mg.collections.array.ReadonlyArray<VkDisplayPresentInfoKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDisplayPresentInfoKHR.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DISPLAY_PRESENT_INFO_KHR));;
        }

        public Array(int count, VkDisplayPresentInfoKHR o){
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
        public VkDisplayPresentInfoKHR get(int i){
            return new VkDisplayPresentInfoKHR(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
