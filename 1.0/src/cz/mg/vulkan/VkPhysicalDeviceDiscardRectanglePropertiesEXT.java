package cz.mg.vulkan;

public class VkPhysicalDeviceDiscardRectanglePropertiesEXT extends VkObject {
    public VkPhysicalDeviceDiscardRectanglePropertiesEXT() {
        super(sizeof());
    }

    protected VkPhysicalDeviceDiscardRectanglePropertiesEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkPhysicalDeviceDiscardRectanglePropertiesEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPhysicalDeviceDiscardRectanglePropertiesEXT(VkPointer pointer) {
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

    public VkUInt32 getMaxDiscardRectangles() {
        return new VkUInt32(getVkMemory(), getMaxDiscardRectangles(getVkAddress()));
    }

    
    public void setMaxDiscardRectangles(VkUInt32 maxDiscardRectangles) {
        setMaxDiscardRectangles(getVkAddress(), maxDiscardRectangles != null ? maxDiscardRectangles.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxDiscardRectanglesQ() {
        return getMaxDiscardRectangles().getValue();
    }

    public void setMaxDiscardRectangles(int maxDiscardRectangles) {
        getMaxDiscardRectangles().setValue(maxDiscardRectangles);
    }

    protected static native long getMaxDiscardRectangles(long address);
    protected static native void setMaxDiscardRectangles(long address, long maxDiscardRectangles);


    public static native long sizeof();

    public static class Array extends VkPhysicalDeviceDiscardRectanglePropertiesEXT implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceDiscardRectanglePropertiesEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceDiscardRectanglePropertiesEXT.sizeof()));
            this.count = count;
        }

        public Array(VkPhysicalDeviceDiscardRectanglePropertiesEXT o, int count){
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
        public VkPhysicalDeviceDiscardRectanglePropertiesEXT get(int i){
            return new VkPhysicalDeviceDiscardRectanglePropertiesEXT(getVkMemory(), addressAt(i));
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
