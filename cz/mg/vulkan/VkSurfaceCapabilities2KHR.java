package cz.mg.vulkan;

public class VkSurfaceCapabilities2KHR extends VkObject {
    public VkSurfaceCapabilities2KHR() {
        super(sizeof());
    }

    public VkSurfaceCapabilities2KHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSurfaceCapabilities2KHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkSurfaceCapabilities2KHR(VkStructureType sType, VkObject pNext, VkSurfaceCapabilitiesKHR surfaceCapabilities) {
        super(sizeof());
        setSType(sType);
        setPNext(pNext);
        setSurfaceCapabilities(surfaceCapabilities);
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

    public VkSurfaceCapabilitiesKHR getSurfaceCapabilities() {
        return new VkSurfaceCapabilitiesKHR(getVkMemory(), getSurfaceCapabilities(getVkAddress()));
    }

    
    public void setSurfaceCapabilities(VkSurfaceCapabilitiesKHR surfaceCapabilities) {
        setSurfaceCapabilities(getVkAddress(), surfaceCapabilities != null ? surfaceCapabilities.getVkAddress() : VkPointer.getNullAddress());
        
    }

    private static native long getSurfaceCapabilities(long address);
    private static native void setSurfaceCapabilities(long address, long surfaceCapabilities);


    public static native long sizeof();

    public static class Array extends VkSurfaceCapabilities2KHR implements cz.mg.collections.array.ReadonlyArray<VkSurfaceCapabilities2KHR> {        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSurfaceCapabilities2KHR.sizeof()));
            this.count = count;
        }

        public Array(int count, VkSurfaceCapabilities2KHR o){
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
        public VkSurfaceCapabilities2KHR get(int i){
            return new VkSurfaceCapabilities2KHR(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkSurfaceCapabilities2KHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VkSurfaceCapabilities2KHR.Pointer> {
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

            public Array(VkSurfaceCapabilities2KHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkSurfaceCapabilities2KHR.Pointer get(int i){
                return new VkSurfaceCapabilities2KHR.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }

}
