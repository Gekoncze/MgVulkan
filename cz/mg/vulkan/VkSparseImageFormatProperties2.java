package cz.mg.vulkan;

public class VkSparseImageFormatProperties2 extends VkObject {
    public VkSparseImageFormatProperties2() {
        super(sizeof());
    }

    public VkSparseImageFormatProperties2(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSparseImageFormatProperties2(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkSparseImageFormatProperties2(VkStructureType sType, VkObject pNext, VkSparseImageFormatProperties properties) {
        super(sizeof());
        setSType(sType);
        setPNext(pNext);
        setProperties(properties);
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

    public VkSparseImageFormatProperties getProperties() {
        return new VkSparseImageFormatProperties(getVkMemory(), getProperties(getVkAddress()));
    }

    
    public void setProperties(VkSparseImageFormatProperties properties) {
        setProperties(getVkAddress(), properties != null ? properties.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getProperties(long address);
    private static native void setProperties(long address, long properties);


    public static native long sizeof();

    public static class Array extends VkSparseImageFormatProperties2 implements cz.mg.collections.array.ReadonlyArray<VkSparseImageFormatProperties2> {        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSparseImageFormatProperties2.sizeof()));
            this.count = count;
        }

        public Array(int count, VkSparseImageFormatProperties2 o){
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
        public VkSparseImageFormatProperties2 get(int i){
            return new VkSparseImageFormatProperties2(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }


    public static class Pointer extends VkObject.Pointer {        public Pointer() {
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

        public static class Array extends VkSparseImageFormatProperties2.Pointer implements cz.mg.collections.array.ReadonlyArray<VkSparseImageFormatProperties2.Pointer> {
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

            public Array(VkSparseImageFormatProperties2[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkSparseImageFormatProperties2.Pointer get(int i){
                return new VkSparseImageFormatProperties2.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }

}
