package cz.mg.vulkan;

public class VkDescriptorSetLayoutBindingFlagsCreateInfoEXT extends VkObject {
    public VkDescriptorSetLayoutBindingFlagsCreateInfoEXT() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_BINDING_FLAGS_CREATE_INFO_EXT));
    }

    public VkDescriptorSetLayoutBindingFlagsCreateInfoEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDescriptorSetLayoutBindingFlagsCreateInfoEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDescriptorSetLayoutBindingFlagsCreateInfoEXT(VkPointer pointer) {
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

    public VkDescriptorBindingFlagsEXT getPBindingFlags() {
        return new VkDescriptorBindingFlagsEXT(getVkMemory(), getPBindingFlagsNative(getVkAddress()));
    }

    private VkObject pBindingFlags = null;
    public void setPBindingFlags(VkDescriptorBindingFlagsEXT pBindingFlags) {
        setPBindingFlagsNative(getVkAddress(), pBindingFlags != null ? pBindingFlags.getVkAddress() : VkPointer.NULL);
        this.pBindingFlags = pBindingFlags;
    }

    protected static native long getPBindingFlagsNative(long address);
    protected static native void setPBindingFlagsNative(long address, long pBindingFlags);


    public static native long sizeof();

    public static class Array extends VkDescriptorSetLayoutBindingFlagsCreateInfoEXT implements cz.mg.collections.array.ReadonlyArray<VkDescriptorSetLayoutBindingFlagsCreateInfoEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_BINDING_FLAGS_CREATE_INFO_EXT));;
        }

        public Array(int count, VkDescriptorSetLayoutBindingFlagsCreateInfoEXT o){
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
        public VkDescriptorSetLayoutBindingFlagsCreateInfoEXT get(int i){
            return new VkDescriptorSetLayoutBindingFlagsCreateInfoEXT(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
