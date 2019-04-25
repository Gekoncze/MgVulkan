package cz.mg.vulkan;

public class VkPipelineColorBlendAttachmentState extends VkObject {
    public VkPipelineColorBlendAttachmentState() {
        super(sizeof());
    }

    protected VkPipelineColorBlendAttachmentState(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkPipelineColorBlendAttachmentState(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPipelineColorBlendAttachmentState(VkPointer pointer) {
        super(pointer);
    }



    public VkBool32 getBlendEnable() {
        return new VkBool32(getVkMemory(), getBlendEnableNative(getVkAddress()));
    }

    
    public void setBlendEnable(VkBool32 blendEnable) {
        setBlendEnableNative(getVkAddress(), blendEnable != null ? blendEnable.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getBlendEnableQ() {
        return getBlendEnable().getValue();
    }

    public void setBlendEnable(int blendEnable) {
        getBlendEnable().setValue(blendEnable);
    }

    protected static native long getBlendEnableNative(long address);
    protected static native void setBlendEnableNative(long address, long blendEnable);

    public VkBlendFactor getSrcColorBlendFactor() {
        return new VkBlendFactor(getVkMemory(), getSrcColorBlendFactorNative(getVkAddress()));
    }

    
    public void setSrcColorBlendFactor(VkBlendFactor srcColorBlendFactor) {
        setSrcColorBlendFactorNative(getVkAddress(), srcColorBlendFactor != null ? srcColorBlendFactor.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSrcColorBlendFactorQ() {
        return getSrcColorBlendFactor().getValue();
    }

    public void setSrcColorBlendFactor(int srcColorBlendFactor) {
        getSrcColorBlendFactor().setValue(srcColorBlendFactor);
    }

    protected static native long getSrcColorBlendFactorNative(long address);
    protected static native void setSrcColorBlendFactorNative(long address, long srcColorBlendFactor);

    public VkBlendFactor getDstColorBlendFactor() {
        return new VkBlendFactor(getVkMemory(), getDstColorBlendFactorNative(getVkAddress()));
    }

    
    public void setDstColorBlendFactor(VkBlendFactor dstColorBlendFactor) {
        setDstColorBlendFactorNative(getVkAddress(), dstColorBlendFactor != null ? dstColorBlendFactor.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDstColorBlendFactorQ() {
        return getDstColorBlendFactor().getValue();
    }

    public void setDstColorBlendFactor(int dstColorBlendFactor) {
        getDstColorBlendFactor().setValue(dstColorBlendFactor);
    }

    protected static native long getDstColorBlendFactorNative(long address);
    protected static native void setDstColorBlendFactorNative(long address, long dstColorBlendFactor);

    public VkBlendOp getColorBlendOp() {
        return new VkBlendOp(getVkMemory(), getColorBlendOpNative(getVkAddress()));
    }

    
    public void setColorBlendOp(VkBlendOp colorBlendOp) {
        setColorBlendOpNative(getVkAddress(), colorBlendOp != null ? colorBlendOp.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getColorBlendOpQ() {
        return getColorBlendOp().getValue();
    }

    public void setColorBlendOp(int colorBlendOp) {
        getColorBlendOp().setValue(colorBlendOp);
    }

    protected static native long getColorBlendOpNative(long address);
    protected static native void setColorBlendOpNative(long address, long colorBlendOp);

    public VkBlendFactor getSrcAlphaBlendFactor() {
        return new VkBlendFactor(getVkMemory(), getSrcAlphaBlendFactorNative(getVkAddress()));
    }

    
    public void setSrcAlphaBlendFactor(VkBlendFactor srcAlphaBlendFactor) {
        setSrcAlphaBlendFactorNative(getVkAddress(), srcAlphaBlendFactor != null ? srcAlphaBlendFactor.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSrcAlphaBlendFactorQ() {
        return getSrcAlphaBlendFactor().getValue();
    }

    public void setSrcAlphaBlendFactor(int srcAlphaBlendFactor) {
        getSrcAlphaBlendFactor().setValue(srcAlphaBlendFactor);
    }

    protected static native long getSrcAlphaBlendFactorNative(long address);
    protected static native void setSrcAlphaBlendFactorNative(long address, long srcAlphaBlendFactor);

    public VkBlendFactor getDstAlphaBlendFactor() {
        return new VkBlendFactor(getVkMemory(), getDstAlphaBlendFactorNative(getVkAddress()));
    }

    
    public void setDstAlphaBlendFactor(VkBlendFactor dstAlphaBlendFactor) {
        setDstAlphaBlendFactorNative(getVkAddress(), dstAlphaBlendFactor != null ? dstAlphaBlendFactor.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDstAlphaBlendFactorQ() {
        return getDstAlphaBlendFactor().getValue();
    }

    public void setDstAlphaBlendFactor(int dstAlphaBlendFactor) {
        getDstAlphaBlendFactor().setValue(dstAlphaBlendFactor);
    }

    protected static native long getDstAlphaBlendFactorNative(long address);
    protected static native void setDstAlphaBlendFactorNative(long address, long dstAlphaBlendFactor);

    public VkBlendOp getAlphaBlendOp() {
        return new VkBlendOp(getVkMemory(), getAlphaBlendOpNative(getVkAddress()));
    }

    
    public void setAlphaBlendOp(VkBlendOp alphaBlendOp) {
        setAlphaBlendOpNative(getVkAddress(), alphaBlendOp != null ? alphaBlendOp.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getAlphaBlendOpQ() {
        return getAlphaBlendOp().getValue();
    }

    public void setAlphaBlendOp(int alphaBlendOp) {
        getAlphaBlendOp().setValue(alphaBlendOp);
    }

    protected static native long getAlphaBlendOpNative(long address);
    protected static native void setAlphaBlendOpNative(long address, long alphaBlendOp);

    public VkColorComponentFlags getColorWriteMask() {
        return new VkColorComponentFlags(getVkMemory(), getColorWriteMaskNative(getVkAddress()));
    }

    
    public void setColorWriteMask(VkColorComponentFlags colorWriteMask) {
        setColorWriteMaskNative(getVkAddress(), colorWriteMask != null ? colorWriteMask.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getColorWriteMaskQ() {
        return getColorWriteMask().getValue();
    }

    public void setColorWriteMask(int colorWriteMask) {
        getColorWriteMask().setValue(colorWriteMask);
    }

    protected static native long getColorWriteMaskNative(long address);
    protected static native void setColorWriteMaskNative(long address, long colorWriteMask);


    public static native long sizeof();

    public static class Array extends VkPipelineColorBlendAttachmentState implements cz.mg.collections.array.ReadonlyArray<VkPipelineColorBlendAttachmentState> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPipelineColorBlendAttachmentState.sizeof()));
            this.count = count;
        }

        public Array(VkPipelineColorBlendAttachmentState o, int count){
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
        public VkPipelineColorBlendAttachmentState get(int i){
            return new VkPipelineColorBlendAttachmentState(getVkMemory(), address(i));
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
