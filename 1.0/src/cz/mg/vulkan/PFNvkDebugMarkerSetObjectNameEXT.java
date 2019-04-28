package cz.mg.vulkan;

public class PFNvkDebugMarkerSetObjectNameEXT extends VkFunctionPointer {
    public PFNvkDebugMarkerSetObjectNameEXT() {
    }

    protected PFNvkDebugMarkerSetObjectNameEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkDebugMarkerSetObjectNameEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkDebugMarkerSetObjectNameEXT(long value) {
        setValue(value);
    }

    public PFNvkDebugMarkerSetObjectNameEXT(VkInstance instance) {
        super(instance, new VkString("vkDebugMarkerSetObjectNameEXT"));
    }

    public void call(VkDevice device, VkDebugMarkerObjectNameInfoEXT pNameInfo, VkResult rval){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pNameInfo != null ? pNameInfo.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void callNative(long vkaddress, long device, long pNameInfo, long rval);


    public int call(VkDevice device, VkDebugMarkerObjectNameInfoEXT pNameInfo){
        return callSimplifiedNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pNameInfo != null ? pNameInfo.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callSimplifiedNative(long vkaddress, long device, long pNameInfo);

}
