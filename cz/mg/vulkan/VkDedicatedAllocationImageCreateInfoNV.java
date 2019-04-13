package cz.mg.vulkan;

public class VkDedicatedAllocationImageCreateInfoNV extends VkObject {
    public VkDedicatedAllocationImageCreateInfoNV() {
        super(sizeof());
    }

    public VkDedicatedAllocationImageCreateInfoNV(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDedicatedAllocationImageCreateInfoNV(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDedicatedAllocationImageCreateInfoNV(VkObject pNext, VkBool32 dedicatedAllocation) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEDICATED_ALLOCATION_IMAGE_CREATE_INFO_NV));
        setPNext(pNext);
        setDedicatedAllocation(dedicatedAllocation);
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

    public VkBool32 getDedicatedAllocation() {
        return new VkBool32(getVkMemory(), getDedicatedAllocation(getVkAddress()));
    }

    
    public void setDedicatedAllocation(VkBool32 dedicatedAllocation) {
        setDedicatedAllocation(getVkAddress(), dedicatedAllocation != null ? dedicatedAllocation.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getDedicatedAllocation(long address);
    private static native void setDedicatedAllocation(long address, long dedicatedAllocation);


    public static native long sizeof();

    public static class Array extends VkDedicatedAllocationImageCreateInfoNV implements cz.mg.collections.array.ReadonlyArray<VkDedicatedAllocationImageCreateInfoNV> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDedicatedAllocationImageCreateInfoNV.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDedicatedAllocationImageCreateInfoNV o){
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
        public VkDedicatedAllocationImageCreateInfoNV get(int i){
            return new VkDedicatedAllocationImageCreateInfoNV(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkDedicatedAllocationImageCreateInfoNV.Pointer implements cz.mg.collections.array.ReadonlyArray<VkDedicatedAllocationImageCreateInfoNV.Pointer> {
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

            public Array(VkDedicatedAllocationImageCreateInfoNV[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkDedicatedAllocationImageCreateInfoNV.Pointer get(int i){
                return new VkDedicatedAllocationImageCreateInfoNV.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
