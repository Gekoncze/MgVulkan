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

    public int call(VkDevice device, int handleType, int fd, VkMemoryFdPropertiesKHR pMemoryFdProperties){
        return callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), handleType, fd, pMemoryFdProperties != null ? pMemoryFdProperties.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callNative(long vkaddress, long device, int handleType, int fd, long pMemoryFdProperties);

}
