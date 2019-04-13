package cz.mg.vulkan;

public class VkDescriptorSetAllocateInfo extends VkObject {
    public VkDescriptorSetAllocateInfo() {
        super(sizeof());
    }

    public VkDescriptorSetAllocateInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDescriptorSetAllocateInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkDescriptorSetAllocateInfo(VkObject pNext, VkDescriptorPool descriptorPool, VkUInt32 descriptorSetCount, VkDescriptorSetLayout pSetLayouts) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_ALLOCATE_INFO));
        setPNext(pNext);
        setDescriptorPool(descriptorPool);
        setDescriptorSetCount(descriptorSetCount);
        setPSetLayouts(pSetLayouts);
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

    public VkDescriptorPool getDescriptorPool() {
        return new VkDescriptorPool(getVkMemory(), getDescriptorPool(getVkAddress()));
    }

    
    public void setDescriptorPool(VkDescriptorPool descriptorPool) {
        setDescriptorPool(getVkAddress(), descriptorPool != null ? descriptorPool.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getDescriptorPool(long address);
    private static native void setDescriptorPool(long address, long descriptorPool);

    public VkUInt32 getDescriptorSetCount() {
        return new VkUInt32(getVkMemory(), getDescriptorSetCount(getVkAddress()));
    }

    
    public void setDescriptorSetCount(VkUInt32 descriptorSetCount) {
        setDescriptorSetCount(getVkAddress(), descriptorSetCount != null ? descriptorSetCount.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getDescriptorSetCount(long address);
    private static native void setDescriptorSetCount(long address, long descriptorSetCount);

    public VkDescriptorSetLayout getPSetLayouts() {
        return new VkDescriptorSetLayout(getVkMemory(), getPSetLayouts(getVkAddress()));
    }

    private VkObject pSetLayouts = null;
    public void setPSetLayouts(VkDescriptorSetLayout pSetLayouts) {
        setPSetLayouts(getVkAddress(), pSetLayouts != null ? pSetLayouts.getVkAddress() : VkPointer.NULL);
        this.pSetLayouts = pSetLayouts;
    }

    private static native long getPSetLayouts(long address);
    private static native void setPSetLayouts(long address, long pSetLayouts);


    public static native long sizeof();

    public static class Array extends VkDescriptorSetAllocateInfo implements cz.mg.collections.array.ReadonlyArray<VkDescriptorSetAllocateInfo> {        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDescriptorSetAllocateInfo.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDescriptorSetAllocateInfo o){
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
        public VkDescriptorSetAllocateInfo get(int i){
            return new VkDescriptorSetAllocateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkDescriptorSetAllocateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VkDescriptorSetAllocateInfo.Pointer> {
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

            public Array(VkDescriptorSetAllocateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkDescriptorSetAllocateInfo.Pointer get(int i){
                return new VkDescriptorSetAllocateInfo.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }

}
