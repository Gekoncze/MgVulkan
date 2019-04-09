package cz.mg.vulkan;

public class VkMemoryRequirements2 extends VkObject {
    public VkMemoryRequirements2() {
        super(sizeof());
    }

    public VkMemoryRequirements2(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkMemoryRequirements2(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkMemoryRequirements2(VkStructureType sType, VkObject pNext, VkMemoryRequirements memoryRequirements) {
        super(sizeof());
        setSType(sType);
        setPNext(pNext);
        setMemoryRequirements(memoryRequirements);
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

    public VkMemoryRequirements getMemoryRequirements() {
        return new VkMemoryRequirements(getVkMemory(), getMemoryRequirements(getVkAddress()));
    }

    
    public void setMemoryRequirements(VkMemoryRequirements memoryRequirements) {
        setMemoryRequirements(getVkAddress(), memoryRequirements != null ? memoryRequirements.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getMemoryRequirements(long address);
    private static native void setMemoryRequirements(long address, long memoryRequirements);


    public static native long sizeof();

    public static class Array extends VkMemoryRequirements2 implements cz.mg.collections.array.ReadonlyArray<VkMemoryRequirements2> {        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkMemoryRequirements2.sizeof()));
            this.count = count;
        }

        public Array(int count, VkMemoryRequirements2 o){
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
        public VkMemoryRequirements2 get(int i){
            return new VkMemoryRequirements2(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkMemoryRequirements2.Pointer implements cz.mg.collections.array.ReadonlyArray<VkMemoryRequirements2.Pointer> {
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

            public Array(VkMemoryRequirements2[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkMemoryRequirements2.Pointer get(int i){
                return new VkMemoryRequirements2.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }

}
