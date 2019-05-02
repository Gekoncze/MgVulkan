package cz.mg.vulkan;

public class VkDescriptorSetLayoutBinding extends VkObject {
    public VkDescriptorSetLayoutBinding() {
        super(sizeof());
    }

    protected VkDescriptorSetLayoutBinding(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkDescriptorSetLayoutBinding(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDescriptorSetLayoutBinding(VkPointer pointer) {
        super(pointer);
    }



    public VkUInt32 getBinding() {
        return new VkUInt32(getVkMemory(), getBindingNative(getVkAddress()));
    }

    
    public void setBinding(VkUInt32 binding) {
        setBindingNative(getVkAddress(), binding != null ? binding.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getBindingQ() {
        return getBinding().getValue();
    }

    public void setBinding(int binding) {
        getBinding().setValue(binding);
    }

    protected static native long getBindingNative(long address);
    protected static native void setBindingNative(long address, long binding);

    public VkDescriptorType getDescriptorType() {
        return new VkDescriptorType(getVkMemory(), getDescriptorTypeNative(getVkAddress()));
    }

    
    public void setDescriptorType(VkDescriptorType descriptorType) {
        setDescriptorTypeNative(getVkAddress(), descriptorType != null ? descriptorType.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDescriptorTypeQ() {
        return getDescriptorType().getValue();
    }

    public void setDescriptorType(int descriptorType) {
        getDescriptorType().setValue(descriptorType);
    }

    protected static native long getDescriptorTypeNative(long address);
    protected static native void setDescriptorTypeNative(long address, long descriptorType);

    public VkUInt32 getDescriptorCount() {
        return new VkUInt32(getVkMemory(), getDescriptorCountNative(getVkAddress()));
    }

    
    public void setDescriptorCount(VkUInt32 descriptorCount) {
        setDescriptorCountNative(getVkAddress(), descriptorCount != null ? descriptorCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDescriptorCountQ() {
        return getDescriptorCount().getValue();
    }

    public void setDescriptorCount(int descriptorCount) {
        getDescriptorCount().setValue(descriptorCount);
    }

    protected static native long getDescriptorCountNative(long address);
    protected static native void setDescriptorCountNative(long address, long descriptorCount);

    public VkShaderStageFlags getStageFlags() {
        return new VkShaderStageFlags(getVkMemory(), getStageFlagsNative(getVkAddress()));
    }

    
    public void setStageFlags(VkShaderStageFlags stageFlags) {
        setStageFlagsNative(getVkAddress(), stageFlags != null ? stageFlags.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getStageFlagsQ() {
        return getStageFlags().getValue();
    }

    public void setStageFlags(int stageFlags) {
        getStageFlags().setValue(stageFlags);
    }

    protected static native long getStageFlagsNative(long address);
    protected static native void setStageFlagsNative(long address, long stageFlags);

    public VkSampler getPImmutableSamplers() {
        return new VkSampler(getVkMemory(), getPImmutableSamplersNative(getVkAddress()));
    }

    private VkObject pImmutableSamplers = null;
    public void setPImmutableSamplers(VkSampler pImmutableSamplers) {
        setPImmutableSamplersNative(getVkAddress(), pImmutableSamplers != null ? pImmutableSamplers.getVkAddress() : VkPointer.NULL);
        this.pImmutableSamplers = pImmutableSamplers;
    }

    protected static native long getPImmutableSamplersNative(long address);
    protected static native void setPImmutableSamplersNative(long address, long pImmutableSamplers);


    public void set(VkDescriptorSetLayoutBinding o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkDescriptorSetLayoutBinding implements cz.mg.collections.array.ReadonlyArray<VkDescriptorSetLayoutBinding> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDescriptorSetLayoutBinding.sizeof()));
            this.count = count;
        }

        public Array(VkDescriptorSetLayoutBinding o, int count){
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
        public VkDescriptorSetLayoutBinding get(int i){
            return new VkDescriptorSetLayoutBinding(getVkMemory(), address(i));
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
