package cz.mg.vulkan.vk;

public class VkMemoryDedicatedRequirements extends VkObject {
    public VkMemoryDedicatedRequirements() {
        super(sizeof());
    }

    public VkMemoryDedicatedRequirements(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkMemoryDedicatedRequirements(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkMemoryDedicatedRequirements(VkStructureType sType, VkObject pNext, VkBool32 prefersDedicatedAllocation, VkBool32 requiresDedicatedAllocation) {
        super(sizeof());
        setSType(sType);
        setPNext(pNext);
        setPrefersDedicatedAllocation(prefersDedicatedAllocation);
        setRequiresDedicatedAllocation(requiresDedicatedAllocation);
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

    public VkBool32 getPrefersDedicatedAllocation() {
        return new VkBool32(getVkMemory(), getPrefersDedicatedAllocation(getVkAddress()));
    }

    
    public void setPrefersDedicatedAllocation(VkBool32 prefersDedicatedAllocation) {
        setPrefersDedicatedAllocation(getVkAddress(), prefersDedicatedAllocation != null ? prefersDedicatedAllocation.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getPrefersDedicatedAllocation(long address);
    private static native void setPrefersDedicatedAllocation(long address, long prefersDedicatedAllocation);

    public VkBool32 getRequiresDedicatedAllocation() {
        return new VkBool32(getVkMemory(), getRequiresDedicatedAllocation(getVkAddress()));
    }

    
    public void setRequiresDedicatedAllocation(VkBool32 requiresDedicatedAllocation) {
        setRequiresDedicatedAllocation(getVkAddress(), requiresDedicatedAllocation != null ? requiresDedicatedAllocation.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getRequiresDedicatedAllocation(long address);
    private static native void setRequiresDedicatedAllocation(long address, long requiresDedicatedAllocation);


    public static native long sizeof();

    public static class Array extends VkMemoryDedicatedRequirements implements cz.mg.collections.array.ReadonlyArray<VkMemoryDedicatedRequirements> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkMemoryDedicatedRequirements.sizeof()));
            this.count = count;
        }

        public Array(int count, VkMemoryDedicatedRequirements o){
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
        public VkMemoryDedicatedRequirements get(int i){
            return new VkMemoryDedicatedRequirements(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkMemoryDedicatedRequirements.Pointer implements cz.mg.collections.array.ReadonlyArray<VkMemoryDedicatedRequirements.Pointer> {
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

            public Array(VkMemoryDedicatedRequirements[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkMemoryDedicatedRequirements.Pointer get(int i){
                return new VkMemoryDedicatedRequirements.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
