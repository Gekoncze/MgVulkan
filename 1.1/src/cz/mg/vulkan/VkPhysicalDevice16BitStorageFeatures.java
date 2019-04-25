package cz.mg.vulkan;

public class VkPhysicalDevice16BitStorageFeatures extends VkObject {
    public VkPhysicalDevice16BitStorageFeatures() {
        super(sizeof());
    }

    protected VkPhysicalDevice16BitStorageFeatures(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkPhysicalDevice16BitStorageFeatures(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPhysicalDevice16BitStorageFeatures(VkPointer pointer) {
        super(pointer);
    }



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSTypeQ() {
        return getSType().getValue();
    }

    public void setSType(int sType) {
        getSType().setValue(sType);
    }

    protected static native long getSType(long address);
    protected static native void setSType(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNext(getVkAddress()));
    }

    private VkObject pNext = null;
    public void setPNext(VkObject pNext) {
        setPNext(getVkAddress(), pNext != null ? pNext.getVkAddress() : VkPointer.NULL);
        this.pNext = pNext;
    }

    protected static native long getPNext(long address);
    protected static native void setPNext(long address, long pNext);

    public VkBool32 getStorageBuffer16BitAccess() {
        return new VkBool32(getVkMemory(), getStorageBuffer16BitAccess(getVkAddress()));
    }

    
    public void setStorageBuffer16BitAccess(VkBool32 storageBuffer16BitAccess) {
        setStorageBuffer16BitAccess(getVkAddress(), storageBuffer16BitAccess != null ? storageBuffer16BitAccess.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getStorageBuffer16BitAccessQ() {
        return getStorageBuffer16BitAccess().getValue();
    }

    public void setStorageBuffer16BitAccess(int storageBuffer16BitAccess) {
        getStorageBuffer16BitAccess().setValue(storageBuffer16BitAccess);
    }

    protected static native long getStorageBuffer16BitAccess(long address);
    protected static native void setStorageBuffer16BitAccess(long address, long storageBuffer16BitAccess);

    public VkBool32 getUniformAndStorageBuffer16BitAccess() {
        return new VkBool32(getVkMemory(), getUniformAndStorageBuffer16BitAccess(getVkAddress()));
    }

    
    public void setUniformAndStorageBuffer16BitAccess(VkBool32 uniformAndStorageBuffer16BitAccess) {
        setUniformAndStorageBuffer16BitAccess(getVkAddress(), uniformAndStorageBuffer16BitAccess != null ? uniformAndStorageBuffer16BitAccess.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getUniformAndStorageBuffer16BitAccessQ() {
        return getUniformAndStorageBuffer16BitAccess().getValue();
    }

    public void setUniformAndStorageBuffer16BitAccess(int uniformAndStorageBuffer16BitAccess) {
        getUniformAndStorageBuffer16BitAccess().setValue(uniformAndStorageBuffer16BitAccess);
    }

    protected static native long getUniformAndStorageBuffer16BitAccess(long address);
    protected static native void setUniformAndStorageBuffer16BitAccess(long address, long uniformAndStorageBuffer16BitAccess);

    public VkBool32 getStoragePushConstant16() {
        return new VkBool32(getVkMemory(), getStoragePushConstant16(getVkAddress()));
    }

    
    public void setStoragePushConstant16(VkBool32 storagePushConstant16) {
        setStoragePushConstant16(getVkAddress(), storagePushConstant16 != null ? storagePushConstant16.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getStoragePushConstant16Q() {
        return getStoragePushConstant16().getValue();
    }

    public void setStoragePushConstant16(int storagePushConstant16) {
        getStoragePushConstant16().setValue(storagePushConstant16);
    }

    protected static native long getStoragePushConstant16(long address);
    protected static native void setStoragePushConstant16(long address, long storagePushConstant16);

    public VkBool32 getStorageInputOutput16() {
        return new VkBool32(getVkMemory(), getStorageInputOutput16(getVkAddress()));
    }

    
    public void setStorageInputOutput16(VkBool32 storageInputOutput16) {
        setStorageInputOutput16(getVkAddress(), storageInputOutput16 != null ? storageInputOutput16.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getStorageInputOutput16Q() {
        return getStorageInputOutput16().getValue();
    }

    public void setStorageInputOutput16(int storageInputOutput16) {
        getStorageInputOutput16().setValue(storageInputOutput16);
    }

    protected static native long getStorageInputOutput16(long address);
    protected static native void setStorageInputOutput16(long address, long storageInputOutput16);


    public static native long sizeof();

    public static class Array extends VkPhysicalDevice16BitStorageFeatures implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDevice16BitStorageFeatures> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDevice16BitStorageFeatures.sizeof()));
            this.count = count;
        }

        public Array(VkPhysicalDevice16BitStorageFeatures o, int count){
            super(o.getVkMemory(), o.getVkAddress());
            this.count = count;
        }

        public Array(VkPointer pointer, int count){
            super(pointer);
            this.count = count;
        }

        protected Array(VkMemory vkmemory, int count) {
            super(vkmemory);
            this.count = count;
        }

        protected Array(VkMemory vkmemory, long vkaddress, int count) {
            super(vkmemory, vkaddress);
            this.count = count;
        }





        @Override
        public int count(){
            return count;
        }

        @Override
        public VkPhysicalDevice16BitStorageFeatures get(int i){
            return new VkPhysicalDevice16BitStorageFeatures(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }

        public static class Array2 extends VkPointer.Array {
            public Array2(int count) {
                super(count);
            }

            protected Array2(VkMemory vkmemory, int count) {
                super(vkmemory, count);
            }

            protected Array2(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress, count);
            }
        }
    }
}
