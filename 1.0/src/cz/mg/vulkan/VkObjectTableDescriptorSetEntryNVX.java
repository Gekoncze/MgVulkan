package cz.mg.vulkan;

public class VkObjectTableDescriptorSetEntryNVX extends VkObject {
    public VkObjectTableDescriptorSetEntryNVX() {
        super(sizeof());
    }

    protected VkObjectTableDescriptorSetEntryNVX(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkObjectTableDescriptorSetEntryNVX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkObjectTableDescriptorSetEntryNVX(VkPointer pointer) {
        super(pointer);
    }



    public VkObjectEntryTypeNVX getType() {
        return new VkObjectEntryTypeNVX(getVkMemory(), getTypeNative(getVkAddress()));
    }

    
    public void setType(VkObjectEntryTypeNVX type) {
        setTypeNative(getVkAddress(), type != null ? type.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getTypeQ() {
        return getType().getValue();
    }

    public void setType(int type) {
        getType().setValue(type);
    }

    protected static native long getTypeNative(long address);
    protected static native void setTypeNative(long address, long type);

    public VkObjectEntryUsageFlagsNVX getFlags() {
        return new VkObjectEntryUsageFlagsNVX(getVkMemory(), getFlagsNative(getVkAddress()));
    }

    
    public void setFlags(VkObjectEntryUsageFlagsNVX flags) {
        setFlagsNative(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFlagsQ() {
        return getFlags().getValue();
    }

    public void setFlags(int flags) {
        getFlags().setValue(flags);
    }

    protected static native long getFlagsNative(long address);
    protected static native void setFlagsNative(long address, long flags);

    public VkPipelineLayout getPipelineLayout() {
        return new VkPipelineLayout(getVkMemory(), getPipelineLayoutNative(getVkAddress()));
    }

    
    public void setPipelineLayout(VkPipelineLayout pipelineLayout) {
        setPipelineLayoutNative(getVkAddress(), pipelineLayout != null ? pipelineLayout.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getPipelineLayoutNative(long address);
    protected static native void setPipelineLayoutNative(long address, long pipelineLayout);

    public VkDescriptorSet getDescriptorSet() {
        return new VkDescriptorSet(getVkMemory(), getDescriptorSetNative(getVkAddress()));
    }

    
    public void setDescriptorSet(VkDescriptorSet descriptorSet) {
        setDescriptorSetNative(getVkAddress(), descriptorSet != null ? descriptorSet.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getDescriptorSetNative(long address);
    protected static native void setDescriptorSetNative(long address, long descriptorSet);


    public static native long sizeof();

    public static class Array extends VkObjectTableDescriptorSetEntryNVX implements cz.mg.collections.array.ReadonlyArray<VkObjectTableDescriptorSetEntryNVX> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkObjectTableDescriptorSetEntryNVX.sizeof()));
            this.count = count;
        }

        public Array(VkObjectTableDescriptorSetEntryNVX o, int count){
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
        public VkObjectTableDescriptorSetEntryNVX get(int i){
            return new VkObjectTableDescriptorSetEntryNVX(getVkMemory(), address(i));
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
