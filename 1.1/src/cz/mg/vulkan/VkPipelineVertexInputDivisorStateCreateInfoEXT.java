package cz.mg.vulkan;

public class VkPipelineVertexInputDivisorStateCreateInfoEXT extends VkObject {
    public VkPipelineVertexInputDivisorStateCreateInfoEXT() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO_EXT));
    }

    public VkPipelineVertexInputDivisorStateCreateInfoEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineVertexInputDivisorStateCreateInfoEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPipelineVertexInputDivisorStateCreateInfoEXT(VkPointer pointer) {
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

    public VkUInt32 getVertexBindingDivisorCount() {
        return new VkUInt32(getVkMemory(), getVertexBindingDivisorCountNative(getVkAddress()));
    }

    
    public void setVertexBindingDivisorCount(VkUInt32 vertexBindingDivisorCount) {
        setVertexBindingDivisorCountNative(getVkAddress(), vertexBindingDivisorCount != null ? vertexBindingDivisorCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getVertexBindingDivisorCountQ() {
        return getVertexBindingDivisorCount().getValue();
    }

    public void setVertexBindingDivisorCount(int vertexBindingDivisorCount) {
        getVertexBindingDivisorCount().setValue(vertexBindingDivisorCount);
    }

    protected static native long getVertexBindingDivisorCountNative(long address);
    protected static native void setVertexBindingDivisorCountNative(long address, long vertexBindingDivisorCount);

    public VkVertexInputBindingDivisorDescriptionEXT getPVertexBindingDivisors() {
        return new VkVertexInputBindingDivisorDescriptionEXT(getVkMemory(), getPVertexBindingDivisorsNative(getVkAddress()));
    }

    private VkObject pVertexBindingDivisors = null;
    public void setPVertexBindingDivisors(VkVertexInputBindingDivisorDescriptionEXT pVertexBindingDivisors) {
        setPVertexBindingDivisorsNative(getVkAddress(), pVertexBindingDivisors != null ? pVertexBindingDivisors.getVkAddress() : VkPointer.NULL);
        this.pVertexBindingDivisors = pVertexBindingDivisors;
    }

    protected static native long getPVertexBindingDivisorsNative(long address);
    protected static native void setPVertexBindingDivisorsNative(long address, long pVertexBindingDivisors);


    public static native long sizeof();

    public static class Array extends VkPipelineVertexInputDivisorStateCreateInfoEXT implements cz.mg.collections.array.ReadonlyArray<VkPipelineVertexInputDivisorStateCreateInfoEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPipelineVertexInputDivisorStateCreateInfoEXT.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO_EXT));;
        }

        public Array(int count, VkPipelineVertexInputDivisorStateCreateInfoEXT o){
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
        public VkPipelineVertexInputDivisorStateCreateInfoEXT get(int i){
            return new VkPipelineVertexInputDivisorStateCreateInfoEXT(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
