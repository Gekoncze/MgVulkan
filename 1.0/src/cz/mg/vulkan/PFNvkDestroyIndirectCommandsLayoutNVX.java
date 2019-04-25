package cz.mg.vulkan;

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
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddress(), indirectCommandsLayout != null ? indirectCommandsLayout.getVkAddress() : VkPointer.getNullAddress(), pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    protected static native void call(long vkaddress, long device, long indirectCommandsLayout, long pAllocator);
}
