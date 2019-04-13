package cz.mg.vulkan;

public class VkPhysicalDeviceDiscardRectanglePropertiesEXT extends VkObject {
    public VkPhysicalDeviceDiscardRectanglePropertiesEXT() {
        super(sizeof());
    }

    public VkPhysicalDeviceDiscardRectanglePropertiesEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPhysicalDeviceDiscardRectanglePropertiesEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPhysicalDeviceDiscardRectanglePropertiesEXT(VkStructureType sType, VkObject pNext, VkUInt32 maxDiscardRectangles) {
        super(sizeof());
        setSType(sType);
        setPNext(pNext);
        setMaxDiscardRectangles(maxDiscardRectangles);
    }

    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getSinkAddress());
        
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

    public VkUInt32 getMaxDiscardRectangles() {
        return new VkUInt32(getVkMemory(), getMaxDiscardRectangles(getVkAddress()));
    }

    
    public void setMaxDiscardRectangles(VkUInt32 maxDiscardRectangles) {
        setMaxDiscardRectangles(getVkAddress(), maxDiscardRectangles != null ? maxDiscardRectangles.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getMaxDiscardRectangles(long address);
    private static native void setMaxDiscardRectangles(long address, long maxDiscardRectangles);


    public static native long sizeof();

    public static class Array extends VkPhysicalDeviceDiscardRectanglePropertiesEXT implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceDiscardRectanglePropertiesEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceDiscardRectanglePropertiesEXT.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPhysicalDeviceDiscardRectanglePropertiesEXT o){
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
        public VkPhysicalDeviceDiscardRectanglePropertiesEXT get(int i){
            return new VkPhysicalDeviceDiscardRectanglePropertiesEXT(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkPhysicalDeviceDiscardRectanglePropertiesEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceDiscardRectanglePropertiesEXT.Pointer> {
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

            public Array(VkPhysicalDeviceDiscardRectanglePropertiesEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkPhysicalDeviceDiscardRectanglePropertiesEXT.Pointer get(int i){
                return new VkPhysicalDeviceDiscardRectanglePropertiesEXT.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
