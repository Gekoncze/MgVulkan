package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkDestroyDevice.html">khronos documentation</a>
 **/
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
