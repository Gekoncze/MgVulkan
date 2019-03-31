package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCreateDevice.html">khronos documentation</a>
 **/
public class PFNvkCreateDevice extends VkFunctionPointer {
    public PFNvkCreateDevice() {
    }

    public PFNvkCreateDevice(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCreateDevice(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCreateDevice(long value) {
        setValue(value);
    }

    public PFNvkCreateDevice(VkInstance instance) {
        super(instance, new VkString("vkCreateDevice"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkDeviceCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkDevice pDevice, VkResult rval){
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPhysicalDevice.NULL.getVkAddress(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pDevice != null ? pDevice.getVkAddress() : VkDevice.NULL.getVkAddress(), rval != null ? rval.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long physicalDevice, long pCreateInfo, long pAllocator, long pDevice, long rval);
}
