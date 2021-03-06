package cz.mg.vulkan;

public class VkClearAttachment extends VkObject {
    public VkClearAttachment() {
        super(sizeof());
    }

    protected VkClearAttachment(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkClearAttachment(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkClearAttachment(VkPointer pointer) {
        super(pointer);
    }



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

    public VkUInt32 getColorAttachment() {
        return new VkUInt32(getVkMemory(), getColorAttachmentNative(getVkAddress()));
    }

    
    public void setColorAttachment(VkUInt32 colorAttachment) {
        setColorAttachmentNative(getVkAddress(), colorAttachment != null ? colorAttachment.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getColorAttachmentQ() {
        return getColorAttachment().getValue();
    }

    public void setColorAttachment(int colorAttachment) {
        getColorAttachment().setValue(colorAttachment);
    }

    protected static native long getColorAttachmentNative(long address);
    protected static native void setColorAttachmentNative(long address, long colorAttachment);

    public VkClearValue getClearValue() {
        return new VkClearValue(getVkMemory(), getClearValueNative(getVkAddress()));
    }

    
    public void setClearValue(VkClearValue clearValue) {
        setClearValueNative(getVkAddress(), clearValue != null ? clearValue.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getClearValueNative(long address);
    protected static native void setClearValueNative(long address, long clearValue);


    public void set(VkClearAttachment o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkClearAttachment implements cz.mg.collections.array.ReadonlyArray<VkClearAttachment> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkClearAttachment.sizeof()));
            this.count = count;
        }

        public Array(VkClearAttachment o, int count){
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
        public VkClearAttachment get(int i){
            return new VkClearAttachment(getVkMemory(), address(i));
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
