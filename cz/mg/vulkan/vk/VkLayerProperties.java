package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkLayerProperties.html">khronos documentation</a>
 **/
public class VkLayerProperties extends VkObject {
    public VkLayerProperties() {
        super(sizeof());
    }

    public VkLayerProperties(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkLayerProperties(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
    }


    public VkLayerProperties(VkChar layerName, VkUInt32 specVersion, VkUInt32 implementationVersion, VkChar description) {
        super(sizeof());
        setLayerName(layerName);
        setSpecVersion(specVersion);
        setImplementationVersion(implementationVersion);
        setDescription(description);
    }

    public VkChar getLayerName() {
        return new VkChar(getVkMemory(), getLayerName(getVkAddress()));
    }

    public void setLayerName(VkChar layerName) {
        setLayerName(getVkAddress(), layerName.getVkAddress());
    }

    private static native long getLayerName(long address);
    private static native void setLayerName(long address, long layerName);

    public VkUInt32 getSpecVersion() {
        return new VkUInt32(getVkMemory(), getSpecVersion(getVkAddress()));
    }

    public void setSpecVersion(VkUInt32 specVersion) {
        setSpecVersion(getVkAddress(), specVersion.getVkAddress());
    }

    private static native long getSpecVersion(long address);
    private static native void setSpecVersion(long address, long specVersion);

    public VkUInt32 getImplementationVersion() {
        return new VkUInt32(getVkMemory(), getImplementationVersion(getVkAddress()));
    }

    public void setImplementationVersion(VkUInt32 implementationVersion) {
        setImplementationVersion(getVkAddress(), implementationVersion.getVkAddress());
    }

    private static native long getImplementationVersion(long address);
    private static native void setImplementationVersion(long address, long implementationVersion);

    public VkChar getDescription() {
        return new VkChar(getVkMemory(), getDescription(getVkAddress()));
    }

    public void setDescription(VkChar description) {
        setDescription(getVkAddress(), description.getVkAddress());
    }

    private static native long getDescription(long address);
    private static native void setDescription(long address, long description);


    public static native long sizeof();

    public static class Array extends VkLayerProperties implements cz.mg.collections.array.ReadonlyArray<VkLayerProperties> {
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
        public VkLayerProperties get(int i){
            return new VkLayerProperties(getVkMemory(), getVkAddress() + sizeof()*i);
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

            public Array(VkLayerProperties[] a) {
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
