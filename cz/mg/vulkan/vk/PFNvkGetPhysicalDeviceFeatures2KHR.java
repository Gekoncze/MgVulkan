package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetPhysicalDeviceFeatures2KHR.html">khronos documentation</a>
 **/
public class PFNvkGetPhysicalDeviceFeatures2KHR extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceFeatures2KHR() {
    }

    public PFNvkGetPhysicalDeviceFeatures2KHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetPhysicalDeviceFeatures2KHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkGetPhysicalDeviceFeatures2KHR(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceFeatures2KHR(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceFeatures2KHR"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkPhysicalDeviceFeatures2 pFeatures){
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPhysicalDevice.NULL.getVkAddress(), pFeatures != null ? pFeatures.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long physicalDevice, long pFeatures);
}
