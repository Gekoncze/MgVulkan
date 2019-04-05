package cz.mg.vulkan.vk;

public class PFNvkDestroyDebugUtilsMessengerEXT extends VkFunctionPointer {
    public PFNvkDestroyDebugUtilsMessengerEXT() {
    }

    public PFNvkDestroyDebugUtilsMessengerEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkDestroyDebugUtilsMessengerEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkDestroyDebugUtilsMessengerEXT(long value) {
        setValue(value);
    }

    public PFNvkDestroyDebugUtilsMessengerEXT(VkInstance instance) {
        super(instance, new VkString("vkDestroyDebugUtilsMessengerEXT"));
    }

    public void call(VkInstance instance, VkDebugUtilsMessengerEXT messenger, VkAllocationCallbacks pAllocator){
        call(getValue(), instance != null ? instance.getVkAddress() : VkPointer.NULL_ADDRESS, messenger != null ? messenger.getVkAddress() : VkPointer.NULL_ADDRESS, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long instance, long messenger, long pAllocator);
}
