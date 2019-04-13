package cz.mg.vulkan;

public class VkInputAttachmentAspectReference extends VkObject {
    public VkInputAttachmentAspectReference() {
        super(sizeof());
    }

    public VkInputAttachmentAspectReference(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkInputAttachmentAspectReference(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkInputAttachmentAspectReference(VkUInt32 subpass, VkUInt32 inputAttachmentIndex, VkImageAspectFlags aspectMask) {
        super(sizeof());
        setSubpass(subpass);
        setInputAttachmentIndex(inputAttachmentIndex);
        setAspectMask(aspectMask);
    }

    public VkUInt32 getSubpass() {
        return new VkUInt32(getVkMemory(), getSubpass(getVkAddress()));
    }

    
    public void setSubpass(VkUInt32 subpass) {
        setSubpass(getVkAddress(), subpass != null ? subpass.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getSubpass(long address);
    private static native void setSubpass(long address, long subpass);

    public VkUInt32 getInputAttachmentIndex() {
        return new VkUInt32(getVkMemory(), getInputAttachmentIndex(getVkAddress()));
    }

    
    public void setInputAttachmentIndex(VkUInt32 inputAttachmentIndex) {
        setInputAttachmentIndex(getVkAddress(), inputAttachmentIndex != null ? inputAttachmentIndex.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getInputAttachmentIndex(long address);
    private static native void setInputAttachmentIndex(long address, long inputAttachmentIndex);

    public VkImageAspectFlags getAspectMask() {
        return new VkImageAspectFlags(getVkMemory(), getAspectMask(getVkAddress()));
    }

    
    public void setAspectMask(VkImageAspectFlags aspectMask) {
        setAspectMask(getVkAddress(), aspectMask != null ? aspectMask.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getAspectMask(long address);
    private static native void setAspectMask(long address, long aspectMask);


    public static native long sizeof();

    public static class Array extends VkInputAttachmentAspectReference implements cz.mg.collections.array.ReadonlyArray<VkInputAttachmentAspectReference> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkInputAttachmentAspectReference.sizeof()));
            this.count = count;
        }

        public Array(int count, VkInputAttachmentAspectReference o){
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
        public VkInputAttachmentAspectReference get(int i){
            return new VkInputAttachmentAspectReference(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkInputAttachmentAspectReference.Pointer implements cz.mg.collections.array.ReadonlyArray<VkInputAttachmentAspectReference.Pointer> {
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

            public Array(VkInputAttachmentAspectReference[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkInputAttachmentAspectReference.Pointer get(int i){
                return new VkInputAttachmentAspectReference.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
