package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSharedPresentSurfaceCapabilitiesKHR.html">khronos documentation</a>
 **/
public class VkSharedPresentSurfaceCapabilitiesKHR extends VkObject {
    public VkSharedPresentSurfaceCapabilitiesKHR() {
        super(sizeof());
    }

    public VkSharedPresentSurfaceCapabilitiesKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSharedPresentSurfaceCapabilitiesKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkSharedPresentSurfaceCapabilitiesKHR(VkStructureType sType, VkObject pNext, VkImageUsageFlags sharedPresentSupportedUsageFlags) {
        super(sizeof());
        setSType(sType);
        setPNext(pNext);
        setSharedPresentSupportedUsageFlags(sharedPresentSupportedUsageFlags);
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

    public VkImageUsageFlags getSharedPresentSupportedUsageFlags() {
        return new VkImageUsageFlags(getVkMemory(), getSharedPresentSupportedUsageFlags(getVkAddress()));
    }

    
    public void setSharedPresentSupportedUsageFlags(VkImageUsageFlags sharedPresentSupportedUsageFlags) {
        setSharedPresentSupportedUsageFlags(getVkAddress(), sharedPresentSupportedUsageFlags != null ? sharedPresentSupportedUsageFlags.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getSharedPresentSupportedUsageFlags(long address);
    private static native void setSharedPresentSupportedUsageFlags(long address, long sharedPresentSupportedUsageFlags);


    public static native long sizeof();

    public static class Array extends VkSharedPresentSurfaceCapabilitiesKHR implements cz.mg.collections.array.ReadonlyArray<VkSharedPresentSurfaceCapabilitiesKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSharedPresentSurfaceCapabilitiesKHR.sizeof()));
            this.count = count;
        }

        public Array(int count, VkSharedPresentSurfaceCapabilitiesKHR o){
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
        public VkSharedPresentSurfaceCapabilitiesKHR get(int i){
            return new VkSharedPresentSurfaceCapabilitiesKHR(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkSharedPresentSurfaceCapabilitiesKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VkSharedPresentSurfaceCapabilitiesKHR.Pointer> {
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

            public Array(VkSharedPresentSurfaceCapabilitiesKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkSharedPresentSurfaceCapabilitiesKHR.Pointer get(int i){
                return new VkSharedPresentSurfaceCapabilitiesKHR.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
