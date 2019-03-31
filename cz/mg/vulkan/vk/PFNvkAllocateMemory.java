package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkAllocateMemory.html">khronos documentation</a>
 **/
public class PFNvkAllocateMemory extends VkFunctionPointer {
    public PFNvkAllocateMemory() {
    }

    public PFNvkAllocateMemory(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkAllocateMemory(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkAllocateMemory(long value) {
        setValue(value);
    }

    public PFNvkAllocateMemory(VkInstance instance) {
        super(instance, new VkString("vkAllocateMemory"));
    }

    public void call(VkDevice device, VkMemoryAllocateInfo pAllocateInfo, VkAllocationCallbacks pAllocator, VkDeviceMemory pMemory, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkDevice.NULL.getVkAddress(), pAllocateInfo != null ? pAllocateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pMemory != null ? pMemory.getVkAddress() : VkDeviceMemory.NULL.getVkAddress(), rval != null ? rval.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long pAllocateInfo, long pAllocator, long pMemory, long rval);
}
