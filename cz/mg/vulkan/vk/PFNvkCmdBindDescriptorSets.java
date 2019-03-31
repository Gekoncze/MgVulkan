package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdBindDescriptorSets.html">khronos documentation</a>
 **/
public class PFNvkCmdBindDescriptorSets extends VkFunctionPointer {
    public PFNvkCmdBindDescriptorSets() {
    }

    public PFNvkCmdBindDescriptorSets(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdBindDescriptorSets(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCmdBindDescriptorSets(long value) {
        setValue(value);
    }

    public PFNvkCmdBindDescriptorSets(VkInstance instance) {
        super(instance, new VkString("vkCmdBindDescriptorSets"));
    }

    public void call(VkCommandBuffer commandBuffer, VkPipelineBindPoint pipelineBindPoint, VkPipelineLayout layout, VkUInt32 firstSet, VkUInt32 descriptorSetCount, VkDescriptorSet pDescriptorSets, VkUInt32 dynamicOffsetCount, VkUInt32 pDynamicOffsets){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkCommandBuffer.NULL.getVkAddress(), pipelineBindPoint != null ? pipelineBindPoint.getVkAddress() : VkPointer.NULL, layout != null ? layout.getVkAddress() : VkPipelineLayout.NULL.getVkAddress(), firstSet != null ? firstSet.getVkAddress() : VkPointer.NULL, descriptorSetCount != null ? descriptorSetCount.getVkAddress() : VkPointer.NULL, pDescriptorSets != null ? pDescriptorSets.getVkAddress() : VkDescriptorSet.NULL.getVkAddress(), dynamicOffsetCount != null ? dynamicOffsetCount.getVkAddress() : VkPointer.NULL, pDynamicOffsets != null ? pDynamicOffsets.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long commandBuffer, long pipelineBindPoint, long layout, long firstSet, long descriptorSetCount, long pDescriptorSets, long dynamicOffsetCount, long pDynamicOffsets);
}
