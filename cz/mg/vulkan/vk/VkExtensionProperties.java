package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkExtensionProperties.html">khronos documentation</a>
 **/
public class VkExtensionProperties extends VkObject {
    public VkExtensionProperties() {
        super(sizeof());
    }

    public VkExtensionProperties(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkExtensionProperties(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
    }


    public VkExtensionProperties(VkChar extensionName, VkUInt32 specVersion) {
        super(sizeof());
        setExtensionName(extensionName);
        setSpecVersion(specVersion);
    }

    public VkChar getExtensionName() {
        return new VkChar(getVkMemory(), getExtensionName(getVkAddress()));
    }

    public void setExtensionName(VkChar extensionName) {
        setExtensionName(getVkAddress(), extensionName.getVkAddress());
    }

    private static native long getExtensionName(long address);
    private static native void setExtensionName(long address, long extensionName);

    public VkUInt32 getSpecVersion() {
        return new VkUInt32(getVkMemory(), getSpecVersion(getVkAddress()));
    }

    public void setSpecVersion(VkUInt32 specVersion) {
        setSpecVersion(getVkAddress(), specVersion.getVkAddress());
    }

    private static native long getSpecVersion(long address);
    private static native void setSpecVersion(long address, long specVersion);


    public static native long sizeof();

    public static class Array extends VkExtensionProperties implements cz.mg.collections.array.ReadonlyArray<VkExtensionProperties> {
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
        public VkExtensionProperties get(int i){
            return new VkExtensionProperties(getVkMemory(), getVkAddress() + sizeof()*i);
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

            public Array(VkExtensionProperties[] a) {
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
