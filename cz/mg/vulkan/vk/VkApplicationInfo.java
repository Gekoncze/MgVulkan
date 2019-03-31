package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkApplicationInfo.html">khronos documentation</a>
 **/
public class VkApplicationInfo extends VkObject {
    public VkApplicationInfo() {
        super(sizeof());
    }

    public VkApplicationInfo(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkApplicationInfo(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
    }


    public VkApplicationInfo(VkObject pNext, VkChar pApplicationName, VkUInt32 applicationVersion, VkChar pEngineName, VkUInt32 engineVersion, VkUInt32 apiVersion) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_APPLICATION_INFO));
        setPNext(pNext);
        setPApplicationName(pApplicationName);
        setApplicationVersion(applicationVersion);
        setPEngineName(pEngineName);
        setEngineVersion(engineVersion);
        setApiVersion(apiVersion);
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

    public VkChar getPApplicationName() {
        return new VkChar(getVkMemory(), getPApplicationName(getVkAddress()));
    }

    public void setPApplicationName(VkChar pApplicationName) {
        setPApplicationName(getVkAddress(), pApplicationName.getVkAddress());
    }

    private static native long getPApplicationName(long address);
    private static native void setPApplicationName(long address, long pApplicationName);

    public VkUInt32 getApplicationVersion() {
        return new VkUInt32(getVkMemory(), getApplicationVersion(getVkAddress()));
    }

    public void setApplicationVersion(VkUInt32 applicationVersion) {
        setApplicationVersion(getVkAddress(), applicationVersion.getVkAddress());
    }

    private static native long getApplicationVersion(long address);
    private static native void setApplicationVersion(long address, long applicationVersion);

    public VkChar getPEngineName() {
        return new VkChar(getVkMemory(), getPEngineName(getVkAddress()));
    }

    public void setPEngineName(VkChar pEngineName) {
        setPEngineName(getVkAddress(), pEngineName.getVkAddress());
    }

    private static native long getPEngineName(long address);
    private static native void setPEngineName(long address, long pEngineName);

    public VkUInt32 getEngineVersion() {
        return new VkUInt32(getVkMemory(), getEngineVersion(getVkAddress()));
    }

    public void setEngineVersion(VkUInt32 engineVersion) {
        setEngineVersion(getVkAddress(), engineVersion.getVkAddress());
    }

    private static native long getEngineVersion(long address);
    private static native void setEngineVersion(long address, long engineVersion);

    public VkUInt32 getApiVersion() {
        return new VkUInt32(getVkMemory(), getApiVersion(getVkAddress()));
    }

    public void setApiVersion(VkUInt32 apiVersion) {
        setApiVersion(getVkAddress(), apiVersion.getVkAddress());
    }

    private static native long getApiVersion(long address);
    private static native void setApiVersion(long address, long apiVersion);


    public static native long sizeof();

    public static class Array extends VkApplicationInfo implements cz.mg.collections.array.ReadonlyArray<VkApplicationInfo> {
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
        public VkApplicationInfo get(int i){
            return new VkApplicationInfo(getVkMemory(), getVkAddress() + sizeof()*i);
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

            public Array(VkApplicationInfo[] a) {
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
