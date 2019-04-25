package cz.mg.vulkan;

public class VkPipelineTessellationDomainOriginStateCreateInfoKHR extends VkObject {
    public VkPipelineTessellationDomainOriginStateCreateInfoKHR() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_TESSELLATION_DOMAIN_ORIGIN_STATE_CREATE_INFO_KHR));
    }

    public VkPipelineTessellationDomainOriginStateCreateInfoKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineTessellationDomainOriginStateCreateInfoKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPipelineTessellationDomainOriginStateCreateInfoKHR(VkPointer pointer) {
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

    public VkTessellationDomainOriginKHR getDomainOrigin() {
        return new VkTessellationDomainOriginKHR(getVkMemory(), getDomainOriginNative(getVkAddress()));
    }

    
    public void setDomainOrigin(VkTessellationDomainOriginKHR domainOrigin) {
        setDomainOriginNative(getVkAddress(), domainOrigin != null ? domainOrigin.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDomainOriginQ() {
        return getDomainOrigin().getValue();
    }

    public void setDomainOrigin(int domainOrigin) {
        getDomainOrigin().setValue(domainOrigin);
    }

    protected static native long getDomainOriginNative(long address);
    protected static native void setDomainOriginNative(long address, long domainOrigin);


    public static native long sizeof();

    public static class Array extends VkPipelineTessellationDomainOriginStateCreateInfoKHR implements cz.mg.collections.array.ReadonlyArray<VkPipelineTessellationDomainOriginStateCreateInfoKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPipelineTessellationDomainOriginStateCreateInfoKHR.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_TESSELLATION_DOMAIN_ORIGIN_STATE_CREATE_INFO_KHR));;
        }

        public Array(int count, VkPipelineTessellationDomainOriginStateCreateInfoKHR o){
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
        public VkPipelineTessellationDomainOriginStateCreateInfoKHR get(int i){
            return new VkPipelineTessellationDomainOriginStateCreateInfoKHR(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
