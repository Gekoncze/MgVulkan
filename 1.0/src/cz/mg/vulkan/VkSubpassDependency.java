package cz.mg.vulkan;

public class VkSubpassDependency extends VkObject {
    public VkSubpassDependency() {
        super(sizeof());
    }

    protected VkSubpassDependency(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkSubpassDependency(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkSubpassDependency(VkPointer pointer) {
        super(pointer);
    }



    public VkUInt32 getSrcSubpass() {
        return new VkUInt32(getVkMemory(), getSrcSubpassNative(getVkAddress()));
    }

    
    public void setSrcSubpass(VkUInt32 srcSubpass) {
        setSrcSubpassNative(getVkAddress(), srcSubpass != null ? srcSubpass.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSrcSubpassQ() {
        return getSrcSubpass().getValue();
    }

    public void setSrcSubpass(int srcSubpass) {
        getSrcSubpass().setValue(srcSubpass);
    }

    protected static native long getSrcSubpassNative(long address);
    protected static native void setSrcSubpassNative(long address, long srcSubpass);

    public VkUInt32 getDstSubpass() {
        return new VkUInt32(getVkMemory(), getDstSubpassNative(getVkAddress()));
    }

    
    public void setDstSubpass(VkUInt32 dstSubpass) {
        setDstSubpassNative(getVkAddress(), dstSubpass != null ? dstSubpass.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDstSubpassQ() {
        return getDstSubpass().getValue();
    }

    public void setDstSubpass(int dstSubpass) {
        getDstSubpass().setValue(dstSubpass);
    }

    protected static native long getDstSubpassNative(long address);
    protected static native void setDstSubpassNative(long address, long dstSubpass);

    public VkPipelineStageFlags getSrcStageMask() {
        return new VkPipelineStageFlags(getVkMemory(), getSrcStageMaskNative(getVkAddress()));
    }

    
    public void setSrcStageMask(VkPipelineStageFlags srcStageMask) {
        setSrcStageMaskNative(getVkAddress(), srcStageMask != null ? srcStageMask.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSrcStageMaskQ() {
        return getSrcStageMask().getValue();
    }

    public void setSrcStageMask(int srcStageMask) {
        getSrcStageMask().setValue(srcStageMask);
    }

    protected static native long getSrcStageMaskNative(long address);
    protected static native void setSrcStageMaskNative(long address, long srcStageMask);

    public VkPipelineStageFlags getDstStageMask() {
        return new VkPipelineStageFlags(getVkMemory(), getDstStageMaskNative(getVkAddress()));
    }

    
    public void setDstStageMask(VkPipelineStageFlags dstStageMask) {
        setDstStageMaskNative(getVkAddress(), dstStageMask != null ? dstStageMask.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDstStageMaskQ() {
        return getDstStageMask().getValue();
    }

    public void setDstStageMask(int dstStageMask) {
        getDstStageMask().setValue(dstStageMask);
    }

    protected static native long getDstStageMaskNative(long address);
    protected static native void setDstStageMaskNative(long address, long dstStageMask);

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

    public VkDependencyFlags getDependencyFlags() {
        return new VkDependencyFlags(getVkMemory(), getDependencyFlagsNative(getVkAddress()));
    }

    
    public void setDependencyFlags(VkDependencyFlags dependencyFlags) {
        setDependencyFlagsNative(getVkAddress(), dependencyFlags != null ? dependencyFlags.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDependencyFlagsQ() {
        return getDependencyFlags().getValue();
    }

    public void setDependencyFlags(int dependencyFlags) {
        getDependencyFlags().setValue(dependencyFlags);
    }

    protected static native long getDependencyFlagsNative(long address);
    protected static native void setDependencyFlagsNative(long address, long dependencyFlags);


    public static native long sizeof();

    public static class Array extends VkSubpassDependency implements cz.mg.collections.array.ReadonlyArray<VkSubpassDependency> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSubpassDependency.sizeof()));
            this.count = count;
        }

        public Array(VkSubpassDependency o, int count){
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
        public VkSubpassDependency get(int i){
            return new VkSubpassDependency(getVkMemory(), address(i));
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
