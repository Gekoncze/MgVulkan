package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPhysicalDeviceProtectedMemoryFeatures.html">khronos documentation</a>
 **/
public class VkPhysicalDeviceProtectedMemoryFeatures extends VkObject {
    public VkPhysicalDeviceProtectedMemoryFeatures() {
        super(sizeof());
    }

    public VkPhysicalDeviceProtectedMemoryFeatures(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkPhysicalDeviceProtectedMemoryFeatures(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
    }


    public VkPhysicalDeviceProtectedMemoryFeatures(VkStructureType sType, VkObject pNext, VkBool32 protectedMemory) {
        super(sizeof());
        setSType(sType);
        setPNext(pNext);
        setProtectedMemory(protectedMemory);
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

    public VkBool32 getProtectedMemory() {
        return new VkBool32(getVkMemory(), getProtectedMemory(getVkAddress()));
    }

    public void setProtectedMemory(VkBool32 protectedMemory) {
        setProtectedMemory(getVkAddress(), protectedMemory.getVkAddress());
    }

    private static native long getProtectedMemory(long address);
    private static native void setProtectedMemory(long address, long protectedMemory);


    public static native long sizeof();

    public static class Array extends VkPhysicalDeviceProtectedMemoryFeatures implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceProtectedMemoryFeatures> {
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
        public VkPhysicalDeviceProtectedMemoryFeatures get(int i){
            return new VkPhysicalDeviceProtectedMemoryFeatures(getVkMemory(), getVkAddress() + sizeof()*i);
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

            public Array(VkPhysicalDeviceProtectedMemoryFeatures[] a) {
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
