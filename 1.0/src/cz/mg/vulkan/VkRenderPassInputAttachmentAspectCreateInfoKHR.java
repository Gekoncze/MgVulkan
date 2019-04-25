package cz.mg.vulkan;

public class VkRenderPassInputAttachmentAspectCreateInfoKHR extends VkObject {
    public VkRenderPassInputAttachmentAspectCreateInfoKHR() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_RENDER_PASS_INPUT_ATTACHMENT_ASPECT_CREATE_INFO_KHR));
    }

    public VkRenderPassInputAttachmentAspectCreateInfoKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkRenderPassInputAttachmentAspectCreateInfoKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkRenderPassInputAttachmentAspectCreateInfoKHR(VkPointer pointer) {
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

    public VkUInt32 getAspectReferenceCount() {
        return new VkUInt32(getVkMemory(), getAspectReferenceCountNative(getVkAddress()));
    }

    
    public void setAspectReferenceCount(VkUInt32 aspectReferenceCount) {
        setAspectReferenceCountNative(getVkAddress(), aspectReferenceCount != null ? aspectReferenceCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getAspectReferenceCountQ() {
        return getAspectReferenceCount().getValue();
    }

    public void setAspectReferenceCount(int aspectReferenceCount) {
        getAspectReferenceCount().setValue(aspectReferenceCount);
    }

    protected static native long getAspectReferenceCountNative(long address);
    protected static native void setAspectReferenceCountNative(long address, long aspectReferenceCount);

    public VkInputAttachmentAspectReferenceKHR getPAspectReferences() {
        return new VkInputAttachmentAspectReferenceKHR(getVkMemory(), getPAspectReferencesNative(getVkAddress()));
    }

    private VkObject pAspectReferences = null;
    public void setPAspectReferences(VkInputAttachmentAspectReferenceKHR pAspectReferences) {
        setPAspectReferencesNative(getVkAddress(), pAspectReferences != null ? pAspectReferences.getVkAddress() : VkPointer.NULL);
        this.pAspectReferences = pAspectReferences;
    }

    protected static native long getPAspectReferencesNative(long address);
    protected static native void setPAspectReferencesNative(long address, long pAspectReferences);


    public static native long sizeof();

    public static class Array extends VkRenderPassInputAttachmentAspectCreateInfoKHR implements cz.mg.collections.array.ReadonlyArray<VkRenderPassInputAttachmentAspectCreateInfoKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkRenderPassInputAttachmentAspectCreateInfoKHR.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_RENDER_PASS_INPUT_ATTACHMENT_ASPECT_CREATE_INFO_KHR));;
        }

        public Array(int count, VkRenderPassInputAttachmentAspectCreateInfoKHR o){
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
        public VkRenderPassInputAttachmentAspectCreateInfoKHR get(int i){
            return new VkRenderPassInputAttachmentAspectCreateInfoKHR(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
