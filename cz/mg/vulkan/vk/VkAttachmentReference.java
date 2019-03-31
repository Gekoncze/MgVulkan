package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkAttachmentReference.html">khronos documentation</a>
 **/
public class VkAttachmentReference extends VkObject {
    public VkAttachmentReference() {
        super(sizeof());
    }

    public VkAttachmentReference(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkAttachmentReference(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
    }


    public VkAttachmentReference(VkUInt32 attachment, VkImageLayout layout) {
        super(sizeof());
        setAttachment(attachment);
        setLayout(layout);
    }

    public VkUInt32 getAttachment() {
        return new VkUInt32(getVkMemory(), getAttachment(getVkAddress()));
    }

    public void setAttachment(VkUInt32 attachment) {
        setAttachment(getVkAddress(), attachment.getVkAddress());
    }

    private static native long getAttachment(long address);
    private static native void setAttachment(long address, long attachment);

    public VkImageLayout getLayout() {
        return new VkImageLayout(getVkMemory(), getLayout(getVkAddress()));
    }

    public void setLayout(VkImageLayout layout) {
        setLayout(getVkAddress(), layout.getVkAddress());
    }

    private static native long getLayout(long address);
    private static native void setLayout(long address, long layout);


    public static native long sizeof();

    public static class Array extends VkAttachmentReference implements cz.mg.collections.array.ReadonlyArray<VkAttachmentReference> {
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
        public VkAttachmentReference get(int i){
            return new VkAttachmentReference(getVkMemory(), getVkAddress() + sizeof()*i);
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

            public Array(VkAttachmentReference[] a) {
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
