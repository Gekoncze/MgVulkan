package cz.mg.vulkan;

public class PFNvkCreateDescriptorSetLayout extends VkFunctionPointer {
    public PFNvkCreateDescriptorSetLayout() {
    }

    public PFNvkCreateDescriptorSetLayout(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCreateDescriptorSetLayout(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCreateDescriptorSetLayout(long value) {
        setValue(value);
    }

    public PFNvkCreateDescriptorSetLayout(VkInstance instance) {
        super(instance, new VkString("vkCreateDescriptorSetLayout"));
    }

    public void call(VkDevice device, VkDescriptorSetLayoutCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkDescriptorSetLayout pSetLayout, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.NULL_ADDRESS, pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pSetLayout != null ? pSetLayout.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long device, long pCreateInfo, long pAllocator, long pSetLayout, long rval);
}
