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

    public void call(VkDevice device, VkDebugUtilsObjectTagInfoEXT pTagInfo, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pTagInfo != null ? pTagInfo.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void call(long vkaddress, long device, long pTagInfo, long rval);
}
