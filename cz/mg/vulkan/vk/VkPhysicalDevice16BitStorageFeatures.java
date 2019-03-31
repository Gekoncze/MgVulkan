package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPhysicalDevice16BitStorageFeatures.html">khronos documentation</a>
 **/
public class VkPhysicalDevice16BitStorageFeatures extends VkObject {
    public VkPhysicalDevice16BitStorageFeatures() {
        super(sizeof());
    }

    public VkPhysicalDevice16BitStorageFeatures(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkPhysicalDevice16BitStorageFeatures(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
    }


    public VkPhysicalDevice16BitStorageFeatures(VkStructureType sType, VkObject pNext, VkBool32 storageBuffer16BitAccess, VkBool32 uniformAndStorageBuffer16BitAccess, VkBool32 storagePushConstant16, VkBool32 storageInputOutput16) {
        super(sizeof());
        setSType(sType);
        setPNext(pNext);
        setStorageBuffer16BitAccess(storageBuffer16BitAccess);
        setUniformAndStorageBuffer16BitAccess(uniformAndStorageBuffer16BitAccess);
        setStoragePushConstant16(storagePushConstant16);
        setStorageInputOutput16(storageInputOutput16);
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

    public VkBool32 getStorageBuffer16BitAccess() {
        return new VkBool32(getVkMemory(), getStorageBuffer16BitAccess(getVkAddress()));
    }

    public void setStorageBuffer16BitAccess(VkBool32 storageBuffer16BitAccess) {
        setStorageBuffer16BitAccess(getVkAddress(), storageBuffer16BitAccess.getVkAddress());
    }

    private static native long getStorageBuffer16BitAccess(long address);
    private static native void setStorageBuffer16BitAccess(long address, long storageBuffer16BitAccess);

    public VkBool32 getUniformAndStorageBuffer16BitAccess() {
        return new VkBool32(getVkMemory(), getUniformAndStorageBuffer16BitAccess(getVkAddress()));
    }

    public void setUniformAndStorageBuffer16BitAccess(VkBool32 uniformAndStorageBuffer16BitAccess) {
        setUniformAndStorageBuffer16BitAccess(getVkAddress(), uniformAndStorageBuffer16BitAccess.getVkAddress());
    }

    private static native long getUniformAndStorageBuffer16BitAccess(long address);
    private static native void setUniformAndStorageBuffer16BitAccess(long address, long uniformAndStorageBuffer16BitAccess);

    public VkBool32 getStoragePushConstant16() {
        return new VkBool32(getVkMemory(), getStoragePushConstant16(getVkAddress()));
    }

    public void setStoragePushConstant16(VkBool32 storagePushConstant16) {
        setStoragePushConstant16(getVkAddress(), storagePushConstant16.getVkAddress());
    }

    private static native long getStoragePushConstant16(long address);
    private static native void setStoragePushConstant16(long address, long storagePushConstant16);

    public VkBool32 getStorageInputOutput16() {
        return new VkBool32(getVkMemory(), getStorageInputOutput16(getVkAddress()));
    }

    public void setStorageInputOutput16(VkBool32 storageInputOutput16) {
        setStorageInputOutput16(getVkAddress(), storageInputOutput16.getVkAddress());
    }

    private static native long getStorageInputOutput16(long address);
    private static native void setStorageInputOutput16(long address, long storageInputOutput16);


    public static native long sizeof();

    public static class Array extends VkPhysicalDevice16BitStorageFeatures implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDevice16BitStorageFeatures> {
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
        public VkPhysicalDevice16BitStorageFeatures get(int i){
            return new VkPhysicalDevice16BitStorageFeatures(getVkMemory(), getVkAddress() + sizeof()*i);
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

            public Array(VkPhysicalDevice16BitStorageFeatures[] a) {
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
