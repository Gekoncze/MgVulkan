package cz.mg.vulkan;

public class PFNvkDestroySurfaceKHR extends VkFunctionPointer {
    public PFNvkDestroySurfaceKHR() {
    }

    protected PFNvkDestroySurfaceKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkDestroySurfaceKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkDestroySurfaceKHR(long value) {
        setValue(value);
    }

    public PFNvkDestroySurfaceKHR(VkInstance instance) {
        super(instance, new VkString("vkDestroySurfaceKHR"));
    }

    public void call(VkInstance instance, VkSurfaceKHR surface, VkAllocationCallbacks pAllocator){
        callNative(getValue(), instance != null ? instance.getVkAddress() : VkPointer.getNullAddressNative(), surface != null ? surface.getVkAddress() : VkPointer.getNullAddressNative(), pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long instance, long surface, long pAllocator);

}
