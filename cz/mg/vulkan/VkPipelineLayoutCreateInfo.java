package cz.mg.vulkan;

public class VkPipelineLayoutCreateInfo extends VkObject {
    public VkPipelineLayoutCreateInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_LAYOUT_CREATE_INFO));
    }

    public VkPipelineLayoutCreateInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineLayoutCreateInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public void setSType(int sType) {
        getSType().setValue(sType);
    }

    private static native long getSType(long address);
    private static native void setSType(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNext(getVkAddress()));
    }

    private VkObject pNext = null;
    public void setPNext(VkObject pNext) {
        setPNext(getVkAddress(), pNext != null ? pNext.getVkAddress() : VkPointer.NULL);
        this.pNext = pNext;
    }

    private static native long getPNext(long address);
    private static native void setPNext(long address, long pNext);

    public VkPipelineLayoutCreateFlags getFlags() {
        return new VkPipelineLayoutCreateFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkPipelineLayoutCreateFlags flags) {
        setFlags(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public void setFlags(int flags) {
        getFlags().setValue(flags);
    }

    private static native long getFlags(long address);
    private static native void setFlags(long address, long flags);

    public VkUInt32 getSetLayoutCount() {
        return new VkUInt32(getVkMemory(), getSetLayoutCount(getVkAddress()));
    }

    
    public void setSetLayoutCount(VkUInt32 setLayoutCount) {
        setSetLayoutCount(getVkAddress(), setLayoutCount != null ? setLayoutCount.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public void setSetLayoutCount(int setLayoutCount) {
        getSetLayoutCount().setValue(setLayoutCount);
    }

    private static native long getSetLayoutCount(long address);
    private static native void setSetLayoutCount(long address, long setLayoutCount);

    public VkDescriptorSetLayout getPSetLayouts() {
        return new VkDescriptorSetLayout(getVkMemory(), getPSetLayouts(getVkAddress()));
    }

    private VkObject pSetLayouts = null;
    public void setPSetLayouts(VkDescriptorSetLayout pSetLayouts) {
        setPSetLayouts(getVkAddress(), pSetLayouts != null ? pSetLayouts.getVkAddress() : VkPointer.NULL);
        this.pSetLayouts = pSetLayouts;
    }

    private static native long getPSetLayouts(long address);
    private static native void setPSetLayouts(long address, long pSetLayouts);

    public VkUInt32 getPushConstantRangeCount() {
        return new VkUInt32(getVkMemory(), getPushConstantRangeCount(getVkAddress()));
    }

    
    public void setPushConstantRangeCount(VkUInt32 pushConstantRangeCount) {
        setPushConstantRangeCount(getVkAddress(), pushConstantRangeCount != null ? pushConstantRangeCount.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public void setPushConstantRangeCount(int pushConstantRangeCount) {
        getPushConstantRangeCount().setValue(pushConstantRangeCount);
    }

    private static native long getPushConstantRangeCount(long address);
    private static native void setPushConstantRangeCount(long address, long pushConstantRangeCount);

    public VkPushConstantRange getPPushConstantRanges() {
        return new VkPushConstantRange(getVkMemory(), getPPushConstantRanges(getVkAddress()));
    }

    private VkObject pPushConstantRanges = null;
    public void setPPushConstantRanges(VkPushConstantRange pPushConstantRanges) {
        setPPushConstantRanges(getVkAddress(), pPushConstantRanges != null ? pPushConstantRanges.getVkAddress() : VkPointer.NULL);
        this.pPushConstantRanges = pPushConstantRanges;
    }

    private static native long getPPushConstantRanges(long address);
    private static native void setPPushConstantRanges(long address, long pPushConstantRanges);


    public static native long sizeof();

    public static class Array extends VkPipelineLayoutCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkPipelineLayoutCreateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPipelineLayoutCreateInfo.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPipelineLayoutCreateInfo o){
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
        public VkPipelineLayoutCreateInfo get(int i){
            return new VkPipelineLayoutCreateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkPipelineLayoutCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPipelineLayoutCreateInfo.Pointer> {
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

            public Array(VkPipelineLayoutCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkPipelineLayoutCreateInfo.Pointer get(int i){
                return new VkPipelineLayoutCreateInfo.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
