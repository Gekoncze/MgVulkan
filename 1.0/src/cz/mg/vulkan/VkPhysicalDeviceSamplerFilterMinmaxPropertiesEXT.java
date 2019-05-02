package cz.mg.vulkan;

public class VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT extends VkObject {
    public VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT() {
        super(sizeof());
    }

    protected VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT(VkPointer pointer) {
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

    public VkBool32 getFilterMinmaxSingleComponentFormats() {
        return new VkBool32(getVkMemory(), getFilterMinmaxSingleComponentFormatsNative(getVkAddress()));
    }

    
    public void setFilterMinmaxSingleComponentFormats(VkBool32 filterMinmaxSingleComponentFormats) {
        setFilterMinmaxSingleComponentFormatsNative(getVkAddress(), filterMinmaxSingleComponentFormats != null ? filterMinmaxSingleComponentFormats.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFilterMinmaxSingleComponentFormatsQ() {
        return getFilterMinmaxSingleComponentFormats().getValue();
    }

    public void setFilterMinmaxSingleComponentFormats(int filterMinmaxSingleComponentFormats) {
        getFilterMinmaxSingleComponentFormats().setValue(filterMinmaxSingleComponentFormats);
    }

    protected static native long getFilterMinmaxSingleComponentFormatsNative(long address);
    protected static native void setFilterMinmaxSingleComponentFormatsNative(long address, long filterMinmaxSingleComponentFormats);

    public VkBool32 getFilterMinmaxImageComponentMapping() {
        return new VkBool32(getVkMemory(), getFilterMinmaxImageComponentMappingNative(getVkAddress()));
    }

    
    public void setFilterMinmaxImageComponentMapping(VkBool32 filterMinmaxImageComponentMapping) {
        setFilterMinmaxImageComponentMappingNative(getVkAddress(), filterMinmaxImageComponentMapping != null ? filterMinmaxImageComponentMapping.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFilterMinmaxImageComponentMappingQ() {
        return getFilterMinmaxImageComponentMapping().getValue();
    }

    public void setFilterMinmaxImageComponentMapping(int filterMinmaxImageComponentMapping) {
        getFilterMinmaxImageComponentMapping().setValue(filterMinmaxImageComponentMapping);
    }

    protected static native long getFilterMinmaxImageComponentMappingNative(long address);
    protected static native void setFilterMinmaxImageComponentMappingNative(long address, long filterMinmaxImageComponentMapping);


    public void set(VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.sizeof()));
            this.count = count;
        }

        public Array(VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT o, int count){
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
        public VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT get(int i){
            return new VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT(getVkMemory(), address(i));
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
