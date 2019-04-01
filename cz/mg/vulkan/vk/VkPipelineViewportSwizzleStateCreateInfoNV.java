package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineViewportSwizzleStateCreateInfoNV.html">khronos documentation</a>
 **/
public class VkPipelineViewportSwizzleStateCreateInfoNV extends VkObject {
    public VkPipelineViewportSwizzleStateCreateInfoNV() {
        super(sizeof());
    }

    public VkPipelineViewportSwizzleStateCreateInfoNV(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineViewportSwizzleStateCreateInfoNV(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkPipelineViewportSwizzleStateCreateInfoNV(VkObject pNext, VkPipelineViewportSwizzleStateCreateFlagsNV flags, VkUInt32 viewportCount, VkViewportSwizzleNV pViewportSwizzles) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_SWIZZLE_STATE_CREATE_INFO_NV));
        setPNext(pNext);
        setFlags(flags);
        setViewportCount(viewportCount);
        setPViewportSwizzles(pViewportSwizzles);
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

    public VkPipelineViewportSwizzleStateCreateFlagsNV getFlags() {
        return new VkPipelineViewportSwizzleStateCreateFlagsNV(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkPipelineViewportSwizzleStateCreateFlagsNV flags) {
        setFlags(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getFlags(long address);
    private static native void setFlags(long address, long flags);

    public VkUInt32 getViewportCount() {
        return new VkUInt32(getVkMemory(), getViewportCount(getVkAddress()));
    }

    
    public void setViewportCount(VkUInt32 viewportCount) {
        setViewportCount(getVkAddress(), viewportCount != null ? viewportCount.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getViewportCount(long address);
    private static native void setViewportCount(long address, long viewportCount);

    public VkViewportSwizzleNV getPViewportSwizzles() {
        return new VkViewportSwizzleNV(getVkMemory(), getPViewportSwizzles(getVkAddress()));
    }

    private VkObject pViewportSwizzles = null;
    public void setPViewportSwizzles(VkViewportSwizzleNV pViewportSwizzles) {
        setPViewportSwizzles(getVkAddress(), pViewportSwizzles != null ? pViewportSwizzles.getVkAddress() : VkPointer.NULL);
        this.pViewportSwizzles = pViewportSwizzles;
    }

    private static native long getPViewportSwizzles(long address);
    private static native void setPViewportSwizzles(long address, long pViewportSwizzles);


    public static native long sizeof();

    public static class Array extends VkPipelineViewportSwizzleStateCreateInfoNV implements cz.mg.collections.array.ReadonlyArray<VkPipelineViewportSwizzleStateCreateInfoNV> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPipelineViewportSwizzleStateCreateInfoNV.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPipelineViewportSwizzleStateCreateInfoNV o){
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
        public VkPipelineViewportSwizzleStateCreateInfoNV get(int i){
            return new VkPipelineViewportSwizzleStateCreateInfoNV(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkPipelineViewportSwizzleStateCreateInfoNV.Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
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

            public Array(VkPipelineViewportSwizzleStateCreateInfoNV[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public Pointer get(int i){
                return new Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
