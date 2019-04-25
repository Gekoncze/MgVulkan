package cz.mg.vulkan;

public class PFNvkDestroyPipelineLayout extends VkFunctionPointer {
    public PFNvkDestroyPipelineLayout() {
    }

    public PFNvkDestroyPipelineLayout(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkDestroyPipelineLayout(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkDestroyPipelineLayout(long value) {
        setValue(value);
    }

    public PFNvkDestroyPipelineLayout(VkInstance instance) {
        super(instance, new VkString("vkDestroyPipelineLayout"));
    }

    public void call(VkDevice device, VkPipelineLayout pipelineLayout, VkAllocationCallbacks pAllocator){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pipelineLayout != null ? pipelineLayout.getVkAddress() : VkPointer.getNullAddressNative(), pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    protected static native void call(long vkaddress, long device, long pipelineLayout, long pAllocator);
}
