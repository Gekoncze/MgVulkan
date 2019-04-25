package cz.mg.vulkan;

public class PFNvkSetDebugUtilsObjectNameEXT extends VkFunctionPointer {
    public PFNvkSetDebugUtilsObjectNameEXT() {
    }

    protected PFNvkSetDebugUtilsObjectNameEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkSetDebugUtilsObjectNameEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkSetDebugUtilsObjectNameEXT(long value) {
        setValue(value);
    }

    public PFNvkSetDebugUtilsObjectNameEXT(VkInstance instance) {
        super(instance, new VkString("vkSetDebugUtilsObjectNameEXT"));
    }

    public void call(VkDevice device, VkDebugUtilsObjectNameInfoEXT pNameInfo, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pNameInfo != null ? pNameInfo.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void call(long vkaddress, long device, long pNameInfo, long rval);
}
