package cz.mg.vulkan;

public class PFNvkDebugReportMessageEXT extends VkFunctionPointer {
    public PFNvkDebugReportMessageEXT() {
    }

    protected PFNvkDebugReportMessageEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkDebugReportMessageEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkDebugReportMessageEXT(long value) {
        setValue(value);
    }

    public PFNvkDebugReportMessageEXT(VkInstance instance) {
        super(instance, new VkString("vkDebugReportMessageEXT"));
    }

    public void call(VkInstance instance, int flags, int objectType, long object, long location, int messageCode, VkChar pLayerPrefix, VkChar pMessage){
        callNative(getValue(), instance != null ? instance.getVkAddress() : VkPointer.getNullAddressNative(), flags, objectType, object, location, messageCode, pLayerPrefix != null ? pLayerPrefix.getVkAddress() : VkPointer.NULL, pMessage != null ? pMessage.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long instance, int flags, int objectType, long object, long location, int messageCode, long pLayerPrefix, long pMessage);

}
