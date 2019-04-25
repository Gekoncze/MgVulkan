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



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSTypeQ() {
        return getSType().getValue();
    }

    public void setSType(int sType) {
        getSType().setValue(sType);
    }

    protected static native long getSType(long address);
    protected static native void setSType(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNext(getVkAddress()));
    }

    private VkObject pNext = null;
    public void setPNext(VkObject pNext) {
        setPNext(getVkAddress(), pNext != null ? pNext.getVkAddress() : VkPointer.NULL);
        this.pNext = pNext;
    }

    protected static native long getPNext(long address);
    protected static native void setPNext(long address, long pNext);

    public VkPipelineCoverageModulationStateCreateFlagsNV getFlags() {
        return new VkPipelineCoverageModulationStateCreateFlagsNV(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkPipelineCoverageModulationStateCreateFlagsNV flags) {
        setFlags(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFlagsQ() {
        return getFlags().getValue();
    }

    public void setFlags(int flags) {
        getFlags().setValue(flags);
    }

    protected static native long getFlags(long address);
    protected static native void setFlags(long address, long flags);

    public VkCoverageModulationModeNV getCoverageModulationMode() {
        return new VkCoverageModulationModeNV(getVkMemory(), getCoverageModulationMode(getVkAddress()));
    }

    
    public void setCoverageModulationMode(VkCoverageModulationModeNV coverageModulationMode) {
        setCoverageModulationMode(getVkAddress(), coverageModulationMode != null ? coverageModulationMode.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getCoverageModulationModeQ() {
        return getCoverageModulationMode().getValue();
    }

    public void setCoverageModulationMode(int coverageModulationMode) {
        getCoverageModulationMode().setValue(coverageModulationMode);
    }

    protected static native long getCoverageModulationMode(long address);
    protected static native void setCoverageModulationMode(long address, long coverageModulationMode);

    public VkBool32 getCoverageModulationTableEnable() {
        return new VkBool32(getVkMemory(), getCoverageModulationTableEnable(getVkAddress()));
    }

    
    public void setCoverageModulationTableEnable(VkBool32 coverageModulationTableEnable) {
        setCoverageModulationTableEnable(getVkAddress(), coverageModulationTableEnable != null ? coverageModulationTableEnable.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getCoverageModulationTableEnableQ() {
        return getCoverageModulationTableEnable().getValue();
    }

    public void setCoverageModulationTableEnable(int coverageModulationTableEnable) {
        getCoverageModulationTableEnable().setValue(coverageModulationTableEnable);
    }

    protected static native long getCoverageModulationTableEnable(long address);
    protected static native void setCoverageModulationTableEnable(long address, long coverageModulationTableEnable);

    public VkUInt32 getCoverageModulationTableCount() {
        return new VkUInt32(getVkMemory(), getCoverageModulationTableCount(getVkAddress()));
    }

    
    public void setCoverageModulationTableCount(VkUInt32 coverageModulationTableCount) {
        setCoverageModulationTableCount(getVkAddress(), coverageModulationTableCount != null ? coverageModulationTableCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getCoverageModulationTableCountQ() {
        return getCoverageModulationTableCount().getValue();
    }

    public void setCoverageModulationTableCount(int coverageModulationTableCount) {
        getCoverageModulationTableCount().setValue(coverageModulationTableCount);
    }

    protected static native long getCoverageModulationTableCount(long address);
    protected static native void setCoverageModulationTableCount(long address, long coverageModulationTableCount);

    public VkFloat getPCoverageModulationTable() {
        return new VkFloat(getVkMemory(), getPCoverageModulationTable(getVkAddress()));
    }

    private VkObject pCoverageModulationTable = null;
    public void setPCoverageModulationTable(VkFloat pCoverageModulationTable) {
        setPCoverageModulationTable(getVkAddress(), pCoverageModulationTable != null ? pCoverageModulationTable.getVkAddress() : VkPointer.NULL);
        this.pCoverageModulationTable = pCoverageModulationTable;
    }

    protected static native long getPCoverageModulationTable(long address);
    protected static native void setPCoverageModulationTable(long address, long pCoverageModulationTable);


    public static native long sizeof();

    public static class Array extends VkPipelineCoverageModulationStateCreateInfoNV implements cz.mg.collections.array.ReadonlyArray<VkPipelineCoverageModulationStateCreateInfoNV> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPipelineCoverageModulationStateCreateInfoNV.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_COVERAGE_MODULATION_STATE_CREATE_INFO_NV));;
        }

        public Array(int count, VkPipelineCoverageModulationStateCreateInfoNV o){
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
