package cz.mg.vulkan;

public class VkPhysicalDeviceMultiviewProperties extends VkObject {
    public VkPhysicalDeviceMultiviewProperties() {
        super(sizeof());
    }

    public VkPhysicalDeviceMultiviewProperties(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPhysicalDeviceMultiviewProperties(VkMemory vkmemory, long vkaddress) {
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

    public VkUInt32 getMaxMultiviewViewCount() {
        return new VkUInt32(getVkMemory(), getMaxMultiviewViewCount(getVkAddress()));
    }

    
    public void setMaxMultiviewViewCount(VkUInt32 maxMultiviewViewCount) {
        setMaxMultiviewViewCount(getVkAddress(), maxMultiviewViewCount != null ? maxMultiviewViewCount.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getMaxMultiviewViewCountQ() {
        return getMaxMultiviewViewCount().getValue();
    }

    public void setMaxMultiviewViewCount(int maxMultiviewViewCount) {
        getMaxMultiviewViewCount().setValue(maxMultiviewViewCount);
    }

    private static native long getMaxMultiviewViewCount(long address);
    private static native void setMaxMultiviewViewCount(long address, long maxMultiviewViewCount);

    public VkUInt32 getMaxMultiviewInstanceIndex() {
        return new VkUInt32(getVkMemory(), getMaxMultiviewInstanceIndex(getVkAddress()));
    }

    
    public void setMaxMultiviewInstanceIndex(VkUInt32 maxMultiviewInstanceIndex) {
        setMaxMultiviewInstanceIndex(getVkAddress(), maxMultiviewInstanceIndex != null ? maxMultiviewInstanceIndex.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getMaxMultiviewInstanceIndexQ() {
        return getMaxMultiviewInstanceIndex().getValue();
    }

    public void setMaxMultiviewInstanceIndex(int maxMultiviewInstanceIndex) {
        getMaxMultiviewInstanceIndex().setValue(maxMultiviewInstanceIndex);
    }

    private static native long getMaxMultiviewInstanceIndex(long address);
    private static native void setMaxMultiviewInstanceIndex(long address, long maxMultiviewInstanceIndex);


    public static native long sizeof();

    public static class Array extends VkPhysicalDeviceMultiviewProperties implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceMultiviewProperties> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceMultiviewProperties.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPhysicalDeviceMultiviewProperties o){
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
        public VkPhysicalDeviceMultiviewProperties get(int i){
            return new VkPhysicalDeviceMultiviewProperties(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkPhysicalDeviceMultiviewProperties.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceMultiviewProperties.Pointer> {
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

            public Array(VkPhysicalDeviceMultiviewProperties[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkPhysicalDeviceMultiviewProperties.Pointer get(int i){
                return new VkPhysicalDeviceMultiviewProperties.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
