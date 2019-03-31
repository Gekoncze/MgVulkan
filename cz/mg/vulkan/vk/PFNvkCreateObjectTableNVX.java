package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCreateObjectTableNVX.html">khronos documentation</a>
 **/
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
        call(getValue(), device != null ? device.getVkAddress() : VkDevice.NULL.getVkAddress(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pObjectTable != null ? pObjectTable.getVkAddress() : VkObjectTableNVX.NULL.getVkAddress(), rval != null ? rval.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long pCreateInfo, long pAllocator, long pObjectTable, long rval);
}
