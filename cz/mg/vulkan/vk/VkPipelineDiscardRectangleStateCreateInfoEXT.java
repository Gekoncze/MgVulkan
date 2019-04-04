package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineDiscardRectangleStateCreateInfoEXT.html">khronos documentation</a>
 **/
public class VkPipelineDiscardRectangleStateCreateInfoEXT extends VkObject {
    public VkPipelineDiscardRectangleStateCreateInfoEXT() {
        super(sizeof());
    }

    public VkPipelineDiscardRectangleStateCreateInfoEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineDiscardRectangleStateCreateInfoEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkPipelineDiscardRectangleStateCreateInfoEXT(VkObject pNext, VkPipelineDiscardRectangleStateCreateFlagsEXT flags, VkDiscardRectangleModeEXT discardRectangleMode, VkUInt32 discardRectangleCount, VkRect2D pDiscardRectangles) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_DISCARD_RECTANGLE_STATE_CREATE_INFO_EXT));
        setPNext(pNext);
        setFlags(flags);
        setDiscardRectangleMode(discardRectangleMode);
        setDiscardRectangleCount(discardRectangleCount);
        setPDiscardRectangles(pDiscardRectangles);
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

    public VkPipelineDiscardRectangleStateCreateFlagsEXT getFlags() {
        return new VkPipelineDiscardRectangleStateCreateFlagsEXT(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkPipelineDiscardRectangleStateCreateFlagsEXT flags) {
        setFlags(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getFlags(long address);
    private static native void setFlags(long address, long flags);

    public VkDiscardRectangleModeEXT getDiscardRectangleMode() {
        return new VkDiscardRectangleModeEXT(getVkMemory(), getDiscardRectangleMode(getVkAddress()));
    }

    
    public void setDiscardRectangleMode(VkDiscardRectangleModeEXT discardRectangleMode) {
        setDiscardRectangleMode(getVkAddress(), discardRectangleMode != null ? discardRectangleMode.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getDiscardRectangleMode(long address);
    private static native void setDiscardRectangleMode(long address, long discardRectangleMode);

    public VkUInt32 getDiscardRectangleCount() {
        return new VkUInt32(getVkMemory(), getDiscardRectangleCount(getVkAddress()));
    }

    
    public void setDiscardRectangleCount(VkUInt32 discardRectangleCount) {
        setDiscardRectangleCount(getVkAddress(), discardRectangleCount != null ? discardRectangleCount.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getDiscardRectangleCount(long address);
    private static native void setDiscardRectangleCount(long address, long discardRectangleCount);

    public VkRect2D getPDiscardRectangles() {
        return new VkRect2D(getVkMemory(), getPDiscardRectangles(getVkAddress()));
    }

    private VkObject pDiscardRectangles = null;
    public void setPDiscardRectangles(VkRect2D pDiscardRectangles) {
        setPDiscardRectangles(getVkAddress(), pDiscardRectangles != null ? pDiscardRectangles.getVkAddress() : VkPointer.NULL);
        this.pDiscardRectangles = pDiscardRectangles;
    }

    private static native long getPDiscardRectangles(long address);
    private static native void setPDiscardRectangles(long address, long pDiscardRectangles);


    public static native long sizeof();

    public static class Array extends VkPipelineDiscardRectangleStateCreateInfoEXT implements cz.mg.collections.array.ReadonlyArray<VkPipelineDiscardRectangleStateCreateInfoEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPipelineDiscardRectangleStateCreateInfoEXT.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPipelineDiscardRectangleStateCreateInfoEXT o){
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
        public VkPipelineDiscardRectangleStateCreateInfoEXT get(int i){
            return new VkPipelineDiscardRectangleStateCreateInfoEXT(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkPipelineDiscardRectangleStateCreateInfoEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPipelineDiscardRectangleStateCreateInfoEXT.Pointer> {
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

            public Array(VkPipelineDiscardRectangleStateCreateInfoEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkPipelineDiscardRectangleStateCreateInfoEXT.Pointer get(int i){
                return new VkPipelineDiscardRectangleStateCreateInfoEXT.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
