package cz.mg.vulkan;

public class VkPhysicalDeviceSurfaceInfo2KHR extends VkObject {
    public VkPhysicalDeviceSurfaceInfo2KHR() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SURFACE_INFO_2_KHR));
    }

    public VkPhysicalDeviceSurfaceInfo2KHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPhysicalDeviceSurfaceInfo2KHR(VkMemory vkmemory, long vkaddress) {
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

    public VkSurfaceKHR getSurface() {
        return new VkSurfaceKHR(getVkMemory(), getSurface(getVkAddress()));
    }

    
    public void setSurface(VkSurfaceKHR surface) {
        setSurface(getVkAddress(), surface != null ? surface.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getSurface(long address);
    private static native void setSurface(long address, long surface);


    public static native long sizeof();

    public static class Array extends VkPhysicalDeviceSurfaceInfo2KHR implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceSurfaceInfo2KHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceSurfaceInfo2KHR.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPhysicalDeviceSurfaceInfo2KHR o){
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
        public VkPhysicalDeviceSurfaceInfo2KHR get(int i){
            return new VkPhysicalDeviceSurfaceInfo2KHR(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkPhysicalDeviceSurfaceInfo2KHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceSurfaceInfo2KHR.Pointer> {
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

            public Array(VkPhysicalDeviceSurfaceInfo2KHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkPhysicalDeviceSurfaceInfo2KHR.Pointer get(int i){
                return new VkPhysicalDeviceSurfaceInfo2KHR.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
