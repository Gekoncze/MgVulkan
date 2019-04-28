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

    public int call(VkPhysicalDevice physicalDevice, VkDisplayKHR display){
        return callNative(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), display != null ? display.getVkAddress() : VkPointer.getNullAddressNative());
    }

    protected static native int callNative(long vkaddress, long physicalDevice, long display);

}
