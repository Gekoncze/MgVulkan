package cz.mg.vulkan;

public class VkRenderPassSampleLocationsBeginInfoEXT extends VkObject {
    public VkRenderPassSampleLocationsBeginInfoEXT() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_RENDER_PASS_SAMPLE_LOCATIONS_BEGIN_INFO_EXT));
    }

    public VkRenderPassSampleLocationsBeginInfoEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkRenderPassSampleLocationsBeginInfoEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkRenderPassSampleLocationsBeginInfoEXT(VkPointer pointer) {
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

    public VkUInt32 getAttachmentInitialSampleLocationsCount() {
        return new VkUInt32(getVkMemory(), getAttachmentInitialSampleLocationsCountNative(getVkAddress()));
    }

    
    public void setAttachmentInitialSampleLocationsCount(VkUInt32 attachmentInitialSampleLocationsCount) {
        setAttachmentInitialSampleLocationsCountNative(getVkAddress(), attachmentInitialSampleLocationsCount != null ? attachmentInitialSampleLocationsCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getAttachmentInitialSampleLocationsCountQ() {
        return getAttachmentInitialSampleLocationsCount().getValue();
    }

    public void setAttachmentInitialSampleLocationsCount(int attachmentInitialSampleLocationsCount) {
        getAttachmentInitialSampleLocationsCount().setValue(attachmentInitialSampleLocationsCount);
    }

    protected static native long getAttachmentInitialSampleLocationsCountNative(long address);
    protected static native void setAttachmentInitialSampleLocationsCountNative(long address, long attachmentInitialSampleLocationsCount);

    public VkAttachmentSampleLocationsEXT getPAttachmentInitialSampleLocations() {
        return new VkAttachmentSampleLocationsEXT(getVkMemory(), getPAttachmentInitialSampleLocationsNative(getVkAddress()));
    }

    private VkObject pAttachmentInitialSampleLocations = null;
    public void setPAttachmentInitialSampleLocations(VkAttachmentSampleLocationsEXT pAttachmentInitialSampleLocations) {
        setPAttachmentInitialSampleLocationsNative(getVkAddress(), pAttachmentInitialSampleLocations != null ? pAttachmentInitialSampleLocations.getVkAddress() : VkPointer.NULL);
        this.pAttachmentInitialSampleLocations = pAttachmentInitialSampleLocations;
    }

    protected static native long getPAttachmentInitialSampleLocationsNative(long address);
    protected static native void setPAttachmentInitialSampleLocationsNative(long address, long pAttachmentInitialSampleLocations);

    public VkUInt32 getPostSubpassSampleLocationsCount() {
        return new VkUInt32(getVkMemory(), getPostSubpassSampleLocationsCountNative(getVkAddress()));
    }

    
    public void setPostSubpassSampleLocationsCount(VkUInt32 postSubpassSampleLocationsCount) {
        setPostSubpassSampleLocationsCountNative(getVkAddress(), postSubpassSampleLocationsCount != null ? postSubpassSampleLocationsCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getPostSubpassSampleLocationsCountQ() {
        return getPostSubpassSampleLocationsCount().getValue();
    }

    public void setPostSubpassSampleLocationsCount(int postSubpassSampleLocationsCount) {
        getPostSubpassSampleLocationsCount().setValue(postSubpassSampleLocationsCount);
    }

    protected static native long getPostSubpassSampleLocationsCountNative(long address);
    protected static native void setPostSubpassSampleLocationsCountNative(long address, long postSubpassSampleLocationsCount);

    public VkSubpassSampleLocationsEXT getPPostSubpassSampleLocations() {
        return new VkSubpassSampleLocationsEXT(getVkMemory(), getPPostSubpassSampleLocationsNative(getVkAddress()));
    }

    private VkObject pPostSubpassSampleLocations = null;
    public void setPPostSubpassSampleLocations(VkSubpassSampleLocationsEXT pPostSubpassSampleLocations) {
        setPPostSubpassSampleLocationsNative(getVkAddress(), pPostSubpassSampleLocations != null ? pPostSubpassSampleLocations.getVkAddress() : VkPointer.NULL);
        this.pPostSubpassSampleLocations = pPostSubpassSampleLocations;
    }

    protected static native long getPPostSubpassSampleLocationsNative(long address);
    protected static native void setPPostSubpassSampleLocationsNative(long address, long pPostSubpassSampleLocations);


    public static native long sizeof();

    public static class Array extends VkRenderPassSampleLocationsBeginInfoEXT implements cz.mg.collections.array.ReadonlyArray<VkRenderPassSampleLocationsBeginInfoEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkRenderPassSampleLocationsBeginInfoEXT.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_RENDER_PASS_SAMPLE_LOCATIONS_BEGIN_INFO_EXT));;
        }

        public Array(int count, VkRenderPassSampleLocationsBeginInfoEXT o){
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
        public VkRenderPassSampleLocationsBeginInfoEXT get(int i){
            return new VkRenderPassSampleLocationsBeginInfoEXT(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
