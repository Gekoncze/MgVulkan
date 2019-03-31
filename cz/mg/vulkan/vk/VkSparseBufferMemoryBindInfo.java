package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSparseBufferMemoryBindInfo.html">khronos documentation</a>
 **/
public class VkSparseBufferMemoryBindInfo extends VkObject {
    public VkSparseBufferMemoryBindInfo() {
        super(sizeof());
    }

    public VkSparseBufferMemoryBindInfo(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkSparseBufferMemoryBindInfo(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
    }


    public VkSparseBufferMemoryBindInfo(VkBuffer buffer, VkUInt32 bindCount, VkSparseMemoryBind pBinds) {
        super(sizeof());
        setBuffer(buffer);
        setBindCount(bindCount);
        setPBinds(pBinds);
    }

    public VkBuffer getBuffer() {
        return new VkBuffer(getVkMemory(), getBuffer(getVkAddress()));
    }

    public void setBuffer(VkBuffer buffer) {
        setBuffer(getVkAddress(), buffer.getVkAddress());
    }

    private static native long getBuffer(long address);
    private static native void setBuffer(long address, long buffer);

    public VkUInt32 getBindCount() {
        return new VkUInt32(getVkMemory(), getBindCount(getVkAddress()));
    }

    public void setBindCount(VkUInt32 bindCount) {
        setBindCount(getVkAddress(), bindCount.getVkAddress());
    }

    private static native long getBindCount(long address);
    private static native void setBindCount(long address, long bindCount);

    public VkSparseMemoryBind.Array getPBinds() {
        return new VkSparseMemoryBind.Array(getVkMemory(), getPBinds(getVkAddress()), getBindCount().getValue());
    }

    public void setPBinds(VkSparseMemoryBind pBinds) {
        setPBinds(getVkAddress(), pBinds.getVkAddress());
    }

    private static native long getPBinds(long address);
    private static native void setPBinds(long address, long pBinds);


    public static native long sizeof();

    public static class Array extends VkSparseBufferMemoryBindInfo implements cz.mg.collections.array.ReadonlyArray<VkSparseBufferMemoryBindInfo> {
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
        public VkSparseBufferMemoryBindInfo get(int i){
            return new VkSparseBufferMemoryBindInfo(getVkMemory(), getVkAddress() + sizeof()*i);
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

            public Array(VkSparseBufferMemoryBindInfo[] a) {
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
