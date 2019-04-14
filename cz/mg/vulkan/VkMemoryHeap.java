package cz.mg.vulkan;

public class VkMemoryHeap extends VkObject {
    public VkMemoryHeap() {
        super(sizeof());
    }

    public VkMemoryHeap(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkMemoryHeap(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkDeviceSize getSize() {
        return new VkDeviceSize(getVkMemory(), getSize(getVkAddress()));
    }

    
    public void setSize(VkDeviceSize size) {
        setSize(getVkAddress(), size != null ? size.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getSize(long address);
    private static native void setSize(long address, long size);

    public VkMemoryHeapFlags getFlags() {
        return new VkMemoryHeapFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkMemoryHeapFlags flags) {
        setFlags(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getFlags(long address);
    private static native void setFlags(long address, long flags);


    public static native long sizeof();

    public static class Array extends VkMemoryHeap implements cz.mg.collections.array.ReadonlyArray<VkMemoryHeap> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkMemoryHeap.sizeof()));
            this.count = count;
        }

        public Array(int count, VkMemoryHeap o){
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
        public VkMemoryHeap get(int i){
            return new VkMemoryHeap(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkMemoryHeap.Pointer implements cz.mg.collections.array.ReadonlyArray<VkMemoryHeap.Pointer> {
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

            public Array(VkMemoryHeap[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkMemoryHeap.Pointer get(int i){
                return new VkMemoryHeap.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
