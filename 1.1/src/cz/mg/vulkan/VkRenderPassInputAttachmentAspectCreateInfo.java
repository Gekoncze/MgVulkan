package cz.mg.vulkan;

public class VkRenderPassInputAttachmentAspectCreateInfo extends VkObject {
    public VkRenderPassInputAttachmentAspectCreateInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_RENDER_PASS_INPUT_ATTACHMENT_ASPECT_CREATE_INFO));
    }

    public VkRenderPassInputAttachmentAspectCreateInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkRenderPassInputAttachmentAspectCreateInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkRenderPassInputAttachmentAspectCreateInfo(VkPointer pointer) {
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

    public VkInputAttachmentAspectReference getPAspectReferences() {
        return new VkInputAttachmentAspectReference(getVkMemory(), getPAspectReferencesNative(getVkAddress()));
    }

    private VkObject pAspectReferences = null;
    public void setPAspectReferences(VkInputAttachmentAspectReference pAspectReferences) {
        setPAspectReferencesNative(getVkAddress(), pAspectReferences != null ? pAspectReferences.getVkAddress() : VkPointer.NULL);
        this.pAspectReferences = pAspectReferences;
    }

    public VkInputAttachmentAspectReference.Array getPAspectReferencesQ() {
        return new VkInputAttachmentAspectReference.Array(getPAspectReferences(), getAspectReferenceCountQ());
    }

    protected static native long getPAspectReferencesNative(long address);
    protected static native void setPAspectReferencesNative(long address, long pAspectReferences);


    public void set(VkRenderPassInputAttachmentAspectCreateInfo o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkRenderPassInputAttachmentAspectCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkRenderPassInputAttachmentAspectCreateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkRenderPassInputAttachmentAspectCreateInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_RENDER_PASS_INPUT_ATTACHMENT_ASPECT_CREATE_INFO));;
        }

        public Array(VkRenderPassInputAttachmentAspectCreateInfo o, int count){
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
        public VkRenderPassInputAttachmentAspectCreateInfo get(int i){
            return new VkRenderPassInputAttachmentAspectCreateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
