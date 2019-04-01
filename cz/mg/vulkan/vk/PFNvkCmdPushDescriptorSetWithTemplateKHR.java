package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdPushDescriptorSetWithTemplateKHR.html">khronos documentation</a>
 **/
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
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.NULL_ADDRESS, descriptorUpdateTemplate != null ? descriptorUpdateTemplate.getVkAddress() : VkPointer.NULL_ADDRESS, layout != null ? layout.getVkAddress() : VkPointer.NULL_ADDRESS, set != null ? set.getVkAddress() : VkPointer.NULL_ADDRESS, pData != null ? pData.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long commandBuffer, long descriptorUpdateTemplate, long layout, long set, long pData);
}
