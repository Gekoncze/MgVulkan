package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetPhysicalDeviceExternalFenceProperties.html">khronos documentation</a>
 **/
public class PFNvkGetPhysicalDeviceExternalFenceProperties extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceExternalFenceProperties() {
    }

    public PFNvkGetPhysicalDeviceExternalFenceProperties(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetPhysicalDeviceExternalFenceProperties(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkGetPhysicalDeviceExternalFenceProperties(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceExternalFenceProperties(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceExternalFenceProperties"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkPhysicalDeviceExternalFenceInfo pExternalFenceInfo, VkExternalFenceProperties pExternalFenceProperties){
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.NULL_ADDRESS, pExternalFenceInfo != null ? pExternalFenceInfo.getVkAddress() : VkPointer.NULL, pExternalFenceProperties != null ? pExternalFenceProperties.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long physicalDevice, long pExternalFenceInfo, long pExternalFenceProperties);
}
