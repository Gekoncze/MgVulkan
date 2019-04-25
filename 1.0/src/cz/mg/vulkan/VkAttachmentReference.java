package cz.mg.vulkan;

public class VkAttachmentReference extends VkObject {
    public VkAttachmentReference() {
        super(sizeof());
    }

    public VkAttachmentReference(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkAttachmentReference(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkUInt32 getAttachment() {
        return new VkUInt32(getVkMemory(), getAttachment(getVkAddress()));
    }

    
    public void setAttachment(VkUInt32 attachment) {
        setAttachment(getVkAddress(), attachment != null ? attachment.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getAttachmentQ() {
        return getAttachment().getValue();
    }

    public void setAttachment(int attachment) {
        getAttachment().setValue(attachment);
    }

    protected static native long getAttachment(long address);
    protected static native void setAttachment(long address, long attachment);

    public VkImageLayout getLayout() {
        return new VkImageLayout(getVkMemory(), getLayout(getVkAddress()));
    }

    
    public void setLayout(VkImageLayout layout) {
        setLayout(getVkAddress(), layout != null ? layout.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getLayoutQ() {
        return getLayout().getValue();
    }

    public void setLayout(int layout) {
        getLayout().setValue(layout);
    }

    protected static native long getLayout(long address);
    protected static native void setLayout(long address, long layout);


    public static native long sizeof();

    public static class Array extends VkAttachmentReference implements cz.mg.collections.array.ReadonlyArray<VkAttachmentReference> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkAttachmentReference.sizeof()));
            this.count = count;
        }

        public Array(int count, VkAttachmentReference o){
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
        public VkAttachmentReference get(int i){
            return new VkAttachmentReference(getVkMemory(), addressAt(i));
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

        public static class Array extends VkAttachmentReference.Pointer implements cz.mg.collections.array.ReadonlyArray<VkAttachmentReference.Pointer> {
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

            public Array(VkAttachmentReference[] a) {
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
            public VkAttachmentReference.Pointer get(int i){
                return new VkAttachmentReference.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }

            protected long addressAt(int i){
                return VkPointer.plus(getVkAddress(), sizeof()*i);
            }
        }
    }
}
