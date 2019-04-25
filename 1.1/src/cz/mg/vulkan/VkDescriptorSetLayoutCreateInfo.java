package cz.mg.vulkan;

public class VkDescriptorSetLayoutCreateInfo extends VkObject {
    public VkDescriptorSetLayoutCreateInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_CREATE_INFO));
    }

    public VkDescriptorSetLayoutCreateInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDescriptorSetLayoutCreateInfo(VkMemory vkmemory, long vkaddress) {
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

    public VkDescriptorSetLayoutCreateFlags getFlags() {
        return new VkDescriptorSetLayoutCreateFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkDescriptorSetLayoutCreateFlags flags) {
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

    public VkUInt32 getBindingCount() {
        return new VkUInt32(getVkMemory(), getBindingCount(getVkAddress()));
    }

    
    public void setBindingCount(VkUInt32 bindingCount) {
        setBindingCount(getVkAddress(), bindingCount != null ? bindingCount.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getBindingCountQ() {
        return getBindingCount().getValue();
    }

    public void setBindingCount(int bindingCount) {
        getBindingCount().setValue(bindingCount);
    }

    protected static native long getBindingCount(long address);
    protected static native void setBindingCount(long address, long bindingCount);

    public VkDescriptorSetLayoutBinding getPBindings() {
        return new VkDescriptorSetLayoutBinding(getVkMemory(), getPBindings(getVkAddress()));
    }

    private VkObject pBindings = null;
    public void setPBindings(VkDescriptorSetLayoutBinding pBindings) {
        setPBindings(getVkAddress(), pBindings != null ? pBindings.getVkAddress() : VkPointer.NULL);
        this.pBindings = pBindings;
    }

    protected static native long getPBindings(long address);
    protected static native void setPBindings(long address, long pBindings);


    public static native long sizeof();

    public static class Array extends VkDescriptorSetLayoutCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkDescriptorSetLayoutCreateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDescriptorSetLayoutCreateInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_CREATE_INFO));;
        }

        public Array(int count, VkDescriptorSetLayoutCreateInfo o){
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
        public VkDescriptorSetLayoutCreateInfo get(int i){
            return new VkDescriptorSetLayoutCreateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkDescriptorSetLayoutCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VkDescriptorSetLayoutCreateInfo.Pointer> {
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

            public Array(VkDescriptorSetLayoutCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkDescriptorSetLayoutCreateInfo.Pointer get(int i){
                return new VkDescriptorSetLayoutCreateInfo.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
