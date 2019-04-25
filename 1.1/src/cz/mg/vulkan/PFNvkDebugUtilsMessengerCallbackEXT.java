package cz.mg.vulkan;

public class PFNvkDebugUtilsMessengerCallbackEXT extends VkFunctionPointer {
    public PFNvkDebugUtilsMessengerCallbackEXT() {
    }

    protected PFNvkDebugUtilsMessengerCallbackEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkDebugUtilsMessengerCallbackEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public PFNvkDebugUtilsMessengerCallbackEXT(long value) {
        setValue(value);
    }

    public void call(VkDebugUtilsMessageSeverityFlagBitsEXT messageSeverity, VkDebugUtilsMessageTypeFlagsEXT messageType, VkDebugUtilsMessengerCallbackDataEXT pCallbackData, VkObject pUserData, VkBool32 rval){
        call(getValue(), messageSeverity != null ? messageSeverity.getVkAddress() : VkPointer.getNullAddressNative(), messageType != null ? messageType.getVkAddress() : VkPointer.getNullAddressNative(), pCallbackData != null ? pCallbackData.getVkAddress() : VkPointer.NULL, pUserData != null ? pUserData.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void call(long vkaddress, long messageSeverity, long messageType, long pCallbackData, long pUserData, long rval);
}
