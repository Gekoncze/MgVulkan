package cz.mg.vulkan;

public class PFNvkUpdateDescriptorSetWithTemplate extends VkFunctionPointer {
    public PFNvkUpdateDescriptorSetWithTemplate() {
    }

    protected PFNvkUpdateDescriptorSetWithTemplate(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkUpdateDescriptorSetWithTemplate(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkUpdateDescriptorSetWithTemplate(long value) {
        setValue(value);
    }

    public PFNvkUpdateDescriptorSetWithTemplate(VkInstance instance) {
        super(instance, new VkString("vkUpdateDescriptorSetWithTemplate"));
    }

    public void call(VkDevice device, VkDescriptorSet descriptorSet, VkDescriptorUpdateTemplate descriptorUpdateTemplate, VkObject pData){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), descriptorSet != null ? descriptorSet.getVkAddress() : VkPointer.getNullAddressNative(), descriptorUpdateTemplate != null ? descriptorUpdateTemplate.getVkAddress() : VkPointer.getNullAddressNative(), pData != null ? pData.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long device, long descriptorSet, long descriptorUpdateTemplate, long pData);

}
