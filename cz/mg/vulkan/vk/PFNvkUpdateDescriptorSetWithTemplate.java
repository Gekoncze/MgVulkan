package cz.mg.vulkan.vk;

public class PFNvkUpdateDescriptorSetWithTemplate extends VkFunctionPointer {
    public PFNvkUpdateDescriptorSetWithTemplate() {
    }

    public PFNvkUpdateDescriptorSetWithTemplate(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkUpdateDescriptorSetWithTemplate(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkUpdateDescriptorSetWithTemplate(long value) {
        setValue(value);
    }

    public PFNvkUpdateDescriptorSetWithTemplate(VkInstance instance) {
        super(instance, new VkString("vkUpdateDescriptorSetWithTemplate"));
    }

    public void call(VkDevice device, VkDescriptorSet descriptorSet, VkDescriptorUpdateTemplate descriptorUpdateTemplate, VkObject pData){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.NULL_ADDRESS, descriptorSet != null ? descriptorSet.getVkAddress() : VkPointer.NULL_ADDRESS, descriptorUpdateTemplate != null ? descriptorUpdateTemplate.getVkAddress() : VkPointer.NULL_ADDRESS, pData != null ? pData.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long descriptorSet, long descriptorUpdateTemplate, long pData);
}
