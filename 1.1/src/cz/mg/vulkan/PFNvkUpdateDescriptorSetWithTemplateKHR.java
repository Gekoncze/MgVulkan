package cz.mg.vulkan;

public class PFNvkUpdateDescriptorSetWithTemplateKHR extends VkFunctionPointer {
    public PFNvkUpdateDescriptorSetWithTemplateKHR() {
    }

    protected PFNvkUpdateDescriptorSetWithTemplateKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkUpdateDescriptorSetWithTemplateKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkUpdateDescriptorSetWithTemplateKHR(long value) {
        setValue(value);
    }

    public PFNvkUpdateDescriptorSetWithTemplateKHR(VkInstance instance) {
        super(instance, new VkString("vkUpdateDescriptorSetWithTemplateKHR"));
    }

    public void call(VkDevice device, VkDescriptorSet descriptorSet, VkDescriptorUpdateTemplate descriptorUpdateTemplate, VkObject pData){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), descriptorSet != null ? descriptorSet.getVkAddress() : VkPointer.getNullAddressNative(), descriptorUpdateTemplate != null ? descriptorUpdateTemplate.getVkAddress() : VkPointer.getNullAddressNative(), pData != null ? pData.getVkAddress() : VkPointer.NULL);
    }

    protected static native void call(long vkaddress, long device, long descriptorSet, long descriptorUpdateTemplate, long pData);
}
