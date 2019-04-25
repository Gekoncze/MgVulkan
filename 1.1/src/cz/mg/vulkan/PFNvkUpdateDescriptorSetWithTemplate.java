package cz.mg.vulkan;

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
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddress(), descriptorSet != null ? descriptorSet.getVkAddress() : VkPointer.getNullAddress(), descriptorUpdateTemplate != null ? descriptorUpdateTemplate.getVkAddress() : VkPointer.getNullAddress(), pData != null ? pData.getVkAddress() : VkPointer.NULL);
    }

    protected static native void call(long vkaddress, long device, long descriptorSet, long descriptorUpdateTemplate, long pData);
}
