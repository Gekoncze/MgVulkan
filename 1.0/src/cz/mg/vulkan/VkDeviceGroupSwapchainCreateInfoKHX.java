package cz.mg.vulkan;

public class VkDeviceGroupSwapchainCreateInfoKHX extends VkObject {
    public VkDeviceGroupSwapchainCreateInfoKHX() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEVICE_GROUP_SWAPCHAIN_CREATE_INFO_KHX));
    }

    public VkDeviceGroupSwapchainCreateInfoKHX(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDeviceGroupSwapchainCreateInfoKHX(VkMemory vkmemory, long vkaddress) {
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

    public VkDeviceGroupPresentModeFlagsKHX getModes() {
        return new VkDeviceGroupPresentModeFlagsKHX(getVkMemory(), getModes(getVkAddress()));
    }

    
    public void setModes(VkDeviceGroupPresentModeFlagsKHX modes) {
        setModes(getVkAddress(), modes != null ? modes.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getModesQ() {
        return getModes().getValue();
    }

    public void setModes(int modes) {
        getModes().setValue(modes);
    }

    private static native long getModes(long address);
    private static native void setModes(long address, long modes);


    public static native long sizeof();

    public static class Array extends VkDeviceGroupSwapchainCreateInfoKHX implements cz.mg.collections.array.ReadonlyArray<VkDeviceGroupSwapchainCreateInfoKHX> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDeviceGroupSwapchainCreateInfoKHX.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDeviceGroupSwapchainCreateInfoKHX o){
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
        public VkDeviceGroupSwapchainCreateInfoKHX get(int i){
            return new VkDeviceGroupSwapchainCreateInfoKHX(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkDeviceGroupSwapchainCreateInfoKHX.Pointer implements cz.mg.collections.array.ReadonlyArray<VkDeviceGroupSwapchainCreateInfoKHX.Pointer> {
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

            public Array(VkDeviceGroupSwapchainCreateInfoKHX[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkDeviceGroupSwapchainCreateInfoKHX.Pointer get(int i){
                return new VkDeviceGroupSwapchainCreateInfoKHX.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
