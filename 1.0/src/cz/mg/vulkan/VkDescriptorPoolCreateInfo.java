package cz.mg.vulkan;

public class VkDescriptorPoolCreateInfo extends VkObject {
    public VkDescriptorPoolCreateInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_CREATE_INFO));
    }

    public VkDescriptorPoolCreateInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDescriptorPoolCreateInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddressNative());
        
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

    public VkDescriptorPoolCreateFlags getFlags() {
        return new VkDescriptorPoolCreateFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkDescriptorPoolCreateFlags flags) {
        setFlags(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFlagsQ() {
        return getFlags().getValue();
    }

    public void setFlags(int flags) {
        getFlags().setValue(flags);
    }

    protected static native long getFlags(long address);
    protected static native void setFlags(long address, long flags);

    public VkUInt32 getMaxSets() {
        return new VkUInt32(getVkMemory(), getMaxSets(getVkAddress()));
    }

    
    public void setMaxSets(VkUInt32 maxSets) {
        setMaxSets(getVkAddress(), maxSets != null ? maxSets.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxSetsQ() {
        return getMaxSets().getValue();
    }

    public void setMaxSets(int maxSets) {
        getMaxSets().setValue(maxSets);
    }

    protected static native long getMaxSets(long address);
    protected static native void setMaxSets(long address, long maxSets);

    public VkUInt32 getPoolSizeCount() {
        return new VkUInt32(getVkMemory(), getPoolSizeCount(getVkAddress()));
    }

    
    public void setPoolSizeCount(VkUInt32 poolSizeCount) {
        setPoolSizeCount(getVkAddress(), poolSizeCount != null ? poolSizeCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getPoolSizeCountQ() {
        return getPoolSizeCount().getValue();
    }

    public void setPoolSizeCount(int poolSizeCount) {
        getPoolSizeCount().setValue(poolSizeCount);
    }

    protected static native long getPoolSizeCount(long address);
    protected static native void setPoolSizeCount(long address, long poolSizeCount);

    public VkDescriptorPoolSize getPPoolSizes() {
        return new VkDescriptorPoolSize(getVkMemory(), getPPoolSizes(getVkAddress()));
    }

    private VkObject pPoolSizes = null;
    public void setPPoolSizes(VkDescriptorPoolSize pPoolSizes) {
        setPPoolSizes(getVkAddress(), pPoolSizes != null ? pPoolSizes.getVkAddress() : VkPointer.NULL);
        this.pPoolSizes = pPoolSizes;
    }

    protected static native long getPPoolSizes(long address);
    protected static native void setPPoolSizes(long address, long pPoolSizes);


    public static native long sizeof();

    public static class Array extends VkDescriptorPoolCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkDescriptorPoolCreateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDescriptorPoolCreateInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_CREATE_INFO));;
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

            public Array(long... values){
                this(values.length);
                for(int i = 0; i < values.length; i++) setValueAt(i, values[i]);
            }

            public long getValueAt(int i){
                return getValueNative(addressAt(i));
            }

            public void setValueAt(int i, long value){
                setValueNative(addressAt(i), value);
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkDescriptorPoolCreateInfo.Pointer get(int i){
                return new VkDescriptorPoolCreateInfo.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }

            protected long addressAt(int i){
                return VkPointer.plus(getVkAddress(), sizeof()*i);
            }
        }
    }
}
