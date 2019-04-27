package cz.mg.vulkan;

public class VkMemoryBarrier extends VkObject {
    public VkMemoryBarrier() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_MEMORY_BARRIER));
    }

    public VkMemoryBarrier(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkMemoryBarrier(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkMemoryBarrier(VkPointer pointer) {
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

    public VkAccessFlags getSrcAccessMask() {
        return new VkAccessFlags(getVkMemory(), getSrcAccessMaskNative(getVkAddress()));
    }

    
    public void setSrcAccessMask(VkAccessFlags srcAccessMask) {
        setSrcAccessMaskNative(getVkAddress(), srcAccessMask != null ? srcAccessMask.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSrcAccessMaskQ() {
        return getSrcAccessMask().getValue();
    }

    public void setSrcAccessMask(int srcAccessMask) {
        getSrcAccessMask().setValue(srcAccessMask);
    }

    protected static native long getSrcAccessMaskNative(long address);
    protected static native void setSrcAccessMaskNative(long address, long srcAccessMask);

    public VkAccessFlags getDstAccessMask() {
        return new VkAccessFlags(getVkMemory(), getDstAccessMaskNative(getVkAddress()));
    }

    
    public void setDstAccessMask(VkAccessFlags dstAccessMask) {
        setDstAccessMaskNative(getVkAddress(), dstAccessMask != null ? dstAccessMask.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDstAccessMaskQ() {
        return getDstAccessMask().getValue();
    }

    public void setDstAccessMask(int dstAccessMask) {
        getDstAccessMask().setValue(dstAccessMask);
    }

    protected static native long getDstAccessMaskNative(long address);
    protected static native void setDstAccessMaskNative(long address, long dstAccessMask);


    public static native long sizeof();

    public static class Array extends VkMemoryBarrier implements cz.mg.collections.array.ReadonlyArray<VkMemoryBarrier> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkMemoryBarrier.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_MEMORY_BARRIER));;
        }

        public Array(int count, VkMemoryBarrier o){
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
        public VkMemoryBarrier get(int i){
            return new VkMemoryBarrier(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
