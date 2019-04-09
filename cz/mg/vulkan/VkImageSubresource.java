package cz.mg.vulkan;

public class VkImageSubresource extends VkObject {
    public VkImageSubresource() {
        super(sizeof());
    }

    public VkImageSubresource(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkImageSubresource(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkImageSubresource(VkImageAspectFlags aspectMask, VkUInt32 mipLevel, VkUInt32 arrayLayer) {
        super(sizeof());
        setAspectMask(aspectMask);
        setMipLevel(mipLevel);
        setArrayLayer(arrayLayer);
    }

    public VkImageAspectFlags getAspectMask() {
        return new VkImageAspectFlags(getVkMemory(), getAspectMask(getVkAddress()));
    }

    
    public void setAspectMask(VkImageAspectFlags aspectMask) {
        setAspectMask(getVkAddress(), aspectMask != null ? aspectMask.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getAspectMask(long address);
    private static native void setAspectMask(long address, long aspectMask);

    public VkUInt32 getMipLevel() {
        return new VkUInt32(getVkMemory(), getMipLevel(getVkAddress()));
    }

    
    public void setMipLevel(VkUInt32 mipLevel) {
        setMipLevel(getVkAddress(), mipLevel != null ? mipLevel.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getMipLevel(long address);
    private static native void setMipLevel(long address, long mipLevel);

    public VkUInt32 getArrayLayer() {
        return new VkUInt32(getVkMemory(), getArrayLayer(getVkAddress()));
    }

    
    public void setArrayLayer(VkUInt32 arrayLayer) {
        setArrayLayer(getVkAddress(), arrayLayer != null ? arrayLayer.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getArrayLayer(long address);
    private static native void setArrayLayer(long address, long arrayLayer);


    public static native long sizeof();

    public static class Array extends VkImageSubresource implements cz.mg.collections.array.ReadonlyArray<VkImageSubresource> {        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkImageSubresource.sizeof()));
            this.count = count;
        }

        public Array(int count, VkImageSubresource o){
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
        public VkImageSubresource get(int i){
            return new VkImageSubresource(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }


    public static class Pointer extends VkObject.Pointer {        public Pointer() {
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

        public static class Array extends VkImageSubresource.Pointer implements cz.mg.collections.array.ReadonlyArray<VkImageSubresource.Pointer> {
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

            public Array(VkImageSubresource[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkImageSubresource.Pointer get(int i){
                return new VkImageSubresource.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }

}
