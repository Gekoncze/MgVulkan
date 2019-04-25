package cz.mg.vulkan;

public class VkPhysicalDeviceExternalMemoryHostPropertiesEXT extends VkObject {
    public VkPhysicalDeviceExternalMemoryHostPropertiesEXT() {
        super(sizeof());
    }

    protected VkPhysicalDeviceExternalMemoryHostPropertiesEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkPhysicalDeviceExternalMemoryHostPropertiesEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPhysicalDeviceExternalMemoryHostPropertiesEXT(VkPointer pointer) {
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

    public VkDeviceSize getMinImportedHostPointerAlignment() {
        return new VkDeviceSize(getVkMemory(), getMinImportedHostPointerAlignment(getVkAddress()));
    }

    
    public void setMinImportedHostPointerAlignment(VkDeviceSize minImportedHostPointerAlignment) {
        setMinImportedHostPointerAlignment(getVkAddress(), minImportedHostPointerAlignment != null ? minImportedHostPointerAlignment.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getMinImportedHostPointerAlignmentQ() {
        return getMinImportedHostPointerAlignment().getValue();
    }

    public void setMinImportedHostPointerAlignment(long minImportedHostPointerAlignment) {
        getMinImportedHostPointerAlignment().setValue(minImportedHostPointerAlignment);
    }

    protected static native long getMinImportedHostPointerAlignment(long address);
    protected static native void setMinImportedHostPointerAlignment(long address, long minImportedHostPointerAlignment);


    public static native long sizeof();

    public static class Array extends VkPhysicalDeviceExternalMemoryHostPropertiesEXT implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceExternalMemoryHostPropertiesEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceExternalMemoryHostPropertiesEXT.sizeof()));
            this.count = count;
        }

        public Array(VkPhysicalDeviceExternalMemoryHostPropertiesEXT o, int count){
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
        public VkPhysicalDeviceExternalMemoryHostPropertiesEXT get(int i){
            return new VkPhysicalDeviceExternalMemoryHostPropertiesEXT(getVkMemory(), addressAt(i));
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
