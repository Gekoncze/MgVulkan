package cz.mg.vulkan.vk;

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
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.NULL_ADDRESS, pTagInfo != null ? pTagInfo.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long device, long pTagInfo, long rval);
}
