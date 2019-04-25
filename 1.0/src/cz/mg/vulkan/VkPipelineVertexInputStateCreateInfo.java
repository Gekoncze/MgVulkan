package cz.mg.vulkan;

public class VkPipelineVertexInputStateCreateInfo extends VkObject {
    public VkPipelineVertexInputStateCreateInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_STATE_CREATE_INFO));
    }

    public VkPipelineVertexInputStateCreateInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineVertexInputStateCreateInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPipelineVertexInputStateCreateInfo(VkPointer pointer) {
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

    public VkPipelineVertexInputStateCreateFlags getFlags() {
        return new VkPipelineVertexInputStateCreateFlags(getVkMemory(), getFlagsNative(getVkAddress()));
    }

    
    public void setFlags(VkPipelineVertexInputStateCreateFlags flags) {
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

    public VkUInt32 getVertexBindingDescriptionCount() {
        return new VkUInt32(getVkMemory(), getVertexBindingDescriptionCountNative(getVkAddress()));
    }

    
    public void setVertexBindingDescriptionCount(VkUInt32 vertexBindingDescriptionCount) {
        setVertexBindingDescriptionCountNative(getVkAddress(), vertexBindingDescriptionCount != null ? vertexBindingDescriptionCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getVertexBindingDescriptionCountQ() {
        return getVertexBindingDescriptionCount().getValue();
    }

    public void setVertexBindingDescriptionCount(int vertexBindingDescriptionCount) {
        getVertexBindingDescriptionCount().setValue(vertexBindingDescriptionCount);
    }

    protected static native long getVertexBindingDescriptionCountNative(long address);
    protected static native void setVertexBindingDescriptionCountNative(long address, long vertexBindingDescriptionCount);

    public VkVertexInputBindingDescription getPVertexBindingDescriptions() {
        return new VkVertexInputBindingDescription(getVkMemory(), getPVertexBindingDescriptionsNative(getVkAddress()));
    }

    private VkObject pVertexBindingDescriptions = null;
    public void setPVertexBindingDescriptions(VkVertexInputBindingDescription pVertexBindingDescriptions) {
        setPVertexBindingDescriptionsNative(getVkAddress(), pVertexBindingDescriptions != null ? pVertexBindingDescriptions.getVkAddress() : VkPointer.NULL);
        this.pVertexBindingDescriptions = pVertexBindingDescriptions;
    }

    protected static native long getPVertexBindingDescriptionsNative(long address);
    protected static native void setPVertexBindingDescriptionsNative(long address, long pVertexBindingDescriptions);

    public VkUInt32 getVertexAttributeDescriptionCount() {
        return new VkUInt32(getVkMemory(), getVertexAttributeDescriptionCountNative(getVkAddress()));
    }

    
    public void setVertexAttributeDescriptionCount(VkUInt32 vertexAttributeDescriptionCount) {
        setVertexAttributeDescriptionCountNative(getVkAddress(), vertexAttributeDescriptionCount != null ? vertexAttributeDescriptionCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getVertexAttributeDescriptionCountQ() {
        return getVertexAttributeDescriptionCount().getValue();
    }

    public void setVertexAttributeDescriptionCount(int vertexAttributeDescriptionCount) {
        getVertexAttributeDescriptionCount().setValue(vertexAttributeDescriptionCount);
    }

    protected static native long getVertexAttributeDescriptionCountNative(long address);
    protected static native void setVertexAttributeDescriptionCountNative(long address, long vertexAttributeDescriptionCount);

    public VkVertexInputAttributeDescription getPVertexAttributeDescriptions() {
        return new VkVertexInputAttributeDescription(getVkMemory(), getPVertexAttributeDescriptionsNative(getVkAddress()));
    }

    private VkObject pVertexAttributeDescriptions = null;
    public void setPVertexAttributeDescriptions(VkVertexInputAttributeDescription pVertexAttributeDescriptions) {
        setPVertexAttributeDescriptionsNative(getVkAddress(), pVertexAttributeDescriptions != null ? pVertexAttributeDescriptions.getVkAddress() : VkPointer.NULL);
        this.pVertexAttributeDescriptions = pVertexAttributeDescriptions;
    }

    protected static native long getPVertexAttributeDescriptionsNative(long address);
    protected static native void setPVertexAttributeDescriptionsNative(long address, long pVertexAttributeDescriptions);


    public static native long sizeof();

    public static class Array extends VkPipelineVertexInputStateCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkPipelineVertexInputStateCreateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPipelineVertexInputStateCreateInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_STATE_CREATE_INFO));;
        }

        public Array(int count, VkPipelineVertexInputStateCreateInfo o){
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
        public VkPipelineVertexInputStateCreateInfo get(int i){
            return new VkPipelineVertexInputStateCreateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
