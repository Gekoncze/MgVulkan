package cz.mg.vulkan;

public class VkClearAttachment extends VkObject {
    public VkClearAttachment() {
        super(sizeof());
    }

    public VkClearAttachment(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkClearAttachment(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkClearAttachment(VkImageAspectFlags aspectMask, VkUInt32 colorAttachment, VkClearValue clearValue) {
        super(sizeof());
        setAspectMask(aspectMask);
        setColorAttachment(colorAttachment);
        setClearValue(clearValue);
    }

    public VkImageAspectFlags getAspectMask() {
        return new VkImageAspectFlags(getVkMemory(), getAspectMask(getVkAddress()));
    }

    
    public void setAspectMask(VkImageAspectFlags aspectMask) {
        setAspectMask(getVkAddress(), aspectMask != null ? aspectMask.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getAspectMask(long address);
    private static native void setAspectMask(long address, long aspectMask);

    public VkUInt32 getColorAttachment() {
        return new VkUInt32(getVkMemory(), getColorAttachment(getVkAddress()));
    }

    
    public void setColorAttachment(VkUInt32 colorAttachment) {
        setColorAttachment(getVkAddress(), colorAttachment != null ? colorAttachment.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getColorAttachment(long address);
    private static native void setColorAttachment(long address, long colorAttachment);

    public VkClearValue getClearValue() {
        return new VkClearValue(getVkMemory(), getClearValue(getVkAddress()));
    }

    
    public void setClearValue(VkClearValue clearValue) {
        setClearValue(getVkAddress(), clearValue != null ? clearValue.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getClearValue(long address);
    private static native void setClearValue(long address, long clearValue);


    public static native long sizeof();

    public static class Array extends VkClearAttachment implements cz.mg.collections.array.ReadonlyArray<VkClearAttachment> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkClearAttachment.sizeof()));
            this.count = count;
        }

        public Array(int count, VkClearAttachment o){
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
        public VkClearAttachment get(int i){
            return new VkClearAttachment(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkClearAttachment.Pointer implements cz.mg.collections.array.ReadonlyArray<VkClearAttachment.Pointer> {
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

            public Array(VkClearAttachment[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkClearAttachment.Pointer get(int i){
                return new VkClearAttachment.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
