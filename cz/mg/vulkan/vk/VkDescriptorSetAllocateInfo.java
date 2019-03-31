package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDescriptorSetAllocateInfo.html">khronos documentation</a>
 **/
public class VkDescriptorSetAllocateInfo extends VkObject {
    public VkDescriptorSetAllocateInfo() {
        super(sizeof());
    }

    public VkDescriptorSetAllocateInfo(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkDescriptorSetAllocateInfo(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
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
        setSType(getVkAddress(), sType.getVkAddress());
    }

    private static native long getSType(long address);
    private static native void setSType(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNext(getVkAddress()));
    }

    public void setPNext(VkObject pNext) {
        setPNext(getVkAddress(), pNext.getVkAddress());
    }

    private static native long getPNext(long address);
    private static native void setPNext(long address, long pNext);

    public VkDescriptorPool getDescriptorPool() {
        return new VkDescriptorPool(getVkMemory(), getDescriptorPool(getVkAddress()));
    }

    public void setDescriptorPool(VkDescriptorPool descriptorPool) {
        setDescriptorPool(getVkAddress(), descriptorPool.getVkAddress());
    }

    private static native long getDescriptorPool(long address);
    private static native void setDescriptorPool(long address, long descriptorPool);

    public VkUInt32 getDescriptorSetCount() {
        return new VkUInt32(getVkMemory(), getDescriptorSetCount(getVkAddress()));
    }

    public void setDescriptorSetCount(VkUInt32 descriptorSetCount) {
        setDescriptorSetCount(getVkAddress(), descriptorSetCount.getVkAddress());
    }

    private static native long getDescriptorSetCount(long address);
    private static native void setDescriptorSetCount(long address, long descriptorSetCount);

    public VkDescriptorSetLayout.Array getPSetLayouts() {
        return new VkDescriptorSetLayout.Array(getVkMemory(), getPSetLayouts(getVkAddress()), getDescriptorSetCount().getValue());
    }

    public void setPSetLayouts(VkDescriptorSetLayout pSetLayouts) {
        setPSetLayouts(getVkAddress(), pSetLayouts.getVkAddress());
    }

    private static native long getPSetLayouts(long address);
    private static native void setPSetLayouts(long address, long pSetLayouts);


    public static native long sizeof();

    public static class Array extends VkDescriptorSetAllocateInfo implements cz.mg.collections.array.ReadonlyArray<VkDescriptorSetAllocateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*sizeof()));
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

        public static class Array extends Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
            private final int count;

            public Array(int count) {
                super(new VkMemory(count*sizeof()));
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
            public Pointer get(int i){
                return new Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
