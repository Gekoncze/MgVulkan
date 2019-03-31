package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDrawIndirectCommand.html">khronos documentation</a>
 **/
public class VkDrawIndirectCommand extends VkObject {
    public VkDrawIndirectCommand() {
        super(sizeof());
    }

    public VkDrawIndirectCommand(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkDrawIndirectCommand(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
    }


    public VkDrawIndirectCommand(VkUInt32 vertexCount, VkUInt32 instanceCount, VkUInt32 firstVertex, VkUInt32 firstInstance) {
        super(sizeof());
        setVertexCount(vertexCount);
        setInstanceCount(instanceCount);
        setFirstVertex(firstVertex);
        setFirstInstance(firstInstance);
    }

    public VkUInt32 getVertexCount() {
        return new VkUInt32(getVkMemory(), getVertexCount(getVkAddress()));
    }

    public void setVertexCount(VkUInt32 vertexCount) {
        setVertexCount(getVkAddress(), vertexCount.getVkAddress());
    }

    private static native long getVertexCount(long address);
    private static native void setVertexCount(long address, long vertexCount);

    public VkUInt32.Array getInstanceCount() {
        return new VkUInt32.Array(getVkMemory(), getInstanceCount(getVkAddress()), getVertexCount().getValue());
    }

    public void setInstanceCount(VkUInt32 instanceCount) {
        setInstanceCount(getVkAddress(), instanceCount.getVkAddress());
    }

    private static native long getInstanceCount(long address);
    private static native void setInstanceCount(long address, long instanceCount);

    public VkUInt32.Array getFirstVertex() {
        return new VkUInt32.Array(getVkMemory(), getFirstVertex(getVkAddress()), getInstanceCount().getValue());
    }

    public void setFirstVertex(VkUInt32 firstVertex) {
        setFirstVertex(getVkAddress(), firstVertex.getVkAddress());
    }

    private static native long getFirstVertex(long address);
    private static native void setFirstVertex(long address, long firstVertex);

    public VkUInt32 getFirstInstance() {
        return new VkUInt32(getVkMemory(), getFirstInstance(getVkAddress()));
    }

    public void setFirstInstance(VkUInt32 firstInstance) {
        setFirstInstance(getVkAddress(), firstInstance.getVkAddress());
    }

    private static native long getFirstInstance(long address);
    private static native void setFirstInstance(long address, long firstInstance);


    public static native long sizeof();

    public static class Array extends VkDrawIndirectCommand implements cz.mg.collections.array.ReadonlyArray<VkDrawIndirectCommand> {
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
        public VkDrawIndirectCommand get(int i){
            return new VkDrawIndirectCommand(getVkMemory(), getVkAddress() + sizeof()*i);
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

            public Array(VkDrawIndirectCommand[] a) {
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
