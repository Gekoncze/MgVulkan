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



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getSTypeQ() {
        return getSType().getValue();
    }

    public void setSType(int sType) {
        getSType().setValue(sType);
    }

    private static native long getSType(long address);
    private static native void setSType(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNext(getVkAddress()));
    }

    private VkObject pNext = null;
    public void setPNext(VkObject pNext) {
        setPNext(getVkAddress(), pNext != null ? pNext.getVkAddress() : VkPointer.NULL);
        this.pNext = pNext;
    }

    private static native long getPNext(long address);
    private static native void setPNext(long address, long pNext);

    public VkUInt32 getAspectReferenceCount() {
        return new VkUInt32(getVkMemory(), getAspectReferenceCount(getVkAddress()));
    }

    
    public void setAspectReferenceCount(VkUInt32 aspectReferenceCount) {
        setAspectReferenceCount(getVkAddress(), aspectReferenceCount != null ? aspectReferenceCount.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getAspectReferenceCountQ() {
        return getAspectReferenceCount().getValue();
    }

    public void setAspectReferenceCount(int aspectReferenceCount) {
        getAspectReferenceCount().setValue(aspectReferenceCount);
    }

    private static native long getAspectReferenceCount(long address);
    private static native void setAspectReferenceCount(long address, long aspectReferenceCount);

    public VkInputAttachmentAspectReference getPAspectReferences() {
        return new VkInputAttachmentAspectReference(getVkMemory(), getPAspectReferences(getVkAddress()));
    }

    private VkObject pAspectReferences = null;
    public void setPAspectReferences(VkInputAttachmentAspectReference pAspectReferences) {
        setPAspectReferences(getVkAddress(), pAspectReferences != null ? pAspectReferences.getVkAddress() : VkPointer.NULL);
        this.pAspectReferences = pAspectReferences;
    }

    private static native long getPAspectReferences(long address);
    private static native void setPAspectReferences(long address, long pAspectReferences);


    public static native long sizeof();

    public static class Array extends VkRenderPassInputAttachmentAspectCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkRenderPassInputAttachmentAspectCreateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkRenderPassInputAttachmentAspectCreateInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_RENDER_PASS_INPUT_ATTACHMENT_ASPECT_CREATE_INFO));;
        }

        public Array(int count, VkRenderPassInputAttachmentAspectCreateInfo o){
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


    public static class Pointer extends VkObject.Pointer {
        public Pointer() {
        }

        public Pointer(long value) {
            setValue(value);
        }

        public Pointer(VkMemory vkmemory) {
            super(vkmemory);
        }

        public Pointer(VkMemory vkmemory, long vkaddress) {
            super(vkmemory, vkaddress);
        }

        public static class Array extends VkRenderPassInputAttachmentAspectCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VkRenderPassInputAttachmentAspectCreateInfo.Pointer> {
            private final int count;

            public Array(int count) {
                super(new VkMemory(count*VkPointer.sizeof()));
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

            public Array(VkRenderPassInputAttachmentAspectCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkRenderPassInputAttachmentAspectCreateInfo.Pointer get(int i){
                return new VkRenderPassInputAttachmentAspectCreateInfo.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
