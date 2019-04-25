package cz.mg.vulkan;

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
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), pipelineBindPoint != null ? pipelineBindPoint.getVkAddress() : VkPointer.getNullAddressNative(), layout != null ? layout.getVkAddress() : VkPointer.getNullAddressNative(), firstSet != null ? firstSet.getVkAddress() : VkPointer.getNullAddressNative(), descriptorSetCount != null ? descriptorSetCount.getVkAddress() : VkPointer.getNullAddressNative(), pDescriptorSets != null ? pDescriptorSets.getVkAddress() : VkPointer.NULL, dynamicOffsetCount != null ? dynamicOffsetCount.getVkAddress() : VkPointer.getNullAddressNative(), pDynamicOffsets != null ? pDynamicOffsets.getVkAddress() : VkPointer.NULL);
    }

    protected static native void call(long vkaddress, long commandBuffer, long pipelineBindPoint, long layout, long firstSet, long descriptorSetCount, long pDescriptorSets, long dynamicOffsetCount, long pDynamicOffsets);
}
