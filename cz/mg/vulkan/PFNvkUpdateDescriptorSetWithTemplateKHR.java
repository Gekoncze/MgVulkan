package cz.mg.vulkan;

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
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.NULL_ADDRESS, descriptorSet != null ? descriptorSet.getVkAddress() : VkPointer.NULL_ADDRESS, descriptorUpdateTemplate != null ? descriptorUpdateTemplate.getVkAddress() : VkPointer.NULL_ADDRESS, pData != null ? pData.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long descriptorSet, long descriptorUpdateTemplate, long pData);
}
