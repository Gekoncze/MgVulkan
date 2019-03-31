package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkSetDebugUtilsObjectTagEXT.html">khronos documentation</a>
 **/
public class PFNvkSetDebugUtilsObjectTagEXT extends VkFunctionPointer {
    public PFNvkSetDebugUtilsObjectTagEXT() {
    }

    public PFNvkSetDebugUtilsObjectTagEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkSetDebugUtilsObjectTagEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkSetDebugUtilsObjectTagEXT(long value) {
        setValue(value);
    }

    public PFNvkSetDebugUtilsObjectTagEXT(VkInstance instance) {
        super(instance, new VkString("vkSetDebugUtilsObjectTagEXT"));
    }

    public void call(VkDevice device, VkDebugUtilsObjectTagInfoEXT pTagInfo, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkDevice.NULL.getVkAddress(), pTagInfo != null ? pTagInfo.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long pTagInfo, long rval);
}
