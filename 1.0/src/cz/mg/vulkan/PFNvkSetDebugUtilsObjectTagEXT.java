package cz.mg.vulkan;

public class PFNvkSetDebugUtilsObjectTagEXT extends VkFunctionPointer {
    public PFNvkSetDebugUtilsObjectTagEXT() {
    }

    protected PFNvkSetDebugUtilsObjectTagEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkSetDebugUtilsObjectTagEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkSetDebugUtilsObjectTagEXT(long value) {
        setValue(value);
    }

    public PFNvkSetDebugUtilsObjectTagEXT(VkInstance instance) {
        super(instance, new VkString("vkSetDebugUtilsObjectTagEXT"));
    }

    public int call(VkDevice device, VkDebugUtilsObjectTagInfoEXT pTagInfo){
        return callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pTagInfo != null ? pTagInfo.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callNative(long vkaddress, long device, long pTagInfo);

}
