package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSurfaceCapabilitiesKHR.html">khronos documentation</a>
 **/
public class VkSurfaceCapabilitiesKHR extends VkObject {
    public VkSurfaceCapabilitiesKHR() {
        super(sizeof());
    }

    public VkSurfaceCapabilitiesKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSurfaceCapabilitiesKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkSurfaceCapabilitiesKHR(VkUInt32 minImageCount, VkUInt32 maxImageCount, VkExtent2D currentExtent, VkExtent2D minImageExtent, VkExtent2D maxImageExtent, VkUInt32 maxImageArrayLayers, VkSurfaceTransformFlagsKHR supportedTransforms, VkSurfaceTransformFlagBitsKHR currentTransform, VkCompositeAlphaFlagsKHR supportedCompositeAlpha, VkImageUsageFlags supportedUsageFlags) {
        super(sizeof());
        setMinImageCount(minImageCount);
        setMaxImageCount(maxImageCount);
        setCurrentExtent(currentExtent);
        setMinImageExtent(minImageExtent);
        setMaxImageExtent(maxImageExtent);
        setMaxImageArrayLayers(maxImageArrayLayers);
        setSupportedTransforms(supportedTransforms);
        setCurrentTransform(currentTransform);
        setSupportedCompositeAlpha(supportedCompositeAlpha);
        setSupportedUsageFlags(supportedUsageFlags);
    }

    public VkUInt32 getMinImageCount() {
        return new VkUInt32(getVkMemory(), getMinImageCount(getVkAddress()));
    }

    
    public void setMinImageCount(VkUInt32 minImageCount) {
        setMinImageCount(getVkAddress(), minImageCount != null ? minImageCount.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getMinImageCount(long address);
    private static native void setMinImageCount(long address, long minImageCount);

    public VkUInt32 getMaxImageCount() {
        return new VkUInt32(getVkMemory(), getMaxImageCount(getVkAddress()));
    }

    
    public void setMaxImageCount(VkUInt32 maxImageCount) {
        setMaxImageCount(getVkAddress(), maxImageCount != null ? maxImageCount.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getMaxImageCount(long address);
    private static native void setMaxImageCount(long address, long maxImageCount);

    public VkExtent2D getCurrentExtent() {
        return new VkExtent2D(getVkMemory(), getCurrentExtent(getVkAddress()));
    }

    
    public void setCurrentExtent(VkExtent2D currentExtent) {
        setCurrentExtent(getVkAddress(), currentExtent != null ? currentExtent.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getCurrentExtent(long address);
    private static native void setCurrentExtent(long address, long currentExtent);

    public VkExtent2D getMinImageExtent() {
        return new VkExtent2D(getVkMemory(), getMinImageExtent(getVkAddress()));
    }

    
    public void setMinImageExtent(VkExtent2D minImageExtent) {
        setMinImageExtent(getVkAddress(), minImageExtent != null ? minImageExtent.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getMinImageExtent(long address);
    private static native void setMinImageExtent(long address, long minImageExtent);

    public VkExtent2D getMaxImageExtent() {
        return new VkExtent2D(getVkMemory(), getMaxImageExtent(getVkAddress()));
    }

    
    public void setMaxImageExtent(VkExtent2D maxImageExtent) {
        setMaxImageExtent(getVkAddress(), maxImageExtent != null ? maxImageExtent.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getMaxImageExtent(long address);
    private static native void setMaxImageExtent(long address, long maxImageExtent);

    public VkUInt32 getMaxImageArrayLayers() {
        return new VkUInt32(getVkMemory(), getMaxImageArrayLayers(getVkAddress()));
    }

    
    public void setMaxImageArrayLayers(VkUInt32 maxImageArrayLayers) {
        setMaxImageArrayLayers(getVkAddress(), maxImageArrayLayers != null ? maxImageArrayLayers.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getMaxImageArrayLayers(long address);
    private static native void setMaxImageArrayLayers(long address, long maxImageArrayLayers);

    public VkSurfaceTransformFlagsKHR getSupportedTransforms() {
        return new VkSurfaceTransformFlagsKHR(getVkMemory(), getSupportedTransforms(getVkAddress()));
    }

    
    public void setSupportedTransforms(VkSurfaceTransformFlagsKHR supportedTransforms) {
        setSupportedTransforms(getVkAddress(), supportedTransforms != null ? supportedTransforms.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getSupportedTransforms(long address);
    private static native void setSupportedTransforms(long address, long supportedTransforms);

    public VkSurfaceTransformFlagBitsKHR getCurrentTransform() {
        return new VkSurfaceTransformFlagBitsKHR(getVkMemory(), getCurrentTransform(getVkAddress()));
    }

    
    public void setCurrentTransform(VkSurfaceTransformFlagBitsKHR currentTransform) {
        setCurrentTransform(getVkAddress(), currentTransform != null ? currentTransform.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getCurrentTransform(long address);
    private static native void setCurrentTransform(long address, long currentTransform);

    public VkCompositeAlphaFlagsKHR getSupportedCompositeAlpha() {
        return new VkCompositeAlphaFlagsKHR(getVkMemory(), getSupportedCompositeAlpha(getVkAddress()));
    }

    
    public void setSupportedCompositeAlpha(VkCompositeAlphaFlagsKHR supportedCompositeAlpha) {
        setSupportedCompositeAlpha(getVkAddress(), supportedCompositeAlpha != null ? supportedCompositeAlpha.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getSupportedCompositeAlpha(long address);
    private static native void setSupportedCompositeAlpha(long address, long supportedCompositeAlpha);

    public VkImageUsageFlags getSupportedUsageFlags() {
        return new VkImageUsageFlags(getVkMemory(), getSupportedUsageFlags(getVkAddress()));
    }

    
    public void setSupportedUsageFlags(VkImageUsageFlags supportedUsageFlags) {
        setSupportedUsageFlags(getVkAddress(), supportedUsageFlags != null ? supportedUsageFlags.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getSupportedUsageFlags(long address);
    private static native void setSupportedUsageFlags(long address, long supportedUsageFlags);


    public static native long sizeof();

    public static class Array extends VkSurfaceCapabilitiesKHR implements cz.mg.collections.array.ReadonlyArray<VkSurfaceCapabilitiesKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSurfaceCapabilitiesKHR.sizeof()));
            this.count = count;
        }

        public Array(int count, VkSurfaceCapabilitiesKHR o){
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
        public VkSurfaceCapabilitiesKHR get(int i){
            return new VkSurfaceCapabilitiesKHR(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkSurfaceCapabilitiesKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VkSurfaceCapabilitiesKHR.Pointer> {
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

            public Array(VkSurfaceCapabilitiesKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkSurfaceCapabilitiesKHR.Pointer get(int i){
                return new VkSurfaceCapabilitiesKHR.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
