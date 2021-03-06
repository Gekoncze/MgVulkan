package cz.mg.vulkan;

public class PFNvkCreateRenderPass extends VkFunctionPointer {
    public PFNvkCreateRenderPass() {
    }

    protected PFNvkCreateRenderPass(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCreateRenderPass(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCreateRenderPass(long value) {
        setValue(value);
    }

    public PFNvkCreateRenderPass(VkInstance instance) {
        super(instance, new VkString("vkCreateRenderPass"));
    }

    public int call(VkDevice device, VkRenderPassCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkRenderPass pRenderPass){
        return callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pRenderPass != null ? pRenderPass.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callNative(long vkaddress, long device, long pCreateInfo, long pAllocator, long pRenderPass);

}
