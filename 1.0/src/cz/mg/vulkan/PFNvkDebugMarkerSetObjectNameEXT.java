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

    public int call(VkDevice device, VkDebugMarkerObjectNameInfoEXT pNameInfo){
        return callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pNameInfo != null ? pNameInfo.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callNative(long vkaddress, long device, long pNameInfo);

}
