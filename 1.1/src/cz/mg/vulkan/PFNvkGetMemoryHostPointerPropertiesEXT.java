package cz.mg.vulkan;

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
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddress(), handleType != null ? handleType.getVkAddress() : VkPointer.getNullAddress(), pHostPointer != null ? pHostPointer.getVkAddress() : VkPointer.NULL, pMemoryHostPointerProperties != null ? pMemoryHostPointerProperties.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddress());
    }

    private static native void call(long vkaddress, long device, long handleType, long pHostPointer, long pMemoryHostPointerProperties, long rval);
}
