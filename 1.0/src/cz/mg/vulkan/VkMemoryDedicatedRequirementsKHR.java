package cz.mg.vulkan;

public class VkMemoryDedicatedRequirementsKHR extends VkObject {
    public VkMemoryDedicatedRequirementsKHR() {
        super(sizeof());
    }

    public VkMemoryDedicatedRequirementsKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkMemoryDedicatedRequirementsKHR(VkMemory vkmemory, long vkaddress) {
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

    public VkBool32 getPrefersDedicatedAllocation() {
        return new VkBool32(getVkMemory(), getPrefersDedicatedAllocation(getVkAddress()));
    }

    
    public void setPrefersDedicatedAllocation(VkBool32 prefersDedicatedAllocation) {
        setPrefersDedicatedAllocation(getVkAddress(), prefersDedicatedAllocation != null ? prefersDedicatedAllocation.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getPrefersDedicatedAllocationQ() {
        return getPrefersDedicatedAllocation().getValue();
    }

    public void setPrefersDedicatedAllocation(int prefersDedicatedAllocation) {
        getPrefersDedicatedAllocation().setValue(prefersDedicatedAllocation);
    }

    protected static native long getPrefersDedicatedAllocation(long address);
    protected static native void setPrefersDedicatedAllocation(long address, long prefersDedicatedAllocation);

    public VkBool32 getRequiresDedicatedAllocation() {
        return new VkBool32(getVkMemory(), getRequiresDedicatedAllocation(getVkAddress()));
    }

    
    public void setRequiresDedicatedAllocation(VkBool32 requiresDedicatedAllocation) {
        setRequiresDedicatedAllocation(getVkAddress(), requiresDedicatedAllocation != null ? requiresDedicatedAllocation.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getRequiresDedicatedAllocationQ() {
        return getRequiresDedicatedAllocation().getValue();
    }

    public void setRequiresDedicatedAllocation(int requiresDedicatedAllocation) {
        getRequiresDedicatedAllocation().setValue(requiresDedicatedAllocation);
    }

    protected static native long getRequiresDedicatedAllocation(long address);
    protected static native void setRequiresDedicatedAllocation(long address, long requiresDedicatedAllocation);


    public static native long sizeof();

    public static class Array extends VkMemoryDedicatedRequirementsKHR implements cz.mg.collections.array.ReadonlyArray<VkMemoryDedicatedRequirementsKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkMemoryDedicatedRequirementsKHR.sizeof()));
            this.count = count;
        }

        public Array(int count, VkMemoryDedicatedRequirementsKHR o){
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
        public VkMemoryDedicatedRequirementsKHR get(int i){
            return new VkMemoryDedicatedRequirementsKHR(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkMemoryDedicatedRequirementsKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VkMemoryDedicatedRequirementsKHR.Pointer> {
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

            public Array(VkMemoryDedicatedRequirementsKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkMemoryDedicatedRequirementsKHR.Pointer get(int i){
                return new VkMemoryDedicatedRequirementsKHR.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
