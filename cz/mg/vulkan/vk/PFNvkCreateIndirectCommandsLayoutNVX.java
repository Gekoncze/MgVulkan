package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCreateIndirectCommandsLayoutNVX.html">khronos documentation</a>
 **/
public class PFNvkCreateIndirectCommandsLayoutNVX extends VkFunctionPointer {
    public PFNvkCreateIndirectCommandsLayoutNVX() {
    }

    public PFNvkCreateIndirectCommandsLayoutNVX(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCreateIndirectCommandsLayoutNVX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCreateIndirectCommandsLayoutNVX(long value) {
        setValue(value);
    }

    public PFNvkCreateIndirectCommandsLayoutNVX(VkInstance instance) {
        super(instance, new VkString("vkCreateIndirectCommandsLayoutNVX"));
    }

    public void call(VkDevice device, VkIndirectCommandsLayoutCreateInfoNVX pCreateInfo, VkAllocationCallbacks pAllocator, VkIndirectCommandsLayoutNVX pIndirectCommandsLayout, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkDevice.NULL.getVkAddress(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pIndirectCommandsLayout != null ? pIndirectCommandsLayout.getVkAddress() : VkIndirectCommandsLayoutNVX.NULL.getVkAddress(), rval != null ? rval.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long pCreateInfo, long pAllocator, long pIndirectCommandsLayout, long rval);
}
