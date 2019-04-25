package cz.mg.vulkan;

public class VkMemoryAllocateFlagsInfoKHX extends VkObject {
    public VkMemoryAllocateFlagsInfoKHX() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_FLAGS_INFO_KHX));
    }

    public VkMemoryAllocateFlagsInfoKHX(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkMemoryAllocateFlagsInfoKHX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getSTypeQ() {
        return getSType().getValue();
    }

    public void setSType(int sType) {
        getSType().setValue(sType);
    }

    protected static native long getSType(long address);
    protected static native void setSType(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNext(getVkAddress()));
    }

    private VkObject pNext = null;
    public void setPNext(VkObject pNext) {
        setPNext(getVkAddress(), pNext != null ? pNext.getVkAddress() : VkPointer.NULL);
        this.pNext = pNext;
    }

    protected static native long getPNext(long address);
    protected static native void setPNext(long address, long pNext);

    public VkMemoryAllocateFlagsKHX getFlags() {
        return new VkMemoryAllocateFlagsKHX(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkMemoryAllocateFlagsKHX flags) {
        setFlags(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getFlagsQ() {
        return getFlags().getValue();
    }

    public void setFlags(int flags) {
        getFlags().setValue(flags);
    }

    protected static native long getFlags(long address);
    protected static native void setFlags(long address, long flags);

    public VkUInt32 getDeviceMask() {
        return new VkUInt32(getVkMemory(), getDeviceMask(getVkAddress()));
    }

    
    public void setDeviceMask(VkUInt32 deviceMask) {
        setDeviceMask(getVkAddress(), deviceMask != null ? deviceMask.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getDeviceMaskQ() {
        return getDeviceMask().getValue();
    }

    public void setDeviceMask(int deviceMask) {
        getDeviceMask().setValue(deviceMask);
    }

    protected static native long getDeviceMask(long address);
    protected static native void setDeviceMask(long address, long deviceMask);


    public static native long sizeof();

    public static class Array extends VkMemoryAllocateFlagsInfoKHX implements cz.mg.collections.array.ReadonlyArray<VkMemoryAllocateFlagsInfoKHX> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkMemoryAllocateFlagsInfoKHX.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_FLAGS_INFO_KHX));;
        }

        public Array(int count, VkMemoryAllocateFlagsInfoKHX o){
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
        public VkMemoryAllocateFlagsInfoKHX get(int i){
            return new VkMemoryAllocateFlagsInfoKHX(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkMemoryAllocateFlagsInfoKHX.Pointer implements cz.mg.collections.array.ReadonlyArray<VkMemoryAllocateFlagsInfoKHX.Pointer> {
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

            public Array(VkMemoryAllocateFlagsInfoKHX[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkMemoryAllocateFlagsInfoKHX.Pointer get(int i){
                return new VkMemoryAllocateFlagsInfoKHX.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
