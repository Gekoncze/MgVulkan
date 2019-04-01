package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkFreeMemory.html">khronos documentation</a>
 **/
public class PFNvkFreeMemory extends VkFunctionPointer {
    public PFNvkFreeMemory() {
    }

    public PFNvkFreeMemory(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkFreeMemory(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkFreeMemory(long value) {
        setValue(value);
    }

    public PFNvkFreeMemory(VkInstance instance) {
        super(instance, new VkString("vkFreeMemory"));
    }

    public void call(VkDevice device, VkDeviceMemory memory, VkAllocationCallbacks pAllocator){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.NULL_ADDRESS, memory != null ? memory.getVkAddress() : VkPointer.NULL_ADDRESS, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long memory, long pAllocator);
}
