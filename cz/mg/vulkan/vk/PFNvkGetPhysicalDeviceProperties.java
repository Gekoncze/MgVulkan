package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetPhysicalDeviceProperties.html">khronos documentation</a>
 **/
public class PFNvkGetPhysicalDeviceProperties extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceProperties() {
    }

    public PFNvkGetPhysicalDeviceProperties(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetPhysicalDeviceProperties(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkGetPhysicalDeviceProperties(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceProperties(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceProperties"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkPhysicalDeviceProperties pProperties){
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.NULL_ADDRESS, pProperties != null ? pProperties.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long physicalDevice, long pProperties);
}
