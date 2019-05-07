package cz.mg.vulkan;

public class VkIndirectCommandsLayoutCreateInfoNVX extends VkObject {
    public VkIndirectCommandsLayoutCreateInfoNVX() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_NVX));
    }

    public VkIndirectCommandsLayoutCreateInfoNVX(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkIndirectCommandsLayoutCreateInfoNVX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkIndirectCommandsLayoutCreateInfoNVX(VkPointer pointer) {
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

    public VkPipelineBindPoint getPipelineBindPoint() {
        return new VkPipelineBindPoint(getVkMemory(), getPipelineBindPointNative(getVkAddress()));
    }

    
    public void setPipelineBindPoint(VkPipelineBindPoint pipelineBindPoint) {
        setPipelineBindPointNative(getVkAddress(), pipelineBindPoint != null ? pipelineBindPoint.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getPipelineBindPointQ() {
        return getPipelineBindPoint().getValue();
    }

    public void setPipelineBindPoint(int pipelineBindPoint) {
        getPipelineBindPoint().setValue(pipelineBindPoint);
    }

    protected static native long getPipelineBindPointNative(long address);
    protected static native void setPipelineBindPointNative(long address, long pipelineBindPoint);

    public VkIndirectCommandsLayoutUsageFlagsNVX getFlags() {
        return new VkIndirectCommandsLayoutUsageFlagsNVX(getVkMemory(), getFlagsNative(getVkAddress()));
    }

    
    public void setFlags(VkIndirectCommandsLayoutUsageFlagsNVX flags) {
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

    public VkUInt32 getTokenCount() {
        return new VkUInt32(getVkMemory(), getTokenCountNative(getVkAddress()));
    }

    
    public void setTokenCount(VkUInt32 tokenCount) {
        setTokenCountNative(getVkAddress(), tokenCount != null ? tokenCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getTokenCountQ() {
        return getTokenCount().getValue();
    }

    public void setTokenCount(int tokenCount) {
        getTokenCount().setValue(tokenCount);
    }

    protected static native long getTokenCountNative(long address);
    protected static native void setTokenCountNative(long address, long tokenCount);

    public VkIndirectCommandsLayoutTokenNVX getPTokens() {
        return new VkIndirectCommandsLayoutTokenNVX(getVkMemory(), getPTokensNative(getVkAddress()));
    }

    private VkObject pTokens = null;
    public void setPTokens(VkIndirectCommandsLayoutTokenNVX pTokens) {
        setPTokensNative(getVkAddress(), pTokens != null ? pTokens.getVkAddress() : VkPointer.NULL);
        this.pTokens = pTokens;
    }

    public VkIndirectCommandsLayoutTokenNVX.Array getPTokensQ() {
        return new VkIndirectCommandsLayoutTokenNVX.Array(getPTokens(), getTokenCountQ());
    }

    protected static native long getPTokensNative(long address);
    protected static native void setPTokensNative(long address, long pTokens);


    public void set(VkIndirectCommandsLayoutCreateInfoNVX o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkIndirectCommandsLayoutCreateInfoNVX implements cz.mg.collections.array.ReadonlyArray<VkIndirectCommandsLayoutCreateInfoNVX> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkIndirectCommandsLayoutCreateInfoNVX.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_NVX));;
        }

        public Array(VkIndirectCommandsLayoutCreateInfoNVX o, int count){
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
        public VkIndirectCommandsLayoutCreateInfoNVX get(int i){
            return new VkIndirectCommandsLayoutCreateInfoNVX(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
