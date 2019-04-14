package cz.mg.vulkan;

public class VkMappedMemoryRange extends VkObject {
    public VkMappedMemoryRange() {
        super(sizeof());
    }

    public VkMappedMemoryRange(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkMappedMemoryRange(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
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

    public VkDeviceMemory getMemory() {
        return new VkDeviceMemory(getVkMemory(), getMemory(getVkAddress()));
    }

    
    public void setMemory(VkDeviceMemory memory) {
        setMemory(getVkAddress(), memory != null ? memory.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getMemory(long address);
    private static native void setMemory(long address, long memory);

    public VkDeviceSize getOffset() {
        return new VkDeviceSize(getVkMemory(), getOffset(getVkAddress()));
    }

    
    public void setOffset(VkDeviceSize offset) {
        setOffset(getVkAddress(), offset != null ? offset.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getOffset(long address);
    private static native void setOffset(long address, long offset);

    public VkDeviceSize getSize() {
        return new VkDeviceSize(getVkMemory(), getSize(getVkAddress()));
    }

    
    public void setSize(VkDeviceSize size) {
        setSize(getVkAddress(), size != null ? size.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getSize(long address);
    private static native void setSize(long address, long size);


    public static native long sizeof();

    public static class Array extends VkMappedMemoryRange implements cz.mg.collections.array.ReadonlyArray<VkMappedMemoryRange> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkMappedMemoryRange.sizeof()));
            this.count = count;
        }

        public Array(int count, VkMappedMemoryRange o){
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
        public VkMappedMemoryRange get(int i){
            return new VkMappedMemoryRange(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkMappedMemoryRange.Pointer implements cz.mg.collections.array.ReadonlyArray<VkMappedMemoryRange.Pointer> {
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

            public Array(VkMappedMemoryRange[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkMappedMemoryRange.Pointer get(int i){
                return new VkMappedMemoryRange.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
