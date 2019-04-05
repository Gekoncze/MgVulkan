package cz.mg.vulkan.vk;

public class PFNvkDestroyDevice extends VkFunctionPointer {
    public PFNvkDestroyDevice() {
    }

    public PFNvkDestroyDevice(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkDestroyDevice(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkDestroyDevice(long value) {
        setValue(value);
    }

    public PFNvkDestroyDevice(VkInstance instance) {
        super(instance, new VkString("vkDestroyDevice"));
    }

    public void call(VkDevice device, VkAllocationCallbacks pAllocator){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.NULL_ADDRESS, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long pAllocator);
}
