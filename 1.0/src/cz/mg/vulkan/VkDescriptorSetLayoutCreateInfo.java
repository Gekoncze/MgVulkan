package cz.mg.vulkan;

public class VkDescriptorSetLayoutCreateInfo extends VkObject {
    public VkDescriptorSetLayoutCreateInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_CREATE_INFO));
    }

    public VkDescriptorSetLayoutCreateInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDescriptorSetLayoutCreateInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDescriptorSetLayoutCreateInfo(VkPointer pointer) {
        super(pointer);
    }



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSTypeNative(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSTypeNative(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSTypeQ() {
        return getSType().getValue();
    }

    public void setSType(int sType) {
        getSType().setValue(sType);
    }

    protected static native long getSTypeNative(long address);
    protected static native void setSTypeNative(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNextNative(getVkAddress()));
    }

    private VkObject pNext = null;
    public void setPNext(VkObject pNext) {
        setPNextNative(getVkAddress(), pNext != null ? pNext.getVkAddress() : VkPointer.NULL);
        this.pNext = pNext;
    }

    protected static native long getPNextNative(long address);
    protected static native void setPNextNative(long address, long pNext);

    public VkDescriptorSetLayoutCreateFlags getFlags() {
        return new VkDescriptorSetLayoutCreateFlags(getVkMemory(), getFlagsNative(getVkAddress()));
    }

    
    public void setFlags(VkDescriptorSetLayoutCreateFlags flags) {
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

    public VkUInt32 getBindingCount() {
        return new VkUInt32(getVkMemory(), getBindingCountNative(getVkAddress()));
    }

    
    public void setBindingCount(VkUInt32 bindingCount) {
        setBindingCountNative(getVkAddress(), bindingCount != null ? bindingCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getBindingCountQ() {
        return getBindingCount().getValue();
    }

    public void setBindingCount(int bindingCount) {
        getBindingCount().setValue(bindingCount);
    }

    protected static native long getBindingCountNative(long address);
    protected static native void setBindingCountNative(long address, long bindingCount);

    public VkDescriptorSetLayoutBinding getPBindings() {
        return new VkDescriptorSetLayoutBinding(getVkMemory(), getPBindingsNative(getVkAddress()));
    }

    private VkObject pBindings = null;
    public void setPBindings(VkDescriptorSetLayoutBinding pBindings) {
        setPBindingsNative(getVkAddress(), pBindings != null ? pBindings.getVkAddress() : VkPointer.NULL);
        this.pBindings = pBindings;
    }

    protected static native long getPBindingsNative(long address);
    protected static native void setPBindingsNative(long address, long pBindings);


    public static native long sizeof();

    public static class Array extends VkDescriptorSetLayoutCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkDescriptorSetLayoutCreateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDescriptorSetLayoutCreateInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_CREATE_INFO));;
        }

        public Array(int count, VkDescriptorSetLayoutCreateInfo o){
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
        public VkDescriptorSetLayoutCreateInfo get(int i){
            return new VkDescriptorSetLayoutCreateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
