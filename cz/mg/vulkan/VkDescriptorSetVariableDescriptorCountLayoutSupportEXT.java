package cz.mg.vulkan;

public class VkDescriptorSetVariableDescriptorCountLayoutSupportEXT extends VkObject {
    public VkDescriptorSetVariableDescriptorCountLayoutSupportEXT() {
        super(sizeof());
    }

    public VkDescriptorSetVariableDescriptorCountLayoutSupportEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDescriptorSetVariableDescriptorCountLayoutSupportEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkDescriptorSetVariableDescriptorCountLayoutSupportEXT(VkStructureType sType, VkObject pNext, VkUInt32 maxVariableDescriptorCount) {
        super(sizeof());
        setSType(sType);
        setPNext(pNext);
        setMaxVariableDescriptorCount(maxVariableDescriptorCount);
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

    public VkUInt32 getMaxVariableDescriptorCount() {
        return new VkUInt32(getVkMemory(), getMaxVariableDescriptorCount(getVkAddress()));
    }

    
    public void setMaxVariableDescriptorCount(VkUInt32 maxVariableDescriptorCount) {
        setMaxVariableDescriptorCount(getVkAddress(), maxVariableDescriptorCount != null ? maxVariableDescriptorCount.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getMaxVariableDescriptorCount(long address);
    private static native void setMaxVariableDescriptorCount(long address, long maxVariableDescriptorCount);


    public static native long sizeof();

    public static class Array extends VkDescriptorSetVariableDescriptorCountLayoutSupportEXT implements cz.mg.collections.array.ReadonlyArray<VkDescriptorSetVariableDescriptorCountLayoutSupportEXT> {        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDescriptorSetVariableDescriptorCountLayoutSupportEXT.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDescriptorSetVariableDescriptorCountLayoutSupportEXT o){
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
        public VkDescriptorSetVariableDescriptorCountLayoutSupportEXT get(int i){
            return new VkDescriptorSetVariableDescriptorCountLayoutSupportEXT(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkDescriptorSetVariableDescriptorCountLayoutSupportEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VkDescriptorSetVariableDescriptorCountLayoutSupportEXT.Pointer> {
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

            public Array(VkDescriptorSetVariableDescriptorCountLayoutSupportEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkDescriptorSetVariableDescriptorCountLayoutSupportEXT.Pointer get(int i){
                return new VkDescriptorSetVariableDescriptorCountLayoutSupportEXT.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }

}
