package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetPhysicalDeviceExternalBufferProperties.html">khronos documentation</a>
 **/
public class PFNvkGetPhysicalDeviceExternalBufferProperties extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceExternalBufferProperties() {
    }

    public PFNvkGetPhysicalDeviceExternalBufferProperties(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetPhysicalDeviceExternalBufferProperties(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkGetPhysicalDeviceExternalBufferProperties(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceExternalBufferProperties(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceExternalBufferProperties"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkPhysicalDeviceExternalBufferInfo pExternalBufferInfo, VkExternalBufferProperties pExternalBufferProperties){
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPhysicalDevice.NULL.getVkAddress(), pExternalBufferInfo != null ? pExternalBufferInfo.getVkAddress() : VkPointer.NULL, pExternalBufferProperties != null ? pExternalBufferProperties.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long physicalDevice, long pExternalBufferInfo, long pExternalBufferProperties);
}
