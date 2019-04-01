package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCreateDescriptorUpdateTemplate.html">khronos documentation</a>
 **/
public class PFNvkCreateDescriptorUpdateTemplate extends VkFunctionPointer {
    public PFNvkCreateDescriptorUpdateTemplate() {
    }

    public PFNvkCreateDescriptorUpdateTemplate(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCreateDescriptorUpdateTemplate(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCreateDescriptorUpdateTemplate(long value) {
        setValue(value);
    }

    public PFNvkCreateDescriptorUpdateTemplate(VkInstance instance) {
        super(instance, new VkString("vkCreateDescriptorUpdateTemplate"));
    }

    public void call(VkDevice device, VkDescriptorUpdateTemplateCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkDescriptorUpdateTemplate pDescriptorUpdateTemplate, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.NULL_ADDRESS, pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pDescriptorUpdateTemplate != null ? pDescriptorUpdateTemplate.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long device, long pCreateInfo, long pAllocator, long pDescriptorUpdateTemplate, long rval);
}
