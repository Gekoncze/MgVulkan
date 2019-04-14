package cz.mg.vulkan;

public class PFNvkDestroyDescriptorUpdateTemplate extends VkFunctionPointer {
    public PFNvkDestroyDescriptorUpdateTemplate() {
    }

    public PFNvkDestroyDescriptorUpdateTemplate(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkDestroyDescriptorUpdateTemplate(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkDestroyDescriptorUpdateTemplate(long value) {
        setValue(value);
    }

    public PFNvkDestroyDescriptorUpdateTemplate(VkInstance instance) {
        super(instance, new VkString("vkDestroyDescriptorUpdateTemplate"));
    }

    public void call(VkDevice device, VkDescriptorUpdateTemplate descriptorUpdateTemplate, VkAllocationCallbacks pAllocator){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddress(), descriptorUpdateTemplate != null ? descriptorUpdateTemplate.getVkAddress() : VkPointer.getNullAddress(), pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long descriptorUpdateTemplate, long pAllocator);
}
