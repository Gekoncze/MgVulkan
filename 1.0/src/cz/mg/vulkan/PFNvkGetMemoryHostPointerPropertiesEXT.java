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

    public void call(VkDevice device, VkExternalMemoryHandleTypeFlagBits handleType, VkObject pHostPointer, VkMemoryHostPointerPropertiesEXT pMemoryHostPointerProperties, VkResult rval){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), handleType != null ? handleType.getVkAddress() : VkPointer.getNullAddressNative(), pHostPointer != null ? pHostPointer.getVkAddress() : VkPointer.NULL, pMemoryHostPointerProperties != null ? pMemoryHostPointerProperties.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void callNative(long vkaddress, long device, long handleType, long pHostPointer, long pMemoryHostPointerProperties, long rval);


    public int call(VkDevice device, int handleType, VkObject pHostPointer, VkMemoryHostPointerPropertiesEXT pMemoryHostPointerProperties){
        return callSimplifiedNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), handleType, pHostPointer != null ? pHostPointer.getVkAddress() : VkPointer.NULL, pMemoryHostPointerProperties != null ? pMemoryHostPointerProperties.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callSimplifiedNative(long vkaddress, long device, int handleType, long pHostPointer, long pMemoryHostPointerProperties);

}
