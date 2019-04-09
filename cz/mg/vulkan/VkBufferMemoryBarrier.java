package cz.mg.vulkan;

public class VkBufferMemoryBarrier extends VkObject {
    public VkBufferMemoryBarrier() {
        super(sizeof());
    }

    public VkBufferMemoryBarrier(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkBufferMemoryBarrier(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkBufferMemoryBarrier(VkStructureType sType, VkObject pNext, VkAccessFlags srcAccessMask, VkAccessFlags dstAccessMask, VkUInt32 srcQueueFamilyIndex, VkUInt32 dstQueueFamilyIndex, VkBuffer buffer, VkDeviceSize offset, VkDeviceSize size) {
        super(sizeof());
        setSType(sType);
        setPNext(pNext);
        setSrcAccessMask(srcAccessMask);
        setDstAccessMask(dstAccessMask);
        setSrcQueueFamilyIndex(srcQueueFamilyIndex);
        setDstQueueFamilyIndex(dstQueueFamilyIndex);
        setBuffer(buffer);
        setOffset(offset);
        setSize(size);
    }

    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getSType(long address);
    private static native void setSType(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNext(getVkAddress()));
    }

    private VkObject pNext = null;
    public void setPNext(VkObject pNext) {
        setPNext(getVkAddress(), pNext != null ? pNext.getVkAddress() : VkPointer.NULL);
        this.pNext = pNext;
    }

    private static native long getPNext(long address);
    private static native void setPNext(long address, long pNext);

    public VkAccessFlags getSrcAccessMask() {
        return new VkAccessFlags(getVkMemory(), getSrcAccessMask(getVkAddress()));
    }

    
    public void setSrcAccessMask(VkAccessFlags srcAccessMask) {
        setSrcAccessMask(getVkAddress(), srcAccessMask != null ? srcAccessMask.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getSrcAccessMask(long address);
    private static native void setSrcAccessMask(long address, long srcAccessMask);

    public VkAccessFlags getDstAccessMask() {
        return new VkAccessFlags(getVkMemory(), getDstAccessMask(getVkAddress()));
    }

    
    public void setDstAccessMask(VkAccessFlags dstAccessMask) {
        setDstAccessMask(getVkAddress(), dstAccessMask != null ? dstAccessMask.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getDstAccessMask(long address);
    private static native void setDstAccessMask(long address, long dstAccessMask);

    public VkUInt32 getSrcQueueFamilyIndex() {
        return new VkUInt32(getVkMemory(), getSrcQueueFamilyIndex(getVkAddress()));
    }

    
    public void setSrcQueueFamilyIndex(VkUInt32 srcQueueFamilyIndex) {
        setSrcQueueFamilyIndex(getVkAddress(), srcQueueFamilyIndex != null ? srcQueueFamilyIndex.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getSrcQueueFamilyIndex(long address);
    private static native void setSrcQueueFamilyIndex(long address, long srcQueueFamilyIndex);

    public VkUInt32 getDstQueueFamilyIndex() {
        return new VkUInt32(getVkMemory(), getDstQueueFamilyIndex(getVkAddress()));
    }

    
    public void setDstQueueFamilyIndex(VkUInt32 dstQueueFamilyIndex) {
        setDstQueueFamilyIndex(getVkAddress(), dstQueueFamilyIndex != null ? dstQueueFamilyIndex.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getDstQueueFamilyIndex(long address);
    private static native void setDstQueueFamilyIndex(long address, long dstQueueFamilyIndex);

    public VkBuffer getBuffer() {
        return new VkBuffer(getVkMemory(), getBuffer(getVkAddress()));
    }

    
    public void setBuffer(VkBuffer buffer) {
        setBuffer(getVkAddress(), buffer != null ? buffer.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getBuffer(long address);
    private static native void setBuffer(long address, long buffer);

    public VkDeviceSize getOffset() {
        return new VkDeviceSize(getVkMemory(), getOffset(getVkAddress()));
    }

    
    public void setOffset(VkDeviceSize offset) {
        setOffset(getVkAddress(), offset != null ? offset.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getOffset(long address);
    private static native void setOffset(long address, long offset);

    public VkDeviceSize getSize() {
        return new VkDeviceSize(getVkMemory(), getSize(getVkAddress()));
    }

    
    public void setSize(VkDeviceSize size) {
        setSize(getVkAddress(), size != null ? size.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getSize(long address);
    private static native void setSize(long address, long size);


    public static native long sizeof();

    public static class Array extends VkBufferMemoryBarrier implements cz.mg.collections.array.ReadonlyArray<VkBufferMemoryBarrier> {        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkBufferMemoryBarrier.sizeof()));
            this.count = count;
        }

        public Array(int count, VkBufferMemoryBarrier o){
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
        public VkBufferMemoryBarrier get(int i){
            return new VkBufferMemoryBarrier(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkBufferMemoryBarrier.Pointer implements cz.mg.collections.array.ReadonlyArray<VkBufferMemoryBarrier.Pointer> {
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

            public Array(VkBufferMemoryBarrier[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkBufferMemoryBarrier.Pointer get(int i){
                return new VkBufferMemoryBarrier.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }

}
