package cz.mg.vulkan.vk;

public class PFNvkDebugReportCallbackEXT extends VkFunctionPointer {
    public PFNvkDebugReportCallbackEXT() {
    }

    public PFNvkDebugReportCallbackEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkDebugReportCallbackEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkDebugReportCallbackEXT(long value) {
        setValue(value);
    }

    public void call(VkDebugReportFlagsEXT flags, VkDebugReportObjectTypeEXT objectType, VkUInt64 object, VkSize location, VkInt32 messageCode, VkChar pLayerPrefix, VkChar pMessage, VkObject pUserData, VkBool32 rval){
        call(getValue(), flags != null ? flags.getVkAddress() : VkPointer.NULL_ADDRESS, objectType != null ? objectType.getVkAddress() : VkPointer.NULL_ADDRESS, object != null ? object.getVkAddress() : VkPointer.NULL_ADDRESS, location != null ? location.getVkAddress() : VkPointer.NULL_ADDRESS, messageCode != null ? messageCode.getVkAddress() : VkPointer.NULL_ADDRESS, pLayerPrefix != null ? pLayerPrefix.getVkAddress() : VkPointer.NULL, pMessage != null ? pMessage.getVkAddress() : VkPointer.NULL, pUserData != null ? pUserData.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long flags, long objectType, long object, long location, long messageCode, long pLayerPrefix, long pMessage, long pUserData, long rval);
}
