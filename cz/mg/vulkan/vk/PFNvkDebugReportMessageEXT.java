package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkDebugReportMessageEXT.html">khronos documentation</a>
 **/
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
        call(getValue(), instance != null ? instance.getVkAddress() : VkPointer.NULL_ADDRESS, flags != null ? flags.getVkAddress() : VkPointer.NULL_ADDRESS, objectType != null ? objectType.getVkAddress() : VkPointer.NULL_ADDRESS, object != null ? object.getVkAddress() : VkPointer.NULL_ADDRESS, location != null ? location.getVkAddress() : VkPointer.NULL_ADDRESS, messageCode != null ? messageCode.getVkAddress() : VkPointer.NULL_ADDRESS, pLayerPrefix != null ? pLayerPrefix.getVkAddress() : VkPointer.NULL, pMessage != null ? pMessage.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long instance, long flags, long objectType, long object, long location, long messageCode, long pLayerPrefix, long pMessage);
}
