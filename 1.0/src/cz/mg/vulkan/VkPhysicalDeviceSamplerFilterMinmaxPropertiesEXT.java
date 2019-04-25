package cz.mg.vulkan;

public class VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT extends VkObject {
    public VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT() {
        super(sizeof());
    }

    public VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
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

    public VkBool32 getFilterMinmaxSingleComponentFormats() {
        return new VkBool32(getVkMemory(), getFilterMinmaxSingleComponentFormats(getVkAddress()));
    }

    
    public void setFilterMinmaxSingleComponentFormats(VkBool32 filterMinmaxSingleComponentFormats) {
        setFilterMinmaxSingleComponentFormats(getVkAddress(), filterMinmaxSingleComponentFormats != null ? filterMinmaxSingleComponentFormats.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFilterMinmaxSingleComponentFormatsQ() {
        return getFilterMinmaxSingleComponentFormats().getValue();
    }

    public void setFilterMinmaxSingleComponentFormats(int filterMinmaxSingleComponentFormats) {
        getFilterMinmaxSingleComponentFormats().setValue(filterMinmaxSingleComponentFormats);
    }

    protected static native long getFilterMinmaxSingleComponentFormats(long address);
    protected static native void setFilterMinmaxSingleComponentFormats(long address, long filterMinmaxSingleComponentFormats);

    public VkBool32 getFilterMinmaxImageComponentMapping() {
        return new VkBool32(getVkMemory(), getFilterMinmaxImageComponentMapping(getVkAddress()));
    }

    
    public void setFilterMinmaxImageComponentMapping(VkBool32 filterMinmaxImageComponentMapping) {
        setFilterMinmaxImageComponentMapping(getVkAddress(), filterMinmaxImageComponentMapping != null ? filterMinmaxImageComponentMapping.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFilterMinmaxImageComponentMappingQ() {
        return getFilterMinmaxImageComponentMapping().getValue();
    }

    public void setFilterMinmaxImageComponentMapping(int filterMinmaxImageComponentMapping) {
        getFilterMinmaxImageComponentMapping().setValue(filterMinmaxImageComponentMapping);
    }

    protected static native long getFilterMinmaxImageComponentMapping(long address);
    protected static native void setFilterMinmaxImageComponentMapping(long address, long filterMinmaxImageComponentMapping);


    public static native long sizeof();

    public static class Array extends VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT o){
            super(o.getVkMemory(), o.getVkAddress());
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
        public VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT get(int i){
            return new VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }

        public static class Array2 extends VkPointer.Array {
            public Array2(int count) {
                super(count);
            }

            public Array2(int count, VkPointer o){
                super(count, o);
            }

            public Array2(VkMemory vkmemory, int count) {
                super(vkmemory, count);
            }

            public Array2(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress, count);
            }
        }
    }
}
