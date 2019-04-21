package cz.mg.vulkan;

public class VkMemoryRequirements2KHR extends VkObject {
    public VkMemoryRequirements2KHR() {
        super(sizeof());
    }

    public VkMemoryRequirements2KHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkMemoryRequirements2KHR(VkMemory vkmemory, long vkaddress) {
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

    public VkMemoryRequirements getMemoryRequirements() {
        return new VkMemoryRequirements(getVkMemory(), getMemoryRequirements(getVkAddress()));
    }

    
    public void setMemoryRequirements(VkMemoryRequirements memoryRequirements) {
        setMemoryRequirements(getVkAddress(), memoryRequirements != null ? memoryRequirements.getVkAddress() : VkPointer.getNullAddress());
        
    }

    private static native long getMemoryRequirements(long address);
    private static native void setMemoryRequirements(long address, long memoryRequirements);


    public static native long sizeof();

    public static class Array extends VkMemoryRequirements2KHR implements cz.mg.collections.array.ReadonlyArray<VkMemoryRequirements2KHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkMemoryRequirements2KHR.sizeof()));
            this.count = count;
        }

        public Array(int count, VkMemoryRequirements2KHR o){
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
        public VkMemoryRequirements2KHR get(int i){
            return new VkMemoryRequirements2KHR(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkMemoryRequirements2KHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VkMemoryRequirements2KHR.Pointer> {
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

            public Array(VkMemoryRequirements2KHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkMemoryRequirements2KHR.Pointer get(int i){
                return new VkMemoryRequirements2KHR.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
