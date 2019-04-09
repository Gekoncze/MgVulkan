package cz.mg.vulkan;

public class VkDescriptorSetLayoutBinding extends VkObject {
    public VkDescriptorSetLayoutBinding() {
        super(sizeof());
    }

    public VkDescriptorSetLayoutBinding(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDescriptorSetLayoutBinding(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkDescriptorSetLayoutBinding(VkUInt32 binding, VkDescriptorType descriptorType, VkUInt32 descriptorCount, VkShaderStageFlags stageFlags, VkSampler pImmutableSamplers) {
        super(sizeof());
        setBinding(binding);
        setDescriptorType(descriptorType);
        setDescriptorCount(descriptorCount);
        setStageFlags(stageFlags);
        setPImmutableSamplers(pImmutableSamplers);
    }

    public VkUInt32 getBinding() {
        return new VkUInt32(getVkMemory(), getBinding(getVkAddress()));
    }

    
    public void setBinding(VkUInt32 binding) {
        setBinding(getVkAddress(), binding != null ? binding.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getBinding(long address);
    private static native void setBinding(long address, long binding);

    public VkDescriptorType getDescriptorType() {
        return new VkDescriptorType(getVkMemory(), getDescriptorType(getVkAddress()));
    }

    
    public void setDescriptorType(VkDescriptorType descriptorType) {
        setDescriptorType(getVkAddress(), descriptorType != null ? descriptorType.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getDescriptorType(long address);
    private static native void setDescriptorType(long address, long descriptorType);

    public VkUInt32 getDescriptorCount() {
        return new VkUInt32(getVkMemory(), getDescriptorCount(getVkAddress()));
    }

    
    public void setDescriptorCount(VkUInt32 descriptorCount) {
        setDescriptorCount(getVkAddress(), descriptorCount != null ? descriptorCount.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getDescriptorCount(long address);
    private static native void setDescriptorCount(long address, long descriptorCount);

    public VkShaderStageFlags getStageFlags() {
        return new VkShaderStageFlags(getVkMemory(), getStageFlags(getVkAddress()));
    }

    
    public void setStageFlags(VkShaderStageFlags stageFlags) {
        setStageFlags(getVkAddress(), stageFlags != null ? stageFlags.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getStageFlags(long address);
    private static native void setStageFlags(long address, long stageFlags);

    public VkSampler getPImmutableSamplers() {
        return new VkSampler(getVkMemory(), getPImmutableSamplers(getVkAddress()));
    }

    private VkObject pImmutableSamplers = null;
    public void setPImmutableSamplers(VkSampler pImmutableSamplers) {
        setPImmutableSamplers(getVkAddress(), pImmutableSamplers != null ? pImmutableSamplers.getVkAddress() : VkPointer.NULL);
        this.pImmutableSamplers = pImmutableSamplers;
    }

    private static native long getPImmutableSamplers(long address);
    private static native void setPImmutableSamplers(long address, long pImmutableSamplers);


    public static native long sizeof();

    public static class Array extends VkDescriptorSetLayoutBinding implements cz.mg.collections.array.ReadonlyArray<VkDescriptorSetLayoutBinding> {        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDescriptorSetLayoutBinding.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDescriptorSetLayoutBinding o){
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
        public VkDescriptorSetLayoutBinding get(int i){
            return new VkDescriptorSetLayoutBinding(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }


    public static class Pointer extends VkObject.Pointer {        public Pointer() {
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

        public static class Array extends VkDescriptorSetLayoutBinding.Pointer implements cz.mg.collections.array.ReadonlyArray<VkDescriptorSetLayoutBinding.Pointer> {
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

            public Array(VkDescriptorSetLayoutBinding[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkDescriptorSetLayoutBinding.Pointer get(int i){
                return new VkDescriptorSetLayoutBinding.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }

}
