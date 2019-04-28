package cz.mg.vulkan;

public class PFNvkDebugReportCallbackEXT extends VkFunctionPointer {
    public PFNvkDebugReportCallbackEXT() {
    }

    protected PFNvkDebugReportCallbackEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkDebugReportCallbackEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkDebugReportCallbackEXT(long value) {
        setValue(value);
    }

    public PFNvkDebugReportCallbackEXT(VkInstance instance) {
        super(instance, new VkString("vkDebugReportCallbackEXT"));
    }

    public int call(int flags, int objectType, long object, long location, int messageCode, VkChar pLayerPrefix, VkChar pMessage, VkObject pUserData){
        return callNative(getValue(), flags, objectType, object, location, messageCode, pLayerPrefix != null ? pLayerPrefix.getVkAddress() : VkPointer.NULL, pMessage != null ? pMessage.getVkAddress() : VkPointer.NULL, pUserData != null ? pUserData.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callNative(long vkaddress, int flags, int objectType, long object, long location, int messageCode, long pLayerPrefix, long pMessage, long pUserData);

}
