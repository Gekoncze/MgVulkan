package cz.mg.vulkan;

public class PFNvkCreateObjectTableNVX extends VkFunctionPointer {
    public PFNvkCreateObjectTableNVX() {
    }

    protected PFNvkCreateObjectTableNVX(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCreateObjectTableNVX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCreateObjectTableNVX(long value) {
        setValue(value);
    }

    public PFNvkCreateObjectTableNVX(VkInstance instance) {
        super(instance, new VkString("vkCreateObjectTableNVX"));
    }

    public int call(VkDevice device, VkObjectTableCreateInfoNVX pCreateInfo, VkAllocationCallbacks pAllocator, VkObjectTableNVX pObjectTable){
        return callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pObjectTable != null ? pObjectTable.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callNative(long vkaddress, long device, long pCreateInfo, long pAllocator, long pObjectTable);

}
