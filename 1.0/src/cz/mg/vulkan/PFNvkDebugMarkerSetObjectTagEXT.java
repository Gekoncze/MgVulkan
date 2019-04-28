package cz.mg.vulkan;

public class PFNvkDebugMarkerSetObjectTagEXT extends VkFunctionPointer {
    public PFNvkDebugMarkerSetObjectTagEXT() {
    }

    protected PFNvkDebugMarkerSetObjectTagEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkDebugMarkerSetObjectTagEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkDebugMarkerSetObjectTagEXT(long value) {
        setValue(value);
    }

    public PFNvkDebugMarkerSetObjectTagEXT(VkInstance instance) {
        super(instance, new VkString("vkDebugMarkerSetObjectTagEXT"));
    }

    public void call(VkDevice device, VkDebugMarkerObjectTagInfoEXT pTagInfo, VkResult rval){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pTagInfo != null ? pTagInfo.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void callNative(long vkaddress, long device, long pTagInfo, long rval);


    public int call(VkDevice device, VkDebugMarkerObjectTagInfoEXT pTagInfo){
        return callSimplifiedNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pTagInfo != null ? pTagInfo.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callSimplifiedNative(long vkaddress, long device, long pTagInfo);

}
