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

    public VkBufferImageCopy(VkDeviceSize bufferOffset, VkUInt32 bufferRowLength, VkUInt32 bufferImageHeight, VkImageSubresourceLayers imageSubresource, VkOffset3D imageOffset, VkExtent3D imageExtent) {
        super(sizeof());
        setBufferOffset(bufferOffset);
        setBufferRowLength(bufferRowLength);
        setBufferImageHeight(bufferImageHeight);
        setImageSubresource(imageSubresource);
        setImageOffset(imageOffset);
        setImageExtent(imageExtent);
    }

    public VkDeviceSize getBufferOffset() {
        return new VkDeviceSize(getVkMemory(), getBufferOffset(getVkAddress()));
    }

    
    public void setBufferOffset(VkDeviceSize bufferOffset) {
        setBufferOffset(getVkAddress(), bufferOffset != null ? bufferOffset.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getBufferOffset(long address);
    private static native void setBufferOffset(long address, long bufferOffset);

    public VkUInt32 getBufferRowLength() {
        return new VkUInt32(getVkMemory(), getBufferRowLength(getVkAddress()));
    }

    
    public void setBufferRowLength(VkUInt32 bufferRowLength) {
        setBufferRowLength(getVkAddress(), bufferRowLength != null ? bufferRowLength.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getBufferRowLength(long address);
    private static native void setBufferRowLength(long address, long bufferRowLength);

    public VkUInt32 getBufferImageHeight() {
        return new VkUInt32(getVkMemory(), getBufferImageHeight(getVkAddress()));
    }

    
    public void setBufferImageHeight(VkUInt32 bufferImageHeight) {
        setBufferImageHeight(getVkAddress(), bufferImageHeight != null ? bufferImageHeight.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getBufferImageHeight(long address);
    private static native void setBufferImageHeight(long address, long bufferImageHeight);

    public VkImageSubresourceLayers getImageSubresource() {
        return new VkImageSubresourceLayers(getVkMemory(), getImageSubresource(getVkAddress()));
    }

    
    public void setImageSubresource(VkImageSubresourceLayers imageSubresource) {
        setImageSubresource(getVkAddress(), imageSubresource != null ? imageSubresource.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getImageSubresource(long address);
    private static native void setImageSubresource(long address, long imageSubresource);

    public VkOffset3D getImageOffset() {
        return new VkOffset3D(getVkMemory(), getImageOffset(getVkAddress()));
    }

    
    public void setImageOffset(VkOffset3D imageOffset) {
        setImageOffset(getVkAddress(), imageOffset != null ? imageOffset.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getImageOffset(long address);
    private static native void setImageOffset(long address, long imageOffset);

    public VkExtent3D getImageExtent() {
        return new VkExtent3D(getVkMemory(), getImageExtent(getVkAddress()));
    }

    
    public void setImageExtent(VkExtent3D imageExtent) {
        setImageExtent(getVkAddress(), imageExtent != null ? imageExtent.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getImageExtent(long address);
    private static native void setImageExtent(long address, long imageExtent);


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
            return new VkBufferImageCopy(getVkMemory(), getVkAddress() + sizeof()*i);
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

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkBufferImageCopy.Pointer get(int i){
                return new VkBufferImageCopy.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
