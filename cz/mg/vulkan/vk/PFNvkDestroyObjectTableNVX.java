package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkDestroyObjectTableNVX.html">khronos documentation</a>
 **/
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
        call(getValue(), device != null ? device.getVkAddress() : VkDevice.NULL.getVkAddress(), objectTable != null ? objectTable.getVkAddress() : VkObjectTableNVX.NULL.getVkAddress(), pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long objectTable, long pAllocator);
}
