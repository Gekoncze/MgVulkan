package cz.mg.vulkan;

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

    public void call(VkDevice device, VkExternalMemoryHandleTypeFlagBitsKHR handleType, VkInt fd, VkMemoryFdPropertiesKHR pMemoryFdProperties, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddress(), handleType != null ? handleType.getVkAddress() : VkPointer.getNullAddress(), fd != null ? fd.getVkAddress() : VkPointer.getNullAddress(), pMemoryFdProperties != null ? pMemoryFdProperties.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddress());
    }

    private static native void call(long vkaddress, long device, long handleType, long fd, long pMemoryFdProperties, long rval);
}
