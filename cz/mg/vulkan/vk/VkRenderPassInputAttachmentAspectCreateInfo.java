package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkRenderPassInputAttachmentAspectCreateInfo.html">khronos documentation</a>
 **/
public class VkRenderPassInputAttachmentAspectCreateInfo extends VkObject {
    public VkRenderPassInputAttachmentAspectCreateInfo() {
        super(sizeof());
    }

    public VkRenderPassInputAttachmentAspectCreateInfo(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkRenderPassInputAttachmentAspectCreateInfo(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
    }


    public VkRenderPassInputAttachmentAspectCreateInfo(VkObject pNext, VkUInt32 aspectReferenceCount, VkInputAttachmentAspectReference pAspectReferences) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_RENDER_PASS_INPUT_ATTACHMENT_ASPECT_CREATE_INFO));
        setPNext(pNext);
        setAspectReferenceCount(aspectReferenceCount);
        setPAspectReferences(pAspectReferences);
    }

    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType.getVkAddress());
    }

    private static native long getSType(long address);
    private static native void setSType(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNext(getVkAddress()));
    }

    public void setPNext(VkObject pNext) {
        setPNext(getVkAddress(), pNext.getVkAddress());
    }

    private static native long getPNext(long address);
    private static native void setPNext(long address, long pNext);

    public VkUInt32 getAspectReferenceCount() {
        return new VkUInt32(getVkMemory(), getAspectReferenceCount(getVkAddress()));
    }

    public void setAspectReferenceCount(VkUInt32 aspectReferenceCount) {
        setAspectReferenceCount(getVkAddress(), aspectReferenceCount.getVkAddress());
    }

    private static native long getAspectReferenceCount(long address);
    private static native void setAspectReferenceCount(long address, long aspectReferenceCount);

    public VkInputAttachmentAspectReference.Array getPAspectReferences() {
        return new VkInputAttachmentAspectReference.Array(getVkMemory(), getPAspectReferences(getVkAddress()), getAspectReferenceCount().getValue());
    }

    public void setPAspectReferences(VkInputAttachmentAspectReference pAspectReferences) {
        setPAspectReferences(getVkAddress(), pAspectReferences.getVkAddress());
    }

    private static native long getPAspectReferences(long address);
    private static native void setPAspectReferences(long address, long pAspectReferences);


    public static native long sizeof();

    public static class Array extends VkRenderPassInputAttachmentAspectCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkRenderPassInputAttachmentAspectCreateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*sizeof()));
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

        public static class Array extends Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
            private final int count;

            public Array(int count) {
                super(new VkMemory(count*sizeof()));
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
            public Pointer get(int i){
                return new Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
