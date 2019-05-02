package cz.mg.vulkan;

public class VkBufferImageCopy extends VkObject {
    public VkBufferImageCopy() {
        super(sizeof());
    }

    protected VkBufferImageCopy(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkBufferImageCopy(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkBufferImageCopy(VkPointer pointer) {
        super(pointer);
    }



    public VkDeviceSize getBufferOffset() {
        return new VkDeviceSize(getVkMemory(), getBufferOffsetNative(getVkAddress()));
    }

    
    public void setBufferOffset(VkDeviceSize bufferOffset) {
        setBufferOffsetNative(getVkAddress(), bufferOffset != null ? bufferOffset.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getBufferOffsetQ() {
        return getBufferOffset().getValue();
    }

    public void setBufferOffset(long bufferOffset) {
        getBufferOffset().setValue(bufferOffset);
    }

    protected static native long getBufferOffsetNative(long address);
    protected static native void setBufferOffsetNative(long address, long bufferOffset);

    public VkUInt32 getBufferRowLength() {
        return new VkUInt32(getVkMemory(), getBufferRowLengthNative(getVkAddress()));
    }

    
    public void setBufferRowLength(VkUInt32 bufferRowLength) {
        setBufferRowLengthNative(getVkAddress(), bufferRowLength != null ? bufferRowLength.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getBufferRowLengthQ() {
        return getBufferRowLength().getValue();
    }

    public void setBufferRowLength(int bufferRowLength) {
        getBufferRowLength().setValue(bufferRowLength);
    }

    protected static native long getBufferRowLengthNative(long address);
    protected static native void setBufferRowLengthNative(long address, long bufferRowLength);

    public VkUInt32 getBufferImageHeight() {
        return new VkUInt32(getVkMemory(), getBufferImageHeightNative(getVkAddress()));
    }

    
    public void setBufferImageHeight(VkUInt32 bufferImageHeight) {
        setBufferImageHeightNative(getVkAddress(), bufferImageHeight != null ? bufferImageHeight.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getBufferImageHeightQ() {
        return getBufferImageHeight().getValue();
    }

    public void setBufferImageHeight(int bufferImageHeight) {
        getBufferImageHeight().setValue(bufferImageHeight);
    }

    protected static native long getBufferImageHeightNative(long address);
    protected static native void setBufferImageHeightNative(long address, long bufferImageHeight);

    public VkImageSubresourceLayers getImageSubresource() {
        return new VkImageSubresourceLayers(getVkMemory(), getImageSubresourceNative(getVkAddress()));
    }

    
    public void setImageSubresource(VkImageSubresourceLayers imageSubresource) {
        setImageSubresourceNative(getVkAddress(), imageSubresource != null ? imageSubresource.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getImageSubresourceNative(long address);
    protected static native void setImageSubresourceNative(long address, long imageSubresource);

    public VkOffset3D getImageOffset() {
        return new VkOffset3D(getVkMemory(), getImageOffsetNative(getVkAddress()));
    }

    
    public void setImageOffset(VkOffset3D imageOffset) {
        setImageOffsetNative(getVkAddress(), imageOffset != null ? imageOffset.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getImageOffsetNative(long address);
    protected static native void setImageOffsetNative(long address, long imageOffset);

    public VkExtent3D getImageExtent() {
        return new VkExtent3D(getVkMemory(), getImageExtentNative(getVkAddress()));
    }

    
    public void setImageExtent(VkExtent3D imageExtent) {
        setImageExtentNative(getVkAddress(), imageExtent != null ? imageExtent.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getImageExtentNative(long address);
    protected static native void setImageExtentNative(long address, long imageExtent);


    public void set(VkBufferImageCopy o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkBufferImageCopy implements cz.mg.collections.array.ReadonlyArray<VkBufferImageCopy> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkBufferImageCopy.sizeof()));
            this.count = count;
        }

        public Array(VkBufferImageCopy o, int count){
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
        public VkBufferImageCopy get(int i){
            return new VkBufferImageCopy(getVkMemory(), address(i));
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
