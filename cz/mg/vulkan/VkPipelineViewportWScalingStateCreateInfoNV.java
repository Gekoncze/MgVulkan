package cz.mg.vulkan;

public class VkPipelineViewportWScalingStateCreateInfoNV extends VkObject {
    public VkPipelineViewportWScalingStateCreateInfoNV() {
        super(sizeof());
    }

    public VkPipelineViewportWScalingStateCreateInfoNV(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineViewportWScalingStateCreateInfoNV(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkPipelineViewportWScalingStateCreateInfoNV(VkObject pNext, VkBool32 viewportWScalingEnable, VkUInt32 viewportCount, VkViewportWScalingNV pViewportWScalings) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_W_SCALING_STATE_CREATE_INFO_NV));
        setPNext(pNext);
        setViewportWScalingEnable(viewportWScalingEnable);
        setViewportCount(viewportCount);
        setPViewportWScalings(pViewportWScalings);
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

    public VkBool32 getViewportWScalingEnable() {
        return new VkBool32(getVkMemory(), getViewportWScalingEnable(getVkAddress()));
    }

    
    public void setViewportWScalingEnable(VkBool32 viewportWScalingEnable) {
        setViewportWScalingEnable(getVkAddress(), viewportWScalingEnable != null ? viewportWScalingEnable.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getViewportWScalingEnable(long address);
    private static native void setViewportWScalingEnable(long address, long viewportWScalingEnable);

    public VkUInt32 getViewportCount() {
        return new VkUInt32(getVkMemory(), getViewportCount(getVkAddress()));
    }

    
    public void setViewportCount(VkUInt32 viewportCount) {
        setViewportCount(getVkAddress(), viewportCount != null ? viewportCount.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getViewportCount(long address);
    private static native void setViewportCount(long address, long viewportCount);

    public VkViewportWScalingNV getPViewportWScalings() {
        return new VkViewportWScalingNV(getVkMemory(), getPViewportWScalings(getVkAddress()));
    }

    private VkObject pViewportWScalings = null;
    public void setPViewportWScalings(VkViewportWScalingNV pViewportWScalings) {
        setPViewportWScalings(getVkAddress(), pViewportWScalings != null ? pViewportWScalings.getVkAddress() : VkPointer.NULL);
        this.pViewportWScalings = pViewportWScalings;
    }

    private static native long getPViewportWScalings(long address);
    private static native void setPViewportWScalings(long address, long pViewportWScalings);


    public static native long sizeof();

    public static class Array extends VkPipelineViewportWScalingStateCreateInfoNV implements cz.mg.collections.array.ReadonlyArray<VkPipelineViewportWScalingStateCreateInfoNV> {        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPipelineViewportWScalingStateCreateInfoNV.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPipelineViewportWScalingStateCreateInfoNV o){
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
        public VkPipelineViewportWScalingStateCreateInfoNV get(int i){
            return new VkPipelineViewportWScalingStateCreateInfoNV(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkPipelineViewportWScalingStateCreateInfoNV.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPipelineViewportWScalingStateCreateInfoNV.Pointer> {
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

            public Array(VkPipelineViewportWScalingStateCreateInfoNV[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkPipelineViewportWScalingStateCreateInfoNV.Pointer get(int i){
                return new VkPipelineViewportWScalingStateCreateInfoNV.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }

}
