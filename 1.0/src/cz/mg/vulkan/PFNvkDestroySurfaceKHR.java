package cz.mg.vulkan;

public class PFNvkDestroySurfaceKHR extends VkFunctionPointer {
    public PFNvkDestroySurfaceKHR() {
    }

    public PFNvkDestroySurfaceKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkDestroySurfaceKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkDestroySurfaceKHR(long value) {
        setValue(value);
    }

    public PFNvkDestroySurfaceKHR(VkInstance instance) {
        super(instance, new VkString("vkDestroySurfaceKHR"));
    }

    public void call(VkInstance instance, VkSurfaceKHR surface, VkAllocationCallbacks pAllocator){
        call(getValue(), instance != null ? instance.getVkAddress() : VkPointer.getNullAddressNative(), surface != null ? surface.getVkAddress() : VkPointer.getNullAddressNative(), pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    protected static native void call(long vkaddress, long instance, long surface, long pAllocator);
}
