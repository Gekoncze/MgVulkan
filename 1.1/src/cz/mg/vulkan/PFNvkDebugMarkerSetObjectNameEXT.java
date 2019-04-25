package cz.mg.vulkan;

public class PFNvkDebugMarkerSetObjectNameEXT extends VkFunctionPointer {
    public PFNvkDebugMarkerSetObjectNameEXT() {
    }

    public PFNvkDebugMarkerSetObjectNameEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkDebugMarkerSetObjectNameEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkDebugMarkerSetObjectNameEXT(long value) {
        setValue(value);
    }

    public PFNvkDebugMarkerSetObjectNameEXT(VkInstance instance) {
        super(instance, new VkString("vkDebugMarkerSetObjectNameEXT"));
    }

    public void call(VkDevice device, VkDebugMarkerObjectNameInfoEXT pNameInfo, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddress(), pNameInfo != null ? pNameInfo.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddress());
    }

    protected static native void call(long vkaddress, long device, long pNameInfo, long rval);
}
