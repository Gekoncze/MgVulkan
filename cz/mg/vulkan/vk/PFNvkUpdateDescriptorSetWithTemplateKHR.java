package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkUpdateDescriptorSetWithTemplateKHR.html">khronos documentation</a>
 **/
public class PFNvkUpdateDescriptorSetWithTemplateKHR extends VkFunctionPointer {
    public PFNvkUpdateDescriptorSetWithTemplateKHR() {
    }

    public PFNvkUpdateDescriptorSetWithTemplateKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkUpdateDescriptorSetWithTemplateKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkUpdateDescriptorSetWithTemplateKHR(long value) {
        setValue(value);
    }

    public PFNvkUpdateDescriptorSetWithTemplateKHR(VkInstance instance) {
        super(instance, new VkString("vkUpdateDescriptorSetWithTemplateKHR"));
    }

    public void call(VkDevice device, VkDescriptorSet descriptorSet, VkDescriptorUpdateTemplate descriptorUpdateTemplate, VkObject pData){
        call(getValue(), device != null ? device.getVkAddress() : VkDevice.NULL.getVkAddress(), descriptorSet != null ? descriptorSet.getVkAddress() : VkDescriptorSet.NULL.getVkAddress(), descriptorUpdateTemplate != null ? descriptorUpdateTemplate.getVkAddress() : VkDescriptorUpdateTemplate.NULL.getVkAddress(), pData != null ? pData.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long descriptorSet, long descriptorUpdateTemplate, long pData);
}
