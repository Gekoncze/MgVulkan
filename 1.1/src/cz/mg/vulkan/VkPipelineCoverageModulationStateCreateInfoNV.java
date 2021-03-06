package cz.mg.vulkan;

public class VkPipelineCoverageModulationStateCreateInfoNV extends VkObject {
    public VkPipelineCoverageModulationStateCreateInfoNV() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_COVERAGE_MODULATION_STATE_CREATE_INFO_NV));
    }

    public VkPipelineCoverageModulationStateCreateInfoNV(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineCoverageModulationStateCreateInfoNV(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPipelineCoverageModulationStateCreateInfoNV(VkPointer pointer) {
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

    public VkPipelineCoverageModulationStateCreateFlagsNV getFlags() {
        return new VkPipelineCoverageModulationStateCreateFlagsNV(getVkMemory(), getFlagsNative(getVkAddress()));
    }

    
    public void setFlags(VkPipelineCoverageModulationStateCreateFlagsNV flags) {
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

    public VkCoverageModulationModeNV getCoverageModulationMode() {
        return new VkCoverageModulationModeNV(getVkMemory(), getCoverageModulationModeNative(getVkAddress()));
    }

    
    public void setCoverageModulationMode(VkCoverageModulationModeNV coverageModulationMode) {
        setCoverageModulationModeNative(getVkAddress(), coverageModulationMode != null ? coverageModulationMode.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getCoverageModulationModeQ() {
        return getCoverageModulationMode().getValue();
    }

    public void setCoverageModulationMode(int coverageModulationMode) {
        getCoverageModulationMode().setValue(coverageModulationMode);
    }

    protected static native long getCoverageModulationModeNative(long address);
    protected static native void setCoverageModulationModeNative(long address, long coverageModulationMode);

    public VkBool32 getCoverageModulationTableEnable() {
        return new VkBool32(getVkMemory(), getCoverageModulationTableEnableNative(getVkAddress()));
    }

    
    public void setCoverageModulationTableEnable(VkBool32 coverageModulationTableEnable) {
        setCoverageModulationTableEnableNative(getVkAddress(), coverageModulationTableEnable != null ? coverageModulationTableEnable.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getCoverageModulationTableEnableQ() {
        return getCoverageModulationTableEnable().getValue();
    }

    public void setCoverageModulationTableEnable(int coverageModulationTableEnable) {
        getCoverageModulationTableEnable().setValue(coverageModulationTableEnable);
    }

    protected static native long getCoverageModulationTableEnableNative(long address);
    protected static native void setCoverageModulationTableEnableNative(long address, long coverageModulationTableEnable);

    public VkUInt32 getCoverageModulationTableCount() {
        return new VkUInt32(getVkMemory(), getCoverageModulationTableCountNative(getVkAddress()));
    }

    
    public void setCoverageModulationTableCount(VkUInt32 coverageModulationTableCount) {
        setCoverageModulationTableCountNative(getVkAddress(), coverageModulationTableCount != null ? coverageModulationTableCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getCoverageModulationTableCountQ() {
        return getCoverageModulationTableCount().getValue();
    }

    public void setCoverageModulationTableCount(int coverageModulationTableCount) {
        getCoverageModulationTableCount().setValue(coverageModulationTableCount);
    }

    protected static native long getCoverageModulationTableCountNative(long address);
    protected static native void setCoverageModulationTableCountNative(long address, long coverageModulationTableCount);

    public VkFloat getPCoverageModulationTable() {
        return new VkFloat(getVkMemory(), getPCoverageModulationTableNative(getVkAddress()));
    }

    private VkObject pCoverageModulationTable = null;
    public void setPCoverageModulationTable(VkFloat pCoverageModulationTable) {
        setPCoverageModulationTableNative(getVkAddress(), pCoverageModulationTable != null ? pCoverageModulationTable.getVkAddress() : VkPointer.NULL);
        this.pCoverageModulationTable = pCoverageModulationTable;
    }

    public VkFloat.Array getPCoverageModulationTableQ() {
        return new VkFloat.Array(getPCoverageModulationTable(), getCoverageModulationTableCountQ());
    }

    protected static native long getPCoverageModulationTableNative(long address);
    protected static native void setPCoverageModulationTableNative(long address, long pCoverageModulationTable);


    public void set(VkPipelineCoverageModulationStateCreateInfoNV o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkPipelineCoverageModulationStateCreateInfoNV implements cz.mg.collections.array.ReadonlyArray<VkPipelineCoverageModulationStateCreateInfoNV> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPipelineCoverageModulationStateCreateInfoNV.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_COVERAGE_MODULATION_STATE_CREATE_INFO_NV));;
        }

        public Array(VkPipelineCoverageModulationStateCreateInfoNV o, int count){
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
        public VkPipelineCoverageModulationStateCreateInfoNV get(int i){
            return new VkPipelineCoverageModulationStateCreateInfoNV(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
