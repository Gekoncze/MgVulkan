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

    public VkPipelineColorBlendAttachmentState(VkBool32 blendEnable, VkBlendFactor srcColorBlendFactor, VkBlendFactor dstColorBlendFactor, VkBlendOp colorBlendOp, VkBlendFactor srcAlphaBlendFactor, VkBlendFactor dstAlphaBlendFactor, VkBlendOp alphaBlendOp, VkColorComponentFlags colorWriteMask) {
        super(sizeof());
        setBlendEnable(blendEnable);
        setSrcColorBlendFactor(srcColorBlendFactor);
        setDstColorBlendFactor(dstColorBlendFactor);
        setColorBlendOp(colorBlendOp);
        setSrcAlphaBlendFactor(srcAlphaBlendFactor);
        setDstAlphaBlendFactor(dstAlphaBlendFactor);
        setAlphaBlendOp(alphaBlendOp);
        setColorWriteMask(colorWriteMask);
    }

    public VkBool32 getBlendEnable() {
        return new VkBool32(getVkMemory(), getBlendEnable(getVkAddress()));
    }

    
    public void setBlendEnable(VkBool32 blendEnable) {
        setBlendEnable(getVkAddress(), blendEnable != null ? blendEnable.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getBlendEnable(long address);
    private static native void setBlendEnable(long address, long blendEnable);

    public VkBlendFactor getSrcColorBlendFactor() {
        return new VkBlendFactor(getVkMemory(), getSrcColorBlendFactor(getVkAddress()));
    }

    
    public void setSrcColorBlendFactor(VkBlendFactor srcColorBlendFactor) {
        setSrcColorBlendFactor(getVkAddress(), srcColorBlendFactor != null ? srcColorBlendFactor.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getSrcColorBlendFactor(long address);
    private static native void setSrcColorBlendFactor(long address, long srcColorBlendFactor);

    public VkBlendFactor getDstColorBlendFactor() {
        return new VkBlendFactor(getVkMemory(), getDstColorBlendFactor(getVkAddress()));
    }

    
    public void setDstColorBlendFactor(VkBlendFactor dstColorBlendFactor) {
        setDstColorBlendFactor(getVkAddress(), dstColorBlendFactor != null ? dstColorBlendFactor.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getDstColorBlendFactor(long address);
    private static native void setDstColorBlendFactor(long address, long dstColorBlendFactor);

    public VkBlendOp getColorBlendOp() {
        return new VkBlendOp(getVkMemory(), getColorBlendOp(getVkAddress()));
    }

    
    public void setColorBlendOp(VkBlendOp colorBlendOp) {
        setColorBlendOp(getVkAddress(), colorBlendOp != null ? colorBlendOp.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getColorBlendOp(long address);
    private static native void setColorBlendOp(long address, long colorBlendOp);

    public VkBlendFactor getSrcAlphaBlendFactor() {
        return new VkBlendFactor(getVkMemory(), getSrcAlphaBlendFactor(getVkAddress()));
    }

    
    public void setSrcAlphaBlendFactor(VkBlendFactor srcAlphaBlendFactor) {
        setSrcAlphaBlendFactor(getVkAddress(), srcAlphaBlendFactor != null ? srcAlphaBlendFactor.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getSrcAlphaBlendFactor(long address);
    private static native void setSrcAlphaBlendFactor(long address, long srcAlphaBlendFactor);

    public VkBlendFactor getDstAlphaBlendFactor() {
        return new VkBlendFactor(getVkMemory(), getDstAlphaBlendFactor(getVkAddress()));
    }

    
    public void setDstAlphaBlendFactor(VkBlendFactor dstAlphaBlendFactor) {
        setDstAlphaBlendFactor(getVkAddress(), dstAlphaBlendFactor != null ? dstAlphaBlendFactor.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getDstAlphaBlendFactor(long address);
    private static native void setDstAlphaBlendFactor(long address, long dstAlphaBlendFactor);

    public VkBlendOp getAlphaBlendOp() {
        return new VkBlendOp(getVkMemory(), getAlphaBlendOp(getVkAddress()));
    }

    
    public void setAlphaBlendOp(VkBlendOp alphaBlendOp) {
        setAlphaBlendOp(getVkAddress(), alphaBlendOp != null ? alphaBlendOp.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getAlphaBlendOp(long address);
    private static native void setAlphaBlendOp(long address, long alphaBlendOp);

    public VkColorComponentFlags getColorWriteMask() {
        return new VkColorComponentFlags(getVkMemory(), getColorWriteMask(getVkAddress()));
    }

    
    public void setColorWriteMask(VkColorComponentFlags colorWriteMask) {
        setColorWriteMask(getVkAddress(), colorWriteMask != null ? colorWriteMask.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getColorWriteMask(long address);
    private static native void setColorWriteMask(long address, long colorWriteMask);


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
            return new VkPipelineColorBlendAttachmentState(getVkMemory(), getVkAddress() + sizeof()*i);
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

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkPipelineColorBlendAttachmentState.Pointer get(int i){
                return new VkPipelineColorBlendAttachmentState.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
