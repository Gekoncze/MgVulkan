package cz.mg.vulkan;

public class VkPipelineColorBlendAttachmentState extends VkObject {
    public VkPipelineColorBlendAttachmentState() {
        super(sizeof());
    }

    public VkPipelineColorBlendAttachmentState(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineColorBlendAttachmentState(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkBool32 getBlendEnable() {
        return new VkBool32(getVkMemory(), getBlendEnable(getVkAddress()));
    }

    
    public void setBlendEnable(VkBool32 blendEnable) {
        setBlendEnable(getVkAddress(), blendEnable != null ? blendEnable.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getBlendEnableQ() {
        return getBlendEnable().getValue();
    }

    public void setBlendEnable(int blendEnable) {
        getBlendEnable().setValue(blendEnable);
    }

    protected static native long getBlendEnable(long address);
    protected static native void setBlendEnable(long address, long blendEnable);

    public VkBlendFactor getSrcColorBlendFactor() {
        return new VkBlendFactor(getVkMemory(), getSrcColorBlendFactor(getVkAddress()));
    }

    
    public void setSrcColorBlendFactor(VkBlendFactor srcColorBlendFactor) {
        setSrcColorBlendFactor(getVkAddress(), srcColorBlendFactor != null ? srcColorBlendFactor.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSrcColorBlendFactorQ() {
        return getSrcColorBlendFactor().getValue();
    }

    public void setSrcColorBlendFactor(int srcColorBlendFactor) {
        getSrcColorBlendFactor().setValue(srcColorBlendFactor);
    }

    protected static native long getSrcColorBlendFactor(long address);
    protected static native void setSrcColorBlendFactor(long address, long srcColorBlendFactor);

    public VkBlendFactor getDstColorBlendFactor() {
        return new VkBlendFactor(getVkMemory(), getDstColorBlendFactor(getVkAddress()));
    }

    
    public void setDstColorBlendFactor(VkBlendFactor dstColorBlendFactor) {
        setDstColorBlendFactor(getVkAddress(), dstColorBlendFactor != null ? dstColorBlendFactor.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDstColorBlendFactorQ() {
        return getDstColorBlendFactor().getValue();
    }

    public void setDstColorBlendFactor(int dstColorBlendFactor) {
        getDstColorBlendFactor().setValue(dstColorBlendFactor);
    }

    protected static native long getDstColorBlendFactor(long address);
    protected static native void setDstColorBlendFactor(long address, long dstColorBlendFactor);

    public VkBlendOp getColorBlendOp() {
        return new VkBlendOp(getVkMemory(), getColorBlendOp(getVkAddress()));
    }

    
    public void setColorBlendOp(VkBlendOp colorBlendOp) {
        setColorBlendOp(getVkAddress(), colorBlendOp != null ? colorBlendOp.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getColorBlendOpQ() {
        return getColorBlendOp().getValue();
    }

    public void setColorBlendOp(int colorBlendOp) {
        getColorBlendOp().setValue(colorBlendOp);
    }

    protected static native long getColorBlendOp(long address);
    protected static native void setColorBlendOp(long address, long colorBlendOp);

    public VkBlendFactor getSrcAlphaBlendFactor() {
        return new VkBlendFactor(getVkMemory(), getSrcAlphaBlendFactor(getVkAddress()));
    }

    
    public void setSrcAlphaBlendFactor(VkBlendFactor srcAlphaBlendFactor) {
        setSrcAlphaBlendFactor(getVkAddress(), srcAlphaBlendFactor != null ? srcAlphaBlendFactor.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSrcAlphaBlendFactorQ() {
        return getSrcAlphaBlendFactor().getValue();
    }

    public void setSrcAlphaBlendFactor(int srcAlphaBlendFactor) {
        getSrcAlphaBlendFactor().setValue(srcAlphaBlendFactor);
    }

    protected static native long getSrcAlphaBlendFactor(long address);
    protected static native void setSrcAlphaBlendFactor(long address, long srcAlphaBlendFactor);

    public VkBlendFactor getDstAlphaBlendFactor() {
        return new VkBlendFactor(getVkMemory(), getDstAlphaBlendFactor(getVkAddress()));
    }

    
    public void setDstAlphaBlendFactor(VkBlendFactor dstAlphaBlendFactor) {
        setDstAlphaBlendFactor(getVkAddress(), dstAlphaBlendFactor != null ? dstAlphaBlendFactor.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDstAlphaBlendFactorQ() {
        return getDstAlphaBlendFactor().getValue();
    }

    public void setDstAlphaBlendFactor(int dstAlphaBlendFactor) {
        getDstAlphaBlendFactor().setValue(dstAlphaBlendFactor);
    }

    protected static native long getDstAlphaBlendFactor(long address);
    protected static native void setDstAlphaBlendFactor(long address, long dstAlphaBlendFactor);

    public VkBlendOp getAlphaBlendOp() {
        return new VkBlendOp(getVkMemory(), getAlphaBlendOp(getVkAddress()));
    }

    
    public void setAlphaBlendOp(VkBlendOp alphaBlendOp) {
        setAlphaBlendOp(getVkAddress(), alphaBlendOp != null ? alphaBlendOp.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getAlphaBlendOpQ() {
        return getAlphaBlendOp().getValue();
    }

    public void setAlphaBlendOp(int alphaBlendOp) {
        getAlphaBlendOp().setValue(alphaBlendOp);
    }

    protected static native long getAlphaBlendOp(long address);
    protected static native void setAlphaBlendOp(long address, long alphaBlendOp);

    public VkColorComponentFlags getColorWriteMask() {
        return new VkColorComponentFlags(getVkMemory(), getColorWriteMask(getVkAddress()));
    }

    
    public void setColorWriteMask(VkColorComponentFlags colorWriteMask) {
        setColorWriteMask(getVkAddress(), colorWriteMask != null ? colorWriteMask.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getColorWriteMaskQ() {
        return getColorWriteMask().getValue();
    }

    public void setColorWriteMask(int colorWriteMask) {
        getColorWriteMask().setValue(colorWriteMask);
    }

    protected static native long getColorWriteMask(long address);
    protected static native void setColorWriteMask(long address, long colorWriteMask);


    public static native long sizeof();

    public static class Array extends VkPipelineColorBlendAttachmentState implements cz.mg.collections.array.ReadonlyArray<VkPipelineColorBlendAttachmentState> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPipelineColorBlendAttachmentState.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPipelineColorBlendAttachmentState o){
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
        public VkPipelineColorBlendAttachmentState get(int i){
            return new VkPipelineColorBlendAttachmentState(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }
    }

    public static class Pointer extends VkObject.Pointer {
        public Pointer() {
        }

        public Pointer(long value) {
            setValue(value);
        }

        public Pointer(VkMemory vkmemory) {
            super(vkmemory);
        }

        public Pointer(VkMemory vkmemory, long vkaddress) {
            super(vkmemory, vkaddress);
        }

        public static class Array extends VkPipelineColorBlendAttachmentState.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPipelineColorBlendAttachmentState.Pointer> {
            private final int count;

            public Array(int count) {
                super(new VkMemory(count*VkPointer.sizeof()));
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

            public Array(VkPipelineColorBlendAttachmentState[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            public Array(long... values){
                this(values.length);
                for(int i = 0; i < values.length; i++) setValueAt(i, values[i]);
            }

            public long getValueAt(int i){
                return getValueNative(addressAt(i));
            }

            public void setValueAt(int i, long value){
                setValueNative(addressAt(i), value);
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkPipelineColorBlendAttachmentState.Pointer get(int i){
                return new VkPipelineColorBlendAttachmentState.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }

            protected long addressAt(int i){
                return VkPointer.plus(getVkAddress(), sizeof()*i);
            }
        }
    }
}
