package cz.mg.vulkan;

public class VkBufferImageCopy extends VkObject {
    public VkBufferImageCopy() {
        super(sizeof());
    }

    public VkBufferImageCopy(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkBufferImageCopy(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkDeviceSize getBufferOffset() {
        return new VkDeviceSize(getVkMemory(), getBufferOffset(getVkAddress()));
    }

    
    public void setBufferOffset(VkDeviceSize bufferOffset) {
        setBufferOffset(getVkAddress(), bufferOffset != null ? bufferOffset.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getBufferOffsetQ() {
        return getBufferOffset().getValue();
    }

    public void setBufferOffset(long bufferOffset) {
        getBufferOffset().setValue(bufferOffset);
    }

    protected static native long getBufferOffset(long address);
    protected static native void setBufferOffset(long address, long bufferOffset);

    public VkUInt32 getBufferRowLength() {
        return new VkUInt32(getVkMemory(), getBufferRowLength(getVkAddress()));
    }

    
    public void setBufferRowLength(VkUInt32 bufferRowLength) {
        setBufferRowLength(getVkAddress(), bufferRowLength != null ? bufferRowLength.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getBufferRowLengthQ() {
        return getBufferRowLength().getValue();
    }

    public void setBufferRowLength(int bufferRowLength) {
        getBufferRowLength().setValue(bufferRowLength);
    }

    protected static native long getBufferRowLength(long address);
    protected static native void setBufferRowLength(long address, long bufferRowLength);

    public VkUInt32 getBufferImageHeight() {
        return new VkUInt32(getVkMemory(), getBufferImageHeight(getVkAddress()));
    }

    
    public void setBufferImageHeight(VkUInt32 bufferImageHeight) {
        setBufferImageHeight(getVkAddress(), bufferImageHeight != null ? bufferImageHeight.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getBufferImageHeightQ() {
        return getBufferImageHeight().getValue();
    }

    public void setBufferImageHeight(int bufferImageHeight) {
        getBufferImageHeight().setValue(bufferImageHeight);
    }

    protected static native long getBufferImageHeight(long address);
    protected static native void setBufferImageHeight(long address, long bufferImageHeight);

    public VkImageSubresourceLayers getImageSubresource() {
        return new VkImageSubresourceLayers(getVkMemory(), getImageSubresource(getVkAddress()));
    }

    
    public void setImageSubresource(VkImageSubresourceLayers imageSubresource) {
        setImageSubresource(getVkAddress(), imageSubresource != null ? imageSubresource.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getImageSubresource(long address);
    protected static native void setImageSubresource(long address, long imageSubresource);

    public VkOffset3D getImageOffset() {
        return new VkOffset3D(getVkMemory(), getImageOffset(getVkAddress()));
    }

    
    public void setImageOffset(VkOffset3D imageOffset) {
        setImageOffset(getVkAddress(), imageOffset != null ? imageOffset.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getImageOffset(long address);
    protected static native void setImageOffset(long address, long imageOffset);

    public VkExtent3D getImageExtent() {
        return new VkExtent3D(getVkMemory(), getImageExtent(getVkAddress()));
    }

    
    public void setImageExtent(VkExtent3D imageExtent) {
        setImageExtent(getVkAddress(), imageExtent != null ? imageExtent.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getImageExtent(long address);
    protected static native void setImageExtent(long address, long imageExtent);


    public static native long sizeof();

    public static class Array extends VkBufferImageCopy implements cz.mg.collections.array.ReadonlyArray<VkBufferImageCopy> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkBufferImageCopy.sizeof()));
            this.count = count;
        }

        public Array(int count, VkBufferImageCopy o){
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
        public VkBufferImageCopy get(int i){
            return new VkBufferImageCopy(getVkMemory(), addressAt(i));
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

        public static class Array extends VkBufferImageCopy.Pointer implements cz.mg.collections.array.ReadonlyArray<VkBufferImageCopy.Pointer> {
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

            public Array(VkBufferImageCopy[] a) {
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
            public VkBufferImageCopy.Pointer get(int i){
                return new VkBufferImageCopy.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }

            protected long addressAt(int i){
                return VkPointer.plus(getVkAddress(), sizeof()*i);
            }
        }
    }
}
