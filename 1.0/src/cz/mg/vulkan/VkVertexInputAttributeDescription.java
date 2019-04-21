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
        setLocation(getVkAddress(), location != null ? location.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getLocationQ() {
        return getLocation().getValue();
    }

    public void setLocation(int location) {
        getLocation().setValue(location);
    }

    private static native long getLocation(long address);
    private static native void setLocation(long address, long location);

    public VkUInt32 getBinding() {
        return new VkUInt32(getVkMemory(), getBinding(getVkAddress()));
    }

    
    public void setBinding(VkUInt32 binding) {
        setBinding(getVkAddress(), binding != null ? binding.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getBindingQ() {
        return getBinding().getValue();
    }

    public void setBinding(int binding) {
        getBinding().setValue(binding);
    }

    private static native long getBinding(long address);
    private static native void setBinding(long address, long binding);

    public VkFormat getFormat() {
        return new VkFormat(getVkMemory(), getFormat(getVkAddress()));
    }

    
    public void setFormat(VkFormat format) {
        setFormat(getVkAddress(), format != null ? format.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getFormatQ() {
        return getFormat().getValue();
    }

    public void setFormat(int format) {
        getFormat().setValue(format);
    }

    private static native long getFormat(long address);
    private static native void setFormat(long address, long format);

    public VkUInt32 getOffset() {
        return new VkUInt32(getVkMemory(), getOffset(getVkAddress()));
    }

    
    public void setOffset(VkUInt32 offset) {
        setOffset(getVkAddress(), offset != null ? offset.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getOffsetQ() {
        return getOffset().getValue();
    }

    public void setOffset(int offset) {
        getOffset().setValue(offset);
    }

    private static native long getOffset(long address);
    private static native void setOffset(long address, long offset);


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
            return new VkVertexInputAttributeDescription(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkVertexInputAttributeDescription.Pointer implements cz.mg.collections.array.ReadonlyArray<VkVertexInputAttributeDescription.Pointer> {
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

            public Array(VkVertexInputAttributeDescription[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkVertexInputAttributeDescription.Pointer get(int i){
                return new VkVertexInputAttributeDescription.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
