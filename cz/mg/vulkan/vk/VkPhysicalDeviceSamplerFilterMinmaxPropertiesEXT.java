package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.html">khronos documentation</a>
 **/
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


    public VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT(VkStructureType sType, VkObject pNext, VkBool32 filterMinmaxSingleComponentFormats, VkBool32 filterMinmaxImageComponentMapping) {
        super(sizeof());
        setSType(sType);
        setPNext(pNext);
        setFilterMinmaxSingleComponentFormats(filterMinmaxSingleComponentFormats);
        setFilterMinmaxImageComponentMapping(filterMinmaxImageComponentMapping);
    }

    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getSType(long address);
    private static native void setSType(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNext(getVkAddress()));
    }

    private VkObject pNext = null;
    public void setPNext(VkObject pNext) {
        setPNext(getVkAddress(), pNext != null ? pNext.getVkAddress() : VkPointer.NULL);
        this.pNext = pNext;
    }

    private static native long getPNext(long address);
    private static native void setPNext(long address, long pNext);

    public VkBool32 getFilterMinmaxSingleComponentFormats() {
        return new VkBool32(getVkMemory(), getFilterMinmaxSingleComponentFormats(getVkAddress()));
    }

    
    public void setFilterMinmaxSingleComponentFormats(VkBool32 filterMinmaxSingleComponentFormats) {
        setFilterMinmaxSingleComponentFormats(getVkAddress(), filterMinmaxSingleComponentFormats != null ? filterMinmaxSingleComponentFormats.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getFilterMinmaxSingleComponentFormats(long address);
    private static native void setFilterMinmaxSingleComponentFormats(long address, long filterMinmaxSingleComponentFormats);

    public VkBool32 getFilterMinmaxImageComponentMapping() {
        return new VkBool32(getVkMemory(), getFilterMinmaxImageComponentMapping(getVkAddress()));
    }

    
    public void setFilterMinmaxImageComponentMapping(VkBool32 filterMinmaxImageComponentMapping) {
        setFilterMinmaxImageComponentMapping(getVkAddress(), filterMinmaxImageComponentMapping != null ? filterMinmaxImageComponentMapping.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getFilterMinmaxImageComponentMapping(long address);
    private static native void setFilterMinmaxImageComponentMapping(long address, long filterMinmaxImageComponentMapping);


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
            return new VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.Pointer> {
            private final int count;

            public Array(int count) {
                super(new VkMemory(count*VkPointer.sizeof()));
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

            public Array(VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.Pointer get(int i){
                return new VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
