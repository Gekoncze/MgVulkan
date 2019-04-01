package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetMemoryHostPointerPropertiesEXT.html">khronos documentation</a>
 **/
public class PFNvkGetMemoryHostPointerPropertiesEXT extends VkFunctionPointer {
    public PFNvkGetMemoryHostPointerPropertiesEXT() {
    }

    public PFNvkGetMemoryHostPointerPropertiesEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetMemoryHostPointerPropertiesEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkGetMemoryHostPointerPropertiesEXT(long value) {
        setValue(value);
    }

    public PFNvkGetMemoryHostPointerPropertiesEXT(VkInstance instance) {
        super(instance, new VkString("vkGetMemoryHostPointerPropertiesEXT"));
    }

    public void call(VkDevice device, VkExternalMemoryHandleTypeFlagBits handleType, VkObject pHostPointer, VkMemoryHostPointerPropertiesEXT pMemoryHostPointerProperties, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.NULL_ADDRESS, handleType != null ? handleType.getVkAddress() : VkPointer.NULL_ADDRESS, pHostPointer != null ? pHostPointer.getVkAddress() : VkPointer.NULL, pMemoryHostPointerProperties != null ? pMemoryHostPointerProperties.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long device, long handleType, long pHostPointer, long pMemoryHostPointerProperties, long rval);
}
