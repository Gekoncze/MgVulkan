package cz.mg.vulkan;

public class VkVertexInputAttributeDescription extends VkObject {
    public VkVertexInputAttributeDescription() {
        super(sizeof());
    }

    protected VkVertexInputAttributeDescription(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkVertexInputAttributeDescription(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkVertexInputAttributeDescription(VkPointer pointer) {
        super(pointer);
    }



    public VkUInt32 getLocation() {
        return new VkUInt32(getVkMemory(), getLocationNative(getVkAddress()));
    }

    
    public void setLocation(VkUInt32 location) {
        setLocationNative(getVkAddress(), location != null ? location.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getLocationQ() {
        return getLocation().getValue();
    }

    public void setLocation(int location) {
        getLocation().setValue(location);
    }

    protected static native long getLocationNative(long address);
    protected static native void setLocationNative(long address, long location);

    public VkUInt32 getBinding() {
        return new VkUInt32(getVkMemory(), getBindingNative(getVkAddress()));
    }

    
    public void setBinding(VkUInt32 binding) {
        setBindingNative(getVkAddress(), binding != null ? binding.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getBindingQ() {
        return getBinding().getValue();
    }

    public void setBinding(int binding) {
        getBinding().setValue(binding);
    }

    protected static native long getBindingNative(long address);
    protected static native void setBindingNative(long address, long binding);

    public VkFormat getFormat() {
        return new VkFormat(getVkMemory(), getFormatNative(getVkAddress()));
    }

    
    public void setFormat(VkFormat format) {
        setFormatNative(getVkAddress(), format != null ? format.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFormatQ() {
        return getFormat().getValue();
    }

    public void setFormat(int format) {
        getFormat().setValue(format);
    }

    protected static native long getFormatNative(long address);
    protected static native void setFormatNative(long address, long format);

    public VkUInt32 getOffset() {
        return new VkUInt32(getVkMemory(), getOffsetNative(getVkAddress()));
    }

    
    public void setOffset(VkUInt32 offset) {
        setOffsetNative(getVkAddress(), offset != null ? offset.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getOffsetQ() {
        return getOffset().getValue();
    }

    public void setOffset(int offset) {
        getOffset().setValue(offset);
    }

    protected static native long getOffsetNative(long address);
    protected static native void setOffsetNative(long address, long offset);


    public static native long sizeof();

    public static class Array extends VkVertexInputAttributeDescription implements cz.mg.collections.array.ReadonlyArray<VkVertexInputAttributeDescription> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkVertexInputAttributeDescription.sizeof()));
            this.count = count;
        }

        public Array(VkVertexInputAttributeDescription o, int count){
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
        public VkVertexInputAttributeDescription get(int i){
            return new VkVertexInputAttributeDescription(getVkMemory(), address(i));
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
