package cz.mg.vulkan;

public class VkDescriptorSetVariableDescriptorCountAllocateInfoEXT extends VkObject {
    public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT() {
        super(sizeof());
    }

    public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT(VkObject pNext, VkUInt32 descriptorSetCount, VkUInt32 pDescriptorCounts) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_ALLOCATE_INFO_EXT));
        setPNext(pNext);
        setDescriptorSetCount(descriptorSetCount);
        setPDescriptorCounts(pDescriptorCounts);
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

    public VkUInt32 getDescriptorSetCount() {
        return new VkUInt32(getVkMemory(), getDescriptorSetCount(getVkAddress()));
    }

    
    public void setDescriptorSetCount(VkUInt32 descriptorSetCount) {
        setDescriptorSetCount(getVkAddress(), descriptorSetCount != null ? descriptorSetCount.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getDescriptorSetCount(long address);
    private static native void setDescriptorSetCount(long address, long descriptorSetCount);

    public VkUInt32 getPDescriptorCounts() {
        return new VkUInt32(getVkMemory(), getPDescriptorCounts(getVkAddress()));
    }

    private VkObject pDescriptorCounts = null;
    public void setPDescriptorCounts(VkUInt32 pDescriptorCounts) {
        setPDescriptorCounts(getVkAddress(), pDescriptorCounts != null ? pDescriptorCounts.getVkAddress() : VkPointer.NULL);
        this.pDescriptorCounts = pDescriptorCounts;
    }

    private static native long getPDescriptorCounts(long address);
    private static native void setPDescriptorCounts(long address, long pDescriptorCounts);


    public static native long sizeof();

    public static class Array extends VkDescriptorSetVariableDescriptorCountAllocateInfoEXT implements cz.mg.collections.array.ReadonlyArray<VkDescriptorSetVariableDescriptorCountAllocateInfoEXT> {        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDescriptorSetVariableDescriptorCountAllocateInfoEXT o){
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
        public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT get(int i){
            return new VkDescriptorSetVariableDescriptorCountAllocateInfoEXT(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.Pointer> {
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

            public Array(VkDescriptorSetVariableDescriptorCountAllocateInfoEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.Pointer get(int i){
                return new VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }

}
