package cz.mg.vulkan;

public class VkRenderPassCreateInfo extends VkObject {
    public VkRenderPassCreateInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO));
    }

    public VkRenderPassCreateInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkRenderPassCreateInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkRenderPassCreateInfo(VkPointer pointer) {
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

    public VkRenderPassCreateFlags getFlags() {
        return new VkRenderPassCreateFlags(getVkMemory(), getFlagsNative(getVkAddress()));
    }

    
    public void setFlags(VkRenderPassCreateFlags flags) {
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

    public VkUInt32 getAttachmentCount() {
        return new VkUInt32(getVkMemory(), getAttachmentCountNative(getVkAddress()));
    }

    
    public void setAttachmentCount(VkUInt32 attachmentCount) {
        setAttachmentCountNative(getVkAddress(), attachmentCount != null ? attachmentCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getAttachmentCountQ() {
        return getAttachmentCount().getValue();
    }

    public void setAttachmentCount(int attachmentCount) {
        getAttachmentCount().setValue(attachmentCount);
    }

    protected static native long getAttachmentCountNative(long address);
    protected static native void setAttachmentCountNative(long address, long attachmentCount);

    public VkAttachmentDescription getPAttachments() {
        return new VkAttachmentDescription(getVkMemory(), getPAttachmentsNative(getVkAddress()));
    }

    private VkObject pAttachments = null;
    public void setPAttachments(VkAttachmentDescription pAttachments) {
        setPAttachmentsNative(getVkAddress(), pAttachments != null ? pAttachments.getVkAddress() : VkPointer.NULL);
        this.pAttachments = pAttachments;
    }

    protected static native long getPAttachmentsNative(long address);
    protected static native void setPAttachmentsNative(long address, long pAttachments);

    public VkUInt32 getSubpassCount() {
        return new VkUInt32(getVkMemory(), getSubpassCountNative(getVkAddress()));
    }

    
    public void setSubpassCount(VkUInt32 subpassCount) {
        setSubpassCountNative(getVkAddress(), subpassCount != null ? subpassCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSubpassCountQ() {
        return getSubpassCount().getValue();
    }

    public void setSubpassCount(int subpassCount) {
        getSubpassCount().setValue(subpassCount);
    }

    protected static native long getSubpassCountNative(long address);
    protected static native void setSubpassCountNative(long address, long subpassCount);

    public VkSubpassDescription getPSubpasses() {
        return new VkSubpassDescription(getVkMemory(), getPSubpassesNative(getVkAddress()));
    }

    private VkObject pSubpasses = null;
    public void setPSubpasses(VkSubpassDescription pSubpasses) {
        setPSubpassesNative(getVkAddress(), pSubpasses != null ? pSubpasses.getVkAddress() : VkPointer.NULL);
        this.pSubpasses = pSubpasses;
    }

    protected static native long getPSubpassesNative(long address);
    protected static native void setPSubpassesNative(long address, long pSubpasses);

    public VkUInt32 getDependencyCount() {
        return new VkUInt32(getVkMemory(), getDependencyCountNative(getVkAddress()));
    }

    
    public void setDependencyCount(VkUInt32 dependencyCount) {
        setDependencyCountNative(getVkAddress(), dependencyCount != null ? dependencyCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDependencyCountQ() {
        return getDependencyCount().getValue();
    }

    public void setDependencyCount(int dependencyCount) {
        getDependencyCount().setValue(dependencyCount);
    }

    protected static native long getDependencyCountNative(long address);
    protected static native void setDependencyCountNative(long address, long dependencyCount);

    public VkSubpassDependency getPDependencies() {
        return new VkSubpassDependency(getVkMemory(), getPDependenciesNative(getVkAddress()));
    }

    private VkObject pDependencies = null;
    public void setPDependencies(VkSubpassDependency pDependencies) {
        setPDependenciesNative(getVkAddress(), pDependencies != null ? pDependencies.getVkAddress() : VkPointer.NULL);
        this.pDependencies = pDependencies;
    }

    protected static native long getPDependenciesNative(long address);
    protected static native void setPDependenciesNative(long address, long pDependencies);


    public void set(VkRenderPassCreateInfo o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkRenderPassCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkRenderPassCreateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkRenderPassCreateInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO));;
        }

        public Array(int count, VkRenderPassCreateInfo o){
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
        public VkRenderPassCreateInfo get(int i){
            return new VkRenderPassCreateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
