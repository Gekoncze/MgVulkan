package cz.mg.vulkan;

public class VkAttachmentReference extends VkObject {
    public VkAttachmentReference() {
        super(sizeof());
    }

    protected VkAttachmentReference(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkAttachmentReference(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkAttachmentReference(VkPointer pointer) {
        super(pointer);
    }



    public VkUInt32 getAttachment() {
        return new VkUInt32(getVkMemory(), getAttachmentNative(getVkAddress()));
    }

    
    public void setAttachment(VkUInt32 attachment) {
        setAttachmentNative(getVkAddress(), attachment != null ? attachment.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getAttachmentQ() {
        return getAttachment().getValue();
    }

    public void setAttachment(int attachment) {
        getAttachment().setValue(attachment);
    }

    protected static native long getAttachmentNative(long address);
    protected static native void setAttachmentNative(long address, long attachment);

    public VkImageLayout getLayout() {
        return new VkImageLayout(getVkMemory(), getLayoutNative(getVkAddress()));
    }

    
    public void setLayout(VkImageLayout layout) {
        setLayoutNative(getVkAddress(), layout != null ? layout.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getLayoutQ() {
        return getLayout().getValue();
    }

    public void setLayout(int layout) {
        getLayout().setValue(layout);
    }

    protected static native long getLayoutNative(long address);
    protected static native void setLayoutNative(long address, long layout);


    public void set(VkAttachmentReference o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkAttachmentReference implements cz.mg.collections.array.ReadonlyArray<VkAttachmentReference> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkAttachmentReference.sizeof()));
            this.count = count;
        }

        public Array(VkAttachmentReference o, int count){
            super(o.getVkMemory(), o.getVkAddress());
            this.count = count;
        }

        public Array(VkPointer pointer, int count){
            super(pointer);
            this.count = count;
        }

        protected Array(VkMemory vkmemory, int count) {
            super(vkmemory);
            this.count = count;
        }

        protected Array(VkMemory vkmemory, long vkaddress, int count) {
            super(vkmemory, vkaddress);
            this.count = count;
        }





        @Override
        public int count(){
            return count;
        }

        @Override
        public VkAttachmentReference get(int i){
            return new VkAttachmentReference(getVkMemory(), address(i));
        }

        protected long address(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }

        public static class Array2 extends VkPointer.Array {
            public Array2(int count) {
                super(count);
            }

            protected Array2(VkMemory vkmemory, int count) {
                super(vkmemory, count);
            }

            protected Array2(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress, count);
            }
        }
    }
}
