package cz.mg.vulkan;

public class PFNvkGetMemoryHostPointerPropertiesEXT extends VkFunctionPointer {
    public PFNvkGetMemoryHostPointerPropertiesEXT() {
    }

    protected PFNvkGetMemoryHostPointerPropertiesEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetMemoryHostPointerPropertiesEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetMemoryHostPointerPropertiesEXT(long value) {
        setValue(value);
    }

    public PFNvkGetMemoryHostPointerPropertiesEXT(VkInstance instance) {
        super(instance, new VkString("vkGetMemoryHostPointerPropertiesEXT"));
    }

    public int call(VkDevice device, int handleType, VkObject pHostPointer, VkMemoryHostPointerPropertiesEXT pMemoryHostPointerProperties){
        return callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), handleType, pHostPointer != null ? pHostPointer.getVkAddress() : VkPointer.NULL, pMemoryHostPointerProperties != null ? pMemoryHostPointerProperties.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callNative(long vkaddress, long device, int handleType, long pHostPointer, long pMemoryHostPointerProperties);

}
