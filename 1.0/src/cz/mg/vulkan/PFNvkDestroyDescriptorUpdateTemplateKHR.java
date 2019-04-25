package cz.mg.vulkan;

public class PFNvkDestroyDescriptorUpdateTemplateKHR extends VkFunctionPointer {
    public PFNvkDestroyDescriptorUpdateTemplateKHR() {
    }

    protected PFNvkDestroyDescriptorUpdateTemplateKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkDestroyDescriptorUpdateTemplateKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkDestroyDescriptorUpdateTemplateKHR(long value) {
        setValue(value);
    }

    public PFNvkDestroyDescriptorUpdateTemplateKHR(VkInstance instance) {
        super(instance, new VkString("vkDestroyDescriptorUpdateTemplateKHR"));
    }

    public void call(VkDevice device, VkDescriptorUpdateTemplateKHR descriptorUpdateTemplate, VkAllocationCallbacks pAllocator){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), descriptorUpdateTemplate != null ? descriptorUpdateTemplate.getVkAddress() : VkPointer.getNullAddressNative(), pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    protected static native void call(long vkaddress, long device, long descriptorUpdateTemplate, long pAllocator);
}
