package cz.mg.vulkan;

public class VkInputAttachmentAspectReferenceKHR extends VkObject {
    public VkInputAttachmentAspectReferenceKHR() {
        super(sizeof());
    }

    public VkInputAttachmentAspectReferenceKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkInputAttachmentAspectReferenceKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkUInt32 getSubpass() {
        return new VkUInt32(getVkMemory(), getSubpass(getVkAddress()));
    }

    
    public void setSubpass(VkUInt32 subpass) {
        setSubpass(getVkAddress(), subpass != null ? subpass.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSubpassQ() {
        return getSubpass().getValue();
    }

    public void setSubpass(int subpass) {
        getSubpass().setValue(subpass);
    }

    protected static native long getSubpass(long address);
    protected static native void setSubpass(long address, long subpass);

    public VkUInt32 getInputAttachmentIndex() {
        return new VkUInt32(getVkMemory(), getInputAttachmentIndex(getVkAddress()));
    }

    
    public void setInputAttachmentIndex(VkUInt32 inputAttachmentIndex) {
        setInputAttachmentIndex(getVkAddress(), inputAttachmentIndex != null ? inputAttachmentIndex.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getInputAttachmentIndexQ() {
        return getInputAttachmentIndex().getValue();
    }

    public void setInputAttachmentIndex(int inputAttachmentIndex) {
        getInputAttachmentIndex().setValue(inputAttachmentIndex);
    }

    protected static native long getInputAttachmentIndex(long address);
    protected static native void setInputAttachmentIndex(long address, long inputAttachmentIndex);

    public VkImageAspectFlags getAspectMask() {
        return new VkImageAspectFlags(getVkMemory(), getAspectMask(getVkAddress()));
    }

    
    public void setAspectMask(VkImageAspectFlags aspectMask) {
        setAspectMask(getVkAddress(), aspectMask != null ? aspectMask.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getAspectMaskQ() {
        return getAspectMask().getValue();
    }

    public void setAspectMask(int aspectMask) {
        getAspectMask().setValue(aspectMask);
    }

    protected static native long getAspectMask(long address);
    protected static native void setAspectMask(long address, long aspectMask);


    public static native long sizeof();

    public static class Array extends VkInputAttachmentAspectReferenceKHR implements cz.mg.collections.array.ReadonlyArray<VkInputAttachmentAspectReferenceKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkInputAttachmentAspectReferenceKHR.sizeof()));
            this.count = count;
        }

        public Array(int count, VkInputAttachmentAspectReferenceKHR o){
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
        public VkInputAttachmentAspectReferenceKHR get(int i){
            return new VkInputAttachmentAspectReferenceKHR(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
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

        public static class Array extends VkInputAttachmentAspectReferenceKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VkInputAttachmentAspectReferenceKHR.Pointer> {
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

            public Array(VkInputAttachmentAspectReferenceKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            public Array(long... values){
                this(values.length);
                for(int i = 0; i < values.length; i++) setValueAt(i, values[i]);
            }

            public long getValueAt(int i){
                return getValueNative(addressAt(i));
            }

            public void setValueAt(int i, long value){
                setValueNative(addressAt(i), value);
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkInputAttachmentAspectReferenceKHR.Pointer get(int i){
                return new VkInputAttachmentAspectReferenceKHR.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }

            protected long addressAt(int i){
                return VkPointer.plus(getVkAddress(), sizeof()*i);
            }
        }
    }
}
