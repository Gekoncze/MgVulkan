package cz.mg.vulkan.vk;

public class VkDescriptorPoolCreateInfo extends VkObject {
    public VkDescriptorPoolCreateInfo() {
        super(sizeof());
    }

    public VkDescriptorPoolCreateInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDescriptorPoolCreateInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkDescriptorPoolCreateInfo(VkObject pNext, VkDescriptorPoolCreateFlags flags, VkUInt32 maxSets, VkUInt32 poolSizeCount, VkDescriptorPoolSize pPoolSizes) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_CREATE_INFO));
        setPNext(pNext);
        setFlags(flags);
        setMaxSets(maxSets);
        setPoolSizeCount(poolSizeCount);
        setPPoolSizes(pPoolSizes);
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

    public VkDescriptorPoolCreateFlags getFlags() {
        return new VkDescriptorPoolCreateFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkDescriptorPoolCreateFlags flags) {
        setFlags(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getFlags(long address);
    private static native void setFlags(long address, long flags);

    public VkUInt32 getMaxSets() {
        return new VkUInt32(getVkMemory(), getMaxSets(getVkAddress()));
    }

    
    public void setMaxSets(VkUInt32 maxSets) {
        setMaxSets(getVkAddress(), maxSets != null ? maxSets.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getMaxSets(long address);
    private static native void setMaxSets(long address, long maxSets);

    public VkUInt32 getPoolSizeCount() {
        return new VkUInt32(getVkMemory(), getPoolSizeCount(getVkAddress()));
    }

    
    public void setPoolSizeCount(VkUInt32 poolSizeCount) {
        setPoolSizeCount(getVkAddress(), poolSizeCount != null ? poolSizeCount.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getPoolSizeCount(long address);
    private static native void setPoolSizeCount(long address, long poolSizeCount);

    public VkDescriptorPoolSize getPPoolSizes() {
        return new VkDescriptorPoolSize(getVkMemory(), getPPoolSizes(getVkAddress()));
    }

    private VkObject pPoolSizes = null;
    public void setPPoolSizes(VkDescriptorPoolSize pPoolSizes) {
        setPPoolSizes(getVkAddress(), pPoolSizes != null ? pPoolSizes.getVkAddress() : VkPointer.NULL);
        this.pPoolSizes = pPoolSizes;
    }

    private static native long getPPoolSizes(long address);
    private static native void setPPoolSizes(long address, long pPoolSizes);


    public static native long sizeof();

    public static class Array extends VkDescriptorPoolCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkDescriptorPoolCreateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDescriptorPoolCreateInfo.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDescriptorPoolCreateInfo o){
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
        public VkDescriptorPoolCreateInfo get(int i){
            return new VkDescriptorPoolCreateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkDescriptorPoolCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VkDescriptorPoolCreateInfo.Pointer> {
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

            public Array(VkDescriptorPoolCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkDescriptorPoolCreateInfo.Pointer get(int i){
                return new VkDescriptorPoolCreateInfo.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
