package cz.mg.vulkan;

public class VkVertexInputAttributeDescription extends VkObject {
    public VkVertexInputAttributeDescription() {
        super(sizeof());
    }

    public VkVertexInputAttributeDescription(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkVertexInputAttributeDescription(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkUInt32 getLocation() {
        return new VkUInt32(getVkMemory(), getLocation(getVkAddress()));
    }

    
    public void setLocation(VkUInt32 location) {
        setLocation(getVkAddress(), location != null ? location.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getLocationQ() {
        return getLocation().getValue();
    }

    public void setLocation(int location) {
        getLocation().setValue(location);
    }

    protected static native long getLocation(long address);
    protected static native void setLocation(long address, long location);

    public VkUInt32 getBinding() {
        return new VkUInt32(getVkMemory(), getBinding(getVkAddress()));
    }

    
    public void setBinding(VkUInt32 binding) {
        setBinding(getVkAddress(), binding != null ? binding.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getBindingQ() {
        return getBinding().getValue();
    }

    public void setBinding(int binding) {
        getBinding().setValue(binding);
    }

    protected static native long getBinding(long address);
    protected static native void setBinding(long address, long binding);

    public VkFormat getFormat() {
        return new VkFormat(getVkMemory(), getFormat(getVkAddress()));
    }

    
    public void setFormat(VkFormat format) {
        setFormat(getVkAddress(), format != null ? format.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFormatQ() {
        return getFormat().getValue();
    }

    public void setFormat(int format) {
        getFormat().setValue(format);
    }

    protected static native long getFormat(long address);
    protected static native void setFormat(long address, long format);

    public VkUInt32 getOffset() {
        return new VkUInt32(getVkMemory(), getOffset(getVkAddress()));
    }

    
    public void setOffset(VkUInt32 offset) {
        setOffset(getVkAddress(), offset != null ? offset.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getOffsetQ() {
        return getOffset().getValue();
    }

    public void setOffset(int offset) {
        getOffset().setValue(offset);
    }

    protected static native long getOffset(long address);
    protected static native void setOffset(long address, long offset);


    public static native long sizeof();

    public static class Array extends VkVertexInputAttributeDescription implements cz.mg.collections.array.ReadonlyArray<VkVertexInputAttributeDescription> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkVertexInputAttributeDescription.sizeof()));
            this.count = count;
        }

        public Array(int count, VkVertexInputAttributeDescription o){
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
        public VkVertexInputAttributeDescription get(int i){
            return new VkVertexInputAttributeDescription(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }

        public static class Array2 extends VkPointer.Array {
            public Array2(int count) {
                super(count);
            }

            public Array2(int count, VkPointer o){
                super(count, o);
            }

            public Array2(VkMemory vkmemory, int count) {
                super(vkmemory, count);
            }

            public Array2(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress, count);
            }
        }
    }
}
