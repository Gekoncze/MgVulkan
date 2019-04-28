package cz.mg.vulkan;

public class PFNvkReleaseDisplayEXT extends VkFunctionPointer {
    public PFNvkReleaseDisplayEXT() {
    }

    protected PFNvkReleaseDisplayEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkReleaseDisplayEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkReleaseDisplayEXT(long value) {
        setValue(value);
    }

    public PFNvkReleaseDisplayEXT(VkInstance instance) {
        super(instance, new VkString("vkReleaseDisplayEXT"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkDisplayKHR display, VkResult rval){
        callNative(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), display != null ? display.getVkAddress() : VkPointer.getNullAddressNative(), rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void callNative(long vkaddress, long physicalDevice, long display, long rval);


    public int call(VkPhysicalDevice physicalDevice, VkDisplayKHR display){
        return callSimplifiedNative(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), display != null ? display.getVkAddress() : VkPointer.getNullAddressNative());
    }

    protected static native int callSimplifiedNative(long vkaddress, long physicalDevice, long display);

}
