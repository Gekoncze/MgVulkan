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

    public VkRect2D getSrcRect() {
        return new VkRect2D(getVkMemory(), getSrcRect(getVkAddress()));
    }

    
    public void setSrcRect(VkRect2D srcRect) {
        setSrcRect(getVkAddress(), srcRect != null ? srcRect.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getSrcRect(long address);
    protected static native void setSrcRect(long address, long srcRect);

    public VkRect2D getDstRect() {
        return new VkRect2D(getVkMemory(), getDstRect(getVkAddress()));
    }

    
    public void setDstRect(VkRect2D dstRect) {
        setDstRect(getVkAddress(), dstRect != null ? dstRect.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getDstRect(long address);
    protected static native void setDstRect(long address, long dstRect);

    public VkBool32 getPersistent() {
        return new VkBool32(getVkMemory(), getPersistent(getVkAddress()));
    }

    
    public void setPersistent(VkBool32 persistent) {
        setPersistent(getVkAddress(), persistent != null ? persistent.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getPersistentQ() {
        return getPersistent().getValue();
    }

    public void setPersistent(int persistent) {
        getPersistent().setValue(persistent);
    }

    protected static native long getPersistent(long address);
    protected static native void setPersistent(long address, long persistent);


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
