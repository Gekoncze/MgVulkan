package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDeviceGroupSwapchainCreateInfoKHR.html">khronos documentation</a>
 **/
public class VkDeviceGroupSwapchainCreateInfoKHR extends VkObject {
    public VkDeviceGroupSwapchainCreateInfoKHR() {
        super(sizeof());
    }

    public VkDeviceGroupSwapchainCreateInfoKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDeviceGroupSwapchainCreateInfoKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkDeviceGroupSwapchainCreateInfoKHR(VkObject pNext, VkDeviceGroupPresentModeFlagsKHR modes) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEVICE_GROUP_SWAPCHAIN_CREATE_INFO_KHR));
        setPNext(pNext);
        setModes(modes);
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

    public VkDeviceGroupPresentModeFlagsKHR getModes() {
        return new VkDeviceGroupPresentModeFlagsKHR(getVkMemory(), getModes(getVkAddress()));
    }

    
    public void setModes(VkDeviceGroupPresentModeFlagsKHR modes) {
        setModes(getVkAddress(), modes != null ? modes.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getModes(long address);
    private static native void setModes(long address, long modes);


    public static native long sizeof();

    public static class Array extends VkDeviceGroupSwapchainCreateInfoKHR implements cz.mg.collections.array.ReadonlyArray<VkDeviceGroupSwapchainCreateInfoKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDeviceGroupSwapchainCreateInfoKHR.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDeviceGroupSwapchainCreateInfoKHR o){
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
        public VkDeviceGroupSwapchainCreateInfoKHR get(int i){
            return new VkDeviceGroupSwapchainCreateInfoKHR(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkDeviceGroupSwapchainCreateInfoKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
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

            public Array(VkDeviceGroupSwapchainCreateInfoKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public Pointer get(int i){
                return new Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
