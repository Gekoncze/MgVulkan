package cz.mg.vulkan;

public class VkDedicatedAllocationMemoryAllocateInfoNV extends VkObject {
    public VkDedicatedAllocationMemoryAllocateInfoNV() {
        super(sizeof());
    }

    public VkDedicatedAllocationMemoryAllocateInfoNV(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDedicatedAllocationMemoryAllocateInfoNV(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDedicatedAllocationMemoryAllocateInfoNV(VkObject pNext, VkImage image, VkBuffer buffer) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEDICATED_ALLOCATION_MEMORY_ALLOCATE_INFO_NV));
        setPNext(pNext);
        setImage(image);
        setBuffer(buffer);
    }

    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getSinkAddress());
        
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

    public VkImage getImage() {
        return new VkImage(getVkMemory(), getImage(getVkAddress()));
    }

    
    public void setImage(VkImage image) {
        setImage(getVkAddress(), image != null ? image.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getImage(long address);
    private static native void setImage(long address, long image);

    public VkBuffer getBuffer() {
        return new VkBuffer(getVkMemory(), getBuffer(getVkAddress()));
    }

    
    public void setBuffer(VkBuffer buffer) {
        setBuffer(getVkAddress(), buffer != null ? buffer.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getBuffer(long address);
    private static native void setBuffer(long address, long buffer);


    public static native long sizeof();

    public static class Array extends VkDedicatedAllocationMemoryAllocateInfoNV implements cz.mg.collections.array.ReadonlyArray<VkDedicatedAllocationMemoryAllocateInfoNV> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDedicatedAllocationMemoryAllocateInfoNV.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDedicatedAllocationMemoryAllocateInfoNV o){
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
        public VkDedicatedAllocationMemoryAllocateInfoNV get(int i){
            return new VkDedicatedAllocationMemoryAllocateInfoNV(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkDedicatedAllocationMemoryAllocateInfoNV.Pointer implements cz.mg.collections.array.ReadonlyArray<VkDedicatedAllocationMemoryAllocateInfoNV.Pointer> {
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

            public Array(VkDedicatedAllocationMemoryAllocateInfoNV[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkDedicatedAllocationMemoryAllocateInfoNV.Pointer get(int i){
                return new VkDedicatedAllocationMemoryAllocateInfoNV.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
