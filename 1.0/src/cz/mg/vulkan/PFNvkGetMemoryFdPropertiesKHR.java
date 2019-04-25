package cz.mg.vulkan;

public class PFNvkGetMemoryFdPropertiesKHR extends VkFunctionPointer {
    public PFNvkGetMemoryFdPropertiesKHR() {
    }

    protected PFNvkGetMemoryFdPropertiesKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetMemoryFdPropertiesKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetMemoryFdPropertiesKHR(long value) {
        setValue(value);
    }

    public PFNvkGetMemoryFdPropertiesKHR(VkInstance instance) {
        super(instance, new VkString("vkGetMemoryFdPropertiesKHR"));
    }

    public void call(VkDevice device, VkExternalMemoryHandleTypeFlagBitsKHR handleType, VkInt fd, VkMemoryFdPropertiesKHR pMemoryFdProperties, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), handleType != null ? handleType.getVkAddress() : VkPointer.getNullAddressNative(), fd != null ? fd.getVkAddress() : VkPointer.getNullAddressNative(), pMemoryFdProperties != null ? pMemoryFdProperties.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void call(long vkaddress, long device, long handleType, long fd, long pMemoryFdProperties, long rval);
}
