package cz.mg.vulkan;

public class PFNvkDestroyRenderPass extends VkFunctionPointer {
    public PFNvkDestroyRenderPass() {
    }

    protected PFNvkDestroyRenderPass(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkDestroyRenderPass(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkDestroyRenderPass(long value) {
        setValue(value);
    }

    public PFNvkDestroyRenderPass(VkInstance instance) {
        super(instance, new VkString("vkDestroyRenderPass"));
    }

    public void call(VkDevice device, VkRenderPass renderPass, VkAllocationCallbacks pAllocator){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), renderPass != null ? renderPass.getVkAddress() : VkPointer.getNullAddressNative(), pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long device, long renderPass, long pAllocator);

}
