package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineVertexInputStateCreateInfo.html">khronos documentation</a>
 **/
public class VkPipelineVertexInputStateCreateInfo extends VkObject {
    public VkPipelineVertexInputStateCreateInfo() {
        super(sizeof());
    }

    public VkPipelineVertexInputStateCreateInfo(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkPipelineVertexInputStateCreateInfo(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
    }


    public VkPipelineVertexInputStateCreateInfo(VkObject pNext, VkPipelineVertexInputStateCreateFlags flags, VkUInt32 vertexBindingDescriptionCount, VkVertexInputBindingDescription pVertexBindingDescriptions, VkUInt32 vertexAttributeDescriptionCount, VkVertexInputAttributeDescription pVertexAttributeDescriptions) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_STATE_CREATE_INFO));
        setPNext(pNext);
        setFlags(flags);
        setVertexBindingDescriptionCount(vertexBindingDescriptionCount);
        setPVertexBindingDescriptions(pVertexBindingDescriptions);
        setVertexAttributeDescriptionCount(vertexAttributeDescriptionCount);
        setPVertexAttributeDescriptions(pVertexAttributeDescriptions);
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

    public VkPipelineVertexInputStateCreateFlags getFlags() {
        return new VkPipelineVertexInputStateCreateFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    public void setFlags(VkPipelineVertexInputStateCreateFlags flags) {
        setFlags(getVkAddress(), flags.getVkAddress());
    }

    private static native long getFlags(long address);
    private static native void setFlags(long address, long flags);

    public VkUInt32 getVertexBindingDescriptionCount() {
        return new VkUInt32(getVkMemory(), getVertexBindingDescriptionCount(getVkAddress()));
    }

    public void setVertexBindingDescriptionCount(VkUInt32 vertexBindingDescriptionCount) {
        setVertexBindingDescriptionCount(getVkAddress(), vertexBindingDescriptionCount.getVkAddress());
    }

    private static native long getVertexBindingDescriptionCount(long address);
    private static native void setVertexBindingDescriptionCount(long address, long vertexBindingDescriptionCount);

    public VkVertexInputBindingDescription.Array getPVertexBindingDescriptions() {
        return new VkVertexInputBindingDescription.Array(getVkMemory(), getPVertexBindingDescriptions(getVkAddress()), getVertexBindingDescriptionCount().getValue());
    }

    public void setPVertexBindingDescriptions(VkVertexInputBindingDescription pVertexBindingDescriptions) {
        setPVertexBindingDescriptions(getVkAddress(), pVertexBindingDescriptions.getVkAddress());
    }

    private static native long getPVertexBindingDescriptions(long address);
    private static native void setPVertexBindingDescriptions(long address, long pVertexBindingDescriptions);

    public VkUInt32 getVertexAttributeDescriptionCount() {
        return new VkUInt32(getVkMemory(), getVertexAttributeDescriptionCount(getVkAddress()));
    }

    public void setVertexAttributeDescriptionCount(VkUInt32 vertexAttributeDescriptionCount) {
        setVertexAttributeDescriptionCount(getVkAddress(), vertexAttributeDescriptionCount.getVkAddress());
    }

    private static native long getVertexAttributeDescriptionCount(long address);
    private static native void setVertexAttributeDescriptionCount(long address, long vertexAttributeDescriptionCount);

    public VkVertexInputAttributeDescription.Array getPVertexAttributeDescriptions() {
        return new VkVertexInputAttributeDescription.Array(getVkMemory(), getPVertexAttributeDescriptions(getVkAddress()), getVertexAttributeDescriptionCount().getValue());
    }

    public void setPVertexAttributeDescriptions(VkVertexInputAttributeDescription pVertexAttributeDescriptions) {
        setPVertexAttributeDescriptions(getVkAddress(), pVertexAttributeDescriptions.getVkAddress());
    }

    private static native long getPVertexAttributeDescriptions(long address);
    private static native void setPVertexAttributeDescriptions(long address, long pVertexAttributeDescriptions);


    public static native long sizeof();

    public static class Array extends VkPipelineVertexInputStateCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkPipelineVertexInputStateCreateInfo> {
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
        public VkPipelineVertexInputStateCreateInfo get(int i){
            return new VkPipelineVertexInputStateCreateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
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

            public Array(VkPipelineVertexInputStateCreateInfo[] a) {
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
