package cz.mg.vulkan;

public class VkMemoryFdPropertiesKHR extends VkObject {
    public VkMemoryFdPropertiesKHR() {
        super(sizeof());
    }

    public VkMemoryFdPropertiesKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkMemoryFdPropertiesKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
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

    public VkUInt32 getMemoryTypeBits() {
        return new VkUInt32(getVkMemory(), getMemoryTypeBits(getVkAddress()));
    }

    
    public void setMemoryTypeBits(VkUInt32 memoryTypeBits) {
        setMemoryTypeBits(getVkAddress(), memoryTypeBits != null ? memoryTypeBits.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getMemoryTypeBits(long address);
    private static native void setMemoryTypeBits(long address, long memoryTypeBits);


    public static native long sizeof();

    public static class Array extends VkMemoryFdPropertiesKHR implements cz.mg.collections.array.ReadonlyArray<VkMemoryFdPropertiesKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkMemoryFdPropertiesKHR.sizeof()));
            this.count = count;
        }

        public Array(int count, VkMemoryFdPropertiesKHR o){
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
        public VkMemoryFdPropertiesKHR get(int i){
            return new VkMemoryFdPropertiesKHR(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkMemoryFdPropertiesKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VkMemoryFdPropertiesKHR.Pointer> {
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

            public Array(VkMemoryFdPropertiesKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkMemoryFdPropertiesKHR.Pointer get(int i){
                return new VkMemoryFdPropertiesKHR.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
