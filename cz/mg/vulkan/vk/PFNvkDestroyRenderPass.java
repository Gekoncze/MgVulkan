package cz.mg.vulkan.vk;

public class PFNvkDestroyRenderPass extends VkFunctionPointer {
    public PFNvkDestroyRenderPass() {
    }

    public PFNvkDestroyRenderPass(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkDestroyRenderPass(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkDestroyRenderPass(long value) {
        setValue(value);
    }

    public PFNvkDestroyRenderPass(VkInstance instance) {
        super(instance, new VkString("vkDestroyRenderPass"));
    }

    public void call(VkDevice device, VkRenderPass renderPass, VkAllocationCallbacks pAllocator){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.NULL_ADDRESS, renderPass != null ? renderPass.getVkAddress() : VkPointer.NULL_ADDRESS, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long renderPass, long pAllocator);
}
