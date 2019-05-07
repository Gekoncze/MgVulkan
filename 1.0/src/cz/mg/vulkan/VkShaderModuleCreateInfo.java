package cz.mg.vulkan;

public class VkShaderModuleCreateInfo extends VkObject {
    public VkShaderModuleCreateInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_SHADER_MODULE_CREATE_INFO));
    }

    public VkShaderModuleCreateInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkShaderModuleCreateInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkShaderModuleCreateInfo(VkPointer pointer) {
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

    public VkShaderModuleCreateFlags getFlags() {
        return new VkShaderModuleCreateFlags(getVkMemory(), getFlagsNative(getVkAddress()));
    }

    
    public void setFlags(VkShaderModuleCreateFlags flags) {
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

    public VkSize getCodeSize() {
        return new VkSize(getVkMemory(), getCodeSizeNative(getVkAddress()));
    }

    
    public void setCodeSize(VkSize codeSize) {
        setCodeSizeNative(getVkAddress(), codeSize != null ? codeSize.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getCodeSizeQ() {
        return getCodeSize().getValue();
    }

    public void setCodeSize(long codeSize) {
        getCodeSize().setValue(codeSize);
    }

    protected static native long getCodeSizeNative(long address);
    protected static native void setCodeSizeNative(long address, long codeSize);

    public VkUInt32 getPCode() {
        return new VkUInt32(getVkMemory(), getPCodeNative(getVkAddress()));
    }

    private VkObject pCode = null;
    public void setPCode(VkUInt32 pCode) {
        setPCodeNative(getVkAddress(), pCode != null ? pCode.getVkAddress() : VkPointer.NULL);
        this.pCode = pCode;
    }

    protected static native long getPCodeNative(long address);
    protected static native void setPCodeNative(long address, long pCode);


    public void set(VkShaderModuleCreateInfo o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkShaderModuleCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkShaderModuleCreateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkShaderModuleCreateInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_SHADER_MODULE_CREATE_INFO));;
        }

        public Array(VkShaderModuleCreateInfo o, int count){
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
        public VkShaderModuleCreateInfo get(int i){
            return new VkShaderModuleCreateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
