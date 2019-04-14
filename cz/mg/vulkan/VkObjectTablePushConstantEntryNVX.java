package cz.mg.vulkan;

public class VkObjectTablePushConstantEntryNVX extends VkObject {
    public VkObjectTablePushConstantEntryNVX() {
        super(sizeof());
    }

    public VkObjectTablePushConstantEntryNVX(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkObjectTablePushConstantEntryNVX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkObjectEntryTypeNVX getType() {
        return new VkObjectEntryTypeNVX(getVkMemory(), getType(getVkAddress()));
    }

    
    public void setType(VkObjectEntryTypeNVX type) {
        setType(getVkAddress(), type != null ? type.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public void setType(int type) {
        getType().setValue(type);
    }

    private static native long getType(long address);
    private static native void setType(long address, long type);

    public VkObjectEntryUsageFlagsNVX getFlags() {
        return new VkObjectEntryUsageFlagsNVX(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkObjectEntryUsageFlagsNVX flags) {
        setFlags(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public void setFlags(int flags) {
        getFlags().setValue(flags);
    }

    private static native long getFlags(long address);
    private static native void setFlags(long address, long flags);

    public VkPipelineLayout getPipelineLayout() {
        return new VkPipelineLayout(getVkMemory(), getPipelineLayout(getVkAddress()));
    }

    
    public void setPipelineLayout(VkPipelineLayout pipelineLayout) {
        setPipelineLayout(getVkAddress(), pipelineLayout != null ? pipelineLayout.getVkAddress() : VkPointer.getNullAddress());
        
    }

    private static native long getPipelineLayout(long address);
    private static native void setPipelineLayout(long address, long pipelineLayout);

    public VkShaderStageFlags getStageFlags() {
        return new VkShaderStageFlags(getVkMemory(), getStageFlags(getVkAddress()));
    }

    
    public void setStageFlags(VkShaderStageFlags stageFlags) {
        setStageFlags(getVkAddress(), stageFlags != null ? stageFlags.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public void setStageFlags(int stageFlags) {
        getStageFlags().setValue(stageFlags);
    }

    private static native long getStageFlags(long address);
    private static native void setStageFlags(long address, long stageFlags);


    public static native long sizeof();

    public static class Array extends VkObjectTablePushConstantEntryNVX implements cz.mg.collections.array.ReadonlyArray<VkObjectTablePushConstantEntryNVX> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkObjectTablePushConstantEntryNVX.sizeof()));
            this.count = count;
        }

        public Array(int count, VkObjectTablePushConstantEntryNVX o){
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
        public VkObjectTablePushConstantEntryNVX get(int i){
            return new VkObjectTablePushConstantEntryNVX(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkObjectTablePushConstantEntryNVX.Pointer implements cz.mg.collections.array.ReadonlyArray<VkObjectTablePushConstantEntryNVX.Pointer> {
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

            public Array(VkObjectTablePushConstantEntryNVX[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkObjectTablePushConstantEntryNVX.Pointer get(int i){
                return new VkObjectTablePushConstantEntryNVX.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
