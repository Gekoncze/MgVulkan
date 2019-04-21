package cz.mg.vulkan;

public class PFNvkDestroyDescriptorUpdateTemplateKHR extends VkFunctionPointer {
    public PFNvkDestroyDescriptorUpdateTemplateKHR() {
    }

    public PFNvkDestroyDescriptorUpdateTemplateKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkDestroyDescriptorUpdateTemplateKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkDestroyDescriptorUpdateTemplateKHR(long value) {
        setValue(value);
    }

    public PFNvkDestroyDescriptorUpdateTemplateKHR(VkInstance instance) {
        super(instance, new VkString("vkDestroyDescriptorUpdateTemplateKHR"));
    }

    public void call(VkDevice device, VkDescriptorUpdateTemplateKHR descriptorUpdateTemplate, VkAllocationCallbacks pAllocator){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddress(), descriptorUpdateTemplate != null ? descriptorUpdateTemplate.getVkAddress() : VkPointer.getNullAddress(), pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long descriptorUpdateTemplate, long pAllocator);
}
