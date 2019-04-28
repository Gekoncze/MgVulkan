package cz.mg.vulkan;

public class PFNvkCreatePipelineLayout extends VkFunctionPointer {
    public PFNvkCreatePipelineLayout() {
    }

    protected PFNvkCreatePipelineLayout(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCreatePipelineLayout(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCreatePipelineLayout(long value) {
        setValue(value);
    }

    public PFNvkCreatePipelineLayout(VkInstance instance) {
        super(instance, new VkString("vkCreatePipelineLayout"));
    }

    public int call(VkDevice device, VkPipelineLayoutCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkPipelineLayout pPipelineLayout){
        return callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pPipelineLayout != null ? pPipelineLayout.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callNative(long vkaddress, long device, long pCreateInfo, long pAllocator, long pPipelineLayout);

}
