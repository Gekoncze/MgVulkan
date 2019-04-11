package cz.mg.vulkan;

public class PFNvkCreatePipelineLayout extends VkFunctionPointer {
    public PFNvkCreatePipelineLayout() {
    }

    public PFNvkCreatePipelineLayout(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCreatePipelineLayout(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCreatePipelineLayout(long value) {
        setValue(value);
    }

    public PFNvkCreatePipelineLayout(VkInstance instance) {
        super(instance, new VkString("vkCreatePipelineLayout"));
    }

    public void call(VkDevice device, VkPipelineLayoutCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkPipelineLayout pPipelineLayout, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddress(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pPipelineLayout != null ? pPipelineLayout.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getNullAddress());
    }

    private static native void call(long vkaddress, long device, long pCreateInfo, long pAllocator, long pPipelineLayout, long rval);
}
