package cz.mg.vulkan;

public class VkSubpassDependency extends VkObject {
    public VkSubpassDependency() {
        super(sizeof());
    }

    public VkSubpassDependency(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSubpassDependency(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkUInt32 getSrcSubpass() {
        return new VkUInt32(getVkMemory(), getSrcSubpass(getVkAddress()));
    }

    
    public void setSrcSubpass(VkUInt32 srcSubpass) {
        setSrcSubpass(getVkAddress(), srcSubpass != null ? srcSubpass.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSrcSubpassQ() {
        return getSrcSubpass().getValue();
    }

    public void setSrcSubpass(int srcSubpass) {
        getSrcSubpass().setValue(srcSubpass);
    }

    protected static native long getSrcSubpass(long address);
    protected static native void setSrcSubpass(long address, long srcSubpass);

    public VkUInt32 getDstSubpass() {
        return new VkUInt32(getVkMemory(), getDstSubpass(getVkAddress()));
    }

    
    public void setDstSubpass(VkUInt32 dstSubpass) {
        setDstSubpass(getVkAddress(), dstSubpass != null ? dstSubpass.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDstSubpassQ() {
        return getDstSubpass().getValue();
    }

    public void setDstSubpass(int dstSubpass) {
        getDstSubpass().setValue(dstSubpass);
    }

    protected static native long getDstSubpass(long address);
    protected static native void setDstSubpass(long address, long dstSubpass);

    public VkPipelineStageFlags getSrcStageMask() {
        return new VkPipelineStageFlags(getVkMemory(), getSrcStageMask(getVkAddress()));
    }

    
    public void setSrcStageMask(VkPipelineStageFlags srcStageMask) {
        setSrcStageMask(getVkAddress(), srcStageMask != null ? srcStageMask.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSrcStageMaskQ() {
        return getSrcStageMask().getValue();
    }

    public void setSrcStageMask(int srcStageMask) {
        getSrcStageMask().setValue(srcStageMask);
    }

    protected static native long getSrcStageMask(long address);
    protected static native void setSrcStageMask(long address, long srcStageMask);

    public VkPipelineStageFlags getDstStageMask() {
        return new VkPipelineStageFlags(getVkMemory(), getDstStageMask(getVkAddress()));
    }

    
    public void setDstStageMask(VkPipelineStageFlags dstStageMask) {
        setDstStageMask(getVkAddress(), dstStageMask != null ? dstStageMask.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDstStageMaskQ() {
        return getDstStageMask().getValue();
    }

    public void setDstStageMask(int dstStageMask) {
        getDstStageMask().setValue(dstStageMask);
    }

    protected static native long getDstStageMask(long address);
    protected static native void setDstStageMask(long address, long dstStageMask);

    public VkAccessFlags getSrcAccessMask() {
        return new VkAccessFlags(getVkMemory(), getSrcAccessMask(getVkAddress()));
    }

    
    public void setSrcAccessMask(VkAccessFlags srcAccessMask) {
        setSrcAccessMask(getVkAddress(), srcAccessMask != null ? srcAccessMask.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSrcAccessMaskQ() {
        return getSrcAccessMask().getValue();
    }

    public void setSrcAccessMask(int srcAccessMask) {
        getSrcAccessMask().setValue(srcAccessMask);
    }

    protected static native long getSrcAccessMask(long address);
    protected static native void setSrcAccessMask(long address, long srcAccessMask);

    public VkAccessFlags getDstAccessMask() {
        return new VkAccessFlags(getVkMemory(), getDstAccessMask(getVkAddress()));
    }

    
    public void setDstAccessMask(VkAccessFlags dstAccessMask) {
        setDstAccessMask(getVkAddress(), dstAccessMask != null ? dstAccessMask.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDstAccessMaskQ() {
        return getDstAccessMask().getValue();
    }

    public void setDstAccessMask(int dstAccessMask) {
        getDstAccessMask().setValue(dstAccessMask);
    }

    protected static native long getDstAccessMask(long address);
    protected static native void setDstAccessMask(long address, long dstAccessMask);

    public VkDependencyFlags getDependencyFlags() {
        return new VkDependencyFlags(getVkMemory(), getDependencyFlags(getVkAddress()));
    }

    
    public void setDependencyFlags(VkDependencyFlags dependencyFlags) {
        setDependencyFlags(getVkAddress(), dependencyFlags != null ? dependencyFlags.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDependencyFlagsQ() {
        return getDependencyFlags().getValue();
    }

    public void setDependencyFlags(int dependencyFlags) {
        getDependencyFlags().setValue(dependencyFlags);
    }

    protected static native long getDependencyFlags(long address);
    protected static native void setDependencyFlags(long address, long dependencyFlags);


    public static native long sizeof();

    public static class Array extends VkSubpassDependency implements cz.mg.collections.array.ReadonlyArray<VkSubpassDependency> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSubpassDependency.sizeof()));
            this.count = count;
        }

        public Array(int count, VkSubpassDependency o){
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
        public VkSubpassDependency get(int i){
            return new VkSubpassDependency(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }

        public static class Array2 extends VkPointer.Array {
            public Array2(int count) {
                super(count);
            }

            public Array2(int count, VkPointer o){
                super(count, o);
            }

            public Array2(VkMemory vkmemory, int count) {
                super(vkmemory, count);
            }

            public Array2(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress, count);
            }
        }
    }
}
