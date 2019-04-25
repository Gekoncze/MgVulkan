package cz.mg.vulkan;

public class PFNvkCmdPushDescriptorSetKHR extends VkFunctionPointer {
    public PFNvkCmdPushDescriptorSetKHR() {
    }

    protected PFNvkCmdPushDescriptorSetKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCmdPushDescriptorSetKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdPushDescriptorSetKHR(long value) {
        setValue(value);
    }

    public PFNvkCmdPushDescriptorSetKHR(VkInstance instance) {
        super(instance, new VkString("vkCmdPushDescriptorSetKHR"));
    }

    public void call(VkCommandBuffer commandBuffer, VkPipelineBindPoint pipelineBindPoint, VkPipelineLayout layout, VkUInt32 set, VkUInt32 descriptorWriteCount, VkWriteDescriptorSet pDescriptorWrites){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), pipelineBindPoint != null ? pipelineBindPoint.getVkAddress() : VkPointer.getNullAddressNative(), layout != null ? layout.getVkAddress() : VkPointer.getNullAddressNative(), set != null ? set.getVkAddress() : VkPointer.getNullAddressNative(), descriptorWriteCount != null ? descriptorWriteCount.getVkAddress() : VkPointer.getNullAddressNative(), pDescriptorWrites != null ? pDescriptorWrites.getVkAddress() : VkPointer.NULL);
    }

    protected static native void call(long vkaddress, long commandBuffer, long pipelineBindPoint, long layout, long set, long descriptorWriteCount, long pDescriptorWrites);
}
