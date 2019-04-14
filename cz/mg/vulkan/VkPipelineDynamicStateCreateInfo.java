package cz.mg.vulkan;

public class VkPipelineDynamicStateCreateInfo extends VkObject {
    public VkPipelineDynamicStateCreateInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_DYNAMIC_STATE_CREATE_INFO));
    }

    public VkPipelineDynamicStateCreateInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineDynamicStateCreateInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
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

    public VkPipelineDynamicStateCreateFlags getFlags() {
        return new VkPipelineDynamicStateCreateFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkPipelineDynamicStateCreateFlags flags) {
        setFlags(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getFlags(long address);
    private static native void setFlags(long address, long flags);

    public VkUInt32 getDynamicStateCount() {
        return new VkUInt32(getVkMemory(), getDynamicStateCount(getVkAddress()));
    }

    
    public void setDynamicStateCount(VkUInt32 dynamicStateCount) {
        setDynamicStateCount(getVkAddress(), dynamicStateCount != null ? dynamicStateCount.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getDynamicStateCount(long address);
    private static native void setDynamicStateCount(long address, long dynamicStateCount);

    public VkDynamicState getPDynamicStates() {
        return new VkDynamicState(getVkMemory(), getPDynamicStates(getVkAddress()));
    }

    private VkObject pDynamicStates = null;
    public void setPDynamicStates(VkDynamicState pDynamicStates) {
        setPDynamicStates(getVkAddress(), pDynamicStates != null ? pDynamicStates.getVkAddress() : VkPointer.NULL);
        this.pDynamicStates = pDynamicStates;
    }

    private static native long getPDynamicStates(long address);
    private static native void setPDynamicStates(long address, long pDynamicStates);


    public static native long sizeof();

    public static class Array extends VkPipelineDynamicStateCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkPipelineDynamicStateCreateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPipelineDynamicStateCreateInfo.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPipelineDynamicStateCreateInfo o){
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
        public VkPipelineDynamicStateCreateInfo get(int i){
            return new VkPipelineDynamicStateCreateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkPipelineDynamicStateCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPipelineDynamicStateCreateInfo.Pointer> {
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

            public Array(VkPipelineDynamicStateCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkPipelineDynamicStateCreateInfo.Pointer get(int i){
                return new VkPipelineDynamicStateCreateInfo.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
