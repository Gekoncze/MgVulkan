package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetMemoryFdPropertiesKHR.html">khronos documentation</a>
 **/
public class PFNvkGetMemoryFdPropertiesKHR extends VkFunctionPointer {
    public PFNvkGetMemoryFdPropertiesKHR() {
    }

    public PFNvkGetMemoryFdPropertiesKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetMemoryFdPropertiesKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkGetMemoryFdPropertiesKHR(long value) {
        setValue(value);
    }

    public PFNvkGetMemoryFdPropertiesKHR(VkInstance instance) {
        super(instance, new VkString("vkGetMemoryFdPropertiesKHR"));
    }

    public void call(VkDevice device, VkExternalMemoryHandleTypeFlagBits handleType, VkInt fd, VkMemoryFdPropertiesKHR pMemoryFdProperties, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkDevice.NULL.getVkAddress(), handleType != null ? handleType.getVkAddress() : VkPointer.NULL, fd != null ? fd.getVkAddress() : VkPointer.NULL, pMemoryFdProperties != null ? pMemoryFdProperties.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long handleType, long fd, long pMemoryFdProperties, long rval);
}
