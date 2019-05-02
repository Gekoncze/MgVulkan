package cz.mg.vulkan;

public class VkInputAttachmentAspectReference extends VkObject {
    public VkInputAttachmentAspectReference() {
        super(sizeof());
    }

    protected VkInputAttachmentAspectReference(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkInputAttachmentAspectReference(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkInputAttachmentAspectReference(VkPointer pointer) {
        super(pointer);
    }



    public VkUInt32 getSubpass() {
        return new VkUInt32(getVkMemory(), getSubpassNative(getVkAddress()));
    }

    
    public void setSubpass(VkUInt32 subpass) {
        setSubpassNative(getVkAddress(), subpass != null ? subpass.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSubpassQ() {
        return getSubpass().getValue();
    }

    public void setSubpass(int subpass) {
        getSubpass().setValue(subpass);
    }

    protected static native long getSubpassNative(long address);
    protected static native void setSubpassNative(long address, long subpass);

    public VkUInt32 getInputAttachmentIndex() {
        return new VkUInt32(getVkMemory(), getInputAttachmentIndexNative(getVkAddress()));
    }

    
    public void setInputAttachmentIndex(VkUInt32 inputAttachmentIndex) {
        setInputAttachmentIndexNative(getVkAddress(), inputAttachmentIndex != null ? inputAttachmentIndex.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getInputAttachmentIndexQ() {
        return getInputAttachmentIndex().getValue();
    }

    public void setInputAttachmentIndex(int inputAttachmentIndex) {
        getInputAttachmentIndex().setValue(inputAttachmentIndex);
    }

    protected static native long getInputAttachmentIndexNative(long address);
    protected static native void setInputAttachmentIndexNative(long address, long inputAttachmentIndex);

    public VkImageAspectFlags getAspectMask() {
        return new VkImageAspectFlags(getVkMemory(), getAspectMaskNative(getVkAddress()));
    }

    
    public void setAspectMask(VkImageAspectFlags aspectMask) {
        setAspectMaskNative(getVkAddress(), aspectMask != null ? aspectMask.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getAspectMaskQ() {
        return getAspectMask().getValue();
    }

    public void setAspectMask(int aspectMask) {
        getAspectMask().setValue(aspectMask);
    }

    protected static native long getAspectMaskNative(long address);
    protected static native void setAspectMaskNative(long address, long aspectMask);


    public void set(VkInputAttachmentAspectReference o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkInputAttachmentAspectReference implements cz.mg.collections.array.ReadonlyArray<VkInputAttachmentAspectReference> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkInputAttachmentAspectReference.sizeof()));
            this.count = count;
        }

        public Array(VkInputAttachmentAspectReference o, int count){
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
        public VkInputAttachmentAspectReference get(int i){
            return new VkInputAttachmentAspectReference(getVkMemory(), address(i));
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
