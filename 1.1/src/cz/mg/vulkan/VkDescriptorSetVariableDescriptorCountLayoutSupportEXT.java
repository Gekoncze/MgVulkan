package cz.mg.vulkan;

public class VkDescriptorSetVariableDescriptorCountLayoutSupportEXT extends VkObject {
    public VkDescriptorSetVariableDescriptorCountLayoutSupportEXT() {
        super(sizeof());
    }

    protected VkDescriptorSetVariableDescriptorCountLayoutSupportEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkDescriptorSetVariableDescriptorCountLayoutSupportEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDescriptorSetVariableDescriptorCountLayoutSupportEXT(VkPointer pointer) {
        super(pointer);
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

    public VkUInt32 getMaxVariableDescriptorCount() {
        return new VkUInt32(getVkMemory(), getMaxVariableDescriptorCount(getVkAddress()));
    }

    
    public void setMaxVariableDescriptorCount(VkUInt32 maxVariableDescriptorCount) {
        setMaxVariableDescriptorCount(getVkAddress(), maxVariableDescriptorCount != null ? maxVariableDescriptorCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxVariableDescriptorCountQ() {
        return getMaxVariableDescriptorCount().getValue();
    }

    public void setMaxVariableDescriptorCount(int maxVariableDescriptorCount) {
        getMaxVariableDescriptorCount().setValue(maxVariableDescriptorCount);
    }

    protected static native long getMaxVariableDescriptorCount(long address);
    protected static native void setMaxVariableDescriptorCount(long address, long maxVariableDescriptorCount);


    public static native long sizeof();

    public static class Array extends VkDescriptorSetVariableDescriptorCountLayoutSupportEXT implements cz.mg.collections.array.ReadonlyArray<VkDescriptorSetVariableDescriptorCountLayoutSupportEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDescriptorSetVariableDescriptorCountLayoutSupportEXT.sizeof()));
            this.count = count;
        }

        public Array(VkDescriptorSetVariableDescriptorCountLayoutSupportEXT o, int count){
            super(o.getVkMemory(), o.getVkAddress());
            this.count = count;
        }

        public Array(VkPointer pointer, int count){
            super(pointer);
            this.count = count;
        }

        protected Array(VkMemory vkmemory, int count) {
            super(vkmemory);
            this.count = count;
        }

        protected Array(VkMemory vkmemory, long vkaddress, int count) {
            super(vkmemory, vkaddress);
            this.count = count;
        }





        @Override
        public int count(){
            return count;
        }

        @Override
        public VkDescriptorSetVariableDescriptorCountLayoutSupportEXT get(int i){
            return new VkDescriptorSetVariableDescriptorCountLayoutSupportEXT(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }

        public static class Array2 extends VkPointer.Array {
            public Array2(int count) {
                super(count);
            }

            protected Array2(VkMemory vkmemory, int count) {
                super(vkmemory, count);
            }

            protected Array2(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress, count);
            }
        }
    }
}
