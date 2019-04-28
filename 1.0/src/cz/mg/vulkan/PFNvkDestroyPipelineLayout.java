package cz.mg.vulkan;

public class PFNvkDestroyPipelineLayout extends VkFunctionPointer {
    public PFNvkDestroyPipelineLayout() {
    }

    protected PFNvkDestroyPipelineLayout(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkDestroyPipelineLayout(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkDestroyPipelineLayout(long value) {
        setValue(value);
    }

    public PFNvkDestroyPipelineLayout(VkInstance instance) {
        super(instance, new VkString("vkDestroyPipelineLayout"));
    }

    public void call(VkDevice device, VkPipelineLayout pipelineLayout, VkAllocationCallbacks pAllocator){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pipelineLayout != null ? pipelineLayout.getVkAddress() : VkPointer.getNullAddressNative(), pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long device, long pipelineLayout, long pAllocator);



}
