package cz.mg.vulkan;

public class PFNvkDebugReportMessageEXT extends VkFunctionPointer {
    public PFNvkDebugReportMessageEXT() {
    }

    public PFNvkDebugReportMessageEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkDebugReportMessageEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkDebugReportMessageEXT(long value) {
        setValue(value);
    }

    public PFNvkDebugReportMessageEXT(VkInstance instance) {
        super(instance, new VkString("vkDebugReportMessageEXT"));
    }

    public void call(VkInstance instance, VkDebugReportFlagsEXT flags, VkDebugReportObjectTypeEXT objectType, VkUInt64 object, VkSize location, VkInt32 messageCode, VkChar pLayerPrefix, VkChar pMessage){
        call(getValue(), instance != null ? instance.getVkAddress() : VkPointer.getNullAddressNative(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddressNative(), objectType != null ? objectType.getVkAddress() : VkPointer.getNullAddressNative(), object != null ? object.getVkAddress() : VkPointer.getNullAddressNative(), location != null ? location.getVkAddress() : VkPointer.getNullAddressNative(), messageCode != null ? messageCode.getVkAddress() : VkPointer.getNullAddressNative(), pLayerPrefix != null ? pLayerPrefix.getVkAddress() : VkPointer.NULL, pMessage != null ? pMessage.getVkAddress() : VkPointer.NULL);
    }

    protected static native void call(long vkaddress, long instance, long flags, long objectType, long object, long location, long messageCode, long pLayerPrefix, long pMessage);
}
