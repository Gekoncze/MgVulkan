package cz.mg.vulkan.vk;

public class PFNvkDestroyObjectTableNVX extends VkFunctionPointer {
    public PFNvkDestroyObjectTableNVX() {
    }

    public PFNvkDestroyObjectTableNVX(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkDestroyObjectTableNVX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkDestroyObjectTableNVX(long value) {
        setValue(value);
    }

    public PFNvkDestroyObjectTableNVX(VkInstance instance) {
        super(instance, new VkString("vkDestroyObjectTableNVX"));
    }

    public void call(VkDevice device, VkObjectTableNVX objectTable, VkAllocationCallbacks pAllocator){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.NULL_ADDRESS, objectTable != null ? objectTable.getVkAddress() : VkPointer.NULL_ADDRESS, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long objectTable, long pAllocator);
}
