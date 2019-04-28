package cz.mg.vulkan;

public class PFNvkSubmitDebugUtilsMessageEXT extends VkFunctionPointer {
    public PFNvkSubmitDebugUtilsMessageEXT() {
    }

    protected PFNvkSubmitDebugUtilsMessageEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkSubmitDebugUtilsMessageEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkSubmitDebugUtilsMessageEXT(long value) {
        setValue(value);
    }

    public PFNvkSubmitDebugUtilsMessageEXT(VkInstance instance) {
        super(instance, new VkString("vkSubmitDebugUtilsMessageEXT"));
    }

    public void call(VkInstance instance, int messageSeverity, int messageTypes, VkDebugUtilsMessengerCallbackDataEXT pCallbackData){
        callNative(getValue(), instance != null ? instance.getVkAddress() : VkPointer.getNullAddressNative(), messageSeverity, messageTypes, pCallbackData != null ? pCallbackData.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long instance, int messageSeverity, int messageTypes, long pCallbackData);

}
