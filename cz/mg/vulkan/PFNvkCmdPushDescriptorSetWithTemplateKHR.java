package cz.mg.vulkan;

public class PFNvkCmdPushDescriptorSetWithTemplateKHR extends VkFunctionPointer {
    public PFNvkCmdPushDescriptorSetWithTemplateKHR() {
    }

    public PFNvkCmdPushDescriptorSetWithTemplateKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdPushDescriptorSetWithTemplateKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCmdPushDescriptorSetWithTemplateKHR(long value) {
        setValue(value);
    }

    public PFNvkCmdPushDescriptorSetWithTemplateKHR(VkInstance instance) {
        super(instance, new VkString("vkCmdPushDescriptorSetWithTemplateKHR"));
    }

    public void call(VkCommandBuffer commandBuffer, VkDescriptorUpdateTemplate descriptorUpdateTemplate, VkPipelineLayout layout, VkUInt32 set, VkObject pData){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getSinkAddress(), descriptorUpdateTemplate != null ? descriptorUpdateTemplate.getVkAddress() : VkPointer.getSinkAddress(), layout != null ? layout.getVkAddress() : VkPointer.getSinkAddress(), set != null ? set.getVkAddress() : VkPointer.getSinkAddress(), pData != null ? pData.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long commandBuffer, long descriptorUpdateTemplate, long layout, long set, long pData);
}
