package cz.mg.vulkan.vk;

public class PFNvkDestroyPipeline extends VkFunctionPointer {
    public PFNvkDestroyPipeline() {
    }

    public PFNvkDestroyPipeline(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkDestroyPipeline(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkDestroyPipeline(long value) {
        setValue(value);
    }

    public PFNvkDestroyPipeline(VkInstance instance) {
        super(instance, new VkString("vkDestroyPipeline"));
    }

    public void call(VkDevice device, VkPipeline pipeline, VkAllocationCallbacks pAllocator){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.NULL_ADDRESS, pipeline != null ? pipeline.getVkAddress() : VkPointer.NULL_ADDRESS, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long pipeline, long pAllocator);
}
