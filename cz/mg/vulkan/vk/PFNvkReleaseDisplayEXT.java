package cz.mg.vulkan.vk;

public class PFNvkReleaseDisplayEXT extends VkFunctionPointer {
    public PFNvkReleaseDisplayEXT() {
    }

    public PFNvkReleaseDisplayEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkReleaseDisplayEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkReleaseDisplayEXT(long value) {
        setValue(value);
    }

    public PFNvkReleaseDisplayEXT(VkInstance instance) {
        super(instance, new VkString("vkReleaseDisplayEXT"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkDisplayKHR display, VkResult rval){
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.NULL_ADDRESS, display != null ? display.getVkAddress() : VkPointer.NULL_ADDRESS, rval != null ? rval.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long physicalDevice, long display, long rval);
}
