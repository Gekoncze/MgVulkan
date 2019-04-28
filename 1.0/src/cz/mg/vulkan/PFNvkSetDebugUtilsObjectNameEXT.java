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
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pNameInfo != null ? pNameInfo.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void callNative(long vkaddress, long device, long pNameInfo, long rval);


    public int call(VkDevice device, VkDebugUtilsObjectNameInfoEXT pNameInfo){
        return callSimplifiedNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pNameInfo != null ? pNameInfo.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callSimplifiedNative(long vkaddress, long device, long pNameInfo);

}
