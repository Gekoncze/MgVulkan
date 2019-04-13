package cz.mg.vulkan;

public class PFNvkCreateObjectTableNVX extends VkFunctionPointer {
    public PFNvkCreateObjectTableNVX() {
    }

    public PFNvkCreateObjectTableNVX(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCreateObjectTableNVX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCreateObjectTableNVX(long value) {
        setValue(value);
    }

    public PFNvkCreateObjectTableNVX(VkInstance instance) {
        super(instance, new VkString("vkCreateObjectTableNVX"));
    }

    public void call(VkDevice device, VkObjectTableCreateInfoNVX pCreateInfo, VkAllocationCallbacks pAllocator, VkObjectTableNVX pObjectTable, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getSinkAddress(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pObjectTable != null ? pObjectTable.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddress());
    }

    private static native void call(long vkaddress, long device, long pCreateInfo, long pAllocator, long pObjectTable, long rval);
}
