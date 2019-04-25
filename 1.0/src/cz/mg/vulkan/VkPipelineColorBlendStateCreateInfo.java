package cz.mg.vulkan;

public class VkPipelineColorBlendStateCreateInfo extends VkObject {
    public VkPipelineColorBlendStateCreateInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_STATE_CREATE_INFO));
    }

    public VkPipelineColorBlendStateCreateInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineColorBlendStateCreateInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
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

    public VkPipelineColorBlendStateCreateFlags getFlags() {
        return new VkPipelineColorBlendStateCreateFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkPipelineColorBlendStateCreateFlags flags) {
        setFlags(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFlagsQ() {
        return getFlags().getValue();
    }

    public void setFlags(int flags) {
        getFlags().setValue(flags);
    }

    protected static native long getFlags(long address);
    protected static native void setFlags(long address, long flags);

    public VkBool32 getLogicOpEnable() {
        return new VkBool32(getVkMemory(), getLogicOpEnable(getVkAddress()));
    }

    
    public void setLogicOpEnable(VkBool32 logicOpEnable) {
        setLogicOpEnable(getVkAddress(), logicOpEnable != null ? logicOpEnable.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getLogicOpEnableQ() {
        return getLogicOpEnable().getValue();
    }

    public void setLogicOpEnable(int logicOpEnable) {
        getLogicOpEnable().setValue(logicOpEnable);
    }

    protected static native long getLogicOpEnable(long address);
    protected static native void setLogicOpEnable(long address, long logicOpEnable);

    public VkLogicOp getLogicOp() {
        return new VkLogicOp(getVkMemory(), getLogicOp(getVkAddress()));
    }

    
    public void setLogicOp(VkLogicOp logicOp) {
        setLogicOp(getVkAddress(), logicOp != null ? logicOp.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getLogicOpQ() {
        return getLogicOp().getValue();
    }

    public void setLogicOp(int logicOp) {
        getLogicOp().setValue(logicOp);
    }

    protected static native long getLogicOp(long address);
    protected static native void setLogicOp(long address, long logicOp);

    public VkUInt32 getAttachmentCount() {
        return new VkUInt32(getVkMemory(), getAttachmentCount(getVkAddress()));
    }

    
    public void setAttachmentCount(VkUInt32 attachmentCount) {
        setAttachmentCount(getVkAddress(), attachmentCount != null ? attachmentCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getAttachmentCountQ() {
        return getAttachmentCount().getValue();
    }

    public void setAttachmentCount(int attachmentCount) {
        getAttachmentCount().setValue(attachmentCount);
    }

    protected static native long getAttachmentCount(long address);
    protected static native void setAttachmentCount(long address, long attachmentCount);

    public VkPipelineColorBlendAttachmentState getPAttachments() {
        return new VkPipelineColorBlendAttachmentState(getVkMemory(), getPAttachments(getVkAddress()));
    }

    private VkObject pAttachments = null;
    public void setPAttachments(VkPipelineColorBlendAttachmentState pAttachments) {
        setPAttachments(getVkAddress(), pAttachments != null ? pAttachments.getVkAddress() : VkPointer.NULL);
        this.pAttachments = pAttachments;
    }

    protected static native long getPAttachments(long address);
    protected static native void setPAttachments(long address, long pAttachments);

    public VkFloat getBlendConstants() {
        return new VkFloat(getVkMemory(), getBlendConstants(getVkAddress()));
    }

    
    public void setBlendConstants(VkFloat blendConstants) {
        setBlendConstants(getVkAddress(), blendConstants != null ? blendConstants.getVkAddress() : VkPointer.NULL);
        
    }

    protected static native long getBlendConstants(long address);
    protected static native void setBlendConstants(long address, long blendConstants);


    public static native long sizeof();

    public static class Array extends VkPipelineColorBlendStateCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkPipelineColorBlendStateCreateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPipelineColorBlendStateCreateInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_STATE_CREATE_INFO));;
        }

        public Array(int count, VkPipelineColorBlendStateCreateInfo o){
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
        public VkPipelineColorBlendStateCreateInfo get(int i){
            return new VkPipelineColorBlendStateCreateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkPipelineColorBlendStateCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPipelineColorBlendStateCreateInfo.Pointer> {
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

            public Array(VkPipelineColorBlendStateCreateInfo[] a) {
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
            public VkPipelineColorBlendStateCreateInfo.Pointer get(int i){
                return new VkPipelineColorBlendStateCreateInfo.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }

            protected long addressAt(int i){
                return VkPointer.plus(getVkAddress(), sizeof()*i);
            }
        }
    }
}
