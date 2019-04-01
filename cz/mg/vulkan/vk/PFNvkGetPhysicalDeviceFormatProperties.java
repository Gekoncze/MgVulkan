package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetPhysicalDeviceFormatProperties.html">khronos documentation</a>
 **/
public class PFNvkGetPhysicalDeviceFormatProperties extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceFormatProperties() {
    }

    public PFNvkGetPhysicalDeviceFormatProperties(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetPhysicalDeviceFormatProperties(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkGetPhysicalDeviceFormatProperties(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceFormatProperties(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceFormatProperties"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkFormat format, VkFormatProperties pFormatProperties){
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.NULL_ADDRESS, format != null ? format.getVkAddress() : VkPointer.NULL_ADDRESS, pFormatProperties != null ? pFormatProperties.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long physicalDevice, long format, long pFormatProperties);
}
