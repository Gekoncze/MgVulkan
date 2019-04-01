package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkSubmitDebugUtilsMessageEXT.html">khronos documentation</a>
 **/
public class PFNvkSubmitDebugUtilsMessageEXT extends VkFunctionPointer {
    public PFNvkSubmitDebugUtilsMessageEXT() {
    }

    public PFNvkSubmitDebugUtilsMessageEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkSubmitDebugUtilsMessageEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkSubmitDebugUtilsMessageEXT(long value) {
        setValue(value);
    }

    public PFNvkSubmitDebugUtilsMessageEXT(VkInstance instance) {
        super(instance, new VkString("vkSubmitDebugUtilsMessageEXT"));
    }

    public void call(VkInstance instance, VkDebugUtilsMessageSeverityFlagBitsEXT messageSeverity, VkDebugUtilsMessageTypeFlagsEXT messageTypes, VkDebugUtilsMessengerCallbackDataEXT pCallbackData){
        call(getValue(), instance != null ? instance.getVkAddress() : VkPointer.NULL_ADDRESS, messageSeverity != null ? messageSeverity.getVkAddress() : VkPointer.NULL_ADDRESS, messageTypes != null ? messageTypes.getVkAddress() : VkPointer.NULL_ADDRESS, pCallbackData != null ? pCallbackData.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long instance, long messageSeverity, long messageTypes, long pCallbackData);
}
