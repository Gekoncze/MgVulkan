package cz.mg.vulkan.vk;

public class PFNvkSetDebugUtilsObjectNameEXT extends VkFunctionPointer {
    public PFNvkSetDebugUtilsObjectNameEXT() {
    }

    public PFNvkSetDebugUtilsObjectNameEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkSetDebugUtilsObjectNameEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkSetDebugUtilsObjectNameEXT(long value) {
        setValue(value);
    }

    public PFNvkSetDebugUtilsObjectNameEXT(VkInstance instance) {
        super(instance, new VkString("vkSetDebugUtilsObjectNameEXT"));
    }

    public void call(VkDevice device, VkDebugUtilsObjectNameInfoEXT pNameInfo, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.NULL_ADDRESS, pNameInfo != null ? pNameInfo.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long device, long pNameInfo, long rval);
}
