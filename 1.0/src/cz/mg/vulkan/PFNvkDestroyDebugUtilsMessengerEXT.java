package cz.mg.vulkan;

public class PFNvkDestroyDebugUtilsMessengerEXT extends VkFunctionPointer {
    public PFNvkDestroyDebugUtilsMessengerEXT() {
    }

    protected PFNvkDestroyDebugUtilsMessengerEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkDestroyDebugUtilsMessengerEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkDestroyDebugUtilsMessengerEXT(long value) {
        setValue(value);
    }

    public PFNvkDestroyDebugUtilsMessengerEXT(VkInstance instance) {
        super(instance, new VkString("vkDestroyDebugUtilsMessengerEXT"));
    }

    public void call(VkInstance instance, VkDebugUtilsMessengerEXT messenger, VkAllocationCallbacks pAllocator){
        callNative(getValue(), instance != null ? instance.getVkAddress() : VkPointer.getNullAddressNative(), messenger != null ? messenger.getVkAddress() : VkPointer.getNullAddressNative(), pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long instance, long messenger, long pAllocator);



}
