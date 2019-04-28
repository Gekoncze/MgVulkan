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

    public PFNvkDebugUtilsMessengerCallbackEXT(VkInstance instance) {
        super(instance, new VkString("vkDebugUtilsMessengerCallbackEXT"));
    }

    public int call(int messageSeverity, int messageType, VkDebugUtilsMessengerCallbackDataEXT pCallbackData, VkObject pUserData){
        return callNative(getValue(), messageSeverity, messageType, pCallbackData != null ? pCallbackData.getVkAddress() : VkPointer.NULL, pUserData != null ? pUserData.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callNative(long vkaddress, int messageSeverity, int messageType, long pCallbackData, long pUserData);

}
