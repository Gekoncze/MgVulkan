package cz.mg.vulkan;

public class PFNvkCreateDescriptorSetLayout extends VkFunctionPointer {
    public PFNvkCreateDescriptorSetLayout() {
    }

    protected PFNvkCreateDescriptorSetLayout(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCreateDescriptorSetLayout(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCreateDescriptorSetLayout(long value) {
        setValue(value);
    }

    public PFNvkCreateDescriptorSetLayout(VkInstance instance) {
        super(instance, new VkString("vkCreateDescriptorSetLayout"));
    }

    public int call(VkDevice device, VkDescriptorSetLayoutCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkDescriptorSetLayout pSetLayout){
        return callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pSetLayout != null ? pSetLayout.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callNative(long vkaddress, long device, long pCreateInfo, long pAllocator, long pSetLayout);

}
