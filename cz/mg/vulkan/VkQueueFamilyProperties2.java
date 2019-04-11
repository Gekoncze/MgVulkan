package cz.mg.vulkan;

public class VkQueueFamilyProperties2 extends VkObject {
    public VkQueueFamilyProperties2() {
        super(sizeof());
    }

    public VkQueueFamilyProperties2(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkQueueFamilyProperties2(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkQueueFamilyProperties2(VkStructureType sType, VkObject pNext, VkQueueFamilyProperties queueFamilyProperties) {
        super(sizeof());
        setSType(sType);
        setPNext(pNext);
        setQueueFamilyProperties(queueFamilyProperties);
    }

    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddress());
        
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

    public VkQueueFamilyProperties getQueueFamilyProperties() {
        return new VkQueueFamilyProperties(getVkMemory(), getQueueFamilyProperties(getVkAddress()));
    }

    
    public void setQueueFamilyProperties(VkQueueFamilyProperties queueFamilyProperties) {
        setQueueFamilyProperties(getVkAddress(), queueFamilyProperties != null ? queueFamilyProperties.getVkAddress() : VkPointer.getNullAddress());
        
    }

    private static native long getQueueFamilyProperties(long address);
    private static native void setQueueFamilyProperties(long address, long queueFamilyProperties);


    public static native long sizeof();

    public static class Array extends VkQueueFamilyProperties2 implements cz.mg.collections.array.ReadonlyArray<VkQueueFamilyProperties2> {        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkQueueFamilyProperties2.sizeof()));
            this.count = count;
        }

        public Array(int count, VkQueueFamilyProperties2 o){
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
        public VkQueueFamilyProperties2 get(int i){
            return new VkQueueFamilyProperties2(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkQueueFamilyProperties2.Pointer implements cz.mg.collections.array.ReadonlyArray<VkQueueFamilyProperties2.Pointer> {
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

            public Array(VkQueueFamilyProperties2[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkQueueFamilyProperties2.Pointer get(int i){
                return new VkQueueFamilyProperties2.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }

}
