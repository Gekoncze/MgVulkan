package cz.mg.vulkan;

public class VkPipelineTessellationDomainOriginStateCreateInfo extends VkObject {
    public VkPipelineTessellationDomainOriginStateCreateInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_TESSELLATION_DOMAIN_ORIGIN_STATE_CREATE_INFO));
    }

    public VkPipelineTessellationDomainOriginStateCreateInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineTessellationDomainOriginStateCreateInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPipelineTessellationDomainOriginStateCreateInfo(VkPointer pointer) {
        super(pointer);
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

    public VkTessellationDomainOrigin getDomainOrigin() {
        return new VkTessellationDomainOrigin(getVkMemory(), getDomainOrigin(getVkAddress()));
    }

    
    public void setDomainOrigin(VkTessellationDomainOrigin domainOrigin) {
        setDomainOrigin(getVkAddress(), domainOrigin != null ? domainOrigin.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDomainOriginQ() {
        return getDomainOrigin().getValue();
    }

    public void setDomainOrigin(int domainOrigin) {
        getDomainOrigin().setValue(domainOrigin);
    }

    protected static native long getDomainOrigin(long address);
    protected static native void setDomainOrigin(long address, long domainOrigin);


    public static native long sizeof();

    public static class Array extends VkPipelineTessellationDomainOriginStateCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkPipelineTessellationDomainOriginStateCreateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPipelineTessellationDomainOriginStateCreateInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_TESSELLATION_DOMAIN_ORIGIN_STATE_CREATE_INFO));;
        }

        public Array(int count, VkPipelineTessellationDomainOriginStateCreateInfo o){
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
        public VkPipelineTessellationDomainOriginStateCreateInfo get(int i){
            return new VkPipelineTessellationDomainOriginStateCreateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
