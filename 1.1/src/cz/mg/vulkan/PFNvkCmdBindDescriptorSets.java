package cz.mg.vulkan;

public class PFNvkCmdBindDescriptorSets extends VkFunctionPointer {
    public PFNvkCmdBindDescriptorSets() {
    }

    protected PFNvkCmdBindDescriptorSets(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCmdBindDescriptorSets(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdBindDescriptorSets(long value) {
        setValue(value);
    }

    public PFNvkCmdBindDescriptorSets(VkInstance instance) {
        super(instance, new VkString("vkCmdBindDescriptorSets"));
    }

    public void call(VkCommandBuffer commandBuffer, VkPipelineBindPoint pipelineBindPoint, VkPipelineLayout layout, VkUInt32 firstSet, VkUInt32 descriptorSetCount, VkDescriptorSet pDescriptorSets, VkUInt32 dynamicOffsetCount, VkUInt32 pDynamicOffsets){
        callNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), pipelineBindPoint != null ? pipelineBindPoint.getVkAddress() : VkPointer.getNullAddressNative(), layout != null ? layout.getVkAddress() : VkPointer.getNullAddressNative(), firstSet != null ? firstSet.getVkAddress() : VkPointer.getNullAddressNative(), descriptorSetCount != null ? descriptorSetCount.getVkAddress() : VkPointer.getNullAddressNative(), pDescriptorSets != null ? pDescriptorSets.getVkAddress() : VkPointer.NULL, dynamicOffsetCount != null ? dynamicOffsetCount.getVkAddress() : VkPointer.getNullAddressNative(), pDynamicOffsets != null ? pDynamicOffsets.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long commandBuffer, long pipelineBindPoint, long layout, long firstSet, long descriptorSetCount, long pDescriptorSets, long dynamicOffsetCount, long pDynamicOffsets);


    public void call(VkCommandBuffer commandBuffer, int pipelineBindPoint, VkPipelineLayout layout, int firstSet, int descriptorSetCount, VkDescriptorSet pDescriptorSets, int dynamicOffsetCount, VkUInt32 pDynamicOffsets){
        callSimplifiedNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), pipelineBindPoint, layout != null ? layout.getVkAddress() : VkPointer.getNullAddressNative(), firstSet, descriptorSetCount, pDescriptorSets != null ? pDescriptorSets.getVkAddress() : VkPointer.NULL, dynamicOffsetCount, pDynamicOffsets != null ? pDynamicOffsets.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callSimplifiedNative(long vkaddress, long commandBuffer, int pipelineBindPoint, long layout, int firstSet, int descriptorSetCount, long pDescriptorSets, int dynamicOffsetCount, long pDynamicOffsets);

}
