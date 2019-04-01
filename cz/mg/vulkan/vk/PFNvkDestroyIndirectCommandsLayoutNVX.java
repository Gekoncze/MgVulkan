package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkDestroyIndirectCommandsLayoutNVX.html">khronos documentation</a>
 **/
public class PFNvkDestroyIndirectCommandsLayoutNVX extends VkFunctionPointer {
    public PFNvkDestroyIndirectCommandsLayoutNVX() {
    }

    public PFNvkDestroyIndirectCommandsLayoutNVX(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkDestroyIndirectCommandsLayoutNVX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkDestroyIndirectCommandsLayoutNVX(long value) {
        setValue(value);
    }

    public PFNvkDestroyIndirectCommandsLayoutNVX(VkInstance instance) {
        super(instance, new VkString("vkDestroyIndirectCommandsLayoutNVX"));
    }

    public void call(VkDevice device, VkIndirectCommandsLayoutNVX indirectCommandsLayout, VkAllocationCallbacks pAllocator){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.NULL_ADDRESS, indirectCommandsLayout != null ? indirectCommandsLayout.getVkAddress() : VkPointer.NULL_ADDRESS, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long indirectCommandsLayout, long pAllocator);
}
