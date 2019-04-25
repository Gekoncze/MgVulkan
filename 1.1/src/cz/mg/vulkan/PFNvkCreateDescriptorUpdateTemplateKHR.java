package cz.mg.vulkan;

public class PFNvkCreateDescriptorUpdateTemplateKHR extends VkFunctionPointer {
    public PFNvkCreateDescriptorUpdateTemplateKHR() {
    }

    protected PFNvkCreateDescriptorUpdateTemplateKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCreateDescriptorUpdateTemplateKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCreateDescriptorUpdateTemplateKHR(long value) {
        setValue(value);
    }

    public PFNvkCreateDescriptorUpdateTemplateKHR(VkInstance instance) {
        super(instance, new VkString("vkCreateDescriptorUpdateTemplateKHR"));
    }

    public void call(VkDevice device, VkDescriptorUpdateTemplateCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkDescriptorUpdateTemplate pDescriptorUpdateTemplate, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pDescriptorUpdateTemplate != null ? pDescriptorUpdateTemplate.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void call(long vkaddress, long device, long pCreateInfo, long pAllocator, long pDescriptorUpdateTemplate, long rval);
}
