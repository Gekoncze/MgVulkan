package cz.mg.vulkan;

public class PFNvkCreateDescriptorUpdateTemplate extends VkFunctionPointer {
    public PFNvkCreateDescriptorUpdateTemplate() {
    }

    protected PFNvkCreateDescriptorUpdateTemplate(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCreateDescriptorUpdateTemplate(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCreateDescriptorUpdateTemplate(long value) {
        setValue(value);
    }

    public PFNvkCreateDescriptorUpdateTemplate(VkInstance instance) {
        super(instance, new VkString("vkCreateDescriptorUpdateTemplate"));
    }

    public int call(VkDevice device, VkDescriptorUpdateTemplateCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkDescriptorUpdateTemplate pDescriptorUpdateTemplate){
        return callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pDescriptorUpdateTemplate != null ? pDescriptorUpdateTemplate.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callNative(long vkaddress, long device, long pCreateInfo, long pAllocator, long pDescriptorUpdateTemplate);

}
