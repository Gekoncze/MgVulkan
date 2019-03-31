package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetPhysicalDeviceExternalSemaphoreProperties.html">khronos documentation</a>
 **/
public class PFNvkGetPhysicalDeviceExternalSemaphoreProperties extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceExternalSemaphoreProperties() {
    }

    public PFNvkGetPhysicalDeviceExternalSemaphoreProperties(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetPhysicalDeviceExternalSemaphoreProperties(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkGetPhysicalDeviceExternalSemaphoreProperties(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceExternalSemaphoreProperties(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceExternalSemaphoreProperties"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkPhysicalDeviceExternalSemaphoreInfo pExternalSemaphoreInfo, VkExternalSemaphoreProperties pExternalSemaphoreProperties){
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPhysicalDevice.NULL.getVkAddress(), pExternalSemaphoreInfo != null ? pExternalSemaphoreInfo.getVkAddress() : VkPointer.NULL, pExternalSemaphoreProperties != null ? pExternalSemaphoreProperties.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long physicalDevice, long pExternalSemaphoreInfo, long pExternalSemaphoreProperties);
}
