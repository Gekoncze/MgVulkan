package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkDestroyDescriptorUpdateTemplateKHR.html">khronos documentation</a>
 **/
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

    public void call(VkDevice device, VkDescriptorUpdateTemplate descriptorUpdateTemplate, VkAllocationCallbacks pAllocator){
        call(getValue(), device != null ? device.getVkAddress() : VkDevice.NULL.getVkAddress(), descriptorUpdateTemplate != null ? descriptorUpdateTemplate.getVkAddress() : VkDescriptorUpdateTemplate.NULL.getVkAddress(), pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long descriptorUpdateTemplate, long pAllocator);
}
