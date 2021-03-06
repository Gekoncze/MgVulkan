package cz.mg.vulkan;

public class VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX extends VkObject {
    public VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX() {
        super(sizeof());
    }

    protected VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX(VkPointer pointer) {
        super(pointer);
    }



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSTypeNative(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSTypeNative(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSTypeQ() {
        return getSType().getValue();
    }

    public void setSType(int sType) {
        getSType().setValue(sType);
    }

    protected static native long getSTypeNative(long address);
    protected static native void setSTypeNative(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNextNative(getVkAddress()));
    }

    private VkObject pNext = null;
    public void setPNext(VkObject pNext) {
        setPNextNative(getVkAddress(), pNext != null ? pNext.getVkAddress() : VkPointer.NULL);
        this.pNext = pNext;
    }

    protected static native long getPNextNative(long address);
    protected static native void setPNextNative(long address, long pNext);

    public VkBool32 getPerViewPositionAllComponents() {
        return new VkBool32(getVkMemory(), getPerViewPositionAllComponentsNative(getVkAddress()));
    }

    
    public void setPerViewPositionAllComponents(VkBool32 perViewPositionAllComponents) {
        setPerViewPositionAllComponentsNative(getVkAddress(), perViewPositionAllComponents != null ? perViewPositionAllComponents.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getPerViewPositionAllComponentsQ() {
        return getPerViewPositionAllComponents().getValue();
    }

    public void setPerViewPositionAllComponents(int perViewPositionAllComponents) {
        getPerViewPositionAllComponents().setValue(perViewPositionAllComponents);
    }

    protected static native long getPerViewPositionAllComponentsNative(long address);
    protected static native void setPerViewPositionAllComponentsNative(long address, long perViewPositionAllComponents);


    public void set(VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.sizeof()));
            this.count = count;
        }

        public Array(VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX o, int count){
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
        public VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX get(int i){
            return new VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX(getVkMemory(), address(i));
        }

        protected long address(int i){
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
