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

    public void call(VkDevice device, VkDescriptorSet descriptorSet, VkDescriptorUpdateTemplateKHR descriptorUpdateTemplate, VkObject pData){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddress(), descriptorSet != null ? descriptorSet.getVkAddress() : VkPointer.getNullAddress(), descriptorUpdateTemplate != null ? descriptorUpdateTemplate.getVkAddress() : VkPointer.getNullAddress(), pData != null ? pData.getVkAddress() : VkPointer.NULL);
    }

    protected static native void call(long vkaddress, long device, long descriptorSet, long descriptorUpdateTemplate, long pData);
}
