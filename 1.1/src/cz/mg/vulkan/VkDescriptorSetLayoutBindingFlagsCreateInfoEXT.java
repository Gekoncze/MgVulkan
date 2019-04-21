package cz.mg.vulkan;

public class VkDescriptorSetLayoutBindingFlagsCreateInfoEXT extends VkObject {
    public VkDescriptorSetLayoutBindingFlagsCreateInfoEXT() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_BINDING_FLAGS_CREATE_INFO_EXT));
    }

    public VkDescriptorSetLayoutBindingFlagsCreateInfoEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDescriptorSetLayoutBindingFlagsCreateInfoEXT(VkMemory vkmemory, long vkaddress) {
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

    private static native long getBindingCount(long address);
    private static native void setBindingCount(long address, long bindingCount);

    public VkDescriptorBindingFlagsEXT getPBindingFlags() {
        return new VkDescriptorBindingFlagsEXT(getVkMemory(), getPBindingFlags(getVkAddress()));
    }

    private VkObject pBindingFlags = null;
    public void setPBindingFlags(VkDescriptorBindingFlagsEXT pBindingFlags) {
        setPBindingFlags(getVkAddress(), pBindingFlags != null ? pBindingFlags.getVkAddress() : VkPointer.NULL);
        this.pBindingFlags = pBindingFlags;
    }

    private static native long getPBindingFlags(long address);
    private static native void setPBindingFlags(long address, long pBindingFlags);


    public static native long sizeof();

    public static class Array extends VkDescriptorSetLayoutBindingFlagsCreateInfoEXT implements cz.mg.collections.array.ReadonlyArray<VkDescriptorSetLayoutBindingFlagsCreateInfoEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDescriptorSetLayoutBindingFlagsCreateInfoEXT o){
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
        public VkDescriptorSetLayoutBindingFlagsCreateInfoEXT get(int i){
            return new VkDescriptorSetLayoutBindingFlagsCreateInfoEXT(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Pointer> {
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

            public Array(VkDescriptorSetLayoutBindingFlagsCreateInfoEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Pointer get(int i){
                return new VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
