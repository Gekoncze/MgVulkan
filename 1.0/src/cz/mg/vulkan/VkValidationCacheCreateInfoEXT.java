package cz.mg.vulkan;

public class VkValidationCacheCreateInfoEXT extends VkObject {
    public VkValidationCacheCreateInfoEXT() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_VALIDATION_CACHE_CREATE_INFO_EXT));
    }

    public VkValidationCacheCreateInfoEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkValidationCacheCreateInfoEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getSTypeQ() {
        return getSType().getValue();
    }

    public void setSType(int sType) {
        getSType().setValue(sType);
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

    public VkValidationCacheCreateFlagsEXT getFlags() {
        return new VkValidationCacheCreateFlagsEXT(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkValidationCacheCreateFlagsEXT flags) {
        setFlags(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getFlagsQ() {
        return getFlags().getValue();
    }

    public void setFlags(int flags) {
        getFlags().setValue(flags);
    }

    private static native long getFlags(long address);
    private static native void setFlags(long address, long flags);

    public VkSize getInitialDataSize() {
        return new VkSize(getVkMemory(), getInitialDataSize(getVkAddress()));
    }

    
    public void setInitialDataSize(VkSize initialDataSize) {
        setInitialDataSize(getVkAddress(), initialDataSize != null ? initialDataSize.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public long getInitialDataSizeQ() {
        return getInitialDataSize().getValue();
    }

    public void setInitialDataSize(long initialDataSize) {
        getInitialDataSize().setValue(initialDataSize);
    }

    private static native long getInitialDataSize(long address);
    private static native void setInitialDataSize(long address, long initialDataSize);

    public VkObject getPInitialData() {
        return new VkObject(getVkMemory(), getPInitialData(getVkAddress()));
    }

    private VkObject pInitialData = null;
    public void setPInitialData(VkObject pInitialData) {
        setPInitialData(getVkAddress(), pInitialData != null ? pInitialData.getVkAddress() : VkPointer.NULL);
        this.pInitialData = pInitialData;
    }

    private static native long getPInitialData(long address);
    private static native void setPInitialData(long address, long pInitialData);


    public static native long sizeof();

    public static class Array extends VkValidationCacheCreateInfoEXT implements cz.mg.collections.array.ReadonlyArray<VkValidationCacheCreateInfoEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkValidationCacheCreateInfoEXT.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_VALIDATION_CACHE_CREATE_INFO_EXT));;
        }

        public Array(int count, VkValidationCacheCreateInfoEXT o){
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
        public VkValidationCacheCreateInfoEXT get(int i){
            return new VkValidationCacheCreateInfoEXT(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkValidationCacheCreateInfoEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VkValidationCacheCreateInfoEXT.Pointer> {
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

            public Array(VkValidationCacheCreateInfoEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkValidationCacheCreateInfoEXT.Pointer get(int i){
                return new VkValidationCacheCreateInfoEXT.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
