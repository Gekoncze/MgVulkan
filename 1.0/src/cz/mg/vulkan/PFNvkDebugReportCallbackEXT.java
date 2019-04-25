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

    public void call(VkDebugReportFlagsEXT flags, VkDebugReportObjectTypeEXT objectType, VkUInt64 object, VkSize location, VkInt32 messageCode, VkChar pLayerPrefix, VkChar pMessage, VkObject pUserData, VkBool32 rval){
        call(getValue(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddressNative(), objectType != null ? objectType.getVkAddress() : VkPointer.getNullAddressNative(), object != null ? object.getVkAddress() : VkPointer.getNullAddressNative(), location != null ? location.getVkAddress() : VkPointer.getNullAddressNative(), messageCode != null ? messageCode.getVkAddress() : VkPointer.getNullAddressNative(), pLayerPrefix != null ? pLayerPrefix.getVkAddress() : VkPointer.NULL, pMessage != null ? pMessage.getVkAddress() : VkPointer.NULL, pUserData != null ? pUserData.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void call(long vkaddress, long flags, long objectType, long object, long location, long messageCode, long pLayerPrefix, long pMessage, long pUserData, long rval);
}
