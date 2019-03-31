package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineCacheCreateInfo.html">khronos documentation</a>
 **/
public class VkPipelineCacheCreateInfo extends VkObject {
    public VkPipelineCacheCreateInfo() {
        super(sizeof());
    }

    public VkPipelineCacheCreateInfo(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkPipelineCacheCreateInfo(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
    }


    public VkPipelineCacheCreateInfo(VkObject pNext, VkPipelineCacheCreateFlags flags, VkSize initialDataSize, VkObject pInitialData) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_CACHE_CREATE_INFO));
        setPNext(pNext);
        setFlags(flags);
        setInitialDataSize(initialDataSize);
        setPInitialData(pInitialData);
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

    public VkPipelineCacheCreateFlags getFlags() {
        return new VkPipelineCacheCreateFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    public void setFlags(VkPipelineCacheCreateFlags flags) {
        setFlags(getVkAddress(), flags.getVkAddress());
    }

    private static native long getFlags(long address);
    private static native void setFlags(long address, long flags);

    public VkSize getInitialDataSize() {
        return new VkSize(getVkMemory(), getInitialDataSize(getVkAddress()));
    }

    public void setInitialDataSize(VkSize initialDataSize) {
        setInitialDataSize(getVkAddress(), initialDataSize.getVkAddress());
    }

    private static native long getInitialDataSize(long address);
    private static native void setInitialDataSize(long address, long initialDataSize);

    public VkObject getPInitialData() {
        return new VkObject(getVkMemory(), getPInitialData(getVkAddress()));
    }

    public void setPInitialData(VkObject pInitialData) {
        setPInitialData(getVkAddress(), pInitialData.getVkAddress());
    }

    private static native long getPInitialData(long address);
    private static native void setPInitialData(long address, long pInitialData);


    public static native long sizeof();

    public static class Array extends VkPipelineCacheCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkPipelineCacheCreateInfo> {
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
        public VkPipelineCacheCreateInfo get(int i){
            return new VkPipelineCacheCreateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
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

            public Array(VkPipelineCacheCreateInfo[] a) {
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
