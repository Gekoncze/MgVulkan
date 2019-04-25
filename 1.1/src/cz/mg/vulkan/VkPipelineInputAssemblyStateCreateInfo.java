package cz.mg.vulkan;

public class VkPipelineInputAssemblyStateCreateInfo extends VkObject {
    public VkPipelineInputAssemblyStateCreateInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO));
    }

    public VkPipelineInputAssemblyStateCreateInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineInputAssemblyStateCreateInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPipelineInputAssemblyStateCreateInfo(VkPointer pointer) {
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

    public VkPipelineInputAssemblyStateCreateFlags getFlags() {
        return new VkPipelineInputAssemblyStateCreateFlags(getVkMemory(), getFlagsNative(getVkAddress()));
    }

    
    public void setFlags(VkPipelineInputAssemblyStateCreateFlags flags) {
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

    public VkPrimitiveTopology getTopology() {
        return new VkPrimitiveTopology(getVkMemory(), getTopologyNative(getVkAddress()));
    }

    
    public void setTopology(VkPrimitiveTopology topology) {
        setTopologyNative(getVkAddress(), topology != null ? topology.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getTopologyQ() {
        return getTopology().getValue();
    }

    public void setTopology(int topology) {
        getTopology().setValue(topology);
    }

    protected static native long getTopologyNative(long address);
    protected static native void setTopologyNative(long address, long topology);

    public VkBool32 getPrimitiveRestartEnable() {
        return new VkBool32(getVkMemory(), getPrimitiveRestartEnableNative(getVkAddress()));
    }

    
    public void setPrimitiveRestartEnable(VkBool32 primitiveRestartEnable) {
        setPrimitiveRestartEnableNative(getVkAddress(), primitiveRestartEnable != null ? primitiveRestartEnable.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getPrimitiveRestartEnableQ() {
        return getPrimitiveRestartEnable().getValue();
    }

    public void setPrimitiveRestartEnable(int primitiveRestartEnable) {
        getPrimitiveRestartEnable().setValue(primitiveRestartEnable);
    }

    protected static native long getPrimitiveRestartEnableNative(long address);
    protected static native void setPrimitiveRestartEnableNative(long address, long primitiveRestartEnable);


    public static native long sizeof();

    public static class Array extends VkPipelineInputAssemblyStateCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkPipelineInputAssemblyStateCreateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPipelineInputAssemblyStateCreateInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO));;
        }

        public Array(int count, VkPipelineInputAssemblyStateCreateInfo o){
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
        public VkPipelineInputAssemblyStateCreateInfo get(int i){
            return new VkPipelineInputAssemblyStateCreateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
