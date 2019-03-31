package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineViewportStateCreateInfo.html">khronos documentation</a>
 **/
public class VkPipelineViewportStateCreateInfo extends VkObject {
    public VkPipelineViewportStateCreateInfo() {
        super(sizeof());
    }

    public VkPipelineViewportStateCreateInfo(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkPipelineViewportStateCreateInfo(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
    }


    public VkPipelineViewportStateCreateInfo(VkObject pNext, VkPipelineViewportStateCreateFlags flags, VkUInt32 viewportCount, VkViewport pViewports, VkUInt32 scissorCount, VkRect2D pScissors) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_STATE_CREATE_INFO));
        setPNext(pNext);
        setFlags(flags);
        setViewportCount(viewportCount);
        setPViewports(pViewports);
        setScissorCount(scissorCount);
        setPScissors(pScissors);
    }

    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType.getVkAddress());
    }

    private static native long getSType(long address);
    private static native void setSType(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNext(getVkAddress()));
    }

    public void setPNext(VkObject pNext) {
        setPNext(getVkAddress(), pNext.getVkAddress());
    }

    private static native long getPNext(long address);
    private static native void setPNext(long address, long pNext);

    public VkPipelineViewportStateCreateFlags getFlags() {
        return new VkPipelineViewportStateCreateFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    public void setFlags(VkPipelineViewportStateCreateFlags flags) {
        setFlags(getVkAddress(), flags.getVkAddress());
    }

    private static native long getFlags(long address);
    private static native void setFlags(long address, long flags);

    public VkUInt32 getViewportCount() {
        return new VkUInt32(getVkMemory(), getViewportCount(getVkAddress()));
    }

    public void setViewportCount(VkUInt32 viewportCount) {
        setViewportCount(getVkAddress(), viewportCount.getVkAddress());
    }

    private static native long getViewportCount(long address);
    private static native void setViewportCount(long address, long viewportCount);

    public VkViewport.Array getPViewports() {
        return new VkViewport.Array(getVkMemory(), getPViewports(getVkAddress()), getViewportCount().getValue());
    }

    public void setPViewports(VkViewport pViewports) {
        setPViewports(getVkAddress(), pViewports.getVkAddress());
    }

    private static native long getPViewports(long address);
    private static native void setPViewports(long address, long pViewports);

    public VkUInt32 getScissorCount() {
        return new VkUInt32(getVkMemory(), getScissorCount(getVkAddress()));
    }

    public void setScissorCount(VkUInt32 scissorCount) {
        setScissorCount(getVkAddress(), scissorCount.getVkAddress());
    }

    private static native long getScissorCount(long address);
    private static native void setScissorCount(long address, long scissorCount);

    public VkRect2D.Array getPScissors() {
        return new VkRect2D.Array(getVkMemory(), getPScissors(getVkAddress()), getScissorCount().getValue());
    }

    public void setPScissors(VkRect2D pScissors) {
        setPScissors(getVkAddress(), pScissors.getVkAddress());
    }

    private static native long getPScissors(long address);
    private static native void setPScissors(long address, long pScissors);


    public static native long sizeof();

    public static class Array extends VkPipelineViewportStateCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkPipelineViewportStateCreateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*sizeof()));
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
        public VkPipelineViewportStateCreateInfo get(int i){
            return new VkPipelineViewportStateCreateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
            private final int count;

            public Array(int count) {
                super(new VkMemory(count*sizeof()));
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

            public Array(VkPipelineViewportStateCreateInfo[] a) {
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
