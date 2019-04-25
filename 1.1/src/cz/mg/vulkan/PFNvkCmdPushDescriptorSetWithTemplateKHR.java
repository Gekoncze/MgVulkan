package cz.mg.vulkan;

public class PFNvkCmdPushDescriptorSetWithTemplateKHR extends VkFunctionPointer {
    public PFNvkCmdPushDescriptorSetWithTemplateKHR() {
    }

    protected PFNvkCmdPushDescriptorSetWithTemplateKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCmdPushDescriptorSetWithTemplateKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdPushDescriptorSetWithTemplateKHR(long value) {
        setValue(value);
    }

    public PFNvkCmdPushDescriptorSetWithTemplateKHR(VkInstance instance) {
        super(instance, new VkString("vkCmdPushDescriptorSetWithTemplateKHR"));
    }

    public void call(VkCommandBuffer commandBuffer, VkDescriptorUpdateTemplate descriptorUpdateTemplate, VkPipelineLayout layout, VkUInt32 set, VkObject pData){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), descriptorUpdateTemplate != null ? descriptorUpdateTemplate.getVkAddress() : VkPointer.getNullAddressNative(), layout != null ? layout.getVkAddress() : VkPointer.getNullAddressNative(), set != null ? set.getVkAddress() : VkPointer.getNullAddressNative(), pData != null ? pData.getVkAddress() : VkPointer.NULL);
    }

    protected static native void call(long vkaddress, long commandBuffer, long descriptorUpdateTemplate, long layout, long set, long pData);
}
