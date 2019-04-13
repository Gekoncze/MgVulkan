package cz.mg.vulkan;

public class VkObjectTableDescriptorSetEntryNVX extends VkObject {
    public VkObjectTableDescriptorSetEntryNVX() {
        super(sizeof());
    }

    public VkObjectTableDescriptorSetEntryNVX(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkObjectTableDescriptorSetEntryNVX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkObjectTableDescriptorSetEntryNVX(VkObjectEntryTypeNVX type, VkObjectEntryUsageFlagsNVX flags, VkPipelineLayout pipelineLayout, VkDescriptorSet descriptorSet) {
        super(sizeof());
        setType(type);
        setFlags(flags);
        setPipelineLayout(pipelineLayout);
        setDescriptorSet(descriptorSet);
    }

    public VkObjectEntryTypeNVX getType() {
        return new VkObjectEntryTypeNVX(getVkMemory(), getType(getVkAddress()));
    }

    
    public void setType(VkObjectEntryTypeNVX type) {
        setType(getVkAddress(), type != null ? type.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getType(long address);
    private static native void setType(long address, long type);

    public VkObjectEntryUsageFlagsNVX getFlags() {
        return new VkObjectEntryUsageFlagsNVX(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkObjectEntryUsageFlagsNVX flags) {
        setFlags(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getFlags(long address);
    private static native void setFlags(long address, long flags);

    public VkPipelineLayout getPipelineLayout() {
        return new VkPipelineLayout(getVkMemory(), getPipelineLayout(getVkAddress()));
    }

    
    public void setPipelineLayout(VkPipelineLayout pipelineLayout) {
        setPipelineLayout(getVkAddress(), pipelineLayout != null ? pipelineLayout.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getPipelineLayout(long address);
    private static native void setPipelineLayout(long address, long pipelineLayout);

    public VkDescriptorSet getDescriptorSet() {
        return new VkDescriptorSet(getVkMemory(), getDescriptorSet(getVkAddress()));
    }

    
    public void setDescriptorSet(VkDescriptorSet descriptorSet) {
        setDescriptorSet(getVkAddress(), descriptorSet != null ? descriptorSet.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getDescriptorSet(long address);
    private static native void setDescriptorSet(long address, long descriptorSet);


    public static native long sizeof();

    public static class Array extends VkObjectTableDescriptorSetEntryNVX implements cz.mg.collections.array.ReadonlyArray<VkObjectTableDescriptorSetEntryNVX> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkObjectTableDescriptorSetEntryNVX.sizeof()));
            this.count = count;
        }

        public Array(int count, VkObjectTableDescriptorSetEntryNVX o){
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
        public VkObjectTableDescriptorSetEntryNVX get(int i){
            return new VkObjectTableDescriptorSetEntryNVX(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkObjectTableDescriptorSetEntryNVX.Pointer implements cz.mg.collections.array.ReadonlyArray<VkObjectTableDescriptorSetEntryNVX.Pointer> {
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

            public Array(VkObjectTableDescriptorSetEntryNVX[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkObjectTableDescriptorSetEntryNVX.Pointer get(int i){
                return new VkObjectTableDescriptorSetEntryNVX.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
