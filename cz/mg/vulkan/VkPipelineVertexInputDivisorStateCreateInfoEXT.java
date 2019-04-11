package cz.mg.vulkan;

public class VkPipelineVertexInputDivisorStateCreateInfoEXT extends VkObject {
    public VkPipelineVertexInputDivisorStateCreateInfoEXT() {
        super(sizeof());
    }

    public VkPipelineVertexInputDivisorStateCreateInfoEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineVertexInputDivisorStateCreateInfoEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkPipelineVertexInputDivisorStateCreateInfoEXT(VkObject pNext, VkUInt32 vertexBindingDivisorCount, VkVertexInputBindingDivisorDescriptionEXT pVertexBindingDivisors) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO_EXT));
        setPNext(pNext);
        setVertexBindingDivisorCount(vertexBindingDivisorCount);
        setPVertexBindingDivisors(pVertexBindingDivisors);
    }

    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddress());
        
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

    public VkUInt32 getVertexBindingDivisorCount() {
        return new VkUInt32(getVkMemory(), getVertexBindingDivisorCount(getVkAddress()));
    }

    
    public void setVertexBindingDivisorCount(VkUInt32 vertexBindingDivisorCount) {
        setVertexBindingDivisorCount(getVkAddress(), vertexBindingDivisorCount != null ? vertexBindingDivisorCount.getVkAddress() : VkPointer.getNullAddress());
        
    }

    private static native long getVertexBindingDivisorCount(long address);
    private static native void setVertexBindingDivisorCount(long address, long vertexBindingDivisorCount);

    public VkVertexInputBindingDivisorDescriptionEXT getPVertexBindingDivisors() {
        return new VkVertexInputBindingDivisorDescriptionEXT(getVkMemory(), getPVertexBindingDivisors(getVkAddress()));
    }

    private VkObject pVertexBindingDivisors = null;
    public void setPVertexBindingDivisors(VkVertexInputBindingDivisorDescriptionEXT pVertexBindingDivisors) {
        setPVertexBindingDivisors(getVkAddress(), pVertexBindingDivisors != null ? pVertexBindingDivisors.getVkAddress() : VkPointer.NULL);
        this.pVertexBindingDivisors = pVertexBindingDivisors;
    }

    private static native long getPVertexBindingDivisors(long address);
    private static native void setPVertexBindingDivisors(long address, long pVertexBindingDivisors);


    public static native long sizeof();

    public static class Array extends VkPipelineVertexInputDivisorStateCreateInfoEXT implements cz.mg.collections.array.ReadonlyArray<VkPipelineVertexInputDivisorStateCreateInfoEXT> {        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPipelineVertexInputDivisorStateCreateInfoEXT.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPipelineVertexInputDivisorStateCreateInfoEXT o){
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
        public VkPipelineVertexInputDivisorStateCreateInfoEXT get(int i){
            return new VkPipelineVertexInputDivisorStateCreateInfoEXT(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkPipelineVertexInputDivisorStateCreateInfoEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPipelineVertexInputDivisorStateCreateInfoEXT.Pointer> {
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

            public Array(VkPipelineVertexInputDivisorStateCreateInfoEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkPipelineVertexInputDivisorStateCreateInfoEXT.Pointer get(int i){
                return new VkPipelineVertexInputDivisorStateCreateInfoEXT.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }

}
